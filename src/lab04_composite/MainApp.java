package lab04_composite;

public class MainApp {

	public static void main(String[] args) {
		ProductCatalog catalog = new ProductCatalog("lab04ASD");
		Category bookCat = new Category(catalog, "Book");
		Category dvdCat = new Category(catalog, "DVD");

		Component bookPro = new Product(catalog, "Book Product");
		Component bookTrainPro = new Product(catalog, "Book train Product");
		Component dvdPro = new Product(catalog, "Ceiline DVD Music");

		bookCat.addComponent(bookPro);
		bookCat.addComponent(bookTrainPro);

		dvdCat.addComponent(dvdPro);
		
		catalog.addComponent(bookCat);
		catalog.addComponent(dvdCat);
		// if Product in catalog
		catalog.addComponent(bookTrainPro);
		
		for (Component c : catalog.getComponents()) {
			c.showInfor();
		}
	}

}
