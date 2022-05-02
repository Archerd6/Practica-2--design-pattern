package semaforo.completo;

public class Verde implements Condition 
{
	public Verde()
	{
		
	}
	
	public String estado()
	{
		return "abierto";
	}
	
	public void cerrar()
	{
		Semaforo.setStrategy(new Amarillo());
	}
	
	public void abrir()
	{
		// "... Un mensaje abrir() en estado Verde no tendrá efecto ..."
	}
	
	public void cambio()
	{
		Semaforo.setStrategy(new Verde_biestable());
	}
}