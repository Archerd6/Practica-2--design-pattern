package semaforo.biestable;

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
		Semaforo.setStrategy(new Rojo());
	}
	
	public void abrir()
	{
		// "... Un mensaje abrir() en estado Verde no tendrá efecto ..."
	}
}