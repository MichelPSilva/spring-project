package com.springproject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springproject.beans.Products;
import com.springproject.dao.ProductsDAO;

@RestController
@SpringBootApplication
public class ProductsController {
	
	
	@Autowired
	private ProductsDAO prodDao;
	
	// LISTA TODOS OS PRODUTOS

	@GetMapping("/products")
	public ResponseEntity<List<Products>> getAll() {
		List<Products> prodLista = (List<Products>) prodDao.findAll();
		
		if(prodLista.size() == 0) {
			return ResponseEntity.status(404).build();
		}
		
		return ResponseEntity.ok(prodLista);
	}
	
	// LISTANDO O PRODUTO PELO ID
	@GetMapping("/products/{id}")
	public Optional<Products> getById(@PathVariable(value = "id") int id) {
		return prodDao.findById(id);
	}
}
