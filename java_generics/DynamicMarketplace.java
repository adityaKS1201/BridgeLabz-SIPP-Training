class Product<T> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public T getCategory() { return category; }
}

class BookCategory { public String toString() { return "Book"; } }
class ClothingCategory { public String toString() { return "Clothing"; } }
class GadgetCategory { public String toString() { return "Gadget"; } }

public class DynamicMarketplace {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discountedPrice = product.getPrice() - (product.getPrice() * percentage / 100);
        product.setPrice(discountedPrice);
    }

    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Programming", 500, new BookCategory());
        Product<ClothingCategory> shirt = new Product<>("T-Shirt", 300, new ClothingCategory());

        applyDiscount(book, 10);
        applyDiscount(shirt, 20);

        System.out.println(book.getName() + " - Price after discount: " + book.getPrice());
        System.out.println(shirt.getName() + " - Price after discount: " + shirt.getPrice());
    }
}
