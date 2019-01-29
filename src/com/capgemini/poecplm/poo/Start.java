package com.capgemini.poecplm.poo;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
	
	/**
	 * QUESITONS
	 * ---------
	 *  ==> on va poser les questions du prénom et nom. 
	 *  	Demander à l'utilisateur d'entrer une information pour "firstname" et pour "lastname". 
	 *  Pour ce faire nous devons utiliser la "Classe Scanner" du packadge "java.uti.Scanner"
	 *  pour avoir la méthode "nextLine()"
	 *  
	 *  note : nous utilisons
	 *   		- System.out pour montrer une informaiton de l'ordi vers l'extérieux 
	 *   		- System.in pour que l'extérieur donne une informaiton à l'ordi (programme)
	 *   
	 *  Nous construisons un Objet de la Classe Scanner. Il aura : 
	 *  	- nom : scan
	 *  	- action appliquée : System.in, c'est-à-dire d'enregistrer les informations que l'extérieur va donner.
	 *   
	 *   Plus loin, ces informations vont être enregister dans deux variables de type String : 
	 *   	- firstname : l'Objet scan utilise la Méthode "nextLine() : scan.nextLine()"
	 *   	- lastname : l'Objet scan utilise la Méthode "nextLine() : scan.nextLine()"
	 */
		
		
	Scanner scan = new Scanner(System.in);
	
	
	System.out.println("Hello you");	
	System.out.println("---------");
	System.out.println(" ");
	System.out.print("What is your firstname ?  ");
		String firstname = scan.nextLine();
	System.out.print("What is your lastname ?  ");
		String lastname = scan.nextLine();	
		
/**
 * Création de l'Objet Person
 * --------------------------
 *  ==> création de l'Objet "Person" qui a les propriété "fristname" et "lastname", tout deux du type String.
 *  				new Person(firstname, lastname);
 *  Nous le savons car nous l'avons ainsi défini dans la "Classe Person" avec la syntaxe suivante : 
 *  
 *  		public Person(String firstname, String lastname) {
 *  			this.firstname = firstname;
 *  			this.lastname = lastname;
 *  		}		
 *  Cet objet, nous l'enregistrons dans une variable "p" (= variable) qui est du même type que 
 *  la Classe dont il est issu : "Person" 
 *  
 */
		
		Person p = new Person(firstname, lastname);	
		
		
/**
 * Affichage du Programme
 * ----------------------
 *  ==> maintenant il nous faut afficher le prénom et le nom, précédé d'un Hello. Prénom et nom qui nous ont été donné précédement.
 *  
 *  Pour ce faire, nous avons :
 *  	- la "Méthode" displayHello() pour afficher le " Hello firstname lastname "
 *  	- l'Objet "p" qui a comme caractéristiques "firstname" et "lastname".
 *  Il suffit d'appliquer la "Méthode" à cet Objet
 *  
 *  				=> p.displayHello();
 * 
 */
		
		
		p.displayHello();
		
		
		
		
		
		// ce qui suit est pour une autre méthode
		
		// System.out.println(p.buildHelloMsg());
		// System.out.println(p);
		
		// on pourrait faire la méthode ici, mais non on la veut dans personne
		
	
	}

}
