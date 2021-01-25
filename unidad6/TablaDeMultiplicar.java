import java.util.*;

public class TablaDeMultiplicar {
    
    public static void main(String[] args) {
        int numero;
        System.out.println("Este programa muestra una tabla de multiplicar\n");
        numero = leerDato();
        mostrarTabla(numero);
    }

    public static void mostrarTabla(int numero) {
        int resultado; 
        for(int i=1; i<=10; i++){
            resultado = i * numero;
            System.out.println(numero + " X " + i + " = " + resultado);
        }
    }

    public static int leerDato(){
        int dato;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un numero para mostra su tabla de multiplicar: ");
        dato = entrada.nextInt();
        entrada.close();
        return dato;
    }
    
}
