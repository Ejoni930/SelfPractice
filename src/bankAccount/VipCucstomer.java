package bankAccount;

public class VipCucstomer {
    private String name;
    private double creditLimit;
    private String emailAdress;

    public VipCucstomer() {
        this("eric", 5000.00, "eric@gmail.com");
    }

    public VipCucstomer(String name, double creditLimit) {
         this(name,creditLimit,"erjoni123@hotmail.com");
    }
    public VipCucstomer(String name , double creditLimit, String emailAdress){
        this.name=name;
        this.creditLimit=creditLimit;
        this.emailAdress=emailAdress;
    }

    public String getName() {

        return name;
    }

    public double getCreditLimit() {

        return creditLimit;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

}
