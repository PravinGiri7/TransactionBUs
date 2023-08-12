package com.Transaction.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Transaction.Entity.Bus;
import com.Transaction.Service.TransactionService;

@RestController
public class TransactionController {
	@Autowired
	TransactionService service;
	
	@PostMapping("/addBus")
	public String insertIntoBus(@RequestBody List<Bus> bs) {
		return service.insertIntoBus(bs);
	}
	
	@GetMapping("/getBUs")
public 	List<Bus> getBus(){
		return service.getBus();
	}
	
	@PutMapping("/updateBus")
	public String updateBus( @RequestBody Bus b) {
		return service.updateBus(b);
	}

	@DeleteMapping("/deleteBus/{Busid}")
	public  String deleteBus(@PathVariable int busid){
		return service.deleteBus(busid);
	}

}

