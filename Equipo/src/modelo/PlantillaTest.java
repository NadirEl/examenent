package modelo;

import org.junit.Assert;
import org.junit.Test;

public class PlantillaTest {

    @Test
    public void testAnyadir() {
        Plantilla plantilla = new Plantilla();

        Jugador jugador1 = new Jugador("Jugador1", "Delantero", "Goleador");
        Jugador jugador2 = new Jugador("Jugador2", "Defensor", "Fuerte en el juego aéreo");

        plantilla.anyadir(jugador1);
        plantilla.anyadir(jugador2);

        Assert.assertEquals(2, plantilla.longitud());
    }

    @Test
    public void testEliminar() {
        Plantilla plantilla = new Plantilla();

        Jugador jugador1 = new Jugador("Jugador1", "Delantero", "Goleador");
        Jugador jugador2 = new Jugador("Jugador2", "Defensor", "Fuerte en el juego aéreo");

        plantilla.anyadir(jugador1);
        plantilla.anyadir(jugador2);

        boolean eliminado = plantilla.eliminar("Delantero");
        Assert.assertTrue(eliminado);
        Assert.assertEquals(1, plantilla.longitud());

        eliminado = plantilla.eliminar("Mediocampista");
        Assert.assertFalse(eliminado);
        Assert.assertEquals(1, plantilla.longitud());
    }

    @Test
    public void testBuscar() {
        Plantilla plantilla = new Plantilla();

        Jugador jugador1 = new Jugador("Jugador1", "Delantero", "Goleador");
        Jugador jugador2 = new Jugador("Jugador2", "Defensor", "Fuerte en el juego aéreo");

        plantilla.anyadir(jugador1);
        plantilla.anyadir(jugador2);

        int pos = plantilla.buscar("Jugador1");
        Assert.assertEquals(0, pos);

        pos = plantilla.buscar("Jugador3");
        Assert.assertEquals(-1, pos);
    }

    @Test
    public void testRegistro() {
        Plantilla plantilla = new Plantilla();

        Jugador jugador1 = new Jugador("Jugador1", "Delantero", "Goleador");
        Jugador jugador2 = new Jugador("Jugador2", "Defensor", "Fuerte en el juego aéreo");

        plantilla.anyadir(jugador1);
        plantilla.anyadir(jugador2);

        Jugador jugador = plantilla.registro(0);
        Assert.assertEquals(jugador1, jugador);

        jugador = plantilla.registro(1);
        Assert.assertEquals(jugador2, jugador);

        jugador = plantilla.registro(2);
        Assert.assertNull(jugador);
    }

    @Test
    public void testMostrarLista() {
        Plantilla plantilla = new Plantilla();

        Jugador jugador1 = new Jugador("Jugador1", "Delantero", "Goleador");
        Jugador jugador2 = new Jugador("Jugador2", "Defensor", "Fuerte en el juego aéreo");

        plantilla.anyadir(jugador1);
        plantilla.anyadir(jugador2);

        String lista = plantilla.mostrarLista();
        String expectedLista = "Jugador [nombre=Jugador1, posicion=Delantero, caracteristica=Goleador]"
                + "Jugador [nombre=Jugador2, posicion=Defensor, caracteristica=Fuerte en el juego aéreo]";

        Assert.assertEquals(expectedLista, lista);
    }
}
