//TDD-BDD Assignment   
//Interest calculator

import java.util.*;

class home_loan{

void method1(double interest,double amount,double time)
{
    interest = (amount * 6.70 * time) / 100;
    System.out.println("Interest for home loan is: " +interest);
    
}  
};  

class personal_loan{

void method2(double interest,double amount,double time)
{
    interest = (amount * 9.60 * time) / 100;
    System.out.println("Interest for personal loan is: " +interest);
    
}  
};   


class gold_loan{

void method3(double interest,double amount,double time)
{
    interest = (amount * 7.50 * time) / 100;
    System.out.println("Interest for gold loan is: " +interest);
    
}  
};   


public class Main
{
    public static void main(String[] args)
    {


    double amount, time, interest=0;
   int loan;
    Scanner scan = new Scanner(System.in);  
    System.out.print("Enter the Amount : ");
    amount = scan.nextDouble();
    System.out.print("Enter the Time : ");
    time = scan.nextDouble();
    System.out.println("Enter the option for loan Interest 1.Home Loan  2.Personal Loan  3.Gold Loan ");
    loan=scan.nextInt();
    
    home_loan obj1 = new home_loan();
    personal_loan obj2 = new personal_loan();
    gold_loan obj3 = new gold_loan();
    
    switch(loan)
    {
        case 1:
            obj1.method1(interest,amount,time);
            break;
        
        case 2:
            obj2.method2(interest,amount,time);
            break;
            
        case 3:
            obj3.method3(interest,amount,time);
            break;
        
        default:
            System.out.println("Invalid Input");
            break;
            
    }
    
    }
}
