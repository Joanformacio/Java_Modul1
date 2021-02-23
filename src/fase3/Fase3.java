package fase3;

public class Fase3 {

	public static void main(String[] args) {
		final int ANY_TRASPAS=1948;
		boolean isTraspas=false;
		  
		  
		  for (int i=ANY_TRASPAS; i<=1971; i=i+4) {
			  if(i==1971) {
				  isTraspas=true;
			  }
			  
			  System.out.println(i);
		  }
		  
		  if (isTraspas) {
			  System.out.println("El meu any de naixement es any traspas");
		  }else {
			  System.out.println("El meu any de naixement no es any traspas");
		  }
		  
	}



}


