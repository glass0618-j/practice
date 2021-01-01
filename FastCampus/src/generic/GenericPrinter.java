package generic;

public class GenericPrinter<T> extends Meterial {
	private T material;
	public T getMaterial() {
		return material;
	}
	public void setMaterial(T material) {
		this.material = material;
	}
	public String toString() {
		return material.toString();
	}
	@Override
	public void doPrinting() {
		((Meterial) material).doPrinting();
	}
}
