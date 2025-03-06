package paqueteEjerciciosIntroductorios;
import java.util.Scanner;


public class PrimerosEjercicios2 {
	static Scanner lectura = new Scanner(System.in);
	/* 
	 * 11.Escribir una función que calcule la suma de los múltiplos de 3 o 5
	 *   mayores o iguales que 0 y menores que un parámetro n. Por ejemplo la llamada:
	 *    
	 *    */
    public static double sumaMultiplos(int n) {
        int suma = 0;

        for (int i = 0; i < n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                suma += i;
            }
        }
        return suma;
    }
    
    /*
     * 
     * 12. Dado un conjunto de valores numéricos que se ingresan por teclado determinar el valor promedio. 
     * El fin de datos se indicará ingresando un valor igual a cero
     * 
     * */

    public static double valorPromedio() {
        int valor_numerico;
        double suma_valores = 0;
        int contador = 0;

        System.out.println("Ingrese un valor numérico, la carga finalizará en 0.");

        while (true) {
            valor_numerico = lectura.nextInt();

            if (valor_numerico == 0) {
                break;
            }

            suma_valores += valor_numerico; 
            contador += 1;
        }

        if (contador > 0) {
            return suma_valores / contador; 
        } else {
            return 0; /* Si se ingresa 0 debemos estar al tanto */
        }
    }
    
    /*
     * 13. Se ingresa un valor numérico por consola, determinar e informar si se trata de un número primo o no
     * 
     * */
    
    public static boolean esPrimo(int n) {
    	if(n <=1) {
    		return false; 
    	}
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true; 
    }
    /*
     * 14. Desarrollar un algoritmo que muestre los primeros n números primos siendo n un valor que debe ingresar el usuario
     * 
     * */
    
    public static void nValoresPrimos(int n) {
    	for(int i=0; i<n; i++) {
    		if (esPrimo(i)) {
    			System.out.println(i);
    		}
    	}
    }
    
    /*
     * 15. Dado un conjunto de valores numéricos indicar cuál es el mayor. El ingreso de datos finaliza con la llegada de un cero
     * 
     * */
    
    public static int valorMayor() {
    	int primerValor = 0;
    	int valorMayor;
    	int valorNuevo;
    	
    	System.out.println("Ingrese una secuencia de números, se dirá cuál es el mayor: ");
    	valorMayor = lectura.nextInt();
    	
    	while(true) {
    	if(primerValor == 0) {
    		if(valorMayor == 0) {
    			return 0;
    		}
    		valorMayor = primerValor; /* No podemos decir que el valor mayor es 0 dado que no sabemos si se ingresará un valor negativo */
    		primerValor = 1;
    	}
    	else {
    		System.out.println("Ingrese un nuevo valor: ");
    		valorNuevo = lectura.nextInt();
    		
    		if(valorNuevo == 0) {
    			return valorMayor;
    		}
    		if (valorMayor < valorNuevo) {
    			valorMayor = valorNuevo;
    		}
    		
    	}
    	
    	}
    }
   
    
    
    public static void main(String[] args) {
        System.out.println("Suma de múltiplos de 10: " + sumaMultiplos(10));
        double promedio = valorPromedio();
        System.out.println("El promedio de los valores ingresados es: " + promedio); // Imprimir el promedio
        nValoresPrimos(10);
        int valorMayor = valorMayor();
        System.out.println("El valor más grande ingresado es: " + valorMayor);
    }
}