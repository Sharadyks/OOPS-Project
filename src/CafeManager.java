import java.util.Scanner;
public class CafeManager {
    private MenuItem[] cafeMenu = new MenuItem[6];
    private static int totalOrdersToday = 0;

    public CafeManager(){
        cafeMenu[0] = new Beverage("Cold Coffee",100, false,"Small");
        cafeMenu[1] = new Beverage("Masala Chai",25,true,"Small");
        cafeMenu[2] = new Beverage("Fruit Juice", 40, false, "medium");
        cafeMenu[3] = new Food("Masala Dosa",130,true);
        cafeMenu[4] = new Food("Sandwich", 35, true);
        cafeMenu[5] = new Food("Grilled Sandwich",60,false);
    }
    public void displayMenu(){
        System.out.println("\n -----Cafe Menu-----");
        for (int i=0; i< cafeMenu.length; i++){
            System.out.println((i+1)+". ");
            cafeMenu[i].printDetails();
        }
        System.out.println("----------------");
    }

    public static void main(String[] args) {
        CafeManager cafe = new CafeManager();
        Scanner scanner = new Scanner(System.in);

        // Initializing the system with a logged-in employee
        Employee cashier = new Employee("Sharad Sharma", "EIT209");

        System.out.println("=============================");
        System.out.println("   CAFE MANAGEMENT SYSTEM    ");
        System.out.println("=============================");
        System.out.println("Cashier Logged In: " + cashier.getName() + " (ID: " + cashier.getId() + ")");

        Order currentOrder = new Order();
        boolean systemRunning = true;

        // The main control loop
        while (systemRunning) {
            System.out.println("\n1. View Menu");
            System.out.println("2. Add Item to Order");
            System.out.println("3. Print Bill & Complete Order");
            System.out.println("4. Exit System");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    cafe.displayMenu();
                    break;
                case 2:
                    cafe.displayMenu();
                    System.out.print("Enter the item number to add (1-" + cafe.cafeMenu.length + "): ");
                    int itemNum = scanner.nextInt();

                    // Input validation using control flow
                    if (itemNum >= 1 && itemNum <= cafe.cafeMenu.length) {
                        currentOrder.addItem(cafe.cafeMenu[itemNum - 1]);
                    } else {
                        System.out.println("Invalid item number.");
                    }
                    break;
                case 3:
                    currentOrder.printBill();
                    totalOrdersToday++; // Incrementing the static counter
                    System.out.println("Total Customers Served Today: " + totalOrdersToday);

                    // Reset the order for the next customer
                    currentOrder = new Order();
                    break;
                case 4:
                    systemRunning = false;
                    System.out.println("Shutting down the terminal...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}

