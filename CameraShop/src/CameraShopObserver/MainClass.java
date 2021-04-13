package CameraShopObserver;

public class MainClass {

	public static void main(String[] args) {
		
		Camera camera = new Camera();
		ProductObserver productObserver1 = new CameraAdder("Emag: ");
		ProductObserver productObserver2 = new CameraAdder("Photopavilion: ");
		ProductObserver productObserver3 = new CameraAdder("Technomarket: ");

        camera.add(productObserver1);
        camera.add(productObserver2);
        camera.add(productObserver3);

       camera.setCamera(" Canon 600D ");
       camera.setCamera(" Nikon D5600 ");
		

	}

}
