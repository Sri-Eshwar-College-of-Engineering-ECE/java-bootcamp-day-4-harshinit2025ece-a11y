class Bankacc {
    int accountNumber;
    double balance;
    static String bankName = "State Bank";

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Bank Name: " + bankName);
        System.out.println();
    }

    public static void main(String[] args) {
        Bankacc a1 = new Bankacc();
        a1.accountNumber = 1001;
        a1.balance = 15000;

        Bankacc a2 = new Bankacc();
        a2.accountNumber = 1002;
        a2.balance = 25000;

        a1.display();
        a2.display();
    }
}