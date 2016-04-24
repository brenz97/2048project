import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Brendon on 4/23/2016.
 */
public class Randomizer {

    ArrayList<Integer> row;
    ArrayList<Integer> col;
    Random ran;

    public Randomizer(){
        row = new ArrayList<Integer>();
        col = new ArrayList<Integer>();
        ran =  new Random();
    }

    public int[][] insertTwo(int[][] game)throws IllegalArgumentException{

        for(int i = 0;i<4;i++){
            for(int j = 0;j<4;j++){
                if(game[i][j]==0){
                    row.add(i);
                    row.add(j);
                }
            }
        }

        if(col.size()==0){
            throw new IllegalArgumentException("game over");
        }
        int tmp = ran.nextInt(row.size()-1);
        game[row.get(tmp)][col.get(tmp)] = 2;

        return game;
    }
}
