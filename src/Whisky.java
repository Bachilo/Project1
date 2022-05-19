import java.util.ArrayList;
import java.util.List;

public class Whisky {
    private int price;
    private String model;
    private int year;

    public Whisky (int price, String model, int year) {
        this.price = price;
        this.model = model;
        this.year = year;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public static void main(String[] args) {
        List<Whisky> whisky = new ArrayList<>();
        Whisky Chivas = new Whisky(10000,"Chivas", 1987);
        Whisky Jameson = new Whisky(2500,"Jameson", 2005);
        Whisky GlenMacken = new Whisky(4200,"GlenMacken",1967);
    }
}
