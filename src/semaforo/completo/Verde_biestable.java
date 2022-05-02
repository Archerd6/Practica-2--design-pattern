package semaforo.completo;

public class Verde_biestable implements Condition 
{
	public Verde_biestable()
	{
		
	}
	
	public String estado()
	{
		return "abierto";
	}
	
	public void cerrar()
	{
		Semaforo.setStrategy(new Rojo_biestable());
	}
	
	public void abrir()
	{
		// "... Un mensaje abrir() en estado Verde no tendrá efecto ..."
	}
	
	public void cambio()
	{
		Semaforo.setStrategy(new Amarillo());
	}
}