import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JComponent;
import javax.swing.JMenuBar;
import java.awt.BorderLayout;

/**
 * Created by Brendon on 4/1/2016.
 *
 */
public class GameViewer {

    static int[][] game = new int[4][4];

    public static void main(String[] args){

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JMenuBar menuBar = new JMenuBar();
        MoveMaker moveMaker = new MoveMaker(game);
        Randomizer random = new Randomizer();
        ArrayList<Tiles> tiles = new ArrayList<Tiles>();
        Random placeTwo = new Random();

        frame.setLayout(new BorderLayout());
        frame.setTitle("2048");
        frame.setSize(1080, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JButton left = new JButton("Left");
        JButton right = new JButton("Right");
        JButton up = new JButton("Up");
        JButton down = new JButton("Down");
        JButton start = new JButton("Start");

        panel.add(left);
        panel.add(right);
        panel.add(up);
        panel.add(down);
        panel.add(start);
        frame.add(panel, BorderLayout.SOUTH);

        class ButtonListenerLeft implements ActionListener{

            public void actionPerformed(ActionEvent e){
                game = moveMaker.moveLeft(game);
                game = random.insertTwo(game);
                random.print(game);
                frame.repaint();
            }
        }

        class ButtonListenerRight implements ActionListener{

            public void actionPerformed(ActionEvent e){
                game = moveMaker.moveRight(game);
                game = random.insertTwo(game);
                random.print(game);
                frame.repaint();
            }
        }

        class ButtonListenerUp implements ActionListener{

            public void actionPerformed(ActionEvent e){
                game = moveMaker.moveUp(game);
                game = random.insertTwo(game);
                random.print(game);
                frame.repaint();
            }
        }

        class ButtonListenerDown implements ActionListener{

            public void actionPerformed(ActionEvent e){
                game = moveMaker.moveDown(game);
                game = random.insertTwo(game);
                random.print(game);
                frame.repaint();

            }
        }

        class ButtenListenerStart implements ActionListener{

            public void actionPerformed(ActionEvent e){
                game = random.Start(game);
                game = random.insertTwo(game);
                random.print(game);
                frame.repaint();
            }
        }

        ActionListener moveLeft = new ButtonListenerLeft();
        left.addActionListener(moveLeft);
        ActionListener moveRight = new ButtonListenerRight();
        right.addActionListener(moveRight);
        ActionListener moveUp = new ButtonListenerUp();
        up.addActionListener(moveUp);
        ActionListener moveDown = new ButtonListenerDown();
        down.addActionListener(moveDown);
        ActionListener startButton = new ButtenListenerStart();
        start.addActionListener(startButton);

        Tiles tile0 = new Tiles(200, 75);
        tiles.add(tile0);
        Tiles tile1 = new Tiles(364, 75);
        tiles.add(tile1);
        Tiles tile2 = new Tiles(528, 75);
        tiles.add(tile2);
        Tiles tile3 = new Tiles(692, 75);
        tiles.add(tile3);

        Tiles tile4 = new Tiles(200, 225);
        tiles.add(tile4);
        Tiles tile5 = new Tiles(364, 225);
        tiles.add(tile5);
        Tiles tile6 = new Tiles(528, 225);
        tiles.add(tile6);
        Tiles tile7 = new Tiles(692, 225);
        tiles.add(tile7);

        Tiles tile8 = new Tiles(200, 375);
        tiles.add(tile8);
        Tiles tile9 = new Tiles(364, 375);
        tiles.add(tile9);
        Tiles tile10 = new Tiles(528, 375);
        tiles.add(tile10);
        Tiles tile11 = new Tiles(692, 375);
        tiles.add(tile11);

        Tiles tile12 = new Tiles(200, 525);
        tiles.add(tile12);
        Tiles tile13 = new Tiles(364, 525);
        tiles.add(tile13);
        Tiles tile14 = new Tiles(528, 525);
        tiles.add(tile14);
        Tiles tile15 = new Tiles(692, 525);
        tiles.add(tile15);

        JComponent component = new FrameComponent(tiles, game);
        frame.add(component);
    }
}
