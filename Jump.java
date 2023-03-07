import java.util.Scanner;
import java.awt.*;

public class Jump {
    public static void board(int n) {
        int i;
        int j;
        int s;
        for(i = 0; i <= 5; i++) {
            for(s = 0; s < (6 - i); s++) {
                System.out.print(" ");
            }
            for(j = 0; j < i; j++) {
                System.out.print("o ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //int n = 5;
        //board(n);
    }    
}