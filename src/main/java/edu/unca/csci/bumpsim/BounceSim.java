package edu.unca.csci.bumpsim;

public class BounceSim {
    private final double paneWidth;
    private final double paneHeight;

    private final double entityWidth;
    private final double entityHeight;

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

        var collision = checkCollision();

        // If there was a collision with the floor or ceiling.
        if (collision == CollisionType.Floor) {
            verticalSpeed = -verticalSpeed;
        }

        // If there was a collision with either wall.
        else if (collision == CollisionType.Wall) {
            horizontalSpeed = -horizontalSpeed;
        }

        // If the vertical velocity is very close to 0, set it to 0.
        if (Math.abs(verticalSpeed) <= .5) {
            verticalSpeed = 0;
        }

        // If the vertical speed is 0, reduce the horizontal speed ("friction").
        if (verticalSpeed == 0) {
            horizontalSpeed -= 1;
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
