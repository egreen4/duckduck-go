public class BounceSim {
    private final double paneWidth;
    private final double paneHeight;

    private final double entityWidth;
    private final double entityHeight;

    public BounceSim(double paneWidth, double paneHeight, double entityWidth, double entityHeight, double gravity) {
        this.paneWidth = paneWidth;
        this.paneHeight = paneHeight;

        this.entityHeight = entityHeight;
        this.entityWidth = entityWidth;
    }

    public void bump(double direction, double power) {
    }
}
