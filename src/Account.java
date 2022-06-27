import java.util.ArrayList;
import java.util.List;

public class Account {
    private double balance;
    private String isoCode;
    private int priority;
    private boolean isMetal;
    private int number;

    public Account(int number, double balance, String isoCode, int priority, boolean isMetal) {
        this.number = number;
        this.balance = balance;
        this.isoCode = isoCode;
        this.priority = priority;
        this.isMetal = isMetal;
    }

    public String toString() {
        return "Account number " + number + " balance " + balance + " currency " + isoCode + "-" + priority;
    }

}
