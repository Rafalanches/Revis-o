package com.rafael.PrjRevisao.Repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.rafael.PrjRevisao.Entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}