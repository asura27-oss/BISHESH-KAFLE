import java.util.Scanner;
public class xfx
{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your age group (child/adult/senior): ");
        String ageGroup = sc.next();
        System.out.println("Enter movie language (nepali/hindi/english): ");
        String language = sc.next();
        System.out.println("Are you a student? (yes/no): ");
        String studentCheck = sc.next();
        boolean isStudent = studentCheck.equals("yes");
        System.out.println("Is it a festival day? (yes/no): ");
        String festivalInput = sc.next();
        boolean isFestival = festivalInput.equals("yes");
        int basePrice = 0;
        switch (ageGroup) {
            case "Child":
                basePrice = 150;
                break;
            case "adult":
                basePrice = 250;
                break;
            case "senior":
                break;
            default:
                System.out.println("Invalid age group entered!");
                
        }
        if (language.equals("hindi")) {
            basePrice +=50;
        }  else if (language.equals("english")) {
            basePrice +=100;
        }  else if (!language.equals("nepali")) {
            System.out.println("Invalid language entered!");
            return;
        }
        double finalPrice = basePrice;
        if (isStudent) {
            finalPrice = finalPrice * 0.80;
        }
        if (isFestival) {
            finalPrice = finalPrice * 0.85;
        }
        System.out.println("Final Ticket Price:nRs " + finalPrice);
        }

        }