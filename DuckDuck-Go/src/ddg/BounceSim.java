public class BounceSim {
    private final double paneWidth;
    private final double paneHeight;

    private final double entityWidth;
    private final double entityHeight;

    public BounceSim(double paneWidth, double paneHeight, double entityWidth, double entityHeight, double decayRate) {
        this.paneWidth = paneWidth;
        this.paneHeight = paneHeight;

        this.entityHeight = entityHeight;
        this.entityWidth = entityWidth;
    }

    public void bump(int direction, double rate) {
    }
}
