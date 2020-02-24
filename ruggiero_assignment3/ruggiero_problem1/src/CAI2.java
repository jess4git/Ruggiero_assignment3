//Import required packages

import java.util.Scanner;

import java.security.SecureRandom;

//Create a class

public class CAI2 {
	
	Scanner input = new Scanner(System.in);
    SecureRandom randomNumber = new SecureRandom();

    int num1 = randomNumber.nextInt(10);
    int num2 = randomNumber.nextInt(10);

    public int answer = num1 * num2;
    public int useranswer;
    
	public static void main(String[] args) {
		
	CAI2 i = new CAI2();
	i.quiz();		
		
	}
	    
		//create quiz function and create a loop
	
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
	      
	    	  SecureRandom rand = new SecureRandom();
	    	  int response = rand.nextInt(5);
	    	  
	    	  //execute switch statement for correct 
	    	  
	    	  switch (response) {
	    	  
	    	  case 1: 
	    		  System.out.println("Very Good!");
	    		  break;
	    	  case 2:
	    		  System.out.println("Excellent!");
	    		  break;
	    	  case 3:
	    		  System.out.println("Nice Work!");
	    		  break;
	    	  case 4:
	    		  System.out.println("Keep up the good work!");
	    		  break;
	    	  }
	    			  
	      }

	       
	      //student answers incorrectly
	      
	      public void displayIncorrectResponse() { 
	  
	    	  SecureRandom rand2 = new SecureRandom();
	    	  int response = rand2.nextInt(5);
	    	  
	    	  //execute switch statement for incorrect 
	    	  
	    	  switch (response) {
	    	  
	    	  case 1:
	    		  System.out.println("No. Please try again.");
	    		  break;
	    	  case 2:
	    		  System.out.println("Wrong. Try again.");
	    		  break;
	    	  case 3:
	    		  System.out.println("Don't give up!");
	    		  break;
	    	  case 4:
	    		  System.out.println("No. Keep trying.");
	    		  break;
	    	  }

	         useranswer = input.nextInt();
	      }    

	   }	