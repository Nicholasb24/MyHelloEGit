package com.capgemini.poecplm.poo;

public class Person {

	/**
	 * ATTRIBUTS
	 * ----------
	 */
	
	
	private String firstname;
	private String lastname;
	
	
	/**
	 * CONSTRUCTEUR
	 * ------------
	 *  ==> qui me permet de créer l'objet Person. Le bouton de l'imprimante
	 *  
	 *  Ici nous allons construire (par le code) un "Constructeur" du nom de la Classe dans laquelle il se trouve.
	 *   => Donc il sera du même type => pas besoin de le préciser.
	 *  Le Constructeur "Person" créé aura deux paramètres : "firstname" et "lastname".
	 *  Et ensuite il va venir assigner les nouvelles valeurs de "firstname" et de "lastname" qu'il a reçoit.
	 */
	
	
	public Person(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}
											

	/**
	 * ACCESSEUR
	 * --------
	 *  ==> qui me permettent d'aller chercher (= de nous donner) l'information (= return)
	 *  sur le "firstname" et le "lastname".
	 */
	
	
	public String getFirstname() {
		return this.firstname;
	}
	public String getLastname() {
		return this.lastname;
	}
	
	/**
	 *  ==> la Méthoe displayHello() : a pour objectif de nous afficher en console le "firstname" et le "lastname". Pour ce faire :
	 *  	=> nom : displayHello() 
	 *  	=> type : Comme elle ne nous renvoit rien (càd pas de "return") elle est de type "void"
	 *  	=> visiblilité : public
	 *  	=> {..} : on lui demande d'afficher le "firstname" et "lastname" 
	 *  
	 *  					  System.out.println(this.firstname, this.lastname);
	 *  
	 * 	note : 	lorsque je fait appel aux variables de la Calsse dans la quelle je suis, même si elles sont en "private", elles sont
	 * 			visibles dans toute la Classe. Car elles ont été définie en Attributs de Classe. 
	 * 			Donc pas besoin de "getxx()", juste un "this.xx" suffit.
	 */
	 

	
	public void displayHello() {
		System.out.println(" ");
		System.out.println("Hello " + this.firstname + " " + this.lastname);
	}
	

	
	// Ce qui suit en-dessous est pour une autre méthode que celle d'avoir la méthode dans la classe du Constructeur.
	// public void displayHello() {
	//	System.out.println(p.thisfirstname); // lorsque je suis dans la classe, je n'ai pas besoin de get, ...
	// }
	
	// void c'est pour aucun return
	
	// public String buildHelloMsg() {
	//	return ("Hello " + this.firstname + " " + this.lastname);
	//	}
	
	
}