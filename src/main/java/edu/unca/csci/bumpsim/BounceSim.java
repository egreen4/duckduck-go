package edu.unca.csci.bumpsim;

public class BounceSim {
    private final double paneWidth;
    private final double paneHeight;

    private final double entityWidth;
    private final double entityHeight;

    private double horizontalSpeed;
    private double verticalSpeed;

    private double xCoordinate;
    private double yCoordinate;

    public BounceSim(double paneWidth, double paneHeight, double entityWidth, double entityHeight, double decayRate) {
        this.paneWidth = paneWidth;
        this.paneHeight = paneHeight;

        this.entityHeight = entityHeight;
        this.entityWidth = entityWidth;
    }

    public void bump(HorizontalVelocity horizontalVelocity, VerticalVelocity verticalVelocity) {
    }

    public Position nextPosition() {
        return null;
    }

    private CollisionType checkCollision() {
        return CollisionType.NotCollided;
    }
}
