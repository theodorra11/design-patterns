package CameraShopObserver;

public class CameraAdder implements ProductObserver {
	
	private String name;
    private ObservableProduct camera;

    public CameraAdder(String name) {
        this.setName(name);
    }

    @Override
    public void updateProductObserver() {

        if (camera == null) {
            System.out.println(this.getName() + "camera is not available!");
            return;
        }

        String lastCamera = camera.getUpdate();
        System.out.println(this.getName() + " added the camera " + lastCamera);
    }

    @Override
    public void setCamera(ObservableProduct camera) {
        this.camera = camera;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	

	

}
