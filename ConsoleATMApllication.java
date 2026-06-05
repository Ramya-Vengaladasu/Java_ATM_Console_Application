import java.util.Scanner;
class ConsoleATMApllication {
    
    // Method to display ATM menu
    static void showMenu(){
        System.out.println("\n===== ATM Menu =====");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. With Draw");
        System.out.println("4. Exit");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ATM System!!");
        
        // Initial balance
        int balance =1000;
        int replay;
        do {
            // Display menu options
            showMenu();
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            
            switch(choice) {
                // Check balance
                case 1:
                    System.out.println("Remaining Balance: " + balance);
                    break;
                    
                // Deposit money
                case 2:
                    System.out.print("Enter deposit amount: ");
                    int deposit = sc.nextInt();
                    if (deposit > 0) {
                        balance = deposit + balance;
                        System.out.println("Amount deposited successfully.");
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    System.out.println("Current Balance: " + balance);
                    break;
                
                // Withdraw money
                case 3:
                    System.out.print("Enter withdraw amount: ");
                    int withdraw = sc.nextInt();
                    if(withdraw <= balance) {
                        balance = balance - withdraw;
                        System.out.println("Withdrawal successful.");
                    } else {
                        System.out.println("Insufficient amount");
                    }
                    System.out.println("Current Balance: " + balance);
                    break;
                    
                // Withdraw money
                case 4:
                    System.out.println("Thank You for using ATM!");
                    return;
                    
                default:
                    System.out.println("Invalid choice! Please select 1-4.");
            }
            
            System.out.println("\nDo you want to use ATM again? (Y/N)");
            replay = sc.next().charAt(0);
            
        } while(replay == 'y' || replay == 'Y');
        
        System.out.println("Thank You for using ATM!");
    }
}