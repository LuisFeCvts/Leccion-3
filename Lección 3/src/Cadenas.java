
public class Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String modelo []={"Star Destroyer","Millennium Falcon","Death Star","TIE","Trade Federation cruiser"};

int a�o[];
	a�o= new int[5];
	a�o[0]=2007;
	a�o[1]=2009;
	a�o[2]=2011;
	a�o[3]=2013;
	a�o[4]=2015;
	
	String comprador [];
	comprador= new String [5];
	comprador[0]="Dark Badder";
	comprador[1]="Jabba Ilando";
	comprador[2]="Lucas CieloCaminante";
	comprador[3]="Obi Juan, Que No Vi?";
	comprador[4]="Laberinto Ventana";
	
	int num_serie;
	int malos_num;
	
	for (num_serie=0;num_serie<modelo.length;num_serie++) {
		
		if (modelo[num_serie]!="Millennium Falcon") {
		malos_num=num_serie;
		
		if (a�o[malos_num]>=2009) {
		
System.out.println("El modelo "+modelo[num_serie]+ " a�o " +a�o[malos_num] + " con n�mero de serie " + num_serie+ " esta en mal estado, es necesario llamar al cliente " +comprador [malos_num]);
		}
	}
	}
	}

}
