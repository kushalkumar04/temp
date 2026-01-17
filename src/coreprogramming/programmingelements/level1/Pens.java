package coreprogramming.programmingelements.level1;

/*
 * This class calculates how many pens each person will get
 * when a total number of pens is equally distributed among
 * three people using integer division.
 */
public class Pens {

    public static void main(String[] args) {

        // Total number of pens
        int pens = 14;

        // Divide the pens equally among 3 people
        int finalPens = pens / 3;

        // Print the number of pens each person receives
        System.out.println(finalPens);
    }
}