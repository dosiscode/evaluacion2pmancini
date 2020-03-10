/**
 * 
 */
package cl.awakelab.clases;

/**
 * @author Alumno
 *
 */
public class Television extends Electrodomestico {

	/**
	 * 
	 */
	protected final static int RESOLUCION_DEF = 20;
	protected final static boolean SINTONIZADORTDT_DEF = false;
	
	private int resolucion;
	private boolean sintonizadorTDT;
	
	public Television() {
		super();
		this.resolucion=RESOLUCION_DEF;
		this.sintonizadorTDT=SINTONIZADORTDT_DEF;
	}
	
	public Television(int precio_base, int peso) {
		super(precio_base, peso);
		this.resolucion=RESOLUCION_DEF;
		this.sintonizadorTDT=SINTONIZADORTDT_DEF;
	}
	
	public Television(int resolucion, boolean sintonizadorTDT) {
		super();
		this.resolucion=resolucion;
		this.sintonizadorTDT=sintonizadorTDT;
	}
	
	//GETTERS

	/**
	 * @return the resolucion
	 */
	public int getResolucion() {
		return resolucion;
	}

	/**
	 * @return the sintonizadorTDT
	 */
	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	
	//METODO DE LA CLASE
	
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
