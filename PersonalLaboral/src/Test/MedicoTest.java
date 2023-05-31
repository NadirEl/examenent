package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Modelo.Medico;

class MedicoTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}
	
		
		String dni="";
		String nombre ="";
		double sueldoBase=15.5;
		int edad=10;
		 int numeroPacientes=5;
		 String especialidad="sd";
		
		
Medico me=new Medico(dni, nombre, sueldoBase, edad, edad, dni);
	@Test
	void testMonstrar() {
	System.out.println(me.mostrar());
	assertEquals(me.mostrar(),"Medico [especialidad=, numeroPacientes=10, dni=, nombre=, sueldoBase=27.5, edad=10]");
		
	}
	@Test
	void testSueldototal() {
		double sueldoTotal = 0;
		sueldoTotal = sueldoBase + (numeroPacientes * 1.20);
		assertEquals(me.calculaSueldo(),sueldoTotal);
	}


}
