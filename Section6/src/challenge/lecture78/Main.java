package challenge.lecture78;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(29000);
        account.withdraw(15000);
        System.out.println(account.toString());

        BankAccount account1 = new BankAccount("Manish",
                "(+91) 4440004445","mnpaliwal@gmail.com");
        account.deposit(29000);
        account.withdraw(15000);
        System.out.println(account1.toString());


        BankAccount account2 = new BankAccount("12346",120000,"OmPrakash",
                "(+91) 4440004444","om_paliwal@gmail.com");
        account.deposit(29000);
        account.withdraw(15000);
        System.out.println(account2.toString());
    }
}
