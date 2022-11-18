package com.cursoBackend.sistema.de.vendas.Sistema.de.Vendas.service;

import com.cursoBackend.sistema.de.vendas.Sistema.de.Vendas.domain.Vendas;
import com.cursoBackend.sistema.de.vendas.Sistema.de.Vendas.repository.VendasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class VendasService {
    @Autowired
    private VendasRepository vendasRepository;

    public List<Vendas> findAll() {
        return vendasRepository.findAll();
    }

    public List<Vendas> findBySellerName(String sellerName) {
        return vendasRepository.findBySellerName(sellerName);
    }

    public List<Vendas> findByDate(Date initialDate, Date endDate) {
        return vendasRepository.findByDatas(initialDate, endDate);
    }
}
