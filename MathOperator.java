public class  MathOperator{
    public static void main(String[] args){
        //arithmetic Operator
        int b=10;
        int i=2;
        int k=b+i;
        int sub=b-i;
        int Mul=b*i;
        int Div=b/i;
        int Mod=b%i;
        System.out.println("Sum of the b and i:"+k);
        System.out.println("Subtraction of the b and i:"+sub);
        System.out.println("Multiplication of the b and i:"+Mul);
        System.out.println("Division of the b and i:"+Div);
        System.out.println("Mod of the b and i:"+Mod);
        int increment=++b;
        System.out.println("Increment of b:"+increment);
        int decrement=--i;
        System.out.println("Decrement of i:"+decrement);
        //relational operator
        int age = 24;
        String status=(age >= 18) ? "Adult" : "Minor";
        System.out.println(status);
        //Equal to operator
        System.out.println("b == i : " + (b == i)); 
        //Not equal to operator
        System.out.println("b != i : " + (b != i)); 
        //Greater than operator
        System.out.println("b > i  : " + (b > i)); 
        //Less than operator
        System.out.println("b < i  : " + (b < i));  
        //Greater than or equal to operator
        System.out.println("b >= i : " + (b >= i)); 
        //Less than or equal to operator
        System.out.println("b <= i : " + (b <= i));
        //Logical operator
        boolean hasNID= true;
        boolean vote=(age>=18 &&hasNID);
        System.out.println("Can Vote:"+vote);
        boolean work=(age<18 ||!hasNID);
        System.out.println("work:"+work);
        b += 5;
        System.out.println("+="+b);
        b -= 3;
        System.out.println("-="+b);
        b*= 2;
        System.out.println("*="+b);
        b/= 6;
        System.out.println("/="+b);
        b%= 3;
        System.out.println("%="+b);
        System.out.println("b & i = " + (b & i));
        System.out.println("b | i = " + (b | i));
        System.out.println("b ^ i = " + (b ^ i));
        System.out.println("~b = " + (~b));
        System.out.println("b << 1 = " + (b << i));
        System.out.println("i >> 1 = " + (i >> b));
                
    }
}