package br.com.sen.senbe.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.sen.senbe.domain.Pedido;

@RestController
@RequestMapping(value="/pedidos")
public class PedidoResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Pedido> listar() {
		Pedido p1 = new Pedido(1, "Joao", "Pilhas");
		Pedido p2 = new Pedido(2, "Antonio", "Canetas");
		
		List<Pedido> pedidos = new ArrayList<>();
		
		pedidos.add(p1);
		pedidos.add(p2);
		
		return pedidos;
	}

}
