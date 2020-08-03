// TODO - add the appropriate import here

import textio.TextIO;

public class GrossAndDozens {

    public static void main(String[] args) {
        int eggs;
        int gross;
        int aboveGross;
        int dozenEggs;
        int leftOver;

        System.out.println("How many eggs do you have?      ");
        eggs = TextIO.getInt();

        gross = eggs / 144;
        aboveGross = eggs % 144;

        dozenEggs = aboveGross/ 12;
        leftOver = aboveGross % 12;

        System.out.print("Your number of eggs is        ");
        System.out.print(gross);
        System.out.print(" gross, ");
        System.out.print(dozenEggs);
        System.out.print(" dozen, and ");
        System.out.print(leftOver);
        System.out.println();
        // TODO - add code here to complete Exercise 2.5
    }  // end main()

}  // end class
