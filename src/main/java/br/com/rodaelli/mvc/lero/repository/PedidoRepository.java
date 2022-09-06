package br.com.rodaelli.mvc.lero.repository;

import br.com.rodaelli.mvc.lero.model.StatusPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rodaelli.mvc.lero.model.Pedido;

import java.util.List;

@Repository //para injecao de dependencias
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

    List<Pedido> findByStatus(StatusPedido status);
}
