package projetBD;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TEST {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		testHibernate();

	}
	
	static void test1() throws Exception
	{
		DB db = new DB();
		db.insertPatientV1();

	}
	
	static void test2() throws Exception
	{
		DB db = new DB();
		db.insertPatientV2(103,"toto","titi");

	}
	
	static void test3() throws Exception
	{
		DB db = new DB();
		db.insertPatientV3(105,"toto11","titi");

	}
	
	static void testSelectPatientV1() throws Exception
	{
		DB db = new DB();
		String listePatients = db.selectPatientV1();
		
		System.out.println(listePatients);

	}
	
	static void testHibernate(){
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("formation");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		tx.commit(); // em.flush()	
		em.close();	
		emf.close();
		
	}

}
