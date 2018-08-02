package com.mitocode.spring;

//import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitocode.beans.Jugador;
import com.mitocode.beans.Manchester;
//import com.mitocode.beans.Ciudad;
import com.mitocode.beans.Persona;

import interfaces.IEquipo;

public class App {

	public static void main(String[] args) {
	/*
	ApplicationContext appContext = new ClassPathXmlApplicationContext("com/mitocode/xml/beans.xml");
	Mundo m = (Mundo) appContext.getBean(Mundo.class); 	
	System.out.println(m.getSaludo());
	*/	
	/*	
	ApplicationContext appContext = new ClassPathXmlApplicationContext("com/mitocode/xml/beans.xml");
	Persona per= (Persona) appContext.getBean("persona");
	
	//instancio el objeto
	per.setId(1);
	per.setNombre("Rodrigo");
	per.setApodo("Rodri");
	
	System.out.println(per.toString()+" "+per.getPais().getNombre()+" "+per.getCiudad().getNombre());

	//para cerrarlo!
	((ConfigurableApplicationContext) appContext).close();
	}
	*/
		
	ApplicationContext app= new ClassPathXmlApplicationContext("beans.xml");
	Jugador jug = (Jugador)app.getBean("jugador");
	IEquipo eq= (IEquipo) app.getBean("barcelona");
	
	System.out.println(jug.getNombre()+" juega en: "+eq.mostrar());
	//asfdasfasf
	//System.out.println(eq.mostrar());
	
	
	
	//FUNCIONA TODO JUAN TIENE RAZON
	
	
	
	
	
	
	}


}
