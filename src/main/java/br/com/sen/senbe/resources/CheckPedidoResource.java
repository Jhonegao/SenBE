package br.com.sen.senbe.resources;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.sen.senbe.domain.CheckPedido;
import br.com.sen.senbe.services.CheckPedidoService;

@RestController
@RequestMapping(value="/checks")
public class CheckPedidoResource {
	
	@Autowired
	private CheckPedidoService service;
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public ResponseEntity<?> findOne(@PathVariable Integer id) {
		
		CheckPedido obj = service.search(id);
		
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<CheckPedido>> listAll() {
		
		List<CheckPedido> list = service.listAll();
				return ResponseEntity.ok().body(list);
	}
	
}
