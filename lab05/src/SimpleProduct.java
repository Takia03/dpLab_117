public class SimpleProduct implements IProduct{

    private String name;
    private int price;
    private String description;


    public SimpleProduct(String name, int price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String showDetails() {
         return "Name: " + name + ", Price: " + price + ", Description: " + description;
    }

    public int calculatePrice() {
        return price;
    }

    public void show() {

        System.out.println("Name: " + name + ", Price: " + price + ", Description: " + description);
    }
}
