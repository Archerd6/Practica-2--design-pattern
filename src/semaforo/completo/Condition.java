package semaforo.completo;

public interface Condition
{
	/**Devuelve la cadena “cerrado” cuando está en Rojo, “abierto” cuando está en Verde y “precaucion” cuando está en Amarillo*/
	public String estado();
	public void cerrar();
	public void abrir();
	/**A la recepción de un mensaje cambio(), un dispositivo Biestable pasará a partir de ese momento a comportarse como un Triestable, y viceversa.*/
	public void cambio();
}