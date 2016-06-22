public class MoveMaker {

        int[][] game;
        int position = 0;
        int move=0;

        public MoveMaker(int[][] g){
            game = g;
        }

        public int[][] moveLeft(int[][] game){
            System.out.println("Left");
            for(int i = 0; i < 4;i++){
                position = 0;
                move=0;
                for(int j = 0; j<4;j++){

                    if(game[i][j]>0){
                        for(int k = j+1;k<4;k++){
                            if(k>3){
                                int tmp = game[i][k];
                                game[i][k] = 0;
                                game[i][position] = tmp;
                                move=1;
                            }
                            else if(game[i][k]==game[i][j]){
                                int tmp = game[i][j];
                                game[i][j]=0;
                                game[i][k]=0;
                                game[i][position]=tmp*2;
                                move=1;
                                break;
                            }
                        }
                        if(move==0){
                            int tmp = game[i][j];
                            game[i][j]=0;
                            game[i][position]=tmp;
                        }

                        move=0;
                        position++;

                    }

                }
            }
            return game;
        }

        public int[][] moveUp(int[][] game){
            System.out.println("Up");
            for(int i = 0; i < 4;i++){
                position = 0;
                move=0;
                for(int j = 0; j<4;j++){

                    if(game[j][i]>0){
                        for(int k = j+1;k<4;k++){
                            if(k>3){
                                int tmp = game[k][i];
                                game[i][k] = 0;
                                game[position][i] = tmp;
                                move=1;
                            }
                            else if(game[k][i]==game[j][i]){
                                int tmp = game[j][i];
                                game[j][i]=0;
                                game[k][i]=0;
                                game[position][i]=tmp*2;
                                move=1;
                                break;
                            }
                        }
                        if(move==0){
                            int tmp = game[j][i];
                            game[j][i]=0;
                            game[position][i]=tmp;
                        }

                        move=0;
                        position++;

                    }

                }
            }
            return game;
        }

    public int[][] moveRight(int[][] game){
        System.out.println("Right");
            for(int i = 0; i < 4;i++){
                position = 3;
                move=0;
                for(int j = 3; j>-1;j--){

                    if(game[i][j]>0){
                        for(int k = j-1;k>-1;k--){
                            if(k<0){
                                int tmp = game[k][i];
                                game[i][k] = 0;
                                game[i][position] = tmp;
                                move=1;
                            }
                            else if(game[i][k]==game[i][j]){
                                int tmp = game[i][j];
                                game[i][j]=0;
                                game[i][k]=0;
                                game[i][position]=tmp*2;
                                move=1;
                                break;
                            }
                        }
                        if(move==0){
                            int tmp = game[i][j];
                            game[i][j]=0;
                            game[i][position]=tmp;
                        }

                        move=0;
                        position--;

                    }

                }
            }
        return game;
        }

    public int[][] moveDown(int[][] game){
        System.out.println("Down");
            for(int i = 0; i < 4;i++){
                position = 3;
                move=0;
                for(int j = 3; j>-1;j--){

                    if(game[j][i]>0){
                        for(int k = j-1;k>-1;k--){
                            if(k<0){
                                int tmp = game[i][k];
                                game[k][i] = 0;
                                game[position][i] = tmp;
                                move=1;
                            }
                            else if(game[k][i]==game[j][i]){
                                int tmp = game[j][i];
                                game[j][i]=0;
                                game[k][i]=0;
                                game[position][i]=tmp*2;
                                move=1;
                                break;
                            }
                        }
                        if(move==0){
                            int tmp = game[j][i];
                            game[j][i]=0;
                            game[position][i]=tmp;
                        }

                        move=0;
                        position--;

                    }

                }
            }
        return game;
    }

}
