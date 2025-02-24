public class App {
    // 店铺信息
    public String storeName;
    public String storeAddress;
    public String storeEmail;
    public long storePhone;
    public String storeMenu;

    // 披萨信息
    private String pizzaIngredients;
    private double pizzaPrice;

    // 小吃和饮料
    private String sides;
    private String drinks;

    // 订单信息
    private String orderID;
    private double orderTotal;

    // 构造函数
    public App(String name, String address, String email, long phone, String menu) {
        this.storeName = name;
        this.storeAddress = address;
        this.storeEmail = email;
        this.storePhone = phone;
        this.storeMenu = menu;
    }

    // 接受订单
    public void takeOrder(String id, String ingredients, double price, String sides, String drinks) {
        this.orderID = id;
        this.pizzaIngredients = ingredients;
        this.pizzaPrice = price;
        this.sides = sides;
        this.drinks = drinks;
        this.orderTotal = price + 5.0; // 假设小吃和饮料的固定费用为5.0

        System.out.println("Order accepted!");
        System.out.println("Order is being prepared...");

        makePizza();
    }

    // 制作披萨
    private void makePizza() {
        try {
            Thread.sleep(5000); // 模拟制作披萨的时间
        } catch (InterruptedException e) {
            System.out.println("Pizza preparation interrupted!");
        }

        System.out.println("Your pizza is ready!");
        printReceipt();
    }

    // 打印收据
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
        // 创建店铺实例
        App store = new App("Slice-o-Heaven", "123 Pizza Lane", "contact@sliceoheaven.com", 1234567890, "Pizza, Sides, Drinks");

        // 接受订单
        store.takeOrder("ORDER123", "Pepperoni, Cheese, Tomato Sauce", 10.99, "Garlic Bread", "Coke");
    }
}