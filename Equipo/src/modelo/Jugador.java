package modelo;

public class Jugador {
	private String nombre;
	private String posicion;
	private String caracteristica;
	
	public Jugador()
	{
		this.nombre = "sin nombre";
		this.posicion = "sin convocar";
	}
	
	
	public Jugador(String nombre, String pos, String carac) {
		super();
		this.nombre = nombre;
		this.posicion = pos;
		this.caracteristica = carac;
	}


	
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", posicion=" + posicion + ", caracteristica=" + caracteristica + "]";
	}

  
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Jugador))
			return false;
		Jugador other = (Jugador) obj;
		
		if (posicion == null) {
			if (other.posicion != null)
				return false;
		} else if (!posicion.equals(other.posicion))
			return false;
		return true;
	}


	public String getNombre() { 
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre; 
	}
	public String getPos() {
		return this.posicion;
	}
	public void setPos(String posicion) {
		this.posicion = posicion;
	}
	public String getCarac() {
		return this.caracteristica;
	}
	public void setCarac(String carac) {
		this.caracteristica = carac;
	}

}
