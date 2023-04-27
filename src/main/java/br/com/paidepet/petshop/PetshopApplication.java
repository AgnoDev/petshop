package br.com.paidepet.petshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class PetshopApplication {
	@GetMapping
	public String getHomeTest(){
		return "PetShop - API Home";
	}
	public static void main(String[] args) {
		SpringApplication.run(PetshopApplication.class, args);
	}

}
