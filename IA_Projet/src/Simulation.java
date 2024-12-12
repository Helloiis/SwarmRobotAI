import java.util.Arrays;

public class Simulation {

    private final int gridSize = 10;

    //
    private int[][] grid = new int[gridSize][gridSize];

    public static void main(String[] args) {

        System.out.println("Lancement de la simulation :\n");
        Simulation simulation = new Simulation();
        simulation.printGrid();

    }

    private void printGrid() {
        System.out.println("\n\n");
        System.out.println(Arrays.deepToString(grid));
    }
}