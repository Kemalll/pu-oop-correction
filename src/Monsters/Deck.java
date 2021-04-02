package Monsters;
import java.awt.*;
import java.util.ArrayList;

public class Deck {
    Monsters[] monsters = new Monsters[18];
//    public Deck() {}

        public Monsters[] getMonsters () {

            monsters[0] = (new DarkMagician(8, 5, 10, 1, true));
            monsters[1] = (new DarkMagician(8, 5, 10, 1, true));
            monsters[2] = (new DarkMagician(8, 5, 10, 1, true));
            monsters[3] = (new DrunkenKnight(5, 5, 5, 5, true));
            monsters[4] = (new DrunkenKnight(5, 5, 5, 5, true));
            monsters[5] = (new DrunkenKnight(5, 5, 5, 5, true));
            monsters[6] = (new SofisticatedSam(10, 5, 4, 1, true));
            monsters[7] = (new SofisticatedSam(10, 5, 4, 1, true));
            monsters[8] = (new SofisticatedSam(10, 5, 4, 1, true));
            monsters[9] = (new SandTurtle(5, 10, 1, 4, true));
            monsters[10] = (new SandTurtle(5, 10, 1, 4, true));
            monsters[11] = (new SandTurtle(5, 10, 1, 4, true));
            monsters[12] = (new RecklessCanibal(4, 6, 8, 10, true));
            monsters[13] = (new RecklessCanibal(4, 6, 8, 10, true));
            monsters[14] = (new RecklessCanibal(4, 6, 8, 10, true));
            monsters[15] = (new DogEatingBug(10, 2, 8, 5, true));
            monsters[16] = (new DogEatingBug(10, 2, 8, 5, true));
            monsters[17] = (new DogEatingBug(10, 2, 8, 5, true));

            return monsters;
        }
}



//    ArrayList<Monsters> monsters=new ArrayList<Monsters>(18);

