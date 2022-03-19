package edu.poniperro.arnold;

public enum Planeta {
    MERCURY(3.303e+23),
    VENUS(4.869e+24),
    EARTH(5.976e+24),
    MARS(6.421e+23),
    JUPITER(1.9e+27),
    SATURN(5.688e+26),
    URANUS(8.686e+25),
    NEPTUNE(1.024e+26);

    private double masa;

    private Planeta(double masa){
        this.masa = masa;
    }

    public double getMasa(){
        return masa;
    }
}
