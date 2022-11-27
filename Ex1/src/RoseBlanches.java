import java.util.Scanner;

public class RoseBlanches {
    /**
     * Exercise 4
     * x: 1; x: 2;
     * y: 2 y: 1
     *  A wealthy aunt sends you one day a small envelope, with money inside,
     *  to help you finance your studies. You decide to manage this amount as follows:
     * Three quarters of this sum will be dedicated to the purchase of books
     * and supplies The rest will be evenly distributed between:
     * - Cafés
     * - subscription to the "Flash computer " journal
     * - subway tickets
     * You also decide to manage this sum in dollars changes. The rest of
     * the money will be going to buy a flower bouquet for your mom for the next Mother's Day.
     * Assuming that a cafe is worth 2 dollars, and a number of "Flash Computer" is worth 4
     * and that a subway ticket is worth 3 dollars, write
     * the RoseBlanches.java program allowing you to produce the following output:
     * How much did you receive money ($)? 800 Book and Supplies: 600 $
     * You can then buy: 66.67
     * 33 coffees  33.33
     * 16 Flash Computer Numbers  16.66
     * 22 subway Tickets 22.22
     * and you will have 4 dollars for the white roses.
     * Indication: use variables of type int.
     * The result of a division of two int will be truncated to an int.
     * Use the % operator that gives you the rest of the entire division.
     * */
    static void ex4() {
        Scanner userInput = new Scanner(System.in);

        System.out.print("How much did you receive money ($)? ");
        int income = userInput.nextInt();

        System.out.print("Book and Supplies: ");
        int book = userInput.nextInt();

        int coffeePrice = 2;
        int flashComPrice = 4;
        int subwayTicketPrice = 3;

        int coffees;
        int flashCom;
        int subwayTicket;
        int dollarLeft;

        int dollarForBuyThings = income - book;
        int dollarDivide3 = dollarForBuyThings/3;

        coffees = dollarDivide3/coffeePrice;
        flashCom = dollarDivide3/flashComPrice;
        subwayTicket = dollarDivide3/subwayTicketPrice;
        dollarLeft = dollarForBuyThings - ((coffees*coffeePrice) + (flashCom*flashComPrice) + (subwayTicket*subwayTicketPrice));

        System.out.printf("You can then buy:\n " +
                "%d Coffees\n" +
                "%d Flash Computer Numbers\n" +
                "%d subway Tickets\n" +
                "and you will have %d dollars for the white roses.", coffees, flashCom, subwayTicket, dollarLeft);
    }

    public static void main(String[] args) {
//        ex1();
//        ex2();
//        ex3();
        ex4();
    }
}
