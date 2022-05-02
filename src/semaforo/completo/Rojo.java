package semaforo.completo;

public class Rojo implements Condition
{

	public Rojo()
	{
		
	}
	
	public String estado()
	{
		return "cerrado";
	}
	
	public void cerrar()
	{
	//  ... no tendrá efecto, ni un mensaje cerrar() en estado Rojo ...
	}
	
	public void abrir()
	{
		Semaforo.setStrategy(new Amarillo());
	}
	
	public void cambio()
	{
		Semaforo.setStrategy(new Rojo_biestable());
	}
}