package metier;

import java.time.LocalDate;

public class Facture
{
	private Client client;
	private int montant;
	private boolean reglement = false;
	private LocalDate date = LocalDate.now();
	

	public Facture (int montant, Client client)
	{
		this.montant = montant;
		this.client = client;
		
	}
	/**
	 * Retourne le client à qui est adressée la facture..
	 * @return le client.
	 */
	public Client getClient()
	{
		
		return this.client=client;
	}

	/**
	 * Retourne le montant de la facture.
	 * @return le montant de la facture.
	 */
	
	public int getMontant()
	{
		return montant;
	}

	/**
	 * Retourne vrai si la facture est reglée.
	 * @return vrai ssi la facture est reglée.
	 */
	
	public boolean estReglee()
	{
		return true;
	}

	/**
	 * Retourne la date de la facture.
	 * @return la date de la facture.
	 */
	
	public LocalDate getDate()
	{
		return date;
	}

	/**
	 * Supprime la facture
	 */
	
	public void delete()
	{
	}
	
	/**
	 * Duplique la facture.
	 * @return une copie de la facture.
	 */
	
	public Facture copie()
	{
		return null;
	}
}