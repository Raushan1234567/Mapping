package com.masai.da15q2_p2;

import java.util.List;
import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

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
        Scanner  sc=new Scanner(System.in);
        
        int c;
        do {
        	System.out.println("1. Insert");
        	System.out.println("2. print");
        	System.out.println("3.  chiken Byid");
        	System.out.println("4.  chiken By price");
        	
        	System.out.println("0. Exit");
        	c=sc.nextInt();
        	switch(c) {
        	case 1:
        		Add(sc);
        		break;
        	case 2:
        		Print(sc);
        		break;
        	case 3:
        		Findvegdetails(sc);
        		break;
        	case 4:
        		FindvegdetailsPrice(sc);
        		break;
        	case 0:
        	System.out.println("Thanks");
        
        		break;
        		
        		
        	}
        	
        }while(c!=0);
      
        
    }

	private static void FindvegdetailsPrice(Scanner sc) {
		
		EntityManager em=emf.createEntityManager();
		
		String q="select e from ChickenBiryani e where price < 500";
		
		Query qu=em.createQuery(q);
		
		
		List<ChickenBiryani> t=qu.getResultList();
		
		t.forEach(r -> System.out.println(r.getChickenbiryaniid()+" "+r.getId()+" "+r.getPrice()+" "+r.getDescription()+" "+r.getRating()));
	}

	private static void Add(Scanner sc) {
		EntityManager em=emf.createEntityManager();
		
		VegBiryani a=new VegBiryani(2,102,200,"best");
		VegBiryani a1=new VegBiryani(4,103,400,"superbest");
		VegBiryani a2=new VegBiryani(2,104,200,"best");
		VegBiryani a3=new VegBiryani(4,105,400,"superbest");
		
		ChickenBiryani b=new ChickenBiryani(5,106,300,"good");
		ChickenBiryani b1=new ChickenBiryani(8,107,600,"super good");

		ChickenBiryani b2=new ChickenBiryani(5,108,300,"good");
		ChickenBiryani b3=new ChickenBiryani(8,109,600,"super good");
		
		
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		em.persist(a);
		em.persist(a1);
		em.persist(a2);
		em.persist(a3);
		em.persist(b);
		em.persist(b1);
		em.persist(b2);
		em.persist(b3);
		et.commit();
		em.close();
		
	}

	private static void Print(Scanner sc) {
		EntityManager em=emf.createEntityManager();
		
		String query = "SELECT e FROM ChickenBiryani e join Biryani b on e.id = b.id";
	Query qu=em.createQuery(query);
		List<ChickenBiryani> results =(List<ChickenBiryani>) qu.getResultList();

		results.forEach( a -> System.out.println(a.getId()+" "+a.getRating() +" "+a.getChickenbiryaniid()+" "+a.getDescription()+" "+a.getPrice()));
		em.close();
	}

	private static void Findvegdetails(Scanner sc) {
		EntityManager em=emf.createEntityManager();
		System.out.println("Enter id");
		int id=sc.nextInt();
		
		String q="select e from ChickenBiryani e where Chickenbiryaniid = :id1";
		Query qu=em.createQuery(q);
		qu.setParameter("id1", id);
		
	ChickenBiryani d=  (ChickenBiryani) qu.getSingleResult();
		
		System.out.println(d);
	}
}
//class Biryani
//BiryaniId
//rating
//
//class VegBiryani extends Biryani
//VegBiryaniId **[ Not Primary Key ]**
//price
//description
//
//class ChickenBiryani extends Biryani
//ChickenBiryaniId **[ Not Primary Key ]**
//price
//description