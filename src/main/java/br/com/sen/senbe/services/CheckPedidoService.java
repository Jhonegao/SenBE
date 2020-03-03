package br.com.sen.senbe.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sen.senbe.domain.CheckPedido;
import br.com.sen.senbe.repositories.CheckPedidoRepository;

@Service
public class CheckPedidoService {
	
	@Autowired
	private CheckPedidoRepository repo;
	
	public CheckPedido search(Integer id) {
		
		Optional<CheckPedido> obj = repo.findById(id);
		return obj.orElse(null);
		
	}
	
	public List<CheckPedido> listAll(){
				
		return repo.findAll();
	}
	
}
