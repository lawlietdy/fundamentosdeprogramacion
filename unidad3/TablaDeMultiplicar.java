import java.util.*;

public class TablaDeMultiplicar{

    public static void main(String[] args){
        int resultado, numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero para mostra su tabla de multiplicar");
        numero = sc.nextInt();
        for(int i=1; i<=10; i++){
            resultado = i * numero;
            System.out.println(numero + " X " + i + " = " + resultado);
        }
    }
}