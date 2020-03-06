package br.com.sen.senbe.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import br.com.sen.senbe.domain.Pedido;
import br.com.sen.senbe.repositories.PedidoRepository;

@CrossOrigin
@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;
	
	public Pedido search(Integer id) {
		
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElse(null);
		
	}
	
	public List<Pedido> listAll(){
		
		return repo.findAll();
	}
	
	public Pedido insert(Pedido obj) {
		obj.setId(null);
		return repo.save(obj);
	}
	
	public Pedido updateStatus(Pedido obj) {
		return repo.saveAndFlush(obj);
	}
}
