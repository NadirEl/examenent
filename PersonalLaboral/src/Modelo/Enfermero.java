package Modelo;

public class Enfermero extends Sanitario{
	
	public enum tipoPuesto{
		UCI,planta
	}
	
	private tipoPuesto puesto;

	public Enfermero (String dni, String nombre, double sueldoBase, int edad, tipoPuesto puesto) {
		
		super(dni,nombre,sueldoBase,edad);
		this.puesto=puesto;
		
		
	}

	@Override
	public String mostrar() {
		return this.toString()+"\n"+this.calculaSueldo();

	}

	@Override
	public double calculaSueldo() {
		
		if(this.puesto==tipoPuesto.UCI) {
			return this.sueldoBase+200;
		} else {
			return this.sueldoBase;
		}
		
		
	}

	@Override
	public String toString() {
		return "Enfermero [puesto=" + puesto + ", dni=" + dni + ", nombre=" + nombre + ", sueldoBase=" + sueldoBase
				+ ", edad=" + edad + "]";
	}
	
	@Override
	public boolean jubilable() {
		return (edad>=70);
	}

}
