public class arreglo_bidimencional{
public static void main (String args[]){

int i, j, relleno;

int[][] tabla = new int[4][9];
int[][] tablaCopia = new int [4][9];

for (i=0;i<4;i++) {
	for (j=0;j<9;j++) {
		relleno = (int)(Math.random() * 10);
		tabla[i][j] = relleno;
	}
}

for (i=0;i<4;i++) {
	for (j=0;j<9;j++) {
		tablaCopia[3-i][8-j] = tabla[i][j];
	}
}

System.out.println("Tabla 1:");
for (i=0;i<4;i++) {
	for (j=0;j<9;j++) {
		System.out.print(tabla[i][j] + "  ");
	}
System.out.println();
}

System.out.println("");

System.out.println("Tabla 2:");
for (i=0;i<4;i++) {
	for (j=0;j<9;j++) {
		System.out.print(tablaCopia[i][j] + "  ");
	}
System.out.println();
}


}
}