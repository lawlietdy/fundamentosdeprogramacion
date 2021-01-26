import java.io.*;

public class EjemploVarianzayDesviacion {
    public static void main(String args[]) throws IOException {
        float sumaRango = 0, promedioRango = 0, elementoRango = 0, varianza = 0, desviacion = 0;
        float[] rango = new float[250];
        
        llenarDatosAleatorios(rango);
        sumaRango = sumatoriaRango(rango);
        promedioRango = sumaRango / 250;
        
        varianza = sumatoriaVarianza(rango, promedioRango) / (250);
        desviacion = (float) Math.sqrt(varianza);

        mostrarResultados(sumaRango, promedioRango, varianza, desviacion);
        
    }

    public static void mostrarResultados(float sumaRango, float promedioRango, float varianza, float desviacion) {
        System.out.println("La suma de los elementos es:" + sumaRango);
        System.out.println("El promedio de los elementos es:" + promedioRango);
        System.out.println("La varianza es:" + varianza);
        System.out.println("La desviacion estandar es:" + desviacion);
    }

    public static void llenarDatosAleatorios(float[] rango) {
        for (int i = 0; i < 250; i++) {
            rango[i] = (float) (Math.random() * 10);
        }
    }

    public static float sumatoriaRango(float[] rango){
        float sumaRango = 0;
        for (int i = 0; i < 250; i++) {
            System.out.println(rango[i]);
            sumaRango += rango[i];
        }
        return sumaRango;
    }

    public static float sumatoriaVarianza(float[] rango, float promedioRango){
        float varianza = 0, elementoRango;
        for (int i = 0; i < 250; i++) {
            elementoRango = (float) (Math.pow(rango[i] - promedioRango, 2));
            varianza = varianza + elementoRango;
        }
        return varianza;
    }
}
