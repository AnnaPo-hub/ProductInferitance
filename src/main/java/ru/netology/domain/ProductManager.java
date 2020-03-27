package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductManager {
    private Repository repo;


    public void addProduct(Product item) {
        repo.saveProduct(item);
    }


    public Product[] searchBy(String text) {
        Product[] newList = new Product[0];
        for (Product item : repo.getAll()) {
            if (matches(item, text)) {
                Product[] tmp = new Product[newList.length + 1];
                tmp[tmp.length - 1] = item;
                newList = tmp;
            }
        }
        return newList;

    }

    private boolean matches(Product product, String search) {
        if (product instanceof Book) {
            Book book = (Book) product;
            if (book.getName().equalsIgnoreCase(search)) {
                return true;
            }
            if (book.getAuthor().equalsIgnoreCase(search)) {
                return true;
            }
            return false;
        } else if (product instanceof Smartphone) {
            Smartphone phone = (Smartphone) product;
            if (phone.getProducer().equalsIgnoreCase(search)) {
                return true;
            }
            if (phone.getName().equalsIgnoreCase(search)) {
                return true;
            }
            return false;
        }
        return true;
    }

}
