package semaforo.triestable;

public class Amarillo implements Condition
{
	public Amarillo()
	{
		
	}
	
	public String estado()
	{
		return "precaución"; //  ... la respuesta al método estado() será la cadena "precaución"...
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