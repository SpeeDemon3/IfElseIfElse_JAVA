import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class EjerciciosIfElse {
	
	public static void main(String[] args) throws IOException {
		
		/* A partir de dor variables numéricas avisar si tienen el mismo valor. */
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Introduce el primer valor numérico.");
		
		String valor1 = br.readLine();
		
		System.out.println("Introduce el segundo valor numérico.");
		
		String valor2 = br.readLine();
		
		int numA = Integer.parseInt(valor1);
		int numB = Integer.parseInt(valor2);
		
		if (numA == numB) {
			System.out.println("El número " + numA + " es igual al número " + numB);
		} else {
			System.out.println("Los valores son distintos.");
		}
		*/
		
		/* A partir de dos variables numéricas avisar si la variable mayor tiene un valor superior a 50 */
		/*
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Introduce el primer número");
		
		String num1 = br2.readLine();
		
		int numC = Integer.parseInt(num1);
		
		System.out.println("Introduce el segundo número");
		
		String num2 = br2.readLine();
		
		int numD = Integer.parseInt(num2);
		
		if (numC > numD && numC > 50) {
			System.out.println(numC + " es mayor a 50.");			
		}else if (numD > numC && numD > 50) {
			System.out.println(numD + " es mayor a 50.");
		}else {
				System.out.println("Ninguno de los valores es mayor a 50.");
		}
		*/
		
		/* A partir de una variable numérica indicar si su valor multiplicado por 7 es superior a 100 */
		/*
		int numE = 120;
		int resulMult = numE * 7;
		
		if (resulMult > 100) {
			System.out.println(numE + " X 7 = " + resulMult + ", con lo cual es mayor a 100.");
		} else {
			System.out.println(numE + " X 7 = " + resulMult + ", no es nayor a 100.");
		}
		*/
		
		/* A partir de dos variables numéricas mostrar el resultado de dividir la variable con el mayor valor entre la variable con el menor valor */
		/*
		float numF = 13;
		float numG = 123;
		
		if (numF > numG) {
			System.out.println(numF + "/" + numG + "=" + (numF/numG));
		}else {
			System.out.println(numG + "/" + numF + "=" + (numG/numF));
		}
		*/
		
		/* Pedir al usuario:
		 * - Si introduce un número positivo multiplicar el número por 10
		 * - Si introduce un número negativo dividir el número por 10
		 * - Muestra un aviso indicando si el número introducido es par o impar
		 */
		
		BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Introduce un número");
		String numIntrod = br3.readLine();
		int numUsua = Integer.parseInt(numIntrod);
		int modulo = numUsua % 2;
		
		if (numUsua == 0) {
			System.out.println("El valor introducido es 0, finaliza el programa.");
		}else if (numUsua > 0) {
			System.out.println(numUsua + "X10=" + (numUsua * 10));
		}else if (numUsua < 0) {
			System.out.println(numUsua + "/10=" + (numUsua / 10));
		}else {
			System.out.println("Error!!");
		}
		
		System.out.println("El valor introducido es:");
		if (modulo == 0) {
			System.out.println("Par.");
		}else if (modulo != 0) {
			System.out.println("Impar.");
		}else {
			System.out.println("Gracias por participar!!!");
		}
		
		
	}
}
