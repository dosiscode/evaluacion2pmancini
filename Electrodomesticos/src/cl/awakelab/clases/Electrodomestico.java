/**
 * 
 */
package cl.awakelab.clases;

/**
 * @author Alumno
 * 
 */
public class Electrodomestico {
	
	protected final static double PRECIO_BASE_DEF = 100000;
	protected final static String COLOR_DEF = "BLANCO";
	protected final static String CONSUMO_ENERGETICO_DEF = "F";
	protected final static int PESO_DEF = 5;
	
	private double precio_base;
	private String color;
	private String consumo_energetico;
	private int peso;	
	
	public Electrodomestico() {
		this(PRECIO_BASE_DEF, COLOR_DEF, CONSUMO_ENERGETICO_DEF, PESO_DEF);
	}
	
	public Electrodomestico(double precio_base, int peso) {
		this.precio_base=precio_base;
		this.color=COLOR_DEF;
		this.consumo_energetico=CONSUMO_ENERGETICO_DEF;
		this.peso=peso;
	}
	
	public Electrodomestico(double precio_base, String color, String consumo_energetico, int peso) {
		this.precio_base=precio_base;
		this.color=color;
		this.consumo_energetico=consumo_energetico;
		this.peso=peso;
	}
	
	//GETTERS
	
	/**
	 * @return the precio_base
	 */
	public double getPrecio_base() {
		return precio_base;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @return the consumo_energetico
	 */
	public String getConsumo_energetico() {
		return consumo_energetico;
	}
	/**
	 * @return the peso
	 */
	public int getPeso() {
		return peso;
	}
	
	//METODOS DE LA CLASE

	public void comprobarConsumoEnergetico(String letra) {
		
		if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("B") || letra.equalsIgnoreCase("C") || letra.equalsIgnoreCase("D") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("F")) {
			
			this.consumo_energetico=letra;
			
		}else {
			this.consumo_energetico="F";
		}
	}
	
	public void comprobarColor(String color) {
		if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {
			
			this.color=color;
			
		}else {
			this.color="BLANCO";
		}
	}
	
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
	
	//TO STRING
	@Override
	public String toString() {
		return "precio_base=" + precio_base + ", color=" + color + ", consumo_energetico="
				+ consumo_energetico + ", peso=" + peso;
	}

}
