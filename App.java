public class App {
    public String storeName;
    public String storeAddress;
    public String storeEmail;
    public long storePhone;
    public String storeMenu;

    private String pizzaIngredients;
    private double pizzaPrice;

    private String sides;
    private String drinks;

    private String orderID;
    private double orderTotal;

    public static final String DEF_ORDER_ID = "DEF-SOH-099";
    public static final String DEF_PIZZA_INGREDIENTS = "Mozzarella Cheese";
    public static final double DEF_ORDER_TOTAL = 15.00;

    public App() {
        this.orderID = DEF_ORDER_ID;
        this.pizzaIngredients = DEF_PIZZA_INGREDIENTS;
        this.orderTotal = DEF_ORDER_TOTAL;
        this.sides = "None";
        this.drinks = "None";
    }

    public App(String orderID, String pizzaIngredients, double orderTotal) {
        this.orderID = orderID;
        this.pizzaIngredients = pizzaIngredients;
        this.orderTotal = orderTotal;
        this.sides = "None";
        this.drinks = "None";
    }

    public App(String name, String address, String email, long phone, String menu) {
        this.storeName = name;
        this.storeAddress = address;
        this.storeEmail = email;
        this.storePhone = phone;
        this.storeMenu = menu;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

    public String getPizzaIngredients() {
        return pizzaIngredients;
    }

    public void setPizzaIngredients(String pizzaIngredients) {
        this.pizzaIngredients = pizzaIngredients;
    }

    public String getSides() {
        return sides;
    }

    public void setSides(String sides) {
        this.sides = sides;
    }

    public String getDrinks() {
        return drinks;
    }

    public void setDrinks(String drinks) {
        this.drinks = drinks;
    }

    public void takeOrder(String id, String ingredients, double price, String sides, String drinks) {
        this.orderID = id;
        this.pizzaIngredients = ingredients;
        this.pizzaPrice = price;
        this.sides = sides;
        this.drinks = drinks;
        this.orderTotal = price + 5.0;

        System.out.println("Order accepted!");
        System.out.println("Order is being prepared...");

        makePizza();
    }

    private void makePizza() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Pizza preparation interrupted!");
        }

        System.out.println("Your pizza is ready!");
        printReceipt();
    }

    private void printReceipt() {
        System.out.println("******** RECEIPT ********");
        System.out.println("Store Name: " + storeName);
        System.out.println("Store Address: " + storeAddress);
        System.out.println("Order ID: " + orderID);
        System.out.println("Pizza Ingredients: " + pizzaIngredients);
        System.out.println("Sides: " + sides);
        System.out.println("Drinks: " + drinks);
        System.out.println("Order Total: $" + orderTotal);
        System.out.println("*************************");
    }

    public static void main(String[] args) {
        App store = new App("Slice-o-Heaven", "123 Pizza Lane", "contact@sliceoheaven.com", 1234567890, "Pizza, Sides, Drinks");

        store.takeOrder("ORDER123", "Pepperoni, Cheese, Tomato Sauce", 10.99, "Garlic Bread", "Coke");
    }
}