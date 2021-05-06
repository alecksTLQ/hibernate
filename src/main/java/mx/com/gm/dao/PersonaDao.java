package mx.com.gm.dao;

import javax.persistence.*;

import mx.com.gm.domain.Persona;

import java.util.List;

public class PersonaDao {
	private EntityManagerFactory emf;
	private EntityManager em;
	
	public PersonaDao() {
		emf = Persistence.createEntityManagerFactory("HibernatePU");
		em = emf.createEntityManager();
	}
	
	
	@SuppressWarnings("unchecked")
	public void listar() {
		String hql = "SELECT p FROM Persona p";
		
		Query query = em.createQuery(hql);
		
		List<Persona> personas  = query.getResultList();
		
		for(Persona p: personas) {
			System.out.println("p = "+ p);
		}
	}
	
	public void insertar(Persona persona) {
		try {
			em.getTransaction().begin();
			em.persist(persona);
			em.getTransaction().commit();
			
		}catch(Exception e) {
			e.printStackTrace(System.out);
			em.getTransaction().rollback();
		}
	}
	
	public void modificar(Persona persona) {
		try {
			em.getTransaction().begin();
			em.merge(persona);
			em.getTransaction().commit();
			
		}catch(Exception e) {
			e.printStackTrace(System.out);
			em.getTransaction().rollback();
		}
	}
	
	public Persona buscarPersonaPorId(Persona p) {
		return em.find(Persona.class, p.getIdpersona());
	}
	
	public void eliminar(Persona persona) {
		try {
			em.getTransaction().begin();
			em.remove(em.merge(persona));
			em.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace(System.out);
			em.getTransaction().rollback();
		}
	}
	
}
