package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Modelo.Enfermero;


class EnfermeroTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	String dni="";
	String nombre ="";
	double sueldoBase=15.5;
	int edad=10;
	 int numeroPacientes=5;
	 String especialidad="sd";

	 Enfermero enf =new Enfermero(dni, nombre, sueldoBase, edad, Enfermero.tipoPuesto.planta);
	 Enfermero enf2 =new Enfermero(dni, nombre, sueldoBase, edad, Enfermero.tipoPuesto.UCI);
	 Enfermero enf3 =new Enfermero(dni, nombre, sueldoBase, 70, Enfermero.tipoPuesto.UCI);
	@Test
	void testMonstrar() {
		System.out.println(enf.mostrar());
		assertEquals(enf.mostrar(),"Enfermero [puesto=planta, dni=, nombre=, sueldoBase=15.5, edad=10]"+"\n"+
				15.5);
	}
	@Test
	void testcalculaSueldo() {
		double sal= sueldoBase+200;
		assertEquals(enf2.calculaSueldo(),
				sal);
		assertEquals(enf.calculaSueldo(),
				sueldoBase);
		
		}
	@Test
	void testjubilable() {
		assertEquals(enf.jubilable(),
				70);
	}

		
	}

