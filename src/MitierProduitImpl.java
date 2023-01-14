import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MitierProduitImpl implements IMetier<Produit>,Serializable{
	
	public String nomFile;
	public List<Produit> listProduits;
	
	
	public MitierProduitImpl(String nomFile) {
		this.nomFile=nomFile;
		this.listProduits = new ArrayList<>();
	}
	
	
	public String getNomFile() {
		return nomFile;
	}

	public void setNomFile(String nomFile) {
		this.nomFile = nomFile;
	}

	public List<Produit> getListProduits() {
		return listProduits;
	}

	public void setListProduits(List<Produit> listProduits) {
		this.listProduits = listProduits;
	}

	@Override
	public void add(Produit o) {
		this.listProduits.add(o);
		
	}

	@Override
	public List<Produit> getAll() {
		
		try {
			File file = new File(this.nomFile);
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			List<Produit> readObject = (List<Produit>) ois.readObject();
			this.listProduits = readObject;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this.listProduits;
	}
	
	@Override
	public void saveAll() {
		try {
			File file = new File(this.nomFile);
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos =new ObjectOutputStream(fos);
			oos.writeObject(this.listProduits);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

	@Override
	public Produit findById(long id) {
		// TODO Auto-generated method stub
		for (Produit produit : this.listProduits) {
			if(id == produit.id) {
				return produit;
			}
		}
		return null;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		for (int i = 0; i < this.listProduits.size(); i++) {
			if(id == this.listProduits.get(i).id) {
				this.listProduits.remove(i);
			}
		}
	}

	
}
