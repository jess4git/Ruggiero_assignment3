//Import required packages

import java.util.Scanner;

import java.security.SecureRandom;

//Create a class

public class CAI1 {
	
	Scanner input = new Scanner(System.in);
    SecureRandom randomNumber = new SecureRandom();

    int num1 = randomNumber.nextInt(10);
    int num2 = randomNumber.nextInt(10);

    public int answer = num1 * num2;
    public int useranswer;
    
	public static void main(String[] args) {
		
	CAI1 i = new CAI1();
	i.quiz();		
		
	}
	    
		//call quiz function and create a loop
	
	public void quiz() {
		while (useranswer != answer) {
		askQuestion();
		readResponse();
		isAnswerCorrect(); }
	
	}
	
	      //print problem to the screen
	
	      public void askQuestion() { 

	      System.out.println("How much is " + num1 + " times " + num2 + "?"); }
	      
	      //read answer from student
	      
	      public void readResponse() { 

	      useranswer = input.nextInt(); }
	      
	      //check to see if student's answer matches the correct one
	      
	      public void isAnswerCorrect() { 
	    	 if (useranswer == answer)
	    	 displayCorrectResponse();
	    	 
	    	 else if (useranswer != answer)
	    	 displayIncorrectResponse();

	      }
	      
	      //student answers correctly
	    	  
	      public void displayCorrectResponse() { 
	      
	      

	         System.out.println("Very Good!"); 

	      }
	       
	      //student answers incorrectly
	      
	      public void displayIncorrectResponse() { 
	  

	         System.out.println("No, please try again");
	         useranswer = input.nextInt();
	      }    

	   }
