//import required classes and packages   
import java.util.Scanner;  
  
//create ATMExample class to implement the ATM functionality  
class AtmInterface 
{  
    //main method starts   
    public static void main(String args[] )  
    {  
        //declaring and initializing balance,withdraw and deposit 
        int balance = 556670,withdraw,deposit;  
          
        //create scanner class object to get choice of user  
        Scanner sc = new Scanner(System.in);  
          
        while(true)  
        {  
            System.out.println("ATM INTERFACE");  
            
            System.out.println("Select 1 to check the balance"); 
            System.out.println("Select 2 to withdraw");  
            System.out.println("Select 3 to deposit the cash");  
            System.out.println("Select 4 to tranfer"); 
            System.out.println("Select 5 to Quit");  
            System.out.print("Choose the operation you want to perform:");  
              
            //get choice from user  
            int choice = sc.nextInt();  
            switch(choice)  
            {  
                case 1:
                    //Inorder to display the total balance of the user  
                    System.out.println("Balance : "+balance);  
                    System.out.println("");  
                    break;
                
                case 2:  
                    System.out.print("Enter the money to be withdrawn:");  
                      
                    //Inorder to get the withdrawl money from user  
                      withdraw = sc.nextInt();  
                      
                    //Inorder to check whether the balance is greater than or equal to the withdrawal amount  
                    if(balance >= withdraw)  
                    {  
                        //to remove the withdrawl amount from the total balance  
                        balance = balance - withdraw;  
                        System.out.println("Please collect the cash");  
                    }  
                    else  
                    {  
                        //Inorder to show the custom error message   
                        System.out.println("You do not have sufficient Balance");  
                    }  
                    System.out.println("");  
                    break;  
   
                case 3:  
                      
                    System.out.print("Enter the  money to be deposited:");  
                      
                    //Inorder to get deposite amount from te user  
                    deposit = sc.nextInt();  
                      
                    //Inorder to add the deposit amount to the total balanace  
                    balance = balance + deposit;  
                    System.out.println("Your Cash has been successfully deposited");  
                    System.out.println(" ");  
                    break;  
   
                case 4:  
                    System.out.println("Account Based Tranfer");
                    System.out.print("Enter Your  Account Number : ");
                    
                    System.out.print("Enter Amount : ");
                    int amount = sc.nextInt();
                    
                    if(amount > balance)
                        System.out.println("Balance is insufficient");
                    else {  
                        System.out.println("The amount is tranferred successfully");
                        balance = balance - amount;
                    }
                    System.out.println("");
                    break;  
   
                case 5:  
                    // Inorder to exit from the menu  
                    System.exit(0);  
            }  
        }
        
      
    }  
}  