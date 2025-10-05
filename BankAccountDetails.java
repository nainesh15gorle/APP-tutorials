class BankAccount{
    int accountnumber;
    String accountholder;
    int balance;
    BankAccount(int accno,String acchol,int bal){
        accountnumber=accno;
        accountholder=acchol;
        balance=bal;
    }
    void displayBalance(){
        System.out.println("Accountnumber:"+accountnumber+"AccountHolder:"+accountholder+"Balance"+balance);
    }
}

class BankAccountDetails{
    public static void main(String[] args){
        BankAccount b1=new BankAccount(123,"nainesh",1237685);
        b1.displayBalance();
    }
}