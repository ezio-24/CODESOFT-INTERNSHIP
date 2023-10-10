package CodeSoft.ATMInterface;
public class ATM {
        private BankAccount account;
    
    
        public ATM(BankAccount account){
            this.account = account;
        }
    
    
        public void withdraw(double amount){
            if(amount > 0 && amount <= account.getBalance()){
                account.setBalance(account.getBalance() - amount);
                System.out.println("Withdrawal successful. Updated balance: \u001B[32m" + account.getBalance() + "\u001B[0m");
            }else {
                System.out.println("\u001B[31mInsufficient balance or invalid withdrawal amount.\u001B[0m");
            }
        }
    
        public void deposit (double amount){
            if(amount > 0) {
                account.setBalance(account.getBalance() + amount);
                System.out.println("Deposit successful. Updated balance: " + account.getBalance());
        }else{
            System.out.println("Invalid deposit amount.");
        }
    }
    
        public void checkBalance(){
            System.out.printf("%s's current balance is %f",this.account, this.account.getBalance());
        }
    }