package com.company;

public class Player {
    private String name;
    //Class call creating a new BankAccount, named "account"
    private BankAccount account;
    private int currentPosition = 1;


    public Player(String name, int balance){
        this.name = name;
        this.account = new BankAccount(balance);
    }
    //Converting the string values to "humanfriendly" info!
    @Override
    public String toString(){

        return name+": "+ account.getBalance();
    }
    // both getters here arent used in the code atm.
    public String getName(){

        return name;
    }

    public int getBalance() {

        return account.getBalance();
    }

    public void buyProperty(int amount, int id){

        this.account.doTransaction(-amount);
    }

    private void receiveMoney(int amount){
        this.account.doTransaction(amount);
    }

    private void payRent(int amount, Player recipient){
        boolean result = recipient.account.doTransaction(amount);
        if(result == true) {
            this.account.doTransaction(-amount);
        }
    }

    public int getCurrentPosition(){

        return currentPosition;
    }

    public int updatePosition(int roll){
        currentPosition += roll;
        if(currentPosition > 40){
            currentPosition -= 40;
        }
        return currentPosition;
    }

}
