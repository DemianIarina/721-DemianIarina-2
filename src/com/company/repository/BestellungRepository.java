package com.company.repository;

import com.company.Bestellung;
import com.company.Produkt;

import java.util.Objects;

public class BestellungRepository extends InMemoryRepository<Bestellung>{

    @Override
    public Bestellung update(Bestellung obj) {
        Bestellung bestellungToUpdate = this.repoList.stream()
                .filter(produkt -> Objects.equals(produkt.getBestellNr(), obj.getBestellNr()))
                .findFirst()
                .orElseThrow();
        bestellungToUpdate.setAdresse(obj.getAdresse());
        bestellungToUpdate.setProdukte(obj.getProdukte());

        return bestellungToUpdate;
    }


}
