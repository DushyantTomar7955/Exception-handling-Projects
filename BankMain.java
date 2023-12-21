package com.jspider;
import java.util.*;

abstract class Bank{
    private double balance;
    public  void setBalance(double balance){
        this.balance=balance;
    }
    public  double getBalance(double balance){
        return balance;
    }
    abstract void deposit(double amount)throws InvalidDeposit,InvalidWithdraw;
    abstract void withdraw(double amount)throws InvalidDeposit,InvalidWithdraw;
}
class ICICI extends Bank{
    @Override
    public void deposit(double amount)throws InvalidDeposit{
           if(amount<=0){
            throw new InvalidDeposit("Exception occureed");
        }
        else{
            if(amount%2000==0){
            System.out.println("Deposited Succesfully...");
            }
            else {
                throw new InvalidDeposit("Exception occureed");
            }
        }
        
    }
    @Override
    public void withdraw(double amount)throws InvalidWithdraw{
         if(amount<=0){
            throw new InvalidWithdraw("Withdraw is not possible..");
        }
        else{
            if(amount%1000==0)
            System.out.println("withdraw successfully...");
            else
            throw new InvalidWithdraw("Withdraw is not possible..");
        }
    }
    
}

class HDFC extends Bank{
    @Override
    public void deposit(double amount)throws InvalidDeposit{
        if(amount<=0){
            throw new InvalidDeposit("Exception occureed");
        }
        else{
            if(amount%500==0){
            System.out.println("Deposited Succesfully...");
            }
            else {
                throw new InvalidDeposit("Exception occureed");
            }
        }
        
    }
    @Override
    public void withdraw(double amount)throws InvalidWithdraw{
        if(amount<=0){
            throw new InvalidWithdraw("Withdraw is not possible..");
        }
        else{
            if(amount%2000==0)
            System.out.println("withdraw successfully...");
            else
            throw new InvalidWithdraw("Withdraw is not possible..");
        }
        
    }
    
}

class InvalidDeposit extends Exception{
    InvalidDeposit(String s){
        super(s);
    }
}

class InvalidWithdraw extends Exception{
    InvalidWithdraw(String s){
        super(s);
    }
}

public class BankMain
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the balance: ");
		double balance=sc.nextDouble();
		Bank e2=new ICICI();
		e2.setBalance(balance);
		System.out.print("Enter the Choice to deposit or withdraw an amount: ");
		int choice=sc.nextInt();
		if(choice==1){
		    Bank e=new ICICI();
		    System.out.print("Enter the money to deposit ");
		    double money=sc.nextDouble();
		    try{
		    e.deposit(money);
		    System.out.print("Enter the amount to Withdraw: ");
		    double withdraw=sc.nextDouble();
		     e.withdraw(withdraw);
		    }
		    catch(InvalidDeposit  | InvalidWithdraw e1){
		        System.out.println(e1.getMessage());
		    }
		}
		else{
		    Bank e=new HDFC();
		    System.out.print("Enter the money to deposit ");
		    double money=sc.nextDouble();
		    try{
		    e.deposit(money);
		    System.out.print("Enter the amount to Withdraw: ");
		    double withdraw=sc.nextDouble();
		    e.withdraw(withdraw);
		    }
		    catch(InvalidDeposit  | InvalidWithdraw e1){
		        System.out.println(e1.getMessage());
		    }
		}
		    
		
		
	}
}