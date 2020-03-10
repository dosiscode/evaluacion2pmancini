package cl.awakelab.clases;

/**
 * @author Paolo Mancini
 */
public class Electrodomestico {
	
	protected final static double PRECIO_BASE_DEF = 100; //en las instrucciones decia 100.000 pesos, pero despues en la tabla de precios decia euros. Lo deje como 100 euros.
	protected final static String COLOR_DEF = "BLANCO";
	protected final static String CONSUMO_ENERGETICO_DEF = "F";
	protected final static int PESO_DEF = 5;
	
	private double precio_base;
	private String color;
	private String consumo_energetico;
	private int peso;	
	
	/**
	 *Constructor por defecto de la clase Electrodomestico
	 *Constantes
	 *PRECIO_BASE_DEF = 100
	 *COLOR_DEF = BLANCO
	 *CONSUMO_ENERGETICO_DEF = F
	 *PESO_DEF = 5
	 */
	public Electrodomestico() {
		this(PRECIO_BASE_DEF, COLOR_DEF, CONSUMO_ENERGETICO_DEF, PESO_DEF);
	}
	
	/**
	 * Constructor con parametros
	 * @param precio_base
	 * @param peso
	 */
	public Electrodomestico(double precio_base, int peso) {
		this.precio_base=precio_base;
		this.color=COLOR_DEF;
		this.consumo_energetico=CONSUMO_ENERGETICO_DEF;
		this.peso=peso;
	}
	/**
	 * Constructor con parametros
	 * @param precio_base
	 * @param color
	 * @param consumo_energetico
	 * @param peso
	 */
	public Electrodomestico(double precio_base, String color, String consumo_energetico, int peso) {
		this.precio_base=precio_base;
		this.color=color;
		this.consumo_energetico=consumo_energetico;
		this.peso=peso;
	}
	
	//GETTERS
	
	/**
	 * @return El precio_base del Electrodomestico
	 */
	public double getPrecio_base() {
		return precio_base;
	}
	/**
	 * @return El color del Electrodomestico
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @return El consumo_energetico del Electrodomestico
	 */
	public String getConsumo_energetico() {
		return consumo_energetico;
	}
	/**
	 * @return El peso del Electrodomestico
	 */
	public int getPeso() {
		return peso;
	}
	
	//METODOS DE LA CLASE
	
	/**
	 * Se ingresa una letra por parametro y se evalua si se asigna a consumo_energetico o se cambia a valor por defecto
	 * @param letra
	 * 
	 */
	public void comprobarConsumoEnergetico(String letra) {
		
		if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("B") || letra.equalsIgnoreCase("C") || letra.equalsIgnoreCase("D") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("F")) {
			
			this.consumo_energetico=letra;
			
		}else {
			this.consumo_energetico="F";
		}
	}
	/**
	 * Se ingresa un color por parametro y se valida si es alguno de los colores especificados para los electrodomesticos
	 * @param color
	 */
	public void comprobarColor(String color) {
		if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {
			
			this.color=color;
			
		}else {
			this.color="BLANCO";
		}
	}
	/**
	 * 
	 * @return Precio final del articulo segun consumo_energetico y peso
	 */
	public double precioFinal(){
		double precioFinal=this.precio_base;
		
		if (this.consumo_energetico.equalsIgnoreCase("A")) {
			precioFinal=precioFinal+100;
		}else {
			if (this.consumo_energetico.equalsIgnoreCase("B")) {
				precioFinal=precioFinal+80;
			}else {
				if (this.consumo_energetico.equalsIgnoreCase("C")) {
					precioFinal=precioFinal+60;
				}else {
					if (this.consumo_energetico.equalsIgnoreCase("D")) {
						precioFinal=precioFinal+50;
					}else {
						if (this.consumo_energetico.equalsIgnoreCase("E")) {
							precioFinal=precioFinal+30;
						}else {
							if (this.consumo_energetico.equalsIgnoreCase("F")) {
								precioFinal=precioFinal+10;
							}
						}
					}
				}
			}
		}
		
		if (this.peso>=0 && this.peso<20) {
			precioFinal=precioFinal+10;
		}else {
			if (this.peso>19 && this.peso<50) {
				precioFinal=precioFinal+50;
			}else {
				if (this.peso>49 && this.peso<80) {
					precioFinal=precioFinal+80;
				}else {
					if (this.peso>=80) {
						precioFinal=precioFinal+100;
					}
				}
			}
		}
		
		return precioFinal;
	}
	/**
	 * 
	 * @return Nombre de la clase
	 */
	public String getNombreClase() {
		String nombreClase = this.getClass().getSimpleName();
		return nombreClase;
	}
	
	//TO STRING
	@Override
	public String toString() {
		return "precio_base=" + precio_base + ", color=" + color + ", consumo_energetico="
				+ consumo_energetico + ", peso=" + peso;
	}

}
