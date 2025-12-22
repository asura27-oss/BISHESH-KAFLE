public class KhanaGharMenu {
    String itemName;
    double price;
    String category;
    boolean isVegetarian;
    boolean isAvailable;
    KhanaGharMenu(String itemName, double price, String category,boolean isVegetarian, boolean isAvailable) {
        this.itemName = itemName;
        this.price = price;
        this.category = category;
        this.isVegetarian = isVegetarian;
        this.isAvailable = isAvailable;
    }
    public void display() {
        System.out.println(itemName + "\tRs. " + price +"\t" + category +"\tVeg: " + isVegetarian +"\tAvailable: " + isAvailable);
    }
    public static void main(String[] args) {
        KhanaGharMenu[] menu = {
            new KhanaGharMenu("Dal-Bhat Set", 120, "Dal-Bhat", true, true),
            new KhanaGharMenu("Masala Chiya", 15, "Chiya-Nasta", true, true),
            new KhanaGharMenu("Dharane Kalo Bangur", 400, "Non-Veg", true, true),
            new KhanaGharMenu("Sekuwa", 200, "Non-Veg", true, true)        };
        System.out.println("====== KHANA GHAR MENU ======");
        System.out.println("Item\t\t\tPrice\tCategory\tVeg      \tAvailable");
        for (KhanaGharMenu item : menu) {
            item.display();
        }
        System.out.println("\n  Vegetarian Items ");
        for (KhanaGharMenu item : menu) {
            if (item.isVegetarian) {
                item.display();
            }
        }
        System.out.println("\n   Non-Vegetarian Items ");
        for (KhanaGharMenu item : menu) {
            if (!item.isVegetarian) {
                item.display();
            }
        }
        System.out.println("\n  Non-Veg | Price > 100 | Available ");
        for (KhanaGharMenu item : menu) {
            if (!item.isVegetarian && item.price > 100 && item.isAvailable) {
                item.display();
            }
        }
        System.out.println("\n  Veg | Price < 50 | Available ");
        for (KhanaGharMenu item : menu) {
            if (item.isVegetarian && item.price < 50 && item.isAvailable) {
                item.display();
            }
        }
    }
}
