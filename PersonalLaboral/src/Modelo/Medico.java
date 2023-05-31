package Modelo;

public class Medico extends Sanitario {

	private String especialidad;
	private int numeroPacientes;
	
	public Medico(String dni, String nombre, double sueldoBase, int edad, int numeroPacientes, String especialidad) {
		super(dni, nombre, sueldoBase, edad);
		this.especialidad = especialidad;
		this.numeroPacientes = numeroPacientes;
	}

	@Override
	public String mostrar() {
		// TODO Auto-generated method stub
		return "Medico [especialidad=" + especialidad + ", numeroPacientes=" + numeroPacientes + ", dni=" + dni
				+ ", nombre=" + nombre + ", sueldoBase=" + calculaSueldo() + ", edad=" + edad + "]";
		
	}

	@Override
	public double calculaSueldo() {
		// TODO Auto-generated method stub
		double sueldoTotal = 0;
		sueldoTotal = sueldoBase + (numeroPacientes * 1.20);
		return sueldoTotal;
	}



	
}
