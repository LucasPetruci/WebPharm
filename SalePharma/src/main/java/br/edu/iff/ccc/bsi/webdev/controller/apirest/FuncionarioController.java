package br.edu.iff.ccc.bsi.webdev.controller.apirest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.edu.iff.ccc.bsi.webdev.modelo.Funcionario;

@RestController
@RequestMapping(path = "apirest/funcionario")
public class FuncionarioController {

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void novoFuncionario(
			@RequestParam(value = "id") int id,
			@RequestParam(name = "nome") String nome,
			@RequestParam(value = "dataCadastro") String dataCadastro,
			@RequestParam(value = "horaTrabalho") String horaTrabalho
			) {
		
		Funcionario funcionario = new Funcionario(id, dataCadastro, nome, horaTrabalho);
		
	}
	
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public String page(@PathVariable("id")int id) {
		String nome ="Pedro";
		return "O seu id é: "+id+ ", nome: "+nome;
	}
	
}
