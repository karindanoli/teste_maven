package operacoes;

public class Operacao {

    private int number;
    private String holder;
    private double initial;


    public Operacao(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }


    public Operacao(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public void deposit(double amount) {
        initial += amount;
    }

    public void withdraw(double amount) {
        initial -= amount + 5;
    }

    public String toString() {
        return "Account Data:"
                + number
                + ", Holder:"
                + holder
                + ", Balance: $ "
                + String.format("%.2f", initial);

    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getInitial() {
        return initial;
    }

}