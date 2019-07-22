package lab04_composite;

public class Product implements Component {

	private String name;
	private String isbn;
	private ProductCatalog catalog;

	public Product(ProductCatalog catalog, String name) {
		this.catalog = catalog;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getIsbn() {
		return isbn;
	}

	@Override
	public void showInfor() {
		System.out.println(this.name);
	}
}
