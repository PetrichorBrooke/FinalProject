import java.util.Scanner;
import java.awt.*;

public class BoardClient {

    public void move(Peg other, Point choice) {
        for(Point space : this.pegs) {
            
            Scanner in = new Scanner(System.in);
            Point inPoint1 = Point.valueOf(in.nextLine());
            Point inPoint2 = Point.valueOf(in.nextLine());
    
            if((space.equals(inPoint1)) && !(space.equals(inPoint2))) {
                
    
                if(((this.column - inPoint2.x) || (inPoint2.x - this.column) == 2) 
                    && (this.row.equals(inPoint2.y))) {
                        this.space = inPoint2;
                }
                else if(((this.row - inPoint2.y) || (inPoint2.y - this.row) == 2) 
                    && (this.column.equals(inPoint2.x))) {
                        this.space = inPoint2;
                }
            }
        }
    }

    public static void main(String[] args) {
        Board board = new Board();
        System.out.println(board);
    }
}