package com.Transaction.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Transaction.Entity.Bus;



@Repository
public class TransactionDao {
	
	@Autowired
	SessionFactory sf;
	
	//............insert.................
		public String insertIntoBus(List<Bus> bs) {
			
			Session session=sf.openSession();
			Transaction tr=session.beginTransaction();
			
			
			for (Bus bus : bs) {
				session.save(bus);
			}
		    tr.commit();
			
			return "Saved..... ";
		}
		
		
		//.................get.....................
		public List<Bus> getBus() {
			Session session=sf.openSession();
			Criteria cr=session.createCriteria(Bus.class);
			return cr.list() ;
			}
		
		
		//................udpate..................................
		
		public String updateBus(Bus b){
			Session session=sf.openSession();
			Transaction tr=session.beginTransaction();
			session.update(b);
			tr.commit();
			session.close();
			return "Project Updated..............";
			
		}
		
		
		//..............project..........................
		public String deleteBus(int busid) {
			Session session = sf.openSession();
			Transaction tr = session.beginTransaction();
			Bus bu = session.get(Bus.class, busid);

			session.delete(bu);
			tr.commit();
			return "Project Deleted by id Successfully.....";

		}
}
