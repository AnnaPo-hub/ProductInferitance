package ru.netology.repository;

import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;

public class Repository {
    Product[] repo = {new Book(1, "In Search of Lost Time", 200, "Proust"),
            new Book(2, "The Colossus of Maroussi", 100, "Henry Miller"),
            new Book(3, "The Silent World", 100, "Yves Cousteau"),
            new Smartphone(1, "Galaxy-300", 300, "Samsung"),
            new Smartphone(2, "X-3", 300, "Xiaomi"),
            new Smartphone(3, "MN-54", 50, "Russian Phones")};

    public void save(Product item) {
        Product[] newRepo = new Product[repo.length + 1];
        System.arraycopy(repo, 0, newRepo, 0, repo.length + 1);
        int lastIndex = newRepo.length - 1;
        newRepo[lastIndex] = item;
        repo = newRepo;
    }


    public Product[] getAll() {
        return repo;
    }


    public void removeById(int id) {
        boolean ifExists = false;
        for (Product item : repo) {
            if (item.getId() == id) {
                ifExists = true;
                break;
            }
        }
        if (ifExists) {
            Product[] newRepo = new Product[repo.length - 1];
            int index = 0;
            for (Product item : repo) {
                if (item.getId() != id) {
                    newRepo[index] = item;
                    index++;
                }
            }
            repo = newRepo;
        }
    }
}

