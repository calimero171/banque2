package com.fr.banq.proj_banq;

public class run {

	public static void main(String[] args) throws CompteNonValide {
		// TODO Auto-generated method stub
		Compte c1 = new Compte(1, 50);
		Compte c2 = new Compte(999, 22);
        Client cl1=new Client("A","B",100,666,1000);
        cl1.ajouterCompte(c1); 
        cl1.ajouterCompte(c2);
		System.out.println("compte1 "+c1.toString());
		System.out.println("client "+cl1.toString());
		try {
		 //cl1.retirerCompte(1);
		 System.out.println("client apres retrait "+cl1.toString());
		 
		 cl1.ajouterMontantCompte(999, 1);
		 
		} catch (NumberFormatException e) {
			// encapsulation de l'exception
			throw new CompteNonValide("parse error", e);
		}
       
	}

}
