package com.main.operation;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.main.java.Dept;
import com.main.java.Emp;


public class Insert {
	
	
	public static void main(String[] args)
	{
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("PERSISTENCE_UNIT_NAME");
		EntityManager em=emf.createEntityManager();
		Emp e1=new Emp();
		Emp e2=new Emp();
		Emp e3=new Emp();
		
		//employee data 1
		e1.setDeg("manager");
		e1.setEname("raj");
		e1.setSalary(20000);
		
		//employee data 2
		e2.setDeg("employee");
		e2.setEname("ravi");
		e2.setSalary(12000);

		//employee data 3;
		e3.setDeg("clerk");
		e3.setEname("piyush");
		e3.setSalary(13000);
		 
		
		//employee list
		   List<Emp> l=new ArrayList();
		   l.add(e1);
		   l.add(e2);
		   l.add(e3);
		   
		   
		 //department add
		   Dept d=new Dept();
		   d.setName("production");
		   d.setEmpList(l);
		   em.getTransaction().begin();
		   em.persist(d);
		   em.getTransaction().commit();
		   em.close();
		   em.close();
		   
		
		
	}

}
