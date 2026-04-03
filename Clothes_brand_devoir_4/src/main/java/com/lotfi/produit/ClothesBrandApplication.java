package com.lotfi.produit;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.lotfi.produit.service.*;
import com.lotfi.produit.entities.*;
import java.util.Date;


@SpringBootApplication(scanBasePackages = {
    "com.lotfi.produit"
})

public class ClothesBrandApplication implements CommandLineRunner {
	
	@Autowired
	ProduitService produitService;
	
	@Autowired
	PasswordEncoder passwordEncoder;

    public static void main(String[] args) {
        SpringApplication.run(ClothesBrandApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
     System.out.println("Password Encoded BCRYPT :******************** ");
     System.out.println(passwordEncoder.encode("123"));
    /*produitService.saveProduit(new Produit("PC Dell", 2600.0, new Date()));
    produitService.saveProduit(new Produit("PC Asus", 2800.0, new Date()));
    produitService.saveProduit(new Produit("Imp Epson", 900.0, new Date()));
    */
    }
}

