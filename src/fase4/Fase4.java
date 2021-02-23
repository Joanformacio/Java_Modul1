package fase4;

public class Fase4 {

	public static void main(String[] args) {
		String naixement;
		String nomComplert=persona("Joan", "Lopez", "Ferrer");
		System.out.println(nomComplert);
		naixement=dataNaixement(23, 01, 1971);
		System.out.println("Vaig neixer l'any "+naixement);
		 
		 System.out.println("El meu any "+ isTraspas(1971)+" es de traspas");
		 
		  
		  
	}
	
	public static String  persona(String nom, String cogn1, String cogn2) {
		return nom + " "+ cogn1 +" "+ cogn2;
	}
	
	public static String dataNaixement(int dia, int mes, int any) {
		
		String naixement=dia+"/"+mes+"/"+any;
		
		return naixement; 
	}
	
	public static String isTraspas(int any) {
		final int ANY_TRASPAS=1948;
		boolean traspas=false;
		String result;
		  
		  for (int i=ANY_TRASPAS; i<=any; i=i+4) {
			  if(i==any) {
				  traspas=true;
			  }
			  
			  System.out.println(i);
		  }
		  
		  if (traspas) {
			  result="";
		  }else {
			  result="no";
		  }
		
		return result;
	}


}


