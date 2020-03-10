/**
 * 
 */
package cl.awakelab.clases;

/**
 * @author Paolo Mancini
 */
public class Television extends Electrodomestico {

	/**
	 * Resolucion por defecto = 20
	 * SintonizadorTDT po defecto = false
	 */
	protected final static int RESOLUCION_DEF = 20;
	protected final static boolean SINTONIZADORTDT_DEF = false;
	
	/**
	 * Argumentos de la clase Television
	 * resolucion
	 * sintonizadorTDT
	 */
	private int resolucion;
	private boolean sintonizadorTDT;
	
	/**
	 * Constructor por defecto de la clase Television
	 */
	public Television() {
		super();
		this.resolucion=RESOLUCION_DEF;
		this.sintonizadorTDT=SINTONIZADORTDT_DEF;
	}
	
	/**
	 * Constructor con precio_base y peso de la clase Television
	 * @param precio_base
	 * @param peso
	 */
	public Television(int precio_base, int peso) {
		super(precio_base, peso);
		this.resolucion=RESOLUCION_DEF;
		this.sintonizadorTDT=SINTONIZADORTDT_DEF;
	}
	
	/**
	 * Constructor con resolucion y sintonizadorTDT de la clase Television
	 * @param resolucion
	 * @param sintonizadorTDT
	 */
	public Television(int resolucion, boolean sintonizadorTDT) {
		super();
		this.resolucion=resolucion;
		this.sintonizadorTDT=sintonizadorTDT;
	}
	
	//GETTERS

	/**
	 * @return La resolucion de la Television
	 */
	public int getResolucion() {
		return resolucion;
	}

	/**
	 * @return El sintonizadorTDT (True = existe sintonizador, False = no existe sintonizador)
	 */
	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	
	//METODO DE LA CLASE
	
	/**
	 * @see Electrodomestico
	 * Incluye la variable resolucion y sintonizadorTDT al calculo del precio final
	 * Incrementa 30% si la Television tiene más de 40 pulgadas
	 * Incrementa 50 Euros si la Television tiene sintonizadorTDT
	 */
	public double precioFinal(){
		double precioFinal=super.getPrecio_base();
		
		if (super.getConsumo_energetico().equalsIgnoreCase("A")) {
			precioFinal=precioFinal+100;
		}else {
			if (super.getConsumo_energetico().equalsIgnoreCase("B")) {
				precioFinal=precioFinal+80;
			}else {
				if (super.getConsumo_energetico().equalsIgnoreCase("C")) {
					precioFinal=precioFinal+60;
				}else {
					if (super.getConsumo_energetico().equalsIgnoreCase("D")) {
						precioFinal=precioFinal+50;
					}else {
						if (super.getConsumo_energetico().equalsIgnoreCase("E")) {
							precioFinal=precioFinal+30;
						}else {
							if (super.getConsumo_energetico().equalsIgnoreCase("F")) {
								precioFinal=precioFinal+10;
							}
						}
					}
				}
			}
		}
		
		if (super.getPeso()>=0 && super.getPeso()<20) {
			precioFinal=precioFinal+10;
		}else {
			if (super.getPeso()>19 && super.getPeso()<50) {
				precioFinal=precioFinal+50;
			}else {
				if (super.getPeso()>49 && super.getPeso()<80) {
					precioFinal=precioFinal+80;
				}else {
					if (super.getPeso()>=80) {
						precioFinal=precioFinal+100;
					}
				}
			}
		}
		
		if (this.resolucion>40) {
			precioFinal=precioFinal*1.3;
		}
		
		if (this.sintonizadorTDT==true) {
			precioFinal=precioFinal+50;
		}
		return precioFinal;
	}
	
	//TO STRING CLASE TELEVISION

	@Override
	public String toString() {
		return "Television [" + super.toString() + ", resolucion= " + resolucion + ", sintonizadorTDT=" + sintonizadorTDT + ", Precio Final= " + precioFinal() + "]";
	}
	
	
	

}
