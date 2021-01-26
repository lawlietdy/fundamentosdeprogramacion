import java.io.*;
public class EjemploVarianzayDesviacion{
public static void main (String args[]) throws IOException{
float sumaRango=0, promedioRango=0, elementoRango=0, varianza=0, desviacion=0;
float [] rango= new float[250];
for (int i=0; i<250; i++){
rango [i]= (float) (Math.random() * 10);
}
for (int i=0; i<250; i++){
System.out.println(rango[i]);
sumaRango+= rango[i];
}
promedioRango= sumaRango / 250;
for (int i=0; i<250; i++){
elementoRango = (float)(Math.pow(rango[i] - promedioRango,2));
varianza= varianza + elementoRango;
}
varianza= varianza / (250);
desviacion= (float)Math.sqrt(varianza);

System.out.println ("La suma de los elementos es:" + sumaRango);
System.out.println("El promedio de los elementos es:" + promedioRango);
System.out.println("La varianza es:" + varianza);
System.out.println("La desviacion estandar es:" + desviacion);
}
}
