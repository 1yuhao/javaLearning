package javaLearning_02;

public class VendingMachine {
    int price = 80;
    int balance;
    int tolal;

    VendingMachine() {
        int total = 0;
        System.out.println(total);
    }

    VendingMachine(int price) {
        int total = 0;
        System.out.println(total);
    }

    void showPrompt() {
        System.out.println("Welcome");
    }

    void insertMomey(int amount) {
        balance = balance + amount;
        showBalance();
    }

    void showBalance() {
        System.out.println(balance);
    }

    void getFood() {
        if (balance >= price) {
            System.out.println("Here you are");
            balance = balance - price;
            tolal = tolal + price;
            showBalance();
        } else {
            System.out.println("PLZ prvoid your momey!!");
        }
    }

    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        vm.showPrompt();
        vm.insertMomey(100);
        vm.getFood();
        VendingMachine vm1 = new VendingMachine(100);

    }
}
