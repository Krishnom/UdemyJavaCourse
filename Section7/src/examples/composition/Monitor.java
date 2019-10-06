package examples.composition;

public class Monitor {
    private String model;
    private String manufacturer;
    private Resolution nativeResolution;
    private int size;

    public Monitor(String model, String manufacturer, Resolution nativeResolution, int size) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.nativeResolution = nativeResolution;
        this.size = size;
    }

    public void drawPixel(int x, int y, String color){
        System.out.println("Drawing pixel at "+x+","+y+" with "+color +" Color.");
    }
    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }

    public int getSize() {
        return size;
    }
}
