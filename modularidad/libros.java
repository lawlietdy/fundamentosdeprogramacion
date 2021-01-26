import java.io.*;
import java.util.Random;

public class libros{
public static void main(String args[])throws IOException{

int libros=0, i=0, dias=0, multa=0, sumaMultas=0;
int c1=0,c2=0,c3=0,c4=0,c5=0;

InputStreamReader ent = new InputStreamReader(System.in);
BufferedReader al = new BufferedReader(ent);

System.out.println("Cuantos libros han devuelto?");
libros =  Integer.parseInt(al.readLine());

for(i=1;i<=libros;i++){
	dias = (int)(Math.random() * 10);
	if(dias<=0){
		c1=c1+1;
		System.out.println("");
		System.out.println("Usted Ha devuelto el libro a tiempo");
		System.out.println("Gracias por su eleccion :3");
		System.out.println("");
	}else if(dias>=1 && dias<=4){
		c2=c2+1;
		System.out.println("");
		System.out.println("Usted ha devuelto el libro con " + dias + " dias de retraso");
		multa = dias * 10;
		System.out.println("Debe una multa de: $" + multa);
		sumaMultas=sumaMultas + multa;
		System.out.println("");
	}else if(dias>=5 && dias<=8){
		c3=c3+1;
		System.out.println("");
		System.out.println("Usted ha devuelto el libro con " + dias + " dias de retraso");
		multa = dias * 25;
		System.out.println("Debe una multa de: $" + multa);
		sumaMultas=sumaMultas + multa;
		System.out.println("");
	}else if(dias==9){
		c4=c4+1;
		System.out.println("");
		System.out.println("Usted ha devuelto el libro con " + dias + " dias de retraso");
		multa = dias * 50;
		System.out.println("Debe una multa de: $" + multa);
		sumaMultas=sumaMultas + multa;
		System.out.println("");
	}else if(dias>=10){
		c5=c5+1;
		System.out.println("");
		System.out.println("Usted ha devuelto el libro con " + dias + " dias de retraso");
		multa = dias * 100;
		System.out.println("Debe una multa de: $" + multa);
		sumaMultas=sumaMultas + multa;
		System.out.println("");
	}
}

System.out.println("El total de dinero por retardos es: $" + sumaMultas);
System.out.println("Libros entregados a tiempo: " + c1);
System.out.println("Libros entregados con 1 a 4 dias de retraso: " + c2);
System.out.println("Libros entregados con 5 a 8 dias de retraso: " + c3);
System.out.println("Libros etregados con 9 dias de retraso: " + c4);
System.out.println("Libros entregados con 10 dias de retraso: " + c5);
}
}