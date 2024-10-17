import java.util.ArrayList;
import java.util.List;

public class BundleProduct implements IProduct{

    private String name;
    private int price;
    private String description;

    private int discount;
    private List<IProduct> products;


    public BundleProduct(String name, int price, String description, int discount) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.discount = discount;
        this.products = new ArrayList<>();
    }

    public String showDetails() {
        return "Name: " + name + ", Price: " + price + ", Description: " + description;
    }

    public int calculatePrice() {
        int totalPrice=0;
        for (IProduct product : products) {
            totalPrice += product.calculatePrice();
        }
        return totalPrice - (totalPrice * discount / 100);
    }

    public void addProduct(IProduct product) {
        products.add(product);
    }

    public void show() {
        System.out.println("Bundle Offer : ");
        System.out.println("Name: " + name + ", Price: " + price + ", Description: " + description);
        for (IProduct product : products) {
            product.show();
        }
    }
}
