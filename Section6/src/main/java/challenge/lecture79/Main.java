package challenge.lecture79;

public class Main {
    public static void main(String[] args) {
        VipCustomer vip1 = new VipCustomer();
        System.out.println("\nName: "+vip1.getName()+
                "\nEmail: "+vip1.getEmailAddress()+
                "\nCreditLimit: "+vip1.getCreditLimit());

        VipCustomer vip2 = new VipCustomer("Omprakash Paliwal","om_paliwal@gmail.com");
        System.out.println("\nName: "+vip2.getName()+
                "\nEmail: "+vip2.getEmailAddress()+
                "\nCreditLimit: "+vip2.getCreditLimit());
        VipCustomer vip3 = new VipCustomer("Manish Paliwal","mnpaliwal@gmail.com", 10000000);
        System.out.println("\nName: "+vip3.getName()+
                "\nEmail: "+vip3.getEmailAddress()+
                "\nCreditLimit: "+vip3.getCreditLimit());

    }
}
