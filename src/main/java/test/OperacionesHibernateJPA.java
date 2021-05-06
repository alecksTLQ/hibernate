package test;

import mx.com.gm.dao.PersonaDao;
import mx.com.gm.domain.Persona;

public class OperacionesHibernateJPA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonaDao persona = new PersonaDao();
		persona.listar();
		
		/*Persona mdlPersona = new Persona();
		mdlPersona.setNombre("Carlos");
		mdlPersona.setApellido("Lara");
		mdlPersona.setEmail("carloslara@gmail.com");
		mdlPersona.setTelefono("70401012");
		
		persona.insertar(mdlPersona);*/
		
		
		/*start forma de actualizar*/
		/*Persona mdlPersona = new Persona();
		mdlPersona.setIdpersona(8);
		mdlPersona= persona.buscarPersonaPorId(mdlPersona);
		System.out.println("objeto recuperado de la BD: "+mdlPersona);
		mdlPersona.setApellido("Rivera");
		mdlPersona.setEmail("carlosrivera@gmail.com");
		persona.modificar(mdlPersona);*/
		/*end forma actualizar*/
		
		/*start eliminar*/
		Persona mdlPersona = new Persona();
		mdlPersona.setIdpersona(8);
		mdlPersona= persona.buscarPersonaPorId(mdlPersona);
		persona.eliminar(mdlPersona);
		/*end eliminar*/
		
		persona.listar();
	}

}
