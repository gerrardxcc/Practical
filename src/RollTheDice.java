
public class RollTheDice {

    public static void main(String[] args) {
        int die3;
        int die5;
        int roll;

        die3 =(int)(Math.random()*6)+1;
        die5 =(int)(Math.random()*6)+1;
        roll = die3+die5;

        System.out.println("The first die comes up " + die3);
        System.out.println("The first die comes up " + die5);
        System.out.println("Your total roll is "+ roll);

        // TODO - add code here to complete Exercise 2.2
    }  // end main()

}  // end class
