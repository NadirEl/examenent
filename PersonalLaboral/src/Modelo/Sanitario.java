package Modelo;

public abstract class Sanitario implements PersonalLaboral {

	protected String dni;
	protected String nombre;
	protected double sueldoBase;
	protected int edad;
	
	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public Sanitario(String dni, String nombre, double sueldoBase, int edad)
	{
		this.dni=dni;
		this.nombre=nombre;
		this.sueldoBase=sueldoBase;
		this.edad=edad;
	}
	


	@Override
	public boolean jubilable() {
		return (edad>=65);
	}

	@Override
	public
	abstract double calculaSueldo();

}
