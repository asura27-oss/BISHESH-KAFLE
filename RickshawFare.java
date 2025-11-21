import java.util.Scanner;
public class RickshawFare {
    public static void main(String[] args) {

        final double BASE_FARE = 30.0;
        final double PER_KM = 4.0;
        final double PER_MIN = 1.0;
        final double LOCAL_DISCOUNT = 0.10;   
        final double NIGHT_SURCHARGE = 0.20;  

        
        Scanner sc = new Scanner(System.in);

        System.out.print("Distance(kilometer): ");
        double distance = sc.nextDouble();

        System.out.print("Time(minute): ");
        double time = sc.nextDouble();

        System.out.print("Are you local? (yes/no): ");
        String localInput = sc.next();

        System.out.print("Is it night? (yes/no): ");
        String nightInput = sc.next();

        boolean isLocal = localInput.equalsIgnoreCase("yes") ? true : false;
        boolean isNight = nightInput.equalsIgnoreCase("yes") ? true : false;

        double totalFare = BASE_FARE + (distance * PER_KM) + (time * PER_MIN);

        totalFare = (isLocal && distance > 10) 
                    ? (totalFare - (totalFare * LOCAL_DISCOUNT)) 
                    : totalFare;

        totalFare = isNight
                    ? (totalFare + (totalFare * NIGHT_SURCHARGE))
                    : totalFare;

        System.out.println("\n------------------------------");
        System.out.println("Total value: Rs. " + String.format("%.2f", totalFare));
        System.out.println("------------------------------");
    }
}
