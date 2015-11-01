package mundo;

import java.util.ArrayList;

/**
 * Created by Daniel on 17/10/2015.
 */
public class Controladora {

	/**
	 * Comando para desconectarse el cliente
	 */
	public final static String DESCONECTAR = "desconectar";

	/**
	 * Comando para verificar la posicion del reto
	 */
	public final static String VERIFICAR_RETO = "verificar reto";

	/**
	 * comando para pedir una pista del reto solicitado
	 */
	public final static String PEDIR_PISTA = "pedir pista";

	/**
	 * comando para pedir un reto cuando se haya completado el anterior
	 */
	public final static String PEDIR_RETO = "pedir reto";
	
	/**
	 * El usuario solo tiene acceso a ver la información de los retos 1 por 1
	 */
	private Reto reto;
	
	/**
	 * Puntuación del juego del usuario
	 */
	private int puntuacion;
	
	public Controladora() {
		puntuacion = 0;
	}

	/**
	 * La aplicacion se encarga de verificar que la posicion del usuario sea valida
	 * para completar el reto
	 * 
	 * @param latitud - Latitud de la posicion del usuario
	 * @param longitud - Longitud de la posicion del usuario
	 */
	 public void verificarReto(double latitud, double longitud){
		boolean verifico = reto.verificarPosicionReto(latitud, longitud);
		
		if(verifico)
			pedirReto();
	}
	
	/**
	 * Evento que se utiliza para pedirle al servidor de FitGo un reto
	 */
	public void pedirReto(){
		
	}
	
	/**
	 * pide al servidor una pista del reto
	 */
	public void pedirPista(){
		
	}
	
	
	/**
	 * inicializa la relacion reto
	 * @param codigo
	 * @param descripcion
	 * @param latitud
	 * @param longitud
	 * @param delta
	 */
	public void agregarReto(String codigo, String descripcion, String latitud, String longitud, String delta){
			reto = new Reto(codigo, descripcion, latitud, longitud, delta);
			
	}
	
	/**
	 * agrega la descripcion de una pista al reto
	 * @param descripcion
	 */
	public void agregarPistasReto(String descripcion){
		reto.agregarPista(descripcion);
	}
	
}
