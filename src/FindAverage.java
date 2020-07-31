// TODO - add the appropriate import here

import textio.TextIO;

public class FindAverage {

    public static void main(String[] args) {
        // TODO - add code here to complete Exercise 2.7
        String name;
        int exam1,exam2,exam3;
        double average;

        TextIO.readFile("testdata.txt");

        name = TextIO.getln();
        exam1 = TextIO.getInt();
        exam2 = TextIO.getInt();
        exam3 = TextIO.getInt();

        average = (exam1 + exam2 + exam3) / 3.0;

        System.out.printf("The average grade for %s was %1.1f", name, average);
        System.out.println();
    }

}
