package com.Transaction.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Transaction.Dao.TransactionDao;
import com.Transaction.Entity.Bus;

@Service
public class TransactionService {

	@Autowired
	 TransactionDao dao;
	
	
	public String insertIntoBus(List<Bus> bs) {
		return dao.insertIntoBus(bs);
	}

	public List<Bus> getBus(){
		return dao.getBus();
	}
	
	public String updateBus(Bus b){
		return dao.updateBus(b);
		
	}
	
	public deleteBus(int busid) {
		return dao.deleteBus(busid);
	}
}
