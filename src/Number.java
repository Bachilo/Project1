public class Number {
    private double balance;
    private String isoCode;
    private int priority;
    private boolean isMetal;
    private int number;

    public Number(int number,double balance,String isoCode, int priority, boolean isMetal) {
        this.number = number;
        this.balance = balance;
        this.isoCode = isoCode;
        this.priority = priority;
        this.isMetal = isMetal;
    }


}
