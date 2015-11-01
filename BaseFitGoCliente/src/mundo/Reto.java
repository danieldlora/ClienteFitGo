package mundo;

import java.util.ArrayList;

/**
 * Created by Daniel on 17/10/2015.
 */
public class Reto {

	/**
	 * identificador unico del reto
	 */
	private String codigo;
	
	/**
	 * Descripcion apropiada del reto
	 */
	private String descripcion;
	
	/**
	 * coordenadas maximas y minimas de latitud
	 */
	private double latitudMax, latitudMin;
	
	/**
	 * coordenadas maximas y minimas de longitud
	 */
	private double longitudMax, longitudMin;
	
	/**
	 * El delta es la diferencia entre una coordenada maxima y minima para crear un cuadrado
	 * que sera el area valida del reto para cumplirse
	 */
	private double delta;

	/**
	 * Contenedor de pistas
	 */
	private ArrayList<Pista> pistas;

	/**
	 * Constructor de la clase para crear un reto
	 * @param codigo
	 * @param descripcion
	 * @param latitud
	 * @param longitud
	 * @param delta
	 */
	public Reto(String codigo, String descripcion, String latitud,
			String longitud, String delta) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		pistas = new ArrayList<Pista>();

		inicializarCoordenadasReto(latitud, longitud, delta);

	}

	
	/**
	 * Metodo que inicializa las coordenadas minimas y maximas de la latitud y longitud por un Delta
	 * @param latitud
	 * @param longitud
	 * @param delta
	 */
	private void inicializarCoordenadasReto(String latitud, String longitud,
			String delta) {
		double longitudx = Double.parseDouble(longitud);
		double latitudy = Double.parseDouble(latitud);
		double deltaL = Double.parseDouble(delta);

		deltaL = deltaL * Math.pow(10, -6);

		latitudMax = latitudy + deltaL;
		latitudMin = latitudy - deltaL;

		longitudMax = longitudx + deltaL;
		longitudMin = longitudx - deltaL;
	}

	/**
	 * Metodo que verifica si las coordenadas de la posicion del usuario se encuentran
	 * entre el rango de latitudMin, latitudMax, longitudMin, longitud Max
	 * @param latitud
	 * @param longitud
	 * @return boolean que indica si se encuentra en el area valida o no la posicion del usuario
	 */
	public boolean verificarPosicionReto(double latitud, double longitud) {

		if ((latitud >= latitudMin && latitud <= latitudMax)
				&& (longitud >= longitudMin && longitud <= longitudMax))
			return true;

		else
			return false;
	}

	/**
	 * Agrega una pista al reto
	 * @param descripcion - descripcion de la pista para resolver el reto
	 */
	public void agregarPista(String descripcion) {
		int consecutivo = pistas.size() + 1;
		Pista pista = new Pista(descripcion, consecutivo);
		pistas.add(pista);
	}

	
	//getters and setters
	
	public String getDescripcion() {
		return codigo;
	}

	public String getCodigo() {
		return descripcion;
	}

}
