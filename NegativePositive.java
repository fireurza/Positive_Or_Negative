import java.util.Scanner;

/**
 *
 * @author Aaron Kurth
 */
public class NegativePositive
{
    public static void main(String[] args) {
        //declaring variables
        int positive = 0;
        int negative = 0;
        int zero = 0;
        
         //Getting User Input
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        
        //declaring first variable, converting the user input to an int and placing the value in the variable
        int numOne = userInput.nextInt();
        System.out.println("Enter the second number: ");
        
        //declaring second variable, converting the user input to an int and placing the value in the variable
        int numTwo = userInput.nextInt();
        System.out.println("Enter the third number: ");
        
        //declaring third variable, converting the user input to an int and placing the value in the variable
        int numThree = userInput.nextInt();
        System.out.println("Enter the fourth number: ");
        
        //declaring fourth variable, converting the user input to an int and placing the value in the variable
        int numFour = userInput.nextInt();
        System.out.println("Enter the fifth number: ");
        
        //declaring fifth variable, converting the user input to an int and placing the value in the variable
        int numFive = userInput.nextInt();
        
        //close the user input scanner
        userInput.close();
        
        //displays the user's numbers
        System.out.format("Your numbers are: %d, %d, %d, %d, %d%n", numOne, numTwo, numThree, numFour, numFive);
        
        //checking value of numOne
        if (numOne > 0)
        {
            positive += 1;
        }
        if (numOne < 0)
        {
            negative += 1;
        }
        if (numOne == 0)
        {
            zero += 1;
        }
        
        //checking value of numTwo
        if (numTwo > 0)
        {
            positive += 1;
        }
        if (numTwo < 0)
        {
            negative += 1;
        }
        if (numTwo == 0)
        {
            zero += 1;
        }
        
        //checking value of numThree
        if (numThree > 0)
        {
            positive += 1;
        }
        if (numThree < 0)
        {
            negative += 1;
        }
        if (numThree == 0)
        {
            zero += 1;
        }
        
        //checking value of numFour
        if (numFour > 0)
        {
            positive += 1;
        }
        if (numFour < 0)
        {
            negative += 1;
        }
        if (numFour == 0)
        {
            zero += 1;
        }
        
        //checking value of numFive
        if (numFive > 0)
        {
            positive += 1;
        }
        if (numFive < 0)
        {
            negative += 1;
        }
        if (numFive == 0)
        {
            zero += 1;
        }
        
        System.out.format("%d Positive numbers, %d Negative numbers, %d Zeroes%n", positive, negative, zero);
    }
    
}
