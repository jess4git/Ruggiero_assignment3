//Import required packages

import java.util.Scanner;

import java.security.SecureRandom;

//Create a class

public class CAI4 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String round;

       do {
           //call quiz function 
    	   
           quiz(sc);
           
           //ask if user wants to continue
           
           System.out.print("\nDo you want another round?(yes/no): ");
           round = sc.next();
           System.out.println();
       } while (round.equalsIgnoreCase("yes"));
       sc.close();
   }

   public static void quiz(Scanner sc) {
       SecureRandom randomNumber = new SecureRandom();

       int countCorrect = 0;// for count correct answer

       int difficulty = readDifficulty(sc);
       System.out.println();
       
       //execute loop

       for (int i = 1; i <= 10; i++) {

           int num1 = generateQuestionArgument(randomNumber, difficulty);
           int num2 = generateQuestionArgument(randomNumber, difficulty);
           int correctAns = num1 * num2; // correct answer

           askquestion(num1, num2, i);

           int response = readResponse(sc);

           if (isAnswerCorrect(correctAns, response)) {
               displayCorrectResponse(randomNumber);
               countCorrect++;
           } else
               displayIncorrectResponse(randomNumber);
       }
       displayCompletionMessage(countCorrect);
   }

   //generating random number according to given difficulty
   
   private static int generateQuestionArgument(SecureRandom randomNumber, int difficulty) {
       int argument = 0;
      
       if (difficulty == 1)
           argument = randomNumber.nextInt(10);
       else if (difficulty == 2)
           argument = randomNumber.nextInt(100);
       else if (difficulty == 3)
           argument = randomNumber.nextInt(1000);
       else
           argument = randomNumber.nextInt(10000);
      
       return argument;
   }

   //reading difficulty chosen from user
   
   private static int readDifficulty(Scanner sc) {
       System.out.print("Enter difficulty level(1-4): ");
       return sc.nextInt();
   }

   //calculating percent and displaying completion result
   
   private static void displayCompletionMessage(int countCorrect) {
       double percent = ((double) countCorrect / 10.0) * 100.0;
       System.out.println("\nYou Scored: " + percent + "%");
       if (percent < 75)
           System.out.println("Please ask your teacher for extra help.");
       else
           System.out.println("Congratulations, you are ready to go to next level!");
   }
   
   //if user input is incorrect

   private static void displayIncorrectResponse(SecureRandom randomNumber) {
       String incorrect[] = { "No. Please try again", "Wrong. Try once more", "Don't give up!", "No. Keep trying" };

       // generating random index
       
       int index = randomNumber.nextInt(incorrect.length);

       System.err.println(incorrect[index]); //changing the color to red for incorrect response
   }
   
   //if user input is correct

   private static void displayCorrectResponse(SecureRandom randomNumber) {
       String correct[] = { "Very good!", "Excellent", "Nice work!", "Keep up the good work!" };

       // generating random index
       
       int index = randomNumber.nextInt(correct.length);

       System.out.println(correct[index]);
   }
   
   //determine if answer is correct

   private static boolean isAnswerCorrect(int correctAns, int response) {
       return correctAns == response;
   }
   
   //read user input

   private static int readResponse(Scanner sc) {
       System.out.print("Ans. ");
       int response = sc.nextInt();
       return response;
   }

   //ask for user input
   
   private static void askquestion(int num1, int num2, int i) {
       System.out.println("Q." + i + " how much is " + num1 + " times " + num2 + "?");
   }
}