public class Encapsulation {
//take ex of bank
    private int balance;  //cannot access beacause of private access modifier
    public void deposit(int amt){
        if(amt>0){
            balance+=amt;
        }
        else{
            System.out.println("invalid amount");
        }
    }
    public void withdraw(int amt){
        if(amt>0 && amt<balance){
            balance-=amt;
        }
        else{
            System.out.println("insufficient balance");
        }
    }
}
