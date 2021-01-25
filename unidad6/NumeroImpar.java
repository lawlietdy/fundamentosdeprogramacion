public class NumeroImpar{

    public static void main(String[] args){
        mostrarResultado(50, 200);
    }

    public static void mostrarResultado(int inicio, int fin){
        float residuo;
        for(int i=inicio; i<=fin; i++){
            residuo = i % 2;
            if(residuo != 0){
                System.out.println("Numero impar: " + i);
            }
        }
    }
}
