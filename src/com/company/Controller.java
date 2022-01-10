package com.company;

import com.company.repository.BestellungRepository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
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

        return preise.stream()
                .sorted(Comparator.comparing(Pair::getSum)
                        .reversed())
                .collect(Collectors.toList());
    }

    public List<Bestellung> sortNachProdukt(Produkt produkt){
        List<Bestellung> sortedBestellungen = new ArrayList<>();

        for(Bestellung bestellung : bestellungRepository.getAll()){
            if(bestellung.getProdukte().stream()
                    .anyMatch(obj -> Objects.equals(obj.getName(), produkt.getName()))){  //wenn man in die Bestellung die Produkt existiert
                assert false;
                sortedBestellungen.add(bestellung);       //dann adddiren wir die Bestellung
            }
        }
        return sortedBestellungen;
    }


}
