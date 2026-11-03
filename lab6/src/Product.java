public class Product {
    private String name;
    private double price;
    private String category;
    private boolean available;
    private static int productCount = 0;

    public Product(String name, double price, String category, boolean available){
        this.name = name;
        this.price = price;
        this.category = category;
        this.available = available;
        productCount++;
    }

    public static int getProductCount() {
        return productCount;
    }

    public void printInfo(){
        System.out.print(name + ", cena: " + price + ", należy do kategorii " + category + " i jest aktualnie ");
        if(available)System.out.println("dostępny");else System.out.println("niedostępny");
    }
}
