// TODO - add the appropriate import here

import textio.TextIO;

public class Dozens {

    public static void main(String[] args) {
        int eggs;
        int dozenEggs;
        int leftOver;

        System.out.println("How many eggs do you have? ");
        eggs = TextIO.getInt();

        dozenEggs = eggs / 12;
        leftOver = eggs % 12;

        System.out.print("Your number of eggs is ");
        System.out.print(dozenEggs);
        System.out.print(" dozen and ");
        System.out.print(leftOver);
        System.out.println();




        // TODO - add code here to complete Exercise 2.5
    }  // end main()

}  // end class
