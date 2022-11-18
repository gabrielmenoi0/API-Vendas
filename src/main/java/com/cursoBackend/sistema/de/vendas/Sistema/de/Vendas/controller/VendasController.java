package com.cursoBackend.sistema.de.vendas.Sistema.de.Vendas.controller;

import com.cursoBackend.sistema.de.vendas.Sistema.de.Vendas.domain.Vendas;
import com.cursoBackend.sistema.de.vendas.Sistema.de.Vendas.service.VendasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(path = "api/vendas")
public class VendasController {
    @Autowired
    private VendasService vendasService;

    @GetMapping(path = "")
    public ResponseEntity<List<Vendas>> vendas() {
        return ResponseEntity.status(HttpStatus.OK).body(vendasService.findAll());
    }

    @GetMapping(path = "/{name}")
    public ResponseEntity<List<Vendas>> vendasVendedor(@PathVariable String sellerName) {
        return ResponseEntity.status(HttpStatus.OK).body(vendasService.findBySellerName(sellerName));
    }

    @GetMapping(path = "/{initialDate}/{endDate}")
    public ResponseEntity<List<Vendas>> salesByDate(@PathVariable String initialDate, @PathVariable String endDate) {
        Date dataInicial = new Date();
        Date dataFinal = new Date();
        try {
            dataInicial = new SimpleDateFormat("yyyy-MM-dd").parse(initialDate);
            dataFinal = new SimpleDateFormat("yyyy-MM-dd").parse(endDate);
        } catch (Exception e) {
        }
        return ResponseEntity.status(HttpStatus.OK).body(vendasService.findByDate(dataInicial, dataFinal));
    }
}
