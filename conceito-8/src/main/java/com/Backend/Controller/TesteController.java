package com.Backend.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("TesteApi")
public class TesteController {
	
	@GetMapping
	public String retornandoStringBack () {
		return "backend lidam com os bastidores das funcionalidades das aplicações web. É o código"
				+ " que conecta a internet com o banco de dados, gerencia as conexões dos usuários"
				+ " e alimenta a aplicação web.";
	}
	
	@GetMapping("/1")
	public String retornandoString () {
		return "A função de um backend está relacionada com servidores, "
				+ " bancos de dados, segurança, estrutura, gerenciamento de conteúdo e atualizações."
				+ " Serve para tratar os dados e também é o local onde ocorrem as inserções, "
				+ " arquivamentos e leituras de dados, por trás de uma aplicação.";
	}
	
	@PostMapping
	/*Criar um recurso*/
	public String post (@RequestBody String texto) {	
	System.out.println(texto);	
	return texto;

	}
	
	@PutMapping
	/*Atualizar recurso*/
	public String put (@RequestBody String texto) {
		System.out.println(texto);
		return texto;
	}
	
	@PatchMapping
	/*Fazer a alteração de valores específicos de um recurso*/
	public String patch (@RequestBody String texto) {
		System.out.println(texto);
		return texto;
	}
	
	@DeleteMapping
	/*Remoção recurso*/
	public String deletado () {
		return "deleta alguma coisa pelo amor!!!";
	}

}
