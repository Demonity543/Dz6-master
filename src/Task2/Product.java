package Task2;

public class Product {
    private String name;
    private String category;

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public Product(String name, String category) {
        this.name = name;
        this.category = category;
    }

    @Override
    public String toString() {
        return "\nName: " + name + "\nCategory: " + category;
    }
}
