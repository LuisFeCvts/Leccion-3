
public class Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String modelo []={"Star Destroyer","Millennium Falcon","Death Star","TIE","Trade Federation cruiser"};

int año[];
	año= new int[5];
	año[0]=2007;
	año[1]=2009;
	año[2]=2011;
	año[3]=2013;
	año[4]=2015;
	
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
		
		if (año[malos_num]>=2009) {
		
System.out.println("El modelo "+modelo[num_serie]+ " año " +año[malos_num] + " con número de serie " + num_serie+ " esta en mal estado, es necesario llamar al cliente " +comprador [malos_num]);
		}
	}
	}
	}

}
