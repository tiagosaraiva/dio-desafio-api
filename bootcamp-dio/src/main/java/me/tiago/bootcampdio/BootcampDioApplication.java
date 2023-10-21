package me.tiago.bootcampdio;

import me.tiago.bootcampdio.domain.model.Livro;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootcampDioApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootcampDioApplication.class, args);

		Livro objLivro = new Livro("Tiago","","","",1,false);

	}

}
