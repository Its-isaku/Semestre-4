import java.util.ArrayList;
import java.util.Random;

public class EJ18_b {
	
	
	/**
	 * 
	 * @param cantidad cantidad de numeros no repetidos a crear. Debe ser menor al limite del Random
	 * @return arreglo de numeros no repetidos.
	 */
	public static ArrayList<Integer> generarAleatoriosNoRepetidos (int cantidad) {
		ArrayList<Integer> respuesta = new ArrayList<>();
		for (int i = 0; i < cantidad; i++) {
			respuesta.add(gen(respuesta));
		}			
		return respuesta;
	}
	
	/**
	 * Metodo recursivo que crea un numero aleatorio, pero primero verifica si existe en el arreglo del parametro.
	 * Si el numero ya existe, el metodo se llama a si mismo para hacer otro intento y asi sucesivamente hasta
	 * encontrar un numero aleatorio que no exista en el arreglo
	 * @param a Arreglo de numeros aleatorios que previamente guarados
	 * @return numero que no existe en el arreglo a dado.
	 */
	public static int gen(ArrayList<Integer>a) {
		Random ra = new Random();	
		int numero = ra.nextInt(11);
		if (!a.contains(numero)) {
            System.out.println("asignado: " + numero);
			return numero;
		}else {
            System.out.println("repetido: " + numero);
			return gen(a);
		}
	}
	

	/**
	 * Este metodo solo imprime la respuesta
	 * @param num arreglo a imprimir
	 */
	public static void imprimir (ArrayList<Integer>num) {
		for (int i = 0; i < num.size(); i++) {
			System.out.println(num.get(i));
		}
	}
	
	
	public static void main(String[] args) {
		
		//aqui llamas el metodo con la cantidad de numeros que quieres no repetidos. Recordemso que no podemos crear numeros no repetidos mayores al limite del generador Random
		imprimir(generarAleatoriosNoRepetidos(10));
	}
}