package com.techment.Day5;
class Customer
{
	int custId;
	String custName;
	String addr;
	Account account;
	public Customer(int custId, String custName, String addr, Account account) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.addr = addr;
		this.account = account;
	}
    void displayCustomerInfo()
    {
    	System.out.println("*******Customer Details : ***********");
    	System.out.println("Customer Id: "+custId);
    	System.out.println("Customer Name: "+custName);
    	System.out.println("Address: "+addr);
    	System.out.println("Account Number: "+account.accNo);
    	System.out.println("Account Type: "+account.accType);
    	System.out.println("Balance: "+account.balance);
    	System.out.println("IFSC Code: "+account.ifscCode);
    	System.out.println("Branch: "+account.branch);
    }
	
}
class Account
{
	long accNo;
	String accType;
	int balance;
	String ifscCode;
	String branch;
	public Account(long accNo, String accType, int balance, String ifscCode, String branch) {
		super();
		this.accNo = accNo;
		this.accType = accType;
		this.balance = balance;
		this.ifscCode = ifscCode;
		this.branch = branch;
	}
	
}
public class HasARelation_Task2 {

	public static void main(String[] args) {
		Account acc= new Account(5574351011455025l,"Saving",10000, "SBIN0014512", "BTM 4th Stage");
		Customer customer= new Customer(101,"Shikha"," Koramangala Banglore",acc);
		customer.displayCustomerInfo();
	}

}
