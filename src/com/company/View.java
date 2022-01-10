package com.company;

import com.company.repository.BestellungRepository;
import com.company.repository.ProduktRepository;

import java.util.ArrayList;
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
                    System.out.println("Enter Produkt name:");
                    try {
                        String name = scanner.nextLine();
                        System.out.println("Enter Produkt preis:");
                        scanner.nextLine();
                        int preis = scanner.nextInt();

                        produktRepository.create(new Produkt(name, preis));


                    } catch (Exception e) {
                        throw e;
                    }
                    break;
                case 2:
                    System.out.println("Enter Produkt name:");
                    try {
                        String name = scanner.nextLine();
                        System.out.println("Enter Produkt preis:");
                        scanner.nextLine();
                        int preis = scanner.nextInt();

                        produktRepository.delete(new Produkt(name, preis));


                    } catch (Exception e) {
                        throw e;
                    }
                    break;
                case 3:
                    System.out.println("Enter Produkt name:");
                    try {
                        String name = scanner.nextLine();
                        System.out.println("Enter Produkt preis:");
                        scanner.nextLine();
                        int preis = scanner.nextInt();

                        produktRepository.update(new Produkt(name, preis));


                    } catch (Exception e) {
                        throw e;
                    }
                    break;
                case 4:
                    System.out.println(produktRepository.getAll());
                    break;
                case 5:
                    System.out.println("Enter Bestellung nr:");
                    try {
                        int nr = scanner.nextInt();
                        System.out.println("Enter Bestellung adresse:");
                        scanner.nextLine();
                        String adresse = scanner.nextLine();

                        bestellungRepository.create(new Bestellung(nr, adresse, new ArrayList<>()));

                    } catch (Exception e) {
                        throw e;
                    }
                    break;
                case 6:
                    System.out.println("Enter Bestellung nr:");
                    try {
                        int nr = scanner.nextInt();
                        System.out.println("Enter Bestellung adresse:");
                        scanner.nextLine();
                        String adresse = scanner.nextLine();

                        bestellungRepository.delete(new Bestellung(nr, adresse, new ArrayList<>()));

                    } catch (Exception e) {
                        throw e;
                    }
                    break;
                case 7:
                    System.out.println("Enter Bestellung nr:");
                    try {
                        int nr = scanner.nextInt();
                        System.out.println("Enter Bestellung adresse:");
                        scanner.nextLine();
                        String adresse = scanner.nextLine();

                        bestellungRepository.update(new Bestellung(nr, adresse, new ArrayList<>()));

                    } catch (Exception e) {
                        throw e;
                    }
                    break;
                case 8:
                    System.out.println(bestellungRepository.getAll());
                    break;
            }

        }
    }
}
