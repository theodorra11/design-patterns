package CameraShopObserver;

public interface ObservableProduct {
	
	void add(ProductObserver productObserver); 

    void unadd(ProductObserver productObserver); 

    void notifyProductObservers();

    String getUpdate();
	
	

}
