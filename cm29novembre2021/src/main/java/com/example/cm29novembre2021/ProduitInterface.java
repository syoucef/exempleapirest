package com.example.cm29novembre2021;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitInterface extends
        JpaRepository<Produit, Integer> {

}
