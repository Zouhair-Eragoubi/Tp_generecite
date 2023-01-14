import java.io.Serializable;

public class Produit implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	long id ;
	String nom;
	String marque;
	float prix;
	String description;
	long qteStock;
	
	public Produit() {
	}
	public Produit(long id, String nom, String marque, float prix, String description, long qteStock) {
		super();
		this.id = id;
		this.nom = nom;
		this.marque = marque;
		this.prix = prix;
		this.description = description;
		this.qteStock = qteStock;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getQteStock() {
		return qteStock;
	}
	public void setQteStock(long qteStock) {
		this.qteStock = qteStock;
	}
	@Override
	public String toString() {
		return "Produit [id=" + id + ", nom=" + nom + ", marque=" + marque + ", prix=" + prix + ", description="
				+ description + ", qteStock=" + qteStock + "]";
	}
	
	
	

}
