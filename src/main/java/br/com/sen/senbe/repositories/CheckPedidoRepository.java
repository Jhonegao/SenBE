package br.com.sen.senbe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sen.senbe.domain.CheckPedido;

@Repository
public interface CheckPedidoRepository extends JpaRepository<CheckPedido, Integer>{

}
