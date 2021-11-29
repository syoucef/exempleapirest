package com.example.cm29novembre2021;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Cm29novembre2021Application {

    // injection des dépendances et inversion de contrôle ....
    @Autowired
    private ProduitInterface produitInterface;


    public static void main(String[] args) {
        SpringApplication.run(Cm29novembre2021Application.class, args);
    }


    // je veux insérer des produits dans la table produit au moment
    // de déploiement de notre API rest ....

    @Bean
    CommandLineRunner runner(ProduitInterface produitInterface){
        return args -> {
          produitInterface.save(new Produit(1, "Tablette", 44));
            produitInterface.save(new Produit(2, "Tablette", 44));
            produitInterface.save(new Produit(3, "Tablette", 1200));
            produitInterface.save(new Produit(4, "Tablette", 1200));


        };
    }

}
