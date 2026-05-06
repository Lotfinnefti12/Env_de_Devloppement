package com.lotfi.produit;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.lotfi.produit.service.*;
import com.lotfi.produit.entities.*;
import java.util.Date;

/*
@SpringBootApplication(scanBasePackages = {
    "com.lotfi.produit"
})

public class ClothesBrandApplication {
	/*
	@Autowired
	ProduitService produitService;
	
	@Autowired
	PasswordEncoder passwordEncoder;

    public static void main(String[] args) {
        SpringApplication.run(ClothesBrandApplication.class, args);
    }

    public void run(String... args) throws Exception {

    /*produitService.saveProduit(new Produit("PC Dell", 2600.0, new Date()));
    produitService.saveProduit(new Produit("PC Asus", 2800.0, new Date()));
    produitService.saveProduit(new Produit("Imp Epson", 900.0, new Date()));
    }
    }*/
@SpringBootApplication
public class ClothesBrandApplication implements CommandLineRunner {
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(ClothesBrandApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Produit.class);
	}
}



