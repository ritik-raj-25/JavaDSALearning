package OOPs;

class Account{
    private double balance; //Data hiding (security)
    
    //Methods :: public
    public double getBalance(double balance){
        //perform authentication
        boolean result = validate("ritik-raj-25","ritik@oops");
        if(result == true){
            this.balance = this.balance - balance;
            return balance;
        }
        else{
            //throw a meaningful message to the user
            System.out.println("Invalid username/password try again..."); 
            return 0.0;
        }
    }
    public void setBalance(double balance){
        //perform authentication
        boolean result = validate("ritik-raj-25","ritik@oops");
        if(result == true){
            //deposite the money
            this.balance = this.balance + balance;
            System.out.println("Crediated to the account");
        }
        else{
            //throw a meaningful message to the user
            System.out.println("Invalid username/password try again..."); 
        }
    }

    //Method :: private
    private boolean validate(String userName, String password){
        //logic for authentication
        return userName.equalsIgnoreCase("ritik-raj-25") && password.equals("ritik@oops");
    }
}

public class DataHiding{
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setBalance(1000.0);

        double balance = acc.getBalance(500.0);
        System.out.println("Withdrawing ::"+balance+" amount");
    }
}