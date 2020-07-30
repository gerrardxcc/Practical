import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        String userName;
        String upperCaseName;
        System.out.println("Please enter your name ");
        Scanner input = new Scanner(System.in);
        userName = input.next();

        upperCaseName = userName.toUpperCase();

        System.out.println("Hello, "+ upperCaseName + ", nice to meet you!");

        // TODO - add code here to complete Exercise 2.3
    }  // end main()

}  // end class
