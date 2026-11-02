package oop.ocp;

public class Ellipse extends Shape{
    private double major;
    private double minor;
    private static final double DEFAULT_MAJOR = 1.0;
    private static final double DEFAULT_MINOR = 1.0;

    public double getMajor(){
        return major;
    }
    public void setMajor(double major) {
        if (major > 0.0)
            this.major = major;
        else
            this.major = DEFAULT_MAJOR;
    }
    public double getMinor() {
        return minor    ;
    }
    public void setMinor(double minor) {
        if (minor > 0.0)
            this.minor = minor;
        else
            this.minor = DEFAULT_MINOR;
    }

    public Ellipse() {
        this(DEFAULT_MAJOR, DEFAULT_MINOR);
    }

    public Ellipse(double major, double minor){
        this.setMajor(major);
        this.setMinor(minor);
    }

    @Override
    public double getArea() {
        return Math.PI * this.major * this.minor;
    }
}