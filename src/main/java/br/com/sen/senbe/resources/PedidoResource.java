package br.com.sen.senbe.resources;
import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.sen.senbe.domain.Pedido;
import br.com.sen.senbe.services.PedidoService;

@CrossOrigin
@RestController
@RequestMapping(value="/pedidos")
public class PedidoResource {
	
	@Autowired
	private PedidoService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Pedido>> listAll() {
		
		List<Pedido> list = service.listAll();
		return ResponseEntity.ok().body(list);
	}

	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public ResponseEntity<Pedido> findOne(@PathVariable Integer id) {	
		Pedido obj = service.search(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody Pedido obj){
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody Pedido obj, @PathVariable Integer id){
		obj.setId(id);
		obj = service.updateStatus(obj);
		return ResponseEntity.noContent().build();
	}

}
