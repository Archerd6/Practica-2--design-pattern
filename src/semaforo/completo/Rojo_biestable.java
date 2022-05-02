package semaforo.completo;

public class Rojo_biestable implements Condition
{

	public Rojo_biestable()
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
		Semaforo.setStrategy(new Verde_biestable());
	}
	
	public void cambio()
	{
		Semaforo.setStrategy(new Amarillo());
	}
}