import java.util.Scanner;
import java.util.ArrayList;

public class Smart_Digital_Wallet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();
        ArrayList<Transaction> transactions = new ArrayList<>();
        
        System.out.println("\n-------------------------------------------------------------------");
        System.out.println("                           Smart Digital Wallet");
        System.out.println("\n-------------------------------------------------------------------");
        
        //UserInput
        System.out.println("\n--- Create New Account ---");
        
        System.out.print("Enter User ID(Integer): ");
        int userId = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        while (name == null || name.isEmpty()) {
            System.out.print("Name cannot be empty! Enter again: ");
            name = scanner.nextLine();
        }
        
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        while (email == null || email.isEmpty() || !email.contains("@")) {
            System.out.print("Enter valid email (must contain @): ");
            email = scanner.nextLine();
        }
        
        System.out.print("Enter Phone Number (11 digits): ");
        String phone = scanner.nextLine();
        while (phone == null || phone.length() != 11) {
            System.out.print("Enter valid 11-digit phone number: ");
            phone = scanner.nextLine();
        }
        
        System.out.print("Enter Wallet ID: ");
        String walletId = scanner.nextLine();
        while (walletId == null || walletId.isEmpty()) {
            System.out.print("Wallet ID cannot be empty! Enter again: ");
            walletId = scanner.nextLine();
        }
        
        System.out.print("Enter Initial Balance: ");
        double balance = scanner.nextDouble();
        scanner.nextLine();
        while (balance < 0) {
            System.out.print("Balance cannot be negative! Enter again: ");
            balance = scanner.nextDouble();
            scanner.nextLine();
        }
        
        System.out.print("Enter Currency (PKR/USD): ");
        String currency = scanner.nextLine();
        while (currency == null || (!currency.equals("PKR") && !currency.equals("pkr") && !currency.equals("USD") && !currency.equals("usd") )) {
            System.out.print("Enter valid currency (PKR/USD): ");
            currency = scanner.nextLine();
        }
        


        //Composition
        User user = new User(userId, name, email, phone, true, new Wallet(walletId, balance, currency, "Active"));
        users.add(user);
        
        //Composition
        System.out.println("\n--- Creating Default Receiver Account ---");
        User receiver = new User(999, "Receiver", "receiver@gmail.com", "03000000000", true, new Wallet("R999", 10000, "PKR", "Active"));
        users.add(receiver);
        System.out.println("Default Receiver created with ID: "+receiver.getUserId() +", Name: "+receiver.getName());


        
        //Authentication
        Authentication auth = new Authentication(user);
        System.out.print("\nEnter password to login: ");
        String password = scanner.nextLine();
        
        if (!auth.isAuthentical(user) || !auth.login(user, password)) {
            System.out.println("Authentication failed!");
            return;
        }
        
        System.out.println("Logged in successfully as " + user.getName());
        
        //Menu
        int choice;
        do {
            System.out.println("\n-------------------------------------------------------------------");
            System.out.println("                    MAIN MENU");
            System.out.println("-------------------------------------------------------------------");
            System.out.println("1. View Profile");
            System.out.println("2. Check Balance");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Transfer Money");
            System.out.println("6. View Transaction History");
            System.out.println("7. Logout");
            System.out.println("-------------------------------------------------------------------");
            System.out.print("Enter choice (1-7): ");
            
            choice = scanner.nextInt();
            scanner.nextLine();
            
            if (choice == 1) {
                // View Profile
                System.out.println("\n--- User Profile ---");
                user.displayUserDetails();
                
            } 
            else if (choice == 2) {
                // Check Balance
                System.out.println("\n--- Current Balance ---");
                System.out.println("Wallet ID: " + user.getWallet().getWalletId());
                System.out.println("Balance: " + user.getWallet().getBalance() + " " + user.getWallet().getCurrency());
                System.out.println("Status: " + user.getWallet().getStatus());
                
            } 
            else if (choice == 3) {
                // Deposit
                System.out.println("\n--- Deposit Money ---");
                System.out.print("Enter amount to deposit: ");
                double amount = scanner.nextDouble();

                scanner.nextLine();
                while (amount <= 0) {
                    System.out.print("Amount must be > 0! Enter again: ");
                    amount = scanner.nextDouble();
                    scanner.nextLine();
                }
                
                System.out.print("Enter reference number(In Integers): ");
                int refNum = scanner.nextInt();
                scanner.nextLine();
                
                System.out.print("Enter timestamp (YYYY-MM-DD): ");
                String timeStamp = scanner.nextLine();
                

                //RunTime Polymorphism
                Transaction deposit = new Deposit(refNum, 12345678, timeStamp, amount, user);
                transactions.add(deposit);
                
                System.out.println("\nBefore deposit:");
                System.out.println(deposit.getDetails());
                
                //Transaction is abstract class thats why i'm using type castng here
                ((Deposit) deposit).deposit(amount, refNum);
                
                System.out.println("\nDeposit successful!");
                System.out.println("After deposit:");
                System.out.println(deposit.getDetails());
                
            } 
            else if (choice == 4) {
                // Withdraw
                System.out.println("\n--- Withdraw Money ---");
                System.out.print("Enter amount to withdraw: ");
                double amount = scanner.nextDouble();

                scanner.nextLine();
                while (amount <= 0) {
                    System.out.print("Amount must be > 0! Enter again: ");
                    amount = scanner.nextDouble();
                    scanner.nextLine();
                }
                
                
                System.out.print("Enter OTP (true/false): ");
                String otp = scanner.nextLine();
                while (otp == null || (!otp.equals("true") && !otp.equals("false"))) {
                    System.out.print("Enter true or false: ");
                    otp = scanner.nextLine();
                }

                boolean isOtpVerified;
                if(otp.equals("true")){
                    isOtpVerified=true;
                }
                else{
                    isOtpVerified=false;
                }

                
                System.out.print("Enter timestamp (YYYY-MM-DD): ");
                String timeStamp = scanner.nextLine();
                
                //RunTime Polymorphism
                Transaction withdraw = new Withdraw(isOtpVerified, 908908908, timeStamp, amount, user);
                transactions.add(withdraw);
                
                System.out.println("\nBefore withdraw:");
                System.out.println(withdraw.getDetails());
                
                ((Withdraw) withdraw).withdraw(amount, isOtpVerified);
                
                System.out.println("\nAfter withdraw:");
                System.out.println(withdraw.getDetails());
                
            } 
            else if (choice == 5) {
                // Transfer
                System.out.println("\n--- Transfer Money ---");
    
                System.out.println("Transferring to: " + receiver.getName() + " (ID: " + receiver.getUserId() + ")");
    
                System.out.print("Enter amount to transfer: ");
                double amount = scanner.nextDouble();
    
                while(amount<0){
                    System.out.print("Amount must be greater than 0!");
                    amount = scanner.nextDouble();
                }
                scanner.nextLine();

                    System.out.print("Enter timestamp (YYYY-MM-DD): ");
                    String timeStamp = scanner.nextLine();
        
                    //RunTime Polymorphism
                    Transaction transfer = new Transfer(54325432, timeStamp, amount, user, receiver);
                    transactions.add(transfer);
        
                    System.out.println("\nBefore transfer:");
                    System.out.println(transfer.getDetails());
        
                    ((Transfer) transfer).transfer(amount);
        
                    System.out.println("\nAfter transfer:");
                    System.out.println(transfer.getDetails());
            } 
            else if (choice == 6) {
                //Transaction History
                System.out.println("\n--- Transaction History ---");
                if (transactions.isEmpty()) {
                    System.out.println("No transactions yet.");
                } 
                else {
                    int count = 1;
                    for (Transaction t : transactions) {
                        System.out.println("\nTransaction #" + count++);
                        System.out.println(t.getDetails()); 
                        System.out.println("----------------------------------------");
                    }
                }
                
            }  
            else if (choice == 7) {
                // Logout
                System.out.println("\n--- Logging Out ---");
                auth.logout();
                System.out.println("Goodbye, " + user.getName() + ":)");
                System.out.println("\n-------------------------------------------------------------------");
            } 
            else {
                System.out.println("Invalid choice! Please select 1-7.");
            }
            
        } while (choice != 7);
        
    }//main
}//Smart_Digital_Wallet