public class ejemplo{

    public static void main(String[] args){
        int a = 0, b = 0, c;
        int tamano = 5000000;
        
        long inicio1 = System.currentTimeMillis(); // Inicio 
        for(int i = 1; i < tamano; i++){
            c = (int) Math.sqrt(100);
            a = c / i;
        }
        long fin1 = System.currentTimeMillis(); // Fin
        double tiempo1 = (double) (fin1 - inicio1);  
        System.out.println("Tiempo sin optimizar: " + tiempo1 + " milisegundos");
        
        
        long inicio2 = System.currentTimeMillis(); // Inicio
        c = (int) Math.sqrt(100);
        for(int j = 1; j < tamano; j++){
            a = c / j;
        }
        long fin2 = System.currentTimeMillis(); // fin
        double tiempo2 = (double) (fin2 - inicio2); 
        System.out.println("Tiempo optimizado: " + tiempo2 + " milisegundos");
    }
}