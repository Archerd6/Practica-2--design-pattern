package semaforo.completo;

public interface Condition
{
	/**Devuelve la cadena �cerrado� cuando est� en Rojo, �abierto� cuando est� en Verde y �precaucion� cuando est� en Amarillo*/
	public String estado();
	public void cerrar();
	public void abrir();
	/**A la recepci�n de un mensaje cambio(), un dispositivo Biestable pasar� a partir de ese momento a comportarse como un Triestable, y viceversa.*/
	public void cambio();
}