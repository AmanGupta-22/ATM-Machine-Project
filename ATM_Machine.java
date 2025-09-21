package project_ATM_Machine;

import java.util.Scanner;

class ATM
{
	float balance;
	int pin=123;
	
	public void checkpin()
	{
		System.out.println("Enter your PIN please:");
		Scanner sc = new Scanner(System.in);
		int enteredpin = sc.nextInt();
		if(enteredpin==pin)
		{
			menu();
		}
		else {
			System.out.println("Invalid PIN");
			checkpin();
		}
	}
	public void menu() 
	{
		System.out.println("Enter Your choice: ");
		System.out.println("1. Check A/C balance");
		System.out.println("2. Withdraw Money");
		System.out.println("3. Deposit Money");
		System.out.println("4. Exit");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		if(option==1)
		{
			checkbalance();
		}
		else if(option==2) 
		{
			withdrawMoney();
		}
		else if(option==3) 
		{
			depositMoney();
		}
		else if(option==4) 
		{
			return;
		}
		else 
		{
			System.out.println("Enter a valid choice");
		}
		
	}
	
	public void checkbalance()
	{
		System.out.println("Balance: "+balance);
		menu();
	}
	public void withdrawMoney()
	{
		System.out.println("Enter Amt to withdraw: ");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		if(amount>balance)
		{
			System.out.println("Insufficient Balance");
		}
		else 
		{
			balance-=amount;
			System.out.println("Money Withdrawl Successfully");
			System.out.println("Remaining Amount:"+balance);
			
		}
		menu();
	}
	
	public void depositMoney()
	{
		System.out.println("Enter Amount to deposit: ");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		balance+=amount;
		System.out.println("Money Deposited Succesfully");
		menu();
		
	}
}

public class ATM_Machine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM obj= new ATM();
		obj.checkpin();

	}

}
