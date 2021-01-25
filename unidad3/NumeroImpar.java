public class NumeroImpar{

    public static void main(String[] args){
        float residuo;
        for(int i=50; i<=200; i++){
            residuo = i % 2;
            if(residuo != 0){
                System.out.println("Numero impar: " + i);
            }
        }
    }
}
