package semaforo.triestable;

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
		// "... Un mensaje abrir() en estado Verde no tendr� efecto ..."
	}
}