package com.company.repository;

import com.company.Produkt;

import java.util.Objects;

public class ProduktRepository extends InMemoryRepository<Produkt>{


    @Override
    public Produkt update(Produkt obj) {
        Produkt produktToUpdate = this.repoList.stream()
                .filter(produkt -> Objects.equals(produkt.getName(), obj.getName()))
                .findFirst()
                .orElseThrow();
        produktToUpdate.setPreis(obj.getPreis());

        return produktToUpdate;
    }
}
