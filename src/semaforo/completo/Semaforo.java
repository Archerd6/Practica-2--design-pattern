// State Pattern
package semaforo.completo;

/** Completo (Biestable y Triestable) */
public class Semaforo
{
	private static Condition actual;
	
	public Semaforo(Condition nouveau)
	{
		actual=nouveau;
	}
	
	public static void setStrategy(Condition nouveau)
	{
		actual=nouveau;
	}
		
	public void abrir()
	{	
		actual.abrir();
	}
	
	public void cerrar()
	{
		actual.cerrar();
	}
	
	public String estado()
	{
		return actual.estado();
	}
	
	public void cambio()
	{
		actual.cambio();
	}
}