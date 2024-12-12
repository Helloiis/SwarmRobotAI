public class Fire {

    private int positionX;

    private int positionY;

    private int survivors;


    public Fire(int positionX, int positionY, int survivors) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.survivors = survivors;
    }

    public int getPositionX() {
        return this.positionX;
    }

    public int getPositionY() {
        return this.positionY;
    }

    public int getSurvivors() {
        return this.survivors;
    }
}
