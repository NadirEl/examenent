package vista;


	import java.util.Scanner;
	import modelo.Jugador;
	import modelo.Plantilla;

	public class Equipo {

		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			menu();
		}

		private static void menu() {
			// TODO Auto-generated method stub
			
			Scanner sc = new Scanner(System.in);
			int opc = -1;
			Plantilla plant = new Plantilla();
			do {
				System.out
						.println("1. Buscar (Devuelve los datos de un jugador.\r\n"
								+ "2. Mostrar plantilla (mostrar todos los datos de la plantilla)\r\n"
								+ "3. Añadir (añade un nuevo jugador a la plantilla)\r\n"
								+ "4. Eliminar (se pide una posición y si existe, se eliminan los)\r\n"
								+ "5. Salir ");
				opc = validarInt(sc,"Introduce la opción (1-5)", 1, 5, sc);
				switch(opc)
				{
				case 1: buscar(sc, plant); 
				break;
				case 2: mostrarPlantilla(plant); 
				break;
				case 3: anyadir(sc,plant); 
				break;
				case 4: eliminar(sc,plant); 
				break;
				}
			} while (opc != 5);

		}

		private static void eliminar(Scanner sc,Plantilla p) {
			// TODO Auto-generated method stub
			System.out.println("Introduce un teléfono");
			String tel = sc.nextLine();
			p.eliminar(tel);
		}

		private static void anyadir(Scanner sc, Plantilla p) {
			// TODO Auto-generated method stub
			System.out.println("Introduce un nombre");
			String nombre = sc.nextLine();
			System.out.println("Introduce un teléfono");
			String tel = sc.nextLine();
			System.out.println("Introduce un email");
			String email = sc.nextLine();
			Jugador ju = new Jugador(nombre,tel,email);
			p.anyadir(ju);
		}

		private static void mostrarPlantilla(Plantilla p) {
			// TODO Auto-generated method stub
			System.out.println(p.mostrarLista());
		}

		private static void buscar(Scanner sc, Plantilla p) {
			// TODO Auto-generated method stub
			System.out.println("Introduce un nombre");
			String nombre = sc.nextLine();
			int pos = p.buscar(nombre);
			if(pos != -1)
				System.out.println(p.registro(pos).toString());
			else
				System.out.println("Jugador no encotrado");
		}

		private static int validarInt(Scanner sc,String string, int min, int max, Scanner sc2) {
			// TODO Auto-generated method stub
			int opc = -1;
			boolean error = true;
			do {
				System.out.println(string);
				String texto = sc.nextLine();
				try {
					opc = Integer.valueOf(texto);
					if (opc >= min && opc <= max)
						error = false;

				} catch (Exception ex) {
					error = true;
				}
			} while (error);
			return opc;
		}

	


}
