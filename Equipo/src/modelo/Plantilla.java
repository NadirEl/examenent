package modelo;

import java.util.ArrayList;

public class Plantilla {
	private ArrayList<Jugador> listaTelefonos;

	public Plantilla() {
		listaTelefonos = new ArrayList<Jugador>();
	}

	public void anyadir(Jugador objeto) {
		if(listaTelefonos.size() < 100)
			listaTelefonos.add(objeto);
	}

	public boolean eliminar(String posicion) {
		boolean eliminado = false;
		Jugador per = new Jugador();
		per.setPos(posicion);
		int pos = listaTelefonos.indexOf(per);
		if (pos != -1) {
			eliminado = true;
			listaTelefonos.remove(pos);
		}

		return eliminado; 
	}

	public int buscar(String nombre) {
		int pos = 0;

		while (pos < listaTelefonos.size() && !listaTelefonos.get(pos).getNombre().contains(nombre)) {
			pos++;
		}
		if (pos == listaTelefonos.size())
			pos = -1;

		return pos;
	}

	public Jugador registro(int i) {
		Jugador per = null;
		if (i >= 0 && i < listaTelefonos.size())
			per = listaTelefonos.get(i);
		else
			System.out.println("No se encuentra");
		return per;
	}

	public int longitud() {
		return listaTelefonos.size();
	}

	public String mostrarLista() {
		String texto="";
		for (Jugador Jugador : listaTelefonos) {
			texto+=Jugador.toString();
		}
		return texto;
	}


}
