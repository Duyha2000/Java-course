package session15.business;

import session15.entity.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductBusiness implements IProductDesign {
    public static List<Product> products = new ArrayList<>();

    @Override
    public boolean create(Product product) {
        return products.add(product);
    }

    @Override
    public boolean update(Product product) {
        Product existingProduct = findById(product.getProductId());
        if (existingProduct == null) return false;
        int index = products.indexOf(existingProduct);
        products.set(index, product);
        return true;
    }

    @Override
    public boolean deleteById(String id) {
        return products.removeIf(product -> product.getProductId().equals(id));
    }

    @Override
    public Product findById(String id) {
        return products.stream()
                .filter(product -> product.getProductId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void sortByPrice() {
        products.sort(Comparator.comparingDouble(Product::getPrice));
    }

    @Override
    public void searchByName(String name) {
        String nameSearch = name.toLowerCase().trim();
        products.stream()
                .filter(product -> product.getProductName().toLowerCase().contains(nameSearch))
                .forEach(System.out::println);
    }

    @Override
    public void searchByPrice(double a, double b) {
        products.stream()
                .filter(product -> product.getPrice() >= a && product.getPrice() <= b)
                .forEach(System.out::println);
    }

    @Override
    public boolean isExist(String id) {
        return findById(id) != null;
    }
}
