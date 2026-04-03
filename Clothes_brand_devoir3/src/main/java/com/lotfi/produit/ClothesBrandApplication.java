package com.lotfi.produit;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.lotfi.produit.service.*;
import com.lotfi.produit.entities.*;
import java.util.Date;


@SpringBootApplication(scanBasePackages = {
    "com.lotfi.produit"
})

public class ClothesBrandApplication implements CommandLineRunner {
	
	@Autowired
	ProduitService produitService;
	
    public static void main(String[] args) {
        SpringApplication.run(ClothesBrandApplication.class, args);
    }

	@Override
	public void run(String... args) throws Exception {
		
	}
}

