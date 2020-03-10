/**
 * 
 */
package cl.awakelab.clases;

/**
 * @author Alumno
 *
 */
public class Lavadora extends Electrodomestico {

	/**
	 * 
	 */
	protected final static int CARGA_DEF=5;
	
	private int carga;
	
	public Lavadora() {
		super();
		this.carga=CARGA_DEF;
	}
	
	public Lavadora(int precio_base, int peso) {
		super(precio_base, peso);
		this.carga=CARGA_DEF;
	}
	
	public Lavadora(int carga) {
		super();
		this.carga=carga;
	}
	
	//GETTERS

	/**
	 * @return the carga
	 */
	public int getCarga() {
		return carga;
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
		
		if (this.carga>30) {
			precioFinal=precioFinal+50;
		}else {
			precioFinal=precioFinal+0;
		}
		
		return precioFinal;
	}
	
	//TO STRING CLASE LAVADORA
	@Override
	public String toString() {
		return "Lavadora [" + super.toString() + ", carga= " + carga + ", Precio Final= " + precioFinal() + "]";
	}
	
	

}
