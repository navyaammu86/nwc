package com.hdfc.loans.carloans;

public interface Rbi 
{
    public void withdrawl();
    public void deposit();
    public static void main (String[] args)
    {
       Rbi obj=new Rbi();
       Rbi i;
       
       i= new icici();
       i.deposit();
       i.withdrawl();
      
       i= new Kotak();
       i.deposit();
       i.withdrawl();
       
       i= new hdfc();
       i.deposit();
       i.withdrawl();
    }
}
