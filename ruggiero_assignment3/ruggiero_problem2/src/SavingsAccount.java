//Create class

public class SavingsAccount {
 
   //variable to store annual interest rate
	
        static private double annualInterestRate;
        private double savingBalance;
 
        //constructor method
        
        public SavingsAccount()
        {
 
        }
 
        //constructor method
        
        public SavingsAccount(double savingBalance)
        {
                this.savingBalance=savingBalance;
        }
 
        //Get saving balance
        
        public double getSavingBalance()
        {
                return this.savingBalance;
        }
       
         // Modify interest rate by setting annual interest rate to a new value
        
        public static void modifyInterestRate(double newInterestRate)
        {
                annualInterestRate=newInterestRate;
        }
 
        //Method to calculate monthly interest
        
        public void calculateMonthlyInterest()
        {
                double monthlyI;
                monthlyI= (double)(this.savingBalance*annualInterestRate/12);
                this.savingBalance+=monthlyI;
        }
 
 
    public static void main(String[] args) {
   
                // To test the class designed above
    	
                //Instantiate 2 saving account objects saver1 and saver2
    	
                SavingsAccount saver1, saver2;
                saver1 = new SavingsAccount (2000.0);
                saver2= new SavingsAccount (3000.0);
               
                int total = 0;
 
                //Set the annual interest rate to 4%=0.04
                
                SavingsAccount.modifyInterestRate (0.04);
 
                //Calculate monthly interest
                
                saver1.calculateMonthlyInterest();
                saver2.calculateMonthlyInterest();
 
                //Print out the new balances for both savers
                
                System.out.println("This month:\nSaver 1 balance= "+ saver1.getSavingBalance());
                System.out.println("Saver 2 balance= "+ saver2.getSavingBalance());
 
 
                //Change annual interest rate to 5%=0.05
                
                SavingsAccount.modifyInterestRate(0.05);
 
                //Calculate the next month interest rate and print out balances
                
                saver1.calculateMonthlyInterest();
                saver2.calculateMonthlyInterest();
                System.out.println("Next month:\nSaver 1 balance= "+ saver1.getSavingBalance());
                System.out.println("Saver 2 balance= "+ saver2.getSavingBalance());
 
    }
}
