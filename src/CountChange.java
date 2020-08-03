import java.util.Scanner;

public class CountChange {
 
    public static void main(String[] args) {
        int fiveCents;
        int tenCents;
        int twentyCents;
        int fiftyCents;
        int oneDollar;
        int twoDollars;
        double dollars;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of 5c:     ");
        fiveCents = input.nextInt();
        input.nextLine();

        System.out.println("Please enter the number of 10c:    ");
        tenCents = input.nextInt();
        input.nextLine();

        System.out.println("Please enter the number of 20c:    ");
        twentyCents = input.nextInt();
        input.nextLine();

        System.out.println("Please enter the number of 50c:    ");
        fiftyCents = input.nextInt();
        input.nextLine();

        System.out.println("Please enter the number of $1:     ");
        oneDollar = input.nextInt();
        input.nextLine();

        System.out.println("Please enter the number of $2:     ");
        twoDollars = input.nextInt();
        input.nextLine();
        dollars = (0.05 * fiveCents) + (0.10 * tenCents) + (0.20 * twentyCents)
                + (0.50 * fiftyCents) + (1.00 * oneDollar) + (2.00 * twoDollars);
        System.out.println();
        System.out.print("The total in dollars is $ ");
        System.out.printf("%1.2f", dollars);
        System.out.println();
        // TODO - add code here to complete Exercise 2.4
    }  // end main()

}  // end class
