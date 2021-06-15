package com.aulaspringboot.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.aulaspringboot.crud.interfaces.ContatoInterf;
import com.aulaspringboot.crud.interfaces.EnderecoInterf;
import com.aulaspringboot.crud.interfaces.PessoaInterf;
import com.aulaspringboot.crud.interfaceservice.ContatoInterfServ;
import com.aulaspringboot.crud.interfaceservice.EnderecoInterfServ;
import com.aulaspringboot.crud.interfaceservice.PessoaInterfServ;
import com.aulaspringboot.crud.model.Pessoa;

@Controller
@RequestMapping
public class Controlador {

	@Autowired
	private PessoaInterfServ service;
	@Autowired
	private EnderecoInterfServ service_end;
	@Autowired
	private ContatoInterf repoContato;
	@Autowired
	private EnderecoInterf repoEndereco;
	@Autowired
	private PessoaInterf repoPessoa;


	@GetMapping("/")
	public String listar(Model model) {
		List<Pessoa> pessoas = service.listar();
		model.addAttribute("pessoas", pessoas);
		return "index";
	}

	@GetMapping("/novo-cadastro")
	public String mostrarNovoCadastro(Model model) {
		Pessoa pessoa = new Pessoa();
		model.addAttribute("pessoa", pessoa);
		return "novo-cadastro";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String salvarContato(@ModelAttribute("pessoa") Pessoa pessoa) {
		service_end.salvar(pessoa.getEndereco());
		repoContato.save(pessoa.getContato());
		service.salvar(pessoa);
		return "redirect:/";
	}

	@RequestMapping("/editar/{id}")
	public ModelAndView mostrarIdEdicao(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("editar-pessoa");
		Pessoa pessoa = service.get(id);
		mav.addObject("pessoa", pessoa);
		return mav;
	}

	@GetMapping(value = "/apagar/{id}")
	public String deletarPessoa(@PathVariable(name = "id") int id) {
		Pessoa pessoa = repoPessoa.findById(id).get();
		repoEndereco.delete(pessoa.getEndereco());
		repoContato.delete(pessoa.getContato());
		repoPessoa.delete(pessoa);
		return "redirect:/";
	}

	@PostMapping("/pesquisar")
	public ModelAndView pesquisarPessoa(@RequestParam("buscar") String buscar) {
		ModelAndView mav = new ModelAndView("index");

		List<Pessoa> pessoas;
		if (buscar.isEmpty()) {
			pessoas = repoPessoa.findAll();
		} else {
			pessoas = repoPessoa.findByNome(buscar);
		}

		mav.addObject("pessoas", pessoas);
		return mav;
	}

	@GetMapping("/relatorio")
	public String listarRelatorio(Model model) {
		List<Pessoa> pessoas = service.listar();
		model.addAttribute("pessoas", pessoas);
		return "relatorio";
	}

}



