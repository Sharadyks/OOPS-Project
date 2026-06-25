
public class Food extends MenuItem {
    private boolean isVegetarian;

    public Food(String name, double price, boolean isVegetarian){
        super(name,price);
        this.isVegetarian = isVegetarian;
    }

    @Override
    public void printDetails() {
        String type = isVegetarian ? "Vegetarian" : "Non-Vegeterian";
        System.out.println("Food"+" "+ getName()+ " "+ type+ " "+ getPrice());
    }
}
