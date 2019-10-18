import java.util.Random;
import javax.swing.*;

public class GissaTalet {

    public static void main(String[] args) {

        int antal = 0;
        Random rand = new Random();
        int n = rand.nextInt(101);
        //Generar ett nytt tal för "n" när n = 0 eftersom uppgiften säger att talet ska vara mellan 1 och 100.
        while (n == 0) {
            n = rand.nextInt(101);
        }
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Gissa Talet!"));
        if (a == n) {
            JOptionPane.showMessageDialog(null, "Du gissade rätt!");
            JOptionPane.showMessageDialog(null, "Du vann efter " + antal + " försök!");
        }
        while (a != n) {
            if (a < n) {
                antal++;
                a = Integer.parseInt(JOptionPane.showInputDialog(null, "För lågt! Försök igen!"));
            } else {
                antal++;
                a = Integer.parseInt(JOptionPane.showInputDialog(null, "För högt! Försök igen!"));
            } if (a == n){

                JOptionPane.showMessageDialog(null, "Du gissade rätt!");
                JOptionPane.showMessageDialog(null, "Du vann efter " + antal + " försök!");
            }
        }
    }
}
// Skräp nedan
/*
        // antal = antalet försök som spelaren har gjort
        int antal = 0;
        Random rand = new Random();
        // n = datorns slumpade tal
        double n = rand.nextInt(100);
        // a = Spelarens gissning
        double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Gissa Talet!"));
        if (a == n) {
            JOptionPane.showMessageDialog(null, "Du gissade rätt!");
            JOptionPane.showMessageDialog("Du vann efter " + antal + "försök!");
        } else if (a > n) {
            antal++;
            double a = Double.parseDouble(JOptionPane.showInputDialog(null, "För högt! Försök igen!"));
        } else if (a < n) {
            antal++;
            double a = Double.parseDouble(JOptionPane.showInputDialog(null, "För lågt! Försök igen!"));
        }
    }
}

*/