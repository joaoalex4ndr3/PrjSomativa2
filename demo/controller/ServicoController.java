package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Servico;
import com.example.demo.servicies.ServicoService;

@RestController
@RequestMapping("/Servico")
public class ServicoController {
	
	private final ServicoService servicoservice;

	@Autowired
	public ServicoController(ServicoService servicoservice) {
		this.servicoservice = servicoservice;
	}

	
	@PostMapping("/create")
	public Servico createServico(@RequestBody Servico servico) {
		return servicoservice.saveServiço(servico);
	}
	
	@GetMapping
	public List<Servico> getAllServico() {
		return servicoservice.getAllServiço();
	}
	
	@GetMapping("/{id}")
	public Servico getServico(@PathVariable Long id) {
		return servicoservice.getServiçoById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteServico(@PathVariable Long id) {
		servicoservice.deleteServiço(id);
	}

}


