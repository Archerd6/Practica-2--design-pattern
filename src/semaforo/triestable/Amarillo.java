package semaforo.triestable;

public class Amarillo implements Condition
{
	public Amarillo()
	{
		
	}
	
	public String estado()
	{
		return "precauci�n"; //  ... la respuesta al m�todo estado() ser� la cadena "precauci�n"...
	}
	
	public void cerrar()
	{
		Semaforo.setStrategy(new Rojo());
	}
	
	public void abrir()
	{
		Semaforo.setStrategy(new Verde());
	}
}