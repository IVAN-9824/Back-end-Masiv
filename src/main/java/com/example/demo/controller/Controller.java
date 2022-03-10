package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.model.Storage;
import com.example.demo.model.User;
import com.example.demo.repository.ProductRepository;
import com.example.demo.repository.StorageRepository;
import com.example.demo.repository.UserRepository;




@RestController
@RequestMapping("/logistics")
public class Controller {
	
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private StorageRepository storageRepository;
	@Autowired
	private  ProductRepository productRepo;
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping(value = "/crearstorage")
	public Storage createCellar (@RequestBody Storage storage) {
		return storageRepository.save(storage);
		
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping(value= "/crearproduct")
	public Product createProduct (@RequestBody Product product) {
		if (Integer.parseInt(product.getProductQuantity())>5) {
			if(product.getTypeTranpor().equalsIgnoreCase("Terrestre")) {
				Double auxDes = product.getShippingPrice()*0.02;
				product.setDiscount(auxDes);
			}else {
				Double auxDes = Double.parseDouble(product.getProductQuantity())*0.05;
				product.setDiscount(auxDes);
			}
		}
		return productRepo.save(product);
		
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/createuser")
	public User createUser (@RequestBody User user) {
		return userRepo.save(user);
	}
	
	@GetMapping("/storage")
	public List <Storage> listStorage(){
		return storageRepository.findAll();
	}
	
	@GetMapping("/products")
	public List <Product> listProduct(){
		return productRepo.findAll();
	}

}
