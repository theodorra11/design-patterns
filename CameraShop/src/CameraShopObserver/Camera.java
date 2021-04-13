package CameraShopObserver;

import java.util.ArrayList;
import java.util.List;

public class Camera implements ObservableProduct {

	private List<ProductObserver> productObservers;
	private String camera;

	public Camera() {
		this.productObservers = new ArrayList<>();
	}

	@Override
	public void add(ProductObserver productObserver) {
		productObservers.add(productObserver);
		productObserver.setCamera(this);

	}

	@Override
	public void unadd(ProductObserver productObserver) {
		productObservers.remove(productObserver);

	}

	@Override
	public void notifyProductObservers() {
		for (ProductObserver productsObserver : productObservers) {
			productsObserver.updateProductObserver();
		}

	}

	@Override
	public String getUpdate() {
		return this.camera;

	}

	public void setCamera(String newCamera) {
		this.camera = newCamera;
		this.notifyProductObservers();
	}

}
