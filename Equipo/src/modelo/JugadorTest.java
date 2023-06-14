package modelo;

import org.junit.Assert;
import org.junit.Test;

public class JugadorTest {

    @Test
    public void testConstructorPorDefecto() {
        Jugador jugador = new Jugador();

        Assert.assertEquals("sin nombre", jugador.getNombre());
        Assert.assertEquals("sin convocar", jugador.getPos());
        Assert.assertNull(jugador.getCarac());
    }

    @Test
    public void testConstructorConParametros() {
        String nombre = "Jugador1";
        String posicion = "Delantero";
        String caracteristica = "Goleador";

        Jugador jugador = new Jugador(nombre, posicion, caracteristica);

        Assert.assertEquals(nombre, jugador.getNombre());
        Assert.assertEquals(posicion, jugador.getPos());
        Assert.assertEquals(caracteristica, jugador.getCarac());
    }

    @Test
    public void testSettersAndGetters() {
        Jugador jugador = new Jugador();

        String nombre = "Jugador2";
        String posicion = "Defensor";
        String caracteristica = "Fuerte en el juego aéreo";

        jugador.setNombre(nombre);
        jugador.setPos(posicion);
        jugador.setCarac(caracteristica);

        Assert.assertEquals(nombre, jugador.getNombre());
        Assert.assertEquals(posicion, jugador.getPos());
        Assert.assertEquals(caracteristica, jugador.getCarac());
    }

    @Test
    public void testToString() {
        String nombre = "Jugador3";
        String posicion = "Mediocampista";
        String caracteristica = "Excelente visión de juego";

        Jugador jugador = new Jugador(nombre, posicion, caracteristica);

        String expectedToString = "Jugador [nombre=Jugador3, posicion=Mediocampista, caracteristica=Excelente visión de juego]";

        Assert.assertEquals(expectedToString, jugador.toString());
    }


    @Test
    public void testEquals() {
        Jugador jugador1 = new Jugador("Jugador1", "Delantero", "Goleador");
        Jugador jugador2 = new Jugador("Jugador2", "Delantero", "Veloz");
        Jugador jugador3 = new Jugador("Jugador3", "Mediocampista", "Técnico");
        Jugador jugador4 = new Jugador("Jugador4", "Delantero", "Goleador");

        Assert.assertTrue(jugador1.equals(jugador4));
        Assert.assertTrue(jugador4.equals(jugador1));

        Assert.assertFalse(jugador1.equals(jugador3));
        Assert.assertFalse(jugador3.equals(jugador1));

        Assert.assertTrue(jugador1.equals(jugador2));
        Assert.assertTrue(jugador2.equals(jugador1));

        Assert.assertFalse(jugador2.equals(jugador3));
        Assert.assertFalse(jugador3.equals(jugador2));
    }
}
