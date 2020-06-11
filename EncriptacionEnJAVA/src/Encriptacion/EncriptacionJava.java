package Encriptacion;

import javax.swing.JOptionPane;
import java.util.*;	//Character.isDigit(Parametro)
import java.lang.*;

public class EncriptacionJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int key;
		boolean ver=true;
		String keytmp;
		do {
				
			
			keytmp= JOptionPane.showInputDialog("Ingrese su Key(Solo numeros Enteros)"); //Ventana usuario
				
				for(int i=0;i< keytmp.length();i++) {
					if(!Character.isDigit( keytmp.charAt(i))) {
							ver=true; 
					}else if(keytmp.isBlank()){
							ver=true;
					}else if(keytmp.charAt(i)=='!' ||
								keytmp.charAt(i)=='?' ||
									keytmp.charAt(i)=='.' ||
										keytmp.charAt(i)==',')
											{
												ver=true;

					}else if(Character.isAlphabetic(keytmp.charAt(i))) {
						ver=true;
					}else {
						ver=false;					
					}
						
					
				}
				
		}while(ver==true);
		
		key=Integer.parseInt(keytmp);
		
		
		String P= JOptionPane.showInputDialog("Ingrese lo que quiera Encriptar");	//Ventana usuario
		

		int x=P.length();						
		
		if(x < 0) {														//
			System.out.println("Cantidad de argumentos incorrectos.\n ");	//Verificar el Minimo para Encriptar
		}																		//
	

		
		System.out.println("PlainText: "+P);
		Encriptacion res= new Encriptacion();
		System.out.print("CiperText: ");
		res.setEncriptacion(key, P);
											//Formula C=(P+key)%26
																					//*C=Texto Cifrado/cipertext
																						//*P=Texto sin Cifrar/plaintext
																							//*KEY = a eleccion del usuario (no negative)
		
		String DP= JOptionPane.showInputDialog("Ingrese lo que quiera DesEncriptar");	//Ventana usuario
		System.out.println("\n");
		System.out.println("CiperText: "+ DP);
	
		System.out.print("PlainText: ");
		res.DesEncriptacion(res.getVerificacion(), DP);
		
													
	}

}
//git pull origin clase9

class  Encriptacion {
	
	public Encriptacion() {//Constructor
		
	}
	
	
	public void setEncriptacion(int key,String P) {
		for(int i=0;i<P.length();i++) {
			if( Character.isAlphabetic(P.charAt(i) ) ) {	//Verifico si es Letra-/respetandO //Mayusculas y minusculas
																	
						
					if(Character.isUpperCase(P.charAt(i)) ) {		//Si es Mayusucla
						//System.out.println("El caracter es una letra mayuscula: "+P.charAt(i));
						System.out.print(  (char)  ( (((P.charAt(i)-'A')+key)%26)+'A')  );

					}else {
						System.out.print(  (char)  ( (((P.charAt(i)-'a')+key)%26)+'a')  );
					}
			}else if(Character.isDigit(P.charAt(i) ) ) {	//Verifico si es Numero
					System.out.print( (char) P.charAt(i));
					}
			else {
						System.out.print((char) P.charAt(i));	//Si es un simbolo
			}
		}				
	}
	
	////////////-
	public void DesEncriptacion(int key,String P) {
		for(int i=0;i<P.length();i++) {
			if( Character.isAlphabetic(P.charAt(i) ) ) {	//Verifico si es Letra-/respetandO //Mayusculas y minusculas
																	
						
					if(Character.isUpperCase(P.charAt(i)) ) {		//Si es Mayusucla
						//System.out.println("El caracter es una letra mayuscula: "+P.charAt(i));
						System.out.print(  (char)  ( (((P.charAt(i)-'A')-key)%26)+'A')  );

					}else {
						System.out.print(  (char)  ( (((P.charAt(i)-'a')-key)%26)+'a')  );
					}
			}else if(Character.isDigit(P.charAt(i) ) ) {	//Verifico si es Numero
					System.out.print( (char) P.charAt(i));
					}
			else {
						System.out.print((char) P.charAt(i));	//Si es un simbolo
			}
		}
	}
	
	////////////-
	public int getVerificacion() {
		
				 String keytmp;
				 boolean ver=true;
				 int key2;
		
					do {							
								keytmp= JOptionPane.showInputDialog("Ingrese su Key(Solo numeros Enteros)"); //Ventana usuario
									
									for(int i=0;i< keytmp.length();i++) {
										if(!Character.isDigit( keytmp.charAt(i))) {
												ver=true; 
										}else if(keytmp.isBlank()){
												ver=true;
										}else if(keytmp.charAt(i)=='!' ||
													keytmp.charAt(i)=='?' ||
														keytmp.charAt(i)=='.' ||
															keytmp.charAt(i)==',')
																{
																	ver=true;
					
										}else if(Character.isAlphabetic(keytmp.charAt(i))) {
											ver=true;
										}else {
											ver=false;					
										}
											
										
									}
									
							}while(ver==true);
		
									key2=Integer.parseInt(keytmp);
									
									return key2;
	}
	
	
	
}




