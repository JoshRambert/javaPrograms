package javapractice;
/** A Program that reads an integer that is typed in by the user \
 * and computes and prints the square of that integer.
 * 
 * TextIO.getInInt is a user input subroutine, when the programmer 
 * wants the user to enter an integer that the program will use
 * @author Joshua
 *
 *TextIO.getInInt(); 	//Reads a vlaue of type int
 *TextIO.getDouble();	//Reads a value of type double
 *TextIO.getboolean();	//Reads a value of type boolean
 *TextIO.getChar();		//Reads a value of type char
 *TextIO.getWord();		//Reads one word as a value of type string
 */


  
public class JavaPractice {

    
    public static void main(String[] args) {
      
        int userInput;      //The number input by the user 
        int square;         //The userInput, mutiplied by itself
        
        System.out.print("Please type a number ");
        userInput = TextIO.getlnInt();
        square = userInput * userInput;
        System.out.println("The square of that number is ");
        System.out.print(square);
        
        } //end of main
 
    } //end of class
