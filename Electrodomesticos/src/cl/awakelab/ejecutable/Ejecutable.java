/**
 * 
 */
package cl.awakelab.ejecutable;
import cl.awakelab.clases.*;

/**
 * @author Alumno
 *HORA INICIO: 18:40 09/03/2020
 *HORA TERMINO: 
 */
public class Ejecutable {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		//ARRAY DE 13 COLORES, SE USA PARA INSERTAR COLORES AL AZAR EN LOS CONSTRUCTORES
		String[] LISTA_COLORES = {"BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS", "AMARILLO", "ROSA", "MORADO", "NARANJA", "VERDE", "VIOLETA", "VERDE LIMON", "TURQUESA"};
		
		//VARIABLE PARA ASIGNAR PRECIO BASE RANDOM AL CONSTRUCTOR (DE 0 A 1.000.000)
		double PRECIO_RANDOM = Math.random()*1000001;
		
		//VARIABLE PARA ASIGNAR PESO RANDOM AL CONSTRUCTOR (DE 0 A 150)
		int PESO_RANDOM = (int) (Math.random()*151);
		
		//ARRAY DE LETRAS, PARA ASIGNAR LETRA RANDOM A CONSUMO_ENERGETICO
		String[] ABC = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"};
		
		//AZAR DE BOOLEAN
		boolean[] SINTONIZADOR_RANDOM = {true, false};
		
		Electrodomestico [] lista_electrodomestico = new Electrodomestico[10];
		
		for (int i = 0; i < 5; i++) {
			lista_electrodomestico[i] = new Electrodomestico(PRECIO_RANDOM, LISTA_COLORES[(int) (Math.random()*13)], ABC[(int) (Math.random()*26)], PESO_RANDOM);
			lista_electrodomestico[i].comprobarColor(lista_electrodomestico[i].getColor());
			lista_electrodomestico[i].comprobarConsumoEnergetico(lista_electrodomestico[i].getConsumo_energetico());
		}
		
		//CREA 3 LAVADORAS CON CARGA QUE VARIA DE 0 A 101
		for (int i = 5; i < 8; i++) {
			lista_electrodomestico[i] = new Lavadora((int) (Math.random()*101));
			lista_electrodomestico[i].comprobarColor(lista_electrodomestico[i].getColor());
			lista_electrodomestico[i].comprobarConsumoEnergetico(lista_electrodomestico[i].getConsumo_energetico());
		}
		
		//CREA 2 TELEVISORES CON TAMAÑO DE 14 A 80 PULGADAS, Y SINTONIZADOR AL AZAR (TRUE O FALSE)
		for (int i = 8; i < lista_electrodomestico.length; i++) {
			lista_electrodomestico[i] = new Television((int) (Math.random()*(14-80)+80), SINTONIZADOR_RANDOM[(int) (Math.random()*2)]);
			lista_electrodomestico[i].comprobarColor(lista_electrodomestico[i].getColor());
			lista_electrodomestico[i].comprobarConsumoEnergetico(lista_electrodomestico[i].getConsumo_energetico());
		}
		
		System.out.println("---------------------------LISTA DE PRECIOS---------------------------");
		for (int i = 0; i < lista_electrodomestico.length; i++) {
			System.out.println("Precio final = [ " + lista_electrodomestico[i].precioFinal() + " ]");
		}
		
		
		
	}

}
