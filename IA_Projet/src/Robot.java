public class Robot {

    private int positionX;

    private int positionY;

    private State state = State.ACTIF;

    private String collectedData;

    private GeneralQuarter base;

    enum State {
        ACTIF, INACTIF
    }

    public Robot(int positionX, int positionY, GeneralQuarter base) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.base = base;
    }

    public void move(int X, int Y) {
        // TODO
    }

    public void goToBase() {
        move(this.base.getPostionX(), this.base.getPostionY());
    }
}
