package co.weathertrail.oldmodels;

public class Waypoint {
    private double[] location = new double[2];
    private int stepIndex;
    private double step_interpolation;

    public Waypoint() {
    }

    public double[] getLocation() {
        return location;
    }

    public void setLocation(double[] location) {
        this.location = location;
    }

    public int getStepIndex() {
        return stepIndex;
    }

    public void setStepIndex(int stepIndex) {
        this.stepIndex = stepIndex;
    }

    public double getStep_interpolation() {
        return step_interpolation;
    }

    public void setStep_interpolation(double step_interpolation) {
        this.step_interpolation = step_interpolation;
    }
}
