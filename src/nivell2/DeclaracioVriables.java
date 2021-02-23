package nivell2;

public class DeclaracioVriables {

	public static void main(String[] args) {
		double midouble=2.5641;
		int miInt;
		float f;
		String n;
		
		miInt= (int)midouble;
		f= (float)midouble;
		n= Double.toString(midouble);
		
		System.out.println(miInt );
		System.out.println( f);
		System.out.println( n );
		
		//Nivell3
		
		int miArray[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int aux1=0;
		int aux2=0;
		int position=0;
		
		
		for (int i=miArray.length-1 ; i>=0; i--) {
			//System.out.println(position);
			aux1=miArray[position];
			aux2=miArray[i];
			miArray[position]=aux2;
			miArray[i]=aux1;
			aux1=0;
			aux2=0;
			position++;
			//System.out.println(i);
		}
		
		for (int i=0; i<= miArray.length-1; i++) {
			System.out.println(miArray[i]);
		}
		
	}

}
