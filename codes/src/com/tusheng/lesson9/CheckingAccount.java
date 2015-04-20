package com.tusheng.lesson9;

public class CheckingAccount
{
   private int balance;
   private int number;
   public CheckingAccount(int number)
   {
      this.number = number;
   }
   public void deposit(int amount)
   {
      balance += amount;
   }
   public void withdraw(int amount) throws
                              InsufficientBalanceException
   {
      if(amount <= balance)
      {
         balance -= amount;
      }
      else
      {
         int needs = amount - balance;
         throw new InsufficientBalanceException(needs);
      }
   }
   public double getBalance()
   {
      return balance;
   }
   public int getNumber()
   {
      return number;
   }
   
   public static void main(String [] args)
   {
      CheckingAccount c = new CheckingAccount(101);
      System.out.println("Depositing $500...");
      c.deposit(500);
      try
      {
         System.out.println("\nWithdrawing $100...");
         c.withdraw(100);
         System.out.println("\nWithdrawing $600...");
         c.withdraw(600);
      }catch(InsufficientBalanceException e)
      {
         System.out.println("Sorry, but you are short $"
                                  + e.getAmount());
         e.printStackTrace();
      }
    }
}
