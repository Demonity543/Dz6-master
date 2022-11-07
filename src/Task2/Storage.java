package Task2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Storage {
    private Product[] products;

    public Storage(Product[] products) {
        this.products = products;
    }

    public List<Product> PrintProductLessFiveLetter() {
        Stream<Product> stream = Arrays.stream(products);
        List<Product> newList = stream.filter(s -> s.getName().length() < 5).toList();
        return newList;
    }

    public List<Product> PrintProducts(String letter) {
        Stream<Product> stream = Arrays.stream(products);
        List<Product> newList = stream.filter(s -> s.getName().startsWith(letter)).toList();
        return newList;
    }

    public List<Product> PrintCategory(String category) {
        Stream<Product> stream = Arrays.stream(products);
        List<Product> newList = stream.filter(s -> s.getCategory().toUpperCase() == "МОЛОКО").toList();
        return newList;
    }

    @Override
    public String toString() {
        String str = "";

        for (Product product : products) {
            str += product;
        }
        return str;
    }
}
