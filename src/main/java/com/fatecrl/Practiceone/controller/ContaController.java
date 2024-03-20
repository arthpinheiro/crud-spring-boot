package com.fatecrl.Practiceone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatecrl.Practiceone.bean.Conta;
import com.fatecrl.Practiceone.service.ContaService;
	
@RestController//onde são criados os endpoints (relacao uri + url)
@RequestMapping("/contas")//puxa os dados de determinado endpoint mapeando por
public class ContaController {
	
	@Autowired
	private ContaService service;
	
	@GetMapping("/")
	public String healthCheck(){
		return "Estamos no ar!";
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Conta> getConta(@PathVariable("id") Long id) {
		Conta conta = service.find(id);
		if (conta != null) {
			return ResponseEntity.ok(conta);
		}
		return ResponseEntity.notFound().build();
	}	
}
