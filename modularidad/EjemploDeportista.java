import java.io.*;
public class EjemploDeportista{
public static void main(String args[]) throws IOException{
int i;
float salto, nuevoSalto, sumaDeSaltos=0, promedio=0;
String nombre;
InputStreamReader ent=new InputStreamReader (System.in);
BufferedReader al=new BufferedReader(ent);
System.out.println("Ingrese el nombre del deportista");
nombre= al.readLine();
System.out.println("Ingrese el mejor salto que realizo");
salto= Float.parseFloat(al.readLine());
for (i=1; i<=8; i++){
System.out.println(" ");
System.out.println("Ingrese la marca de su nuevo salto");
nuevoSalto= Float.parseFloat(al.readLine());
sumaDeSaltos= sumaDeSaltos + nuevoSalto;
if(nuevoSalto<=salto)
System.out.println("Esta en los parametros de su propia marca");
else
System.out.println("Supero su marca personal");
promedio= sumaDeSaltos/8;
}
System.out.println("****************************");
System.out.println("Su nombre es:" + nombre);
System.out.println("El promedio de sus 8 saltos es:" + promedio);
}
}


