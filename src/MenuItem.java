
public abstract class MenuItem {
    private String name;
    private double price;


    MenuItem(String name, double price){
        this.name = name;
        setPrice(price);
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }

    public void setPrice(double newPrice){
        if (newPrice>0){
            this.price = newPrice;
        } else {
            System.out.println("OOPS!! Price cannot be zero or negative");
        }
    }
    public abstract void printDetails();
}
