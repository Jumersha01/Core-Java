package com.junaid.predifined_functional_interface;
import java.util.function.Function;

class Transaction{
	String  accountNumber;
	double amount;
	String type;
	Transaction(String accountNumber,double amount,String type){
		this.accountNumber=accountNumber;
		this.amount = amount;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Transaction [accountNumber=" + accountNumber + ", amount=" + amount + ", type=" + type + "]";
	}
	
}
public class TransactionDemo {
   void main() {
	   
	   Function<Transaction,Transaction> processingTransaction =transaction->{
		   Transaction modifiedTransaction = null;
		   double bonusAmount = (transaction.amount)+(transaction.amount*0.05);
		   if(transaction.type.equalsIgnoreCase("Deposit")) {
			   
			   modifiedTransaction = new Transaction(transaction.accountNumber,bonusAmount,transaction.type);
		   }
		   else if(transaction.type.equalsIgnoreCase("Withdraw")){
			   double amountTobeDeduct = 0.0;
			   
			   amountTobeDeduct  = (transaction.amount)-(transaction.amount*0.02);
			   if(transaction.amount>100000) {
				   amountTobeDeduct  = (transaction.amount)-(transaction.amount*0.01);
			   }
			   modifiedTransaction = new Transaction(transaction.accountNumber,amountTobeDeduct,transaction.type);
		   }
		   return modifiedTransaction;
	   };
	   
	   String accountNumber = IO.readln("Enter Account Number: ");
	   double amount = Double.parseDouble(IO.readln("Enter Amount: "));
	   String type = IO.readln("Enter type: ");
	   
	   Transaction tr = new Transaction(accountNumber,amount,type);
	   IO.println("The Modified Transcation Object is as follow: ");
	   
	    Transaction tr2 = processingTransaction.apply(tr);
	    IO.println("Original Amount:"+tr.amount);
	    IO.println("Processed Amount:"+tr2.amount);
	   
   }
}
