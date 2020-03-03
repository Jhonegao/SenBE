package br.com.sen.senbe.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sen.senbe.domain.Pedido;
import br.com.sen.senbe.repositories.PedidoRepository;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;
	
	public Pedido search(Integer id) {
		
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElse(null);
		
	}
	
}