package lab04_composite;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {
	
	private List<Component> components = new ArrayList<>();
	
	private String code;
	
	public String getCode() {
		return code;
	}
	
	public ProductCatalog(String code) {
		this.code = code;
	}
	
	public void addComponent(Component comp) {
		components.add(comp);
	}
	
	public List<Component> getComponents() {
		return components;
	}
}