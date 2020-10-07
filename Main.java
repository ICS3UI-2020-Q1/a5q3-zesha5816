import java.util.Scanner;
/**
 * a program that will ask the user how much money they wish to invest, what their 	interest rate is (as a full percentage), and how many years they want to invest
 * @author Ahmad Zeshan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create the Scanner
		Scanner input = new Scanner(System.in);
		//output the message to the user
		System.out.println("Please enter an integer to calculate the factorial of");
		int factorialValue = input.nextInt();
		//store intial value as the input number
		int initialValue = factorialValue;
		//intialize the final answer as 1
		int finalAnswer=1;
		//decrases the value of count by 1 from the inserted value
		for (int count = factorialValue; count > 0; count--){
			//multiplys count to final answer 
			finalAnswer = count * finalAnswer;
	 }
	 //outputs the final message
	 System.out.println(initialValue + "! = " + finalAnswer);
  }
}
