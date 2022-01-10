package com.company;

import com.company.repository.ProduktRepository;

import java.util.Scanner;

public class Controller {
    private ProduktRepository produktRepository;

    public Controller(ProduktRepository produktRepository) {
        this.produktRepository = produktRepository;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        loop:
        while (true) {
            System.out.println("-----------------\n" +
                    "Menu\n" +
                    "0. Exit Program\n"+
                    "1. Add Produkt\n" +
                    "2. Delete Produkt\n" +
                    "3. Update\n" +
                    "4. Get All Produkte\n");

            System.out.println("Enter input: ");
            int variant = scanner.nextInt();
            System.out.println("You've entered: " + variant);
            switch (variant) {
                case 0:
                    break loop;
                case 1:
                    //hier wird gelesen und ein neu Obj Produkt gemacht
                    produktRepository.create(new Produkt());
                    break;
                case 2:
                    //hier wird gelesen und ein neu Obj Produkt gemacht
                    produktRepository.delete(new Produkt());
                    break;
                case 3:
                    //hier wird gelesen und ein neu Obj Produkt gemacht
                    produktRepository.update(new Produkt());
                    break;
                case 4:
                    System.out.println(produktRepository.getAll());
                    break;
            }

        }
    }
}
