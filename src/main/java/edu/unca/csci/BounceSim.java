package edu.unca.csci;

public class BounceSim {
    private final double paneWidth;
    private final double paneHeight;

    private final double entityWidth;
    private final double entityHeight;

    private double entitySpeed;
    private double entityDirection;

    public BounceSim(double paneWidth, double paneHeight, double entityWidth, double entityHeight, double decayRate) {
        this.paneWidth = paneWidth;
        this.paneHeight = paneHeight;

        this.entityHeight = entityHeight;
        this.entityWidth = entityWidth;

        this.entitySpeed = 0;
        this.entityDirection = 0;
    }

    public void bump(double direction, double speed) {
    }

    public Position moveNext() {
        return null;
    }
}
