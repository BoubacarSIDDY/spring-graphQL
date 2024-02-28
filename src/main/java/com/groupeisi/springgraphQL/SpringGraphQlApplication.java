package com.groupeisi.springgraphQL;

import com.groupeisi.springgraphQL.dao.EtudiantRepository;
import com.groupeisi.springgraphQL.entity.Etudiant;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringGraphQlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringGraphQlApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(EtudiantRepository etudiantRepository){
		return args -> {
			etudiantRepository.save(Etudiant.builder().name("Diallo").lastName("Boubacar").email("diallo@gmail.com").build());
			etudiantRepository.save(Etudiant.builder().name("Diallo").lastName("Ousmane").email("ousmane@gmail.com").build());
			etudiantRepository.save(Etudiant.builder().name("Diallo").lastName("Ahmad").email("ahmad@gmail.com").build());
		};
	}

}
