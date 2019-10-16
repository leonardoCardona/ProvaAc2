package br.com.drummond.ac2;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Prova {
		
@RequestMapping(value = "/api5/{n1}", method = RequestMethod.GET)
	public String api5 (@PathVariable Integer n1) {
		
		Integer resultado = null;
		String multiplo = "";
		
		if(n1 % 5 == 0) {
			multiplo = "é múltiplo de 5, o próximo número múltiplo de 5 à partir do número digitado é: ";
			resultado = n1 + 5;
		} else {
			multiplo = "não é múltiplo de 5: ";
			resultado = -1;
		}

		return "O seu número " + multiplo + resultado;
		
	}


	}
