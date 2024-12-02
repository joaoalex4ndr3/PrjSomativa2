package com.example.demo.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Servico;
import com.example.demo.repositories.ServicoRepository;

@Service
public class ServicoService {
	
	
	@Autowired
	private ServicoRepository servicoRepository;
	
	public List<Servico> getAllServiço() {
		return servicoRepository.findAll();
	}
	
	public Servico saveServiço(Servico serviço) {
		return servicoRepository.save(serviço);
	}
	
	public Servico getServiçoById(Long id) {
		return servicoRepository.findById(id).orElse(null);
	}
	
	public void deleteServiço(Long id) {
		servicoRepository.deleteById(id);
	}

}

