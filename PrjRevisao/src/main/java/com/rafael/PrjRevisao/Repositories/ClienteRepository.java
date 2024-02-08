package com.rafael.PrjRevisao.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafael.PrjRevisao.Entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
}