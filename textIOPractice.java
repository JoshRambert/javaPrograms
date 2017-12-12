/**This class implements a simple program tat will compute the amount
 * of interest that is earned on an investment over a period of one year
 * The initial amount if the investment and the interest rate are input by the
 * user. The value of the investment at the end of the year is output.
 * rate must be input as a decimal, not a percentage (for example, 0.05 rather
 * than 5)
 * 
 * @author Joshua
 */

  
public class javaPractice {

    
    public static void main(String[] args) {
      
        double principal;   //The value of the investment 
        double rate;        //The annual interest rate.
        double interest;    //The interest earned durin the year 
        
        TextIO.put("Enter the intial investment ");
        principal = TextIO.getInDouble();
        
        TextIO.put("Enter the annual interst rate ");
        rate = TextIO.getInDouble();
        
        interest = principal * rate;    //Compute this years interest.
        principal = principal + interest;    //add it to principal
        
        } //end of main
 
    } //end of class
	
	
	
	
	
	/** In this example the programmer uses the input and output
 * TextIO read/write file
 * to create a program that asks a series of questions that is later
 * stored in a file composed by the user 
 * NAME: Create Profile.
 * @author Joshua
 */

  
public class javaPractice {
    
    public static void main(String[] args) {
        
        String name;        //The users name
        String email;       //The users email address 
        double salary;      //The users yearly salary 
        String favColor;    //The users favorite color 
        
        TextIO.putln("Good afternoon! this program will create ");
        TextIO.putln("your profile file, if you will just answer ");
        TextIO.putln("a few sample question. ");
        
        /*Gather responses from the user*/
        
        TextIO.put("What is your name?           ");
        name = TextIO.getln();
        TextIO.put("What is your email address? ");
        email = TextIO.getln();
        TextIO.put("What is your yearly income?   ");
        salary = TextIO.getinDOuble();
        TextIO.put("What is your favorite color?n ");
        FavColor = TextIO.getln();
        
        /*Write the users information to the file named profle.txt. */
        
        TextIO.writeFile("profile.txt");    //Subsequent output goes to the file
        TextIO.putln("Name          " + name);
        TextIO.putln("Email         " + email);
        TextIO.putln("Favorite Color            " + favColor);
        TextIO.putf("Yearly Income:     %,1.2f\n", salary);
                    /*the "/n" in the previous line is a carriage return, and
                    *the comma in %,1.2f adds seperators between groups of digits.
                    */
        //Print a final message for standard output 
        
        TextIO.writesStandardOutput();
        TextIO.putln("Thank you. Your profile has been writtn to profile.txt");
        
        
        } //end of main
 
    } //end of class
