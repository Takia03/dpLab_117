// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args){
        IProduct simpleProduct = new SimpleProduct("abc",100,"def");
        IProduct simpleProduct2 = new SimpleProduct("def",200,"erty");
        simpleProduct.show();
        simpleProduct2.show();
        BundleProduct bundleProduct = new BundleProduct("wertrtu", 300, "rtyu",10);
        System.out.println(bundleProduct.showDetails());
        bundleProduct.addProduct(simpleProduct);



        bundleProduct.show();

        System.out.println(" bundle offer discount Price"+ + bundleProduct.calculatePrice());
    }
}