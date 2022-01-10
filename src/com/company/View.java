package com.company;

import com.company.repository.BestellungRepository;
import com.company.repository.ProduktRepository;

import java.util.Scanner;

public class View {
    private ProduktRepository produktRepository;
    private BestellungRepository bestellungRepository;

    public View(ProduktRepository produktRepository) {
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
                    "3. Update Produkt\n" +
                    "4. Get All Produkte\n" +
                    "5. Add Bestellung\n" +
                    "6. Delete Bestellung\n" +
                    "7. Update Bestellung\n" +
                    "8. Get All Bestellungen\n");

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
                case 5:
                    //hier wird gelesen und ein neu Obj Produkt gemacht
                    bestellungRepository.create(new Bestellung());
                    break;
                case 6:
                    //hier wird gelesen und ein neu Obj Produkt gemacht
                    bestellungRepository.delete(new Bestellung());
                    break;
                case 7:
                    //hier wird gelesen und ein neu Obj Produkt gemacht
                    bestellungRepository.update(new Bestellung());
                    break;
                case 8:
                    System.out.println(bestellungRepository.getAll());
                    break;
            }

        }
    }
}
