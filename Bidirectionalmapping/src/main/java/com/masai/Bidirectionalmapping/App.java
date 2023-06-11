package com.masai.Bidirectionalmapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
	static EntityManagerFactory emf;
	static {
		emf=Persistence.createEntityManagerFactory("Connect");
	}
	
    public static void main( String[] args )
    {
       Scanner sc=new Scanner(System.in);
       
       int c;
       
       do {
    	   System.out.println("1. Insert");
    	   System.out.println("2. Print");
    	   System.out.println("0. Exit");
    	  
    	   c=sc.nextInt();
    	   switch(c) {
    	   case 1:
    		   Add();
    		   break;
    	   case 2:
    		   Print();
    		   break;
    	   case 0:
    		   System.out.println("Thannks");
    		   break;
    		   
    	   default :
    		   System.out.println("Invalis seletion");
    		   break;
    		   
    	   }
    	   
       }while(c!=0);
       sc.close();
       
    }

	private static void Add() {
		EntityManager em=emf.createEntityManager();
		Company a=new Company("Samsung",LocalDate.parse("2021-09-09"), new ArrayList<>());
		
	
	Mobile t=new Mobile();
	t.setMobileno("y67uyyr");
	t.setPrice(45678);
	
	Mobile t1=new Mobile();
	t1.setMobileno("jhfghe");
t1.setPrice(777);

a.getMobiles().add(t);
a.getMobiles().add(t1);

t.setCompany(a);
t1.setCompany(a);
	
	
	Company b=new Company("nokia",LocalDate.parse("2000-09-09"),new ArrayList<>());
	
	Mobile t2=new Mobile();
	t2.setMobileno("707070");
	t2.setPrice(91000);
	
	Mobile t3=new Mobile();
	t3.setMobileno("90909090");
	t3.setPrice(90000);
	
	b.getMobiles().add(t2);
	b.getMobiles().add(t3);

	t2.setCompany(b);
	t3.setCompany(b);
	
EntityTransaction et =em.getTransaction();
et.begin();
em.persist(a);
em.persist(b);
et.commit();
em.close();
		
	}

	private static void Print() {
		// TODO Auto-generated method stub
		
	}
}
