
public class Order {
    public static final double TAX_RATE = 0.05;

    private MenuItem[] cart = new MenuItem[10];
    private int itemCount = 0;

    public void addItem(MenuItem item){
        if (itemCount < cart.length){
            cart[itemCount] = item;
            System.out.println("-> " + item.getName()+ " is added in the cart");
            itemCount++;
        } else {
            System.out.println("Only 10 items can be added into cart at a time!!");
        }
    }

    public void printBill(){
        if (itemCount ==0){
            System.out.println("No orders are placed yet!");
        }
        System.out.println("\n==========Final Bill==========");
        double subtotal = 0;

        for (int i=0; i< itemCount; i++){
            cart[i].printDetails();
            subtotal += cart[i].getPrice();
        }
        double tax = TAX_RATE * subtotal;
        double total = tax + subtotal;

        System.out.println("--------------------");
        System.out.println("Subtotal: Rs: "+ subtotal);
        System.out.println("Tax "+"("+ TAX_RATE + ") : " + tax);
        System.out.println("Total: Rs: " + total);
        System.out.println("-----Thanks for Ordering!-----\n");

    }

}
