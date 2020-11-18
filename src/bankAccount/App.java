package bankAccount;

public class App {
    public static void main(String[] args) {
        BankAccount erjonAccount = new BankAccount("123456", 500.0, "erjon domi", "erjondomi@hotmail.com", "2034062545");


        System.out.println(erjonAccount.getAccountNumber());
        erjonAccount.deposit(100);
        erjonAccount.withdrawal(50);
        erjonAccount.getPhoneNumber();
        VipCucstomer vip1 = new VipCucstomer();
        System.out.println(vip1.getName());
        VipCucstomer vip2 = new VipCucstomer("eroon", 300.00);
        System.out.println(vip2.getName());
        VipCucstomer vip3 = new VipCucstomer("eriiccc", 70000.00, "erjon147852");
        System.out.println(vip3.getName());
        System.out.println(vip1.getCreditLimit());
        System.out.println(vip2.getEmailAdress());
    }
}
