package edu.unca.csci.bumpsim;

public class BounceSim {
    private final double paneWidth;
    private final double paneHeight;

    private final double entityWidth;
    private final double entityHeight;

    private final double entityWidthHalf;
    private final double entityHeightHalf;

    private final double decayRate;

    private double horizontalSpeed;
    private double verticalSpeed;

    private double xCoordinate;
    private double yCoordinate;

    public BounceSim(double paneWidth, double paneHeight, double entityWidth, double entityHeight, double decayRate) {
        this.paneWidth = paneWidth;
        this.paneHeight = paneHeight;

        this.entityHeight = entityHeight;
        this.entityWidth = entityWidth;

        this.entityHeightHalf = Math.floor(entityHeight / 2);
        this.entityWidthHalf = Math.floor(entityWidth / 2);

        this.decayRate = decayRate;

        this.xCoordinate = Math.floor(paneWidth / 2);
        this.yCoordinate = Math.floor(paneHeight / 2);
    }

    public void bump(HorizontalVelocity horizontalVelocity, VerticalVelocity verticalVelocity) {
        horizontalSpeed = horizontalVelocity.speed * (horizontalVelocity.direction == HorizontalDirection.Right ? 1 : -1);
        verticalSpeed = verticalVelocity.speed * (verticalVelocity.direction == VerticalDirection.Up ? -1 : 1);
    }

    public Position nextPosition() {
        // Reduce the vertical speed by the decay rate.
        verticalSpeed += decayRate;

        xCoordinate += horizontalSpeed;
        yCoordinate += verticalSpeed;

        // Check if we're outside of the floor bounds.
        if (yCoordinate >= paneHeight - entityHeight) {
            yCoordinate = paneHeight - entityHeight;
        }

        // Check if we're outside of the ceiling bounds.
        else if (yCoordinate <= entityHeightHalf) {
            yCoordinate = entityHeightHalf;
        }

        // Check if we're outside of the left wall.
        if (xCoordinate < 0) {
            xCoordinate = 0;
        }

        // Check if we're outside of the right wall.
        else if (xCoordinate >= paneWidth - entityWidthHalf) {
            yCoordinate = paneWidth - entityWidthHalf;
        }

        var collision = checkCollision();

        // If there was a collision with the floor or ceiling.
        if (collision == CollisionType.Floor) {
            if (Math.abs(verticalSpeed) <= .5) {
                verticalSpeed = 0;
                horizontalSpeed += .3 * (horizontalSpeed < 0 ? 1 : -1);
                yCoordinate = paneHeight - entityHeightHalf;
            }

            verticalSpeed = -verticalSpeed;
        }

        // If there was a collision with either wall.
        else if (collision == CollisionType.Wall) {
            horizontalSpeed = -horizontalSpeed;
        }

        return new Position(xCoordinate, yCoordinate);
    }

    private CollisionType checkCollision() {
        if (xCoordinate <= 0 || xCoordinate >= paneWidth - entityWidth) {
            return CollisionType.Wall;
        }

        else if (yCoordinate <= 0 || yCoordinate >= paneHeight - entityHeight) {
            return CollisionType.Floor;
        }

        return CollisionType.NotCollided;
    }
}
