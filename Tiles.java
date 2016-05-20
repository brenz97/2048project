import javax.swing.*;
import java.awt.Rectangle;
import java.awt.Color;

/**
 * Created by Brendon on 4/1/2016.
 */
public class Tiles extends JComponent{
    private int number;
    private Rectangle rect;
    private Color color;

    Tiles(int x, int y){
        number = 0;
        rect = new Rectangle(50,50,x,y);
        color = Color.black;
    }

    public int getNumber(){
        return number;
    }

    public void setNumber(int num){
        number = num;
    }
}
