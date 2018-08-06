package Héritages;

public class CreateAnimal {
	public static void main(String argv[]) {
		Chien monChien = new Chien();
		monChien.setNom("Médor ");
		monChien.setCouleur("Noir");
		System.out.println("Mon chien s'appelle " + monChien.getNom() + "et il fait " + monChien.aboie());
	}
}

/* 
 au lieu d'écrire :
 String nom;
 nom = "médor";
 
 on écrit :
 String nom;
 On génère directement les Getters et les Setters (aller dans le menu "source"/"Generate Getters and Setters") au sein de la classe abstraite.
 Puis on va dans la classe qui contient le "main" ("Application") et on se sert de set pour initialiser une instance ("nom de l'instance".set"nom de l'attribut").
 
 */
// 
// setNom : SET, c'est pour affecter une valeur à une variable.
// getNom : GET, c'est pour appeler une valeur qui a été déclarée en amont.