import java.util.Arrays;

public class Board {
    private Peg[] pegs;

    public Board() {
        this.pegs = new Peg[15];
        int index = 0;
        for(int row = 0; row <= 5; row++) {
            for(int column = 0; column < row; column++) {
                this.pegs[index] = new Peg(null, column, row);
                index++;
            }
        }
    }

    public Peg[] getPegs() {
        return this.pegs;
    }
}