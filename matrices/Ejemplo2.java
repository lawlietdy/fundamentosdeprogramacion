public class Ejemplo2 {

    public static void main(String[] args) throws InterruptedException {
        int a = -10, b, c = 4, d, e = 6;

        long inicio1 = System.currentTimeMillis(); // 120 MILISEGUNDOS

        for(int i = 0; i < 1000000; i++){
            b = Math.abs(a) * c;
            d = e / (Math.abs(a) + b);
        }

        long fin1 = System.currentTimeMillis(); // 121 MILISEGUNDOS
        double tiempo1 = (double) (fin1 - inicio1); // 1 MILISEGUNDOS  
        System.out.println("Tiempo: " + tiempo1 + " milisegundos");

        // Optimizacion
        long inicio2 = System.currentTimeMillis(); // 124 MILI
        int tmp = Math.abs(a);
        b = tmp * c;
        for(int i = 0; i < 1000000; i++)
            d = e / (tmp + b);

        long fin2 = System.currentTimeMillis(); // 127 MILI 
        double tiempo2 = (double) (fin2 - inicio2);  // 3 MILI 

        System.out.println("Tiempo optimizado: " + tiempo2 + " milisegundos");
    }
}
