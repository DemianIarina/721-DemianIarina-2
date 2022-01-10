package com.company;

import com.company.repository.BestellungRepository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Controller {
    private BestellungRepository bestellungRepository;

    public List<Pair> sortierenBestellungen(){
        List<Bestellung> bestellungs = bestellungRepository.getAll();
        List<Pair> preise = new ArrayList<>();
        for(Bestellung bestellung : bestellungs){
            int sum = 0;
            for(Produkt produkt : bestellung.getProdukte()){
                sum = sum + produkt.getPreis();
            }
            preise.add(new Pair(bestellung, sum));
        }

        List<Pair> sortierteBestellungen = preise.stream()
                .sorted(Comparator.comparing(Pair::getSum)
                        .reversed())
                .collect(Collectors.toList());

        return sortierteBestellungen;
    }


}
