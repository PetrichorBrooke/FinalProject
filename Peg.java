import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class Peg {

    //public static final String[] NAMES = {"0", "1", "2", "3", "4", "5", "6", "7", 
    //"8", "9", "10", "11", "12", "13"};
    public static final String[] ROWS = {null, "a", "b", "c", "d", "e"};
    public static final String[] COLUMNS = {null, "1", "2", "3", "4", "5"};

    private final String name;
    private int row;
    private int column;
    private Point space;

    public Peg() {
        this.name = "PegOne";
        this.row = 1;
        this.column = 1;
        this.space = new Point(1, 1);
    }

    public Peg(String name, int row, int column) {
        this.name = name;
        this.row = row;
        this.column = column;
        this.space = new Point(this.column, this.row);
    }

    //public void move(Peg other) {
        //Scanner in = new Scanner(System.in);
        //Point inPoint = in.nextPoint;
        //if()
    //}

    public String getName() {
        return this.name;
    }

    public int getRow() {
        return this.row;
    }

    public int getColumn() {
        return this.column;
    }

    public Point getSpace() {
        return this.space;
    }

    public String toString() {
        String s = COLUMNS[this.column] + ROWS[this.row];
        return s;
    }
}