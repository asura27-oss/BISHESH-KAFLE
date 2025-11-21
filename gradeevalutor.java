import java.util.Scanner;
public class gradeevalutor
{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);//CRAAFTING THE SCANNER CLASS OBJECT
        System.out.println("enter the grade");
        double grade=sc.nextDouble();
        String result = (grade>=40)? "pass":"fail";
        System.out.println(result);
        
    }
}