package Monsters;

import java.awt.*;

public abstract class Monsters {

    protected int AP;
    protected int DP;
    protected int MP;
    protected int S;
    protected String name;
    protected boolean isAlive;


    public int getAP() {
        return AP;
    }

    public int getDP() {
        return DP;
    }

    public int getMP() {
        return MP;
    }

    public int getS() {
        return S;
    }

    public boolean isAlive() {
        return isAlive;
    }




    public Monsters(int attackP, int defenceP, int magicPower, int speed, boolean isAlive, String name){
        this.AP=attackP;
        this.DP=defenceP;
        this.MP=magicPower;
        this.S=speed;
        this.isAlive=isAlive;
        this.name=name;
    }


    public void Visuals(Graphics g){
        g.setColor(Color.WHITE);
        g.drawRect(1100,650,100,100);
        g.setColor(new Color(252, 252, 3));
        g.setFont(new Font("Magneto",Font.ITALIC,4));
        g.drawString(this.name,1300,620);

    }
}
