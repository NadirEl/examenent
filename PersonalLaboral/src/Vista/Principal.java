package Vista;

import Modelo.Enfermero;
import Modelo.Enfermero.tipoPuesto;
import Modelo.Medico;
import Modelo.Sanitario;

public class Principal {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		Sanitario[] listaSanitarios = new Sanitario[5];
		listaSanitarios[0]=new Medico("35647362D","Unai", 1200, 66, 200, "Cirujano");
		listaSanitarios[1]=new Medico("34534236G","Iker", 2300, 23, 10, "Cardiologo");
		listaSanitarios[2]=new Enfermero("35647362D","Mikel", 2100, 34, tipoPuesto.UCI);
		listaSanitarios[3]=new Enfermero("35647362D","Ana", 1400, 35, tipoPuesto.UCI);
		listaSanitarios[4]=new Enfermero("35647362D","Sofia", 1900,69, tipoPuesto.planta);
		
		
		for (Sanitario sanitario : listaSanitarios) {
			System.out.println(sanitario.mostrar());
		}
		
		for (Sanitario sanitario : listaSanitarios) {
			double sB = sanitario.getSueldoBase();
			sB=sB*1.01;
			sanitario.setSueldoBase(sB);
		}
		
		for (Sanitario sanitario : listaSanitarios) {
		System.out.println(sanitario.mostrar());
		}
		System.out.println("Jubilarse");
		for  (Sanitario sanitario : listaSanitarios) {
		if(sanitario.jubilable())
			System.out.println(sanitario.mostrar());
		}
		
	}

}
