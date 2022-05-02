package semaforo.biestable;

public interface Condition
{
	/**Devuelve la cadena “cerrado” cuando está en Rojo y “abierto” cuando está en Verde*/
	public String estado();
	public void cerrar();
	public void abrir();
}