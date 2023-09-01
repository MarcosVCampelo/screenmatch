package br.com.alura.projeto;

import br.com.alura.projeto.model.SeriesData;
import br.com.alura.projeto.services.DataConvert;
import br.com.alura.projeto.services.UseApi;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var abc = new UseApi();
		var json = abc.getData("https://www.omdbapi.com/?t=the+office&apikey=67166d38");
		var dataConvert = new DataConvert();
		System.out.println(json);
		SeriesData seriesData = dataConvert.getData(json, SeriesData.class);
		System.out.println(seriesData);


	}
}
