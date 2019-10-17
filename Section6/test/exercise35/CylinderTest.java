package exercise35;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CylinderTest {

    @Test
    public void volumeOfCylinderWithRadius10AndHeigh10Is1000XPI() {
        Cylinder cylinder = new Cylinder(10.0,10.0);
        assertEquals(1000.0*Math.PI,cylinder.getVolume(),0.0001);

    }

    @Test public void heightAndRadiusSetTo0WhenInvalidValueIsGiven(){
        Cylinder cylinder = new Cylinder(1.0, -1.0);
        Circle  circle = new Circle( -1.0);
        assertEquals(0.0,cylinder.getHeight(),0.0);
        assertEquals(0.0,circle.getRadius(),0.0);
    }
}