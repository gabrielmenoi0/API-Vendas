package com.cursoBackend.sistema.de.vendas.Sistema.de.Vendas.repository;

import com.cursoBackend.sistema.de.vendas.Sistema.de.Vendas.domain.Vendas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.UUID;
@Repository("VendasRepository")
public interface VendasRepository extends JpaRepository<Vendas, UUID> {
    List<Vendas> findBySellerName(String sellerName);

    List<Vendas> findByDatas(Date initialDate, Date endDate);
}
