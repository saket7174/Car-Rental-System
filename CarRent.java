package com.Car.Test;
import java.util.*;

public class CarRent {

	String userName = "ABC", uName;
	int userid = 123, balance = 0, uid, menue, amount;
	String options[] = new String[5];
	Scanner r = new Scanner(System.in);

//////////////////////////////////////////////////////////////////////////////////////////	
	boolean Login() {
		System.out.println("Enter user name ");
		uName = r.next();
		System.out.println("Enter user id ");
		uid = r.nextInt();

		if (userName == (userName) && uid == userid) {
			System.out.println("Login Successful..........!");
			Operations();
			return true;
		} else {
			System.out.println("Login Failed,Invalid Credentials........!\n");
			return false;
		}
	}

//////////////////////////////////////////////////////////////////////////////////////////
	void exit() {
		System.out.println("ThankYou for using SBI");
		System.exit(0);
	}

/////////////////////////////////////////////////////////////////////////////////////////
	void Transfer() {
		if (balance >= amount) {
			balance = balance - amount;
			System.out.println("Your New Account balance is " + amount + "is Rs" + balance);
		} else {
			System.out.println("InSufficient Balance ");
		}
	}

////////////////////////////////////////////////////////////////////////////////////////
	void withdraw() {
		if (balance > amount) {
			balance = balance - amount;
			System.out.println("Your Account Balance after Withdrawel of Rs :" + amount + "is Rs " + balance);
		} else

		{
			System.out.println("Insufficient Balance ");
		}
	}

/////////////////////////////////////////////////////////////////////////////////////////
	void Deposite() {

balance=balance+amount;
System.out.println("Your new Account Balance is "+balance+"Rs"+amount);
	}
/////////////////////////////////////////////////////////////////////////////////////////
	void CheckBalance() {
System.out.println("Your Account Balance  is ");
System.out.println(balance);
System.out.println("-----------------------------------------------------");
	}
//////////////////////////////////////////////////////////////////////////////////////////
	void Operations() {
System.out.println("Select Your Option :");
System.out.println("......................................................");
	options[0]= "Available Cars ";
	options[1]= "Rent a car ";
	options[2]= "choose a car ";
	options[3]= "Car Service Request ";
	options[4]= "Exit";
	
	for (int i=0; i< options.length;i++) {
		System.out.println(i + 1 + " " + options[i]);
		
	}
	System.out.println(".....................................................");
	do {
		System.out.println("Select your Operation");
		menue=r.nextInt() -1;
		switch (menue) {
		case 0: {
			
		CheckBalance();
		break;
			
		}
		case 1: {
		System.out.println("Enter the Amount to be Deposited ");	
			amount= r.nextInt();
			Deposite();
			break;
		}
		case 2: {
		System.out.println("Enter the amount ot be withdrawn");	
		amount=r.nextInt();
		withdraw();
		break;	
		}
		case 3:{
			System.out.println("Enter the Amount ot be Transferred ");
			amount = r.nextInt();
			Transfer();
			break;
		}
		case 4: {
			Exit();
			break;
			}
		default:
			throw new IllegalArgumentException("Unexpected value:" + (menue + 1));
	}
} while (menue < 4);
r.close();
		}
		
private void Exit() {
	// TODO Auto-generated method stub
	
}

///////////////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(".......Welcome Car Renting DashBoard  ........");
CarRent bank = new CarRent();
bank.Login();
	}

}
