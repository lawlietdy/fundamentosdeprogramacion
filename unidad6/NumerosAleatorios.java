// 4.- Generar 20 numeros aleatorios y realizar las siguientes operaciones:

// a) Imprimir cada numero generado.
// b) Sumar cada numero.
// c) Calcular e imprimir el promedio de los numeros ?

public class NumerosAleatorios{
    public static void main(String[] args){
        int promedio, total = 20;
        int suma = 0;
        suma = obtenerSumaAleatorios(total);
        promedio = suma/total;
        mostrarResultados(suma, promedio);
        
    }

    public static int obtenerSumaAleatorios(int limite) {
        int suma = 0, numero;
        for(int i=1; i<=limite; i++){
            numero = (int) (Math.random()*100);
            suma += numero;
            System.out.println("Numero: " + numero);
        }
        return suma;
    }

    public static void mostrarResultados(int suma, int promedio) {
        System.out.println("Resultado de los numeros aleatorios");
        System.out.println("La suma es: " + suma);
        System.out.println("El promedio es: " + promedio); 
    }
}