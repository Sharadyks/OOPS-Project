import java.sql.SQLOutput;

public class Beverage extends MenuItem{
    private boolean isHot;
    private String size;

    public Beverage(String name, double price, boolean isHot, String size){
        super(name, price);
        this.isHot = isHot;
        this.size = size;
    }

    @Override
    public void printDetails() {
        String temp = isHot ? "Hot" : "Iced";
        System.out.println("[Beverage]" + size + " " + temp + " " + getName() + " --Rs" + getPrice());
    }
}
