import java.io.PrintStream;

public class BankAccount {

        static float fixedBalance = 5000;
        float accountBalance = 10000;
        String accHolderName, accHolderAccNo;
        String bankName =  "Pupils Bank";

        public void deposit(double amt){
                accountBalance += amt;
        }

        public void widthDraw(double amt){
                accountBalance -= amt;
        }

        public void printStatement(){
                System.out.println(bankName);
                System.out.println("----------------");
                System.out.println("Name : " + accHolderName);
                System.out.println("Account No. : " + accHolderAccNo);
                System.out.println("Current Balance = " + accountBalance);      
                System.out.println("***********************************************\n");
        }

        public void accHolder(String accHolderName, String accHolderAccNo){
                this.accHolderName = accHolderName;
                this.accHolderAccNo = accHolderAccNo;           
        }

        public static void main(String[] args) {

                BankAccount account = new BankAccount();
                account.accHolder("Vithushan", "074200120012627");
                account.widthDraw(1000.50);      
                account.printStatement();
                account.deposit(1068.25);
                account.printStatement();

        }
}