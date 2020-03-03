package br.com.sen.senbe.resources;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.sen.senbe.domain.Pedido;
import br.com.sen.senbe.services.PedidoService;

@RestController
@RequestMapping(value="/pedidos")
public class PedidoResource {
	
	@Autowired
	private PedidoService service;
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public ResponseEntity<?> findOne(@PathVariable Integer id) {
		//Pedido p1 = new Pedido(1, "Joao", "Pilhas");
		//Pedido p2 = new Pedido(2, "Antonio", "Canetas");
		
		Pedido obj = service.search(id);
		
		return ResponseEntity.ok().body(obj);
	}

}
