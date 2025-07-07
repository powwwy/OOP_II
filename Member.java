// Member class to represent a SACCO member

class Member {
    private int memberId;
    private String name;
    // Other member attributes can be added as needed

    // Constructor
    public Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    // Getter for memberId
    public int getMemberId() {
        return memberId;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Other getters and setters can be added here
}

// Account class to represent a member's bank account
class Account {
    private int accountId;
    private Member member;
    private double balance;
    // Other account attributes can be added

    // Constructor
    public Account(int accountId, Member member, double balance) {
        this.accountId = accountId;
        this.member = member;
        this.balance = balance;
    }

    // Getter for accountId
    public int getAccountId() {
        return accountId;
    }

    // Getter for associated member
    public Member getMember() {
        return member;
    }

    // Getter for account balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit funds into the account
    public void deposit(double amount) {
        this.balance += amount;
    }

    // Method to withdraw funds if balance is sufficient
    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    // Other getters and setters can be added here
}

// Loan class to represent a loan taken against an account
class Loan {
    private int loanId;
    private Account account;
    private double amount;
    private double interestRate;
    // Other loan attributes can be added

    // Constructor
    public Loan(int loanId, Account account, double amount, double interestRate) {
        this.loanId = loanId;
        this.account = account;
        this.amount = amount;
        this.interestRate = interestRate;
    }

    // Getter for loanId
    public int getLoanId() {
        return loanId;
    }

    // Getter for associated account
    public Account getAccount() {
        return account;
    }

    // Getter for loan amount
    public double getAmount() {
        return amount;
    }

    // Getter for interest rate
    public double getInterestRate() {
        return interestRate;
    }

    // Other getters and setters can be added here
}

// Transaction class to represent deposits or withdrawals
class Transaction {
    private int transactionId;
    private Account account;
    private String type; // "Deposit" or "Withdrawal"
    private double amount;

    // Constructor
    public Transaction(int transactionId, Account account, String type, double amount) {
        this.transactionId = transactionId;
        this.account = account;
        this.type = type;
        this.amount = amount; // Fixed this line
    }

    // Getter for transactionId
    public int getTransactionId() {
        return transactionId;
    }

    // Getter for associated account
    public Account getAccount() {
        return account;
    }

    // Getter for transaction type
    public String getType() {
        return type;
    }

    // Getter for transaction amount
    public double getAmount() {
        return amount;
    }

    // Other getters and setters can be added here
}

// Main class to run the SACCO application
class SaccoApp {
    public static void main(String[] args) {
        // Create a member
        Member member1 = new Member(1, "John Doe");

        // Create an account for the member with an initial balance of 1000
        Account account1 = new Account(101, member1, 1000);

        // Create a loan against the member's account
        Loan loan1 = new Loan(201, account1, 500, 0.05);

        // Create a deposit transaction
        Transaction transaction1 = new Transaction(301, account1, "Deposit", 200);

        // Print sample output
        System.out.println("Member Name: " + member1.getName());
        System.out.println("Account Balance: " + account1.getBalance());
        System.out.println("Loan Amount: " + loan1.getAmount());
        System.out.println("Transaction Type: " + transaction1.getType());
    }
}

