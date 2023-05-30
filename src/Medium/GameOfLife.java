package Medium;

import java.util.Arrays;

public class GameOfLife {
    public static void main(String[] args) {
        int[][] arr={
                {0,1,0},
                {0,0,1},
                {1,1,1},
                {0,0,0}
        };
        gameOfLife(arr);
        for(int[] row:arr){
            System.out.println(Arrays.toString(row));
        }
    }
    public static void gameOfLife(int[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==1){
                    int count=0;
                    if(i>0&&j>0){
                        if(board[i-1][j-1]%2==1){
                            count++;
                        }
                    }
                    if(i>0&&j<board[0].length-1){
                        if(board[i-1][j+1]%2==1){
                            count++;
                        }
                    }
                    if(i<board.length-1&&j<board[0].length-1){
                        if(board[i+1][j+1]%2==1){
                            count++;
                        }

                    }
                    if(j>0&&i<board.length-1){
                        if(board[i+1][j-1]%2==1){
                            count++;
                        }

                    }
                    if(i>0){
                        if(board[i-1][j]%2==1){
                            count++;
                        }
                    }
                    if(j>0){
                        if(board[i][j-1]%2==1){
                            count++;
                        }
                    }
                    if(i<board.length-1){
                        if(board[i+1][j]%2==1){
                            count++;
                        }
                    }
                    if(j<board[0].length-1){
                        if(board[i][j+1]%2==1){
                            count++;
                        }
                    }
                    if(count==3||count==2){
                        board[i][j]+=2;
                    }
                }else{
                    int count=0;
                    if(i>0&&j>0){
                        if(board[i-1][j-1]%2==1){
                            count++;
                        }
                    }
                    if(i>0&&j<board[0].length-1){
                        if(board[i-1][j+1]%2==1){
                            count++;
                        }
                    }
                    if(i<board.length-1&&j<board[0].length-1){
                        if(board[i+1][j+1]%2==1){
                            count++;
                        }

                    }
                    if(j>0&&i<board.length-1){
                        if(board[i+1][j-1]%2==1){
                            count++;
                        }

                    }
                    if(i>0){
                        if(board[i-1][j]%2==1){
                            count++;
                        }
                    }
                    if(j>0){
                        if(board[i][j-1]%2==1){
                            count++;
                        }
                    }
                    if(i<board.length-1){
                        if(board[i+1][j]%2==1){
                            count++;
                        }
                    }
                    if(j<board[0].length-1){
                        if(board[i][j+1]%2==1){
                            count++;
                        }
                    }
                    if(count==3){
                        board[i][j]+=2;
                    }
                }
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]<2){
                    board[i][j]=0;
                }else{
                    board[i][j]=1;
                }
            }
        }
    }}
