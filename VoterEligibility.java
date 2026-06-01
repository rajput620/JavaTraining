import java.util.Scanner;

public class VoterEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Eligible to Vote");
        } else {
            System.out.println("Not Eligible to Vote");
        }

        sc.close();
    }
}