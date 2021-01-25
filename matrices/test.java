import javax.swing.JOptionPane;

public class test {
    public static void main(String[] args) throws InterruptedException {
        long inicio = System.currentTimeMillis(); // Despues de aqui ingresas el codigo que vas a medir
         
        Thread.sleep(2000); // Eliminas esto
         
        long fin = System.currentTimeMillis(); // Aqui termina de medir el tiempo 
         
        double tiempo = (double) ((fin - inicio)/1000); // Hace la conversion a segundos
        // double tiempo = fin - inicio; // Pero te recomiendo solo milisegundos que seria (fin - inicio) 
         
        JOptionPane.showMessageDialog(null, "Tiempo: " + tiempo + " segundos");
    }
}
