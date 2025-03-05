package paqueteEjerciciosIntroductorios;
import java.util.Scanner;
import java.util.Arrays;

public class PrimerosEjercicios {
	
	public static int nValores(int n) {
		int sumaTotalN = 0;
		for(int i=0; i<=n; i++) {
			sumaTotalN += i;
		}
		
		return sumaTotalN;
	}
	
	
	
	public static void main(String[] args) {
		/* 1. Informar "Hola mundo" */
		System.out.println("1. Hola mundo");
		
		/* 2. Leer dos valores enteros e informar la suma y su cociente */
		Scanner lectura = new Scanner(System.in);
		
		System.out.println("Ingrese dos valores numericos: ");
		int numUno = lectura.nextInt();
		int numDos = lectura.nextInt();
		
		System.out.println("La suma de los numeros es " + (numUno + numDos) + " y su cociente es " + (numUno * numDos));
		
		/* 3. Dado un valor numérico entero, informar si es par o impar */
		
		System.out.println("Ingrese un valor, se dirá si es par o no");
		int numPar = lectura.nextInt();
		
		if (numPar % 2 == 0) {
			System.out.println("Es par");
		}
		else {
			System.out.println("Es impar");
		}
		
		
		
		/* 4. Se ingresa un valor numérico de 8 dígitos que representa una fecha con el siguiente formato aaaammdd. 
		 *    Se pide informar por separado el día, el mes y el año de la fecha ingresada*/
		
		System.out.println("Ingrese una fecha con formato aaaammdd: ");
		int fecha = lectura.nextInt();
		
		String fechaStr = String.format("%08d", fecha); /* Esto en la cursada lo hicimos con logica, no tengo ganas de usarla ahora
		                                                   python me hizo medio vago */
        String anio = fechaStr.substring(0, 4);
        String mes = fechaStr.substring(4, 6);
        String dia = fechaStr.substring(6, 8);
        
        System.out.println("Año: " + anio);
        System.out.println("Mes: " + mes);
        System.out.println("Día: " + dia);
		
	    /* 5. Leer dos valores numéricos enteros e indicar cual es el mayor y cual es el menor. Considerar que ambos valores son diferentes */
        /* Acá no sé si existe .sort, me fije en la API de Java y habia funciones similares pero lo voy a hacer a la antigua*/
        System.out.println("Ingrese dos valores: ");
        
        int valorUno = lectura.nextInt();
        int valorDos = lectura.nextInt();
        
        if (valorUno < valorDos)
        	System.out.println("El valor " + valorUno + " es menor al " + valorDos);
        else {
        	System.out.println("El valor " + valorUno + "es mayor al " + valorDos);
        }
       
        /* 6. Leer tres valores numéricos enteros, indicar cual es el mayor,
         *  cuál es el del medio y cuál el menor. Considerar que los tres valores son diferentes
         *  
         *  Acá ya me cansé, voy a sortear el vector y listo, no voy a hacer 9 if else */
        System.out.println("Ingrese tres valores: ");
        Integer[] tresValores = new Integer[3];
        
        tresValores[0] = lectura.nextInt();
        tresValores[1] = lectura.nextInt();
        tresValores[2] = lectura.nextInt();
        
        Arrays.sort(tresValores);
        
        System.out.println("El valor más grande es el " + tresValores[2] + " el del medio es " + tresValores[1] + " y el más chico es " + tresValores[0]);
	
        /* 7. Leer un valor numérico que representa un día de la semana. Se pide mostrar por pantalla el nombre del día considerando que 
         * el lunes es el día 1, el martes es el día 2 y así, sucesivamente */
	
        String[] diasDeLaSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        
        System.out.println("Ingrese un dia NUMERICO de la semana");
        
        int diaSemanal = lectura.nextInt();
        if (diaSemanal > 0 && diaSemanal <= diasDeLaSemana.length + 1) {
        	System.out.println("El dia de la semana es " + diasDeLaSemana[diaSemanal - 1]);
        }
        else {
        	System.err.println("Valor invalido, no corresponde a un dia semanal del 1 al 7");
        }
        
        /* 8.Se ingresa por teclado un conjunto de valores numéricos enteros positivos, se pide informar, por cada uno, 
         * si el valor ingresado es par o impar. Para indicar el final se ingresará un valor cero o negativo */
        
        System.out.println("Ingrese valores, cuando desee finalizar ingrese 0 o un valor negativo");
        int valor = lectura.nextInt();
        
        while (true) {
        	if(valor <= 0)
        		break;
        }
        /* 9. Sumados: Sumar los 1000 primeros números naturales (1 + 2 + 3 + 4 + … + 1000),
         *  imprimiendo por cada suma el resultado parcial obtenido 
         *  */
        
        int sumaTotal = 0;
        
        for(int i=0; i<=1000; i++) {
        	sumaTotal += i;
        	System.out.println("Suma total parcial después de: " + i + ": " + sumaTotal);
        }
        
        System.out.println("La suma total es de: " + sumaTotal);
        
        /* 10. Desarrollar una función que muestre por pantalla los primeros 
         * n números naturales considerando al 0 (cero) como primer número natural, siendo n un valor que se pasa por parámetro
         * */
        
        nValores(10); /* 0 + 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 */
	lectura.close();
	}
	
}
