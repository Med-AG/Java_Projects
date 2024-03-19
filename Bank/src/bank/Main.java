/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;


public class Main {
    
    public static void main(String[] args) {
     
        Account[] arrAccounts = new Account[3];
        
        arrAccounts[0] = new Account(12023, 200, 2);
        
        System.out.println(arrAccounts[0].toString());
        
        
    /*    Account testAccount = new Account(1122, 20000, 4.5);
        
        testAccount.Withdraw(2100);
        System.out.println("balance : "+testAccount.getBalance());
        
        testAccount.Deposit(3000);
        System.out.println("balance : "+testAccount.getBalance());
        
        System.out.println("the account information is : "
                +testAccount.toString());
        
     */   
        
    }
}
