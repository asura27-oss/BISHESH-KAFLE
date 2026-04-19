bip   = "sales.txt"
def read_sales_data(file_path):
    sales_data = []
    try:
        with open(file_path, "r") as f:
            for line in f:
                line = line.strip()
                if not line:
                    continue
                parts = line.split(",")
                record = {
                    "id":      int(parts[0]),
                    "product": parts[1].strip(),
                    "units":   int(parts[2]),
                    "price":   float(parts[3]),
                }
                record["revenue"] = record["units"] * record["price"]
                sales_data.append(record)
    except FileNotFoundError:
        print(f"  Error '{file_path}' khoi.")
    except ValueError as e:
        print(f"  Error value majala halna: {e}")
    return sales_data


def display_table(sales_data):
    print("\n" + "=" * 65)
    print("\n" + " " * 20 + "CURRENT SALES DATA")
    print("=" * 65)
    print(f"  {'ID':<5} {'Product':<15} {'Units':>8} {'Price (Rs)':>12} {'Revenue (Rs)':>14}")
    print("-" * 65)
    for r in sales_data:
        print(f"  {r['id']:<5} {r['product']:<15} {r['units']:>8} {r['price']:>12,.0f} {r['revenue']:>14,.0f}")
    total = sum(r["revenue"] for r in sales_data)
    print("=" * 65)
    print(f"  {'Total Revenue':<40} {total:>14,.0f}")
    print("=" * 65)


def update_item_price(sales_data):
    print("\n  Available IDs:", [r["id"] for r in sales_data])
    try:
        item_id = int(input("  Enter Item ID: ").strip())
    except ValueError:
        print(" id number .")
        return sales_data

    target = next((r for r in sales_data if r["id"] == item_id), None)
    if not target:
        print(f"  Error {item_id}  ID not found.")
        return sales_data

    print(f"  Current price of '{target['product']}': Rs {target['price']:,.0f}")
    try:
        new_price = float(input("  New price (Rs): ").strip())
        if new_price <= 0:
            raise ValueError("Price be greater than zero.")
    except ValueError as e:
        print(f"Error {e}")
        return sales_data

    target["price"]   = new_price
    target["revenue"] = target["units"] * target["price"]
    print(f"[Updated] '{target['product']}' → Rs {new_price:,.0f}")

    with open(bip, "w") as f:
        for r in sales_data:
            f.write(f"{r['id']},{r['product']},{r['units']},{int(r['price'])}\n")
    print(f"  [Saved] '{bip}' updated.")
    return sales_data



def main():
    sales_data = read_sales_data(bip)
    if not sales_data:
        return

    while True:
        print("\n" + "=" * 40)
        print("      SALES MANAGEMENT SYSTEM")
        print("=" * 40)
        print("1. View Sales Table")
        print("2. Update Item Price")
        print("3. Exit")
        print("=" * 40)
        top = max(sales_data, key=lambda r: r["revenue"])
        print(f"  TOP PRODUCT : {top['product']}\n")
        print(f"  REVENUE     : Rs {top['revenue']:,.0f}\n")
        choice = input("  Choice (1-3): ").strip()
        if   choice == "1":
            display_table(sales_data)
        elif choice == "2":
            sales_data = update_item_price(sales_data)
        elif choice == "3":
             print("\n  Good Night \n"); break
        else:
             print("  [Error] Enter 1, 2 or 3.")


if __name__ == "__main__":
    main()