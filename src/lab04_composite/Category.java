package lab04_composite;

import java.util.ArrayList;
import java.util.List;

public class Category implements Component {

	private String name;
	private ProductCatalog catalog;
	private List<Component> listComponents = new ArrayList<>();

	public Category(ProductCatalog catalog, String name) {
		this.catalog = catalog;
		this.name = name;
	}
	
	public void addComponent(Component comp) {
		listComponents.add(comp);
	}

	@Override
	public void showInfor() {
		System.out.println(name);

		for (Component c : listComponents) {
			c.showInfor();
		}
	}
}
