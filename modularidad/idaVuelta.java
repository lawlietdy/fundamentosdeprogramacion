public class idaVuelta {
public static void main(String args[]) {

int i,relleno;
int ida[];
ida = new int[15];
int vuelta[];
vuelta = new int[15];

for (i=0;i<15;i++) {
	relleno=(int)(Math.random() * 10);
	ida[i] = relleno;
}

for (i=14;i>=0;i--)
	vuelta[i] = ida[14-i];


System.out.println("ida " + " - " + " vuelta");

for (i=0;i<15;i++) 
	System.out.println(ida[i] + "    -    " + vuelta[i]);


}
}
