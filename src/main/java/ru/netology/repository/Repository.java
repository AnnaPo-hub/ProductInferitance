package ru.netology.repository;

import ru.netology.domain.Book;
import ru.netology.domain.NotFoundException;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;

public class Repository {
    Product[] repo = {new Book(1, "In Search of Lost Time", 200, "Proust"),
            new Book(2, "The Colossus of Maroussi", 100, "Henry Miller"),
            new Book(3, "The Silent World", 100, "Yves Cousteau"),
            new Smartphone(4, "Galaxy-300", 300, "Samsung"),
            new Smartphone(5, "X-3", 300, "Xiaomi"),
            new Smartphone(6, "MN-54", 50, "Russian Phones")};

    public void save(Product item) {
        Product[] newRepo = new Product[repo.length + 1];
        for (int i = 0; i < repo.length; i++) {
            newRepo[i] = repo[i];
        }
        int lastIndex = newRepo.length - 1;
        newRepo[lastIndex] = item;
        repo = newRepo;
    }

    public Product[] getAll() {
        return repo;
    }


    public void removeById(int id) {
        boolean idExists = false;
        for (Product item : repo) {
            if (item.getId() == id) {
                idExists = true;
                break;
            }
        }
        if (idExists) {
            Product[] newRepo = new Product[repo.length - 1];
            int index = 0;
            for (Product item : repo) {
                if (item.getId() != id) {
                    newRepo[index] = item;
                    index++;
                }
            }
            repo = newRepo;
        } else {
            throw new NotFoundException(" Element with id: " + id + " not found");
        }
    }
}
