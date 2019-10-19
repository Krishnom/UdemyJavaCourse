package examples.composition;

public class Motherboard {
    private int pcbSlots;
    private int ramSlots;
    private String manufacturer;
    private String model;
    private String bootProgram;

    public Motherboard(int pcbSlots, int ramSlots, String manufacturer, String model, String bootProgram) {
        this.pcbSlots = pcbSlots;
        this.ramSlots = ramSlots;
        this.manufacturer = manufacturer;
        this.model = model;
        this.bootProgram = bootProgram;
    }

    public void loadProgram(String program){
        System.out.println("Loading program "+ program);
    }

    public void loadProgram(){
        System.out.println("Loading program "+bootProgram);
    }


    public int getPcbSlots() {
        return pcbSlots;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }
}
