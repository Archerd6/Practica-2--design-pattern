package semaforo.biestable;

public interface Condition
{
	/**Devuelve la cadena �cerrado� cuando est� en Rojo y �abierto� cuando est� en Verde*/
	public String estado();
	public void cerrar();
	public void abrir();
}