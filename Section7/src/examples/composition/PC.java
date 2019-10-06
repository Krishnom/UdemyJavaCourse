package examples.composition;

public class PC {
    private Motherboard motherboard;
    private Case theCase;
    private Mouse mouse;
    private Keyboard keyboard;
    private Monitor monitor;

    public PC(Motherboard motherboard, Case theCase, Mouse mouse, Keyboard keyboard, Monitor monitor) {
        this.motherboard = motherboard;
        this.theCase = theCase;
        this.mouse = mouse;
        this.keyboard = keyboard;
        this.monitor = monitor;
    }

    public void powerOn(){
        theCase.pressPowerButton();
        motherboard.loadProgram();
        drawLogo();
    }

    private void drawLogo() {
        monitor.drawPixel(1500,50,"Red");
    }
}
