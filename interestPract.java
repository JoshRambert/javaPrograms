/**
 * This class implements a simple program that will
 * compute the amount of interest that is
 * earned on 17,000$ invested at an interest rate of 0.07 for one year
 * The interest and the value of the investment after one year are printed to standard
 * output
 * Created by Joshua Rambert on 6/16/2016.
 */


public class javaPractice {

    public static void main(String[] args) {

        /*Declare the variables*/

        double principal;       //The value of th investment
        double rate;            //The annual interest rate
        double interest;        //interest earned in one year

        /*Do the computations*/

        principal = 17000;
        rate = 0.07;
        interest = principal * rate;    //compute the interest

        principal = principal + interest;
                //compute value of investment after one year, with interest
                //(NOTE: The new replaces the old value of principa)

        /*Output the results*/

        System.out.print("The interest earned is $");
        System.out.println(interest);
        System.out.print("The value of the investment after one year is $");
        System.out.println(principal);

    } //end of main

} //end of class
