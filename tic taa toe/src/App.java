import java.util.Scanner;
public class App {
    public static void main(String[] args){
        char[][] board = new char[3][3];
        for(int row=0;row<board.length;row++){
        for(int col=0;col<board[row].length;col++){
            board[row][col]=0;
        }
    }
    char player='X';
    boolean gameOver=false;
    Scanner scanner=new Scanner(System.in);

    while(!gameOver)
    {
        printBoard(board);
        System.out.println("Player" +player+" enter:");
        int row=scanner.nextInt();
        int col=scanner.nextInt();

        if (board[row][col]==' '){
        board[row][col]= player;
        gameOver=haveWon(board,player);
        if(gameOver){
            System.out.println("Player" + player +" Has won");

        }else{
        //     if(player =='X'){
        //         player ='0';}
        //     else{
        //         player = 'X';
        // }
        player = (player =='X')? '0' :'X';
    }
        }else{
            System.out.println("Invalid move.Try again!");
        }
    }
     printBoard(board);
    }
    public static boolean haveWon (char[][] board,char player){


    }
     
    public static printBoard(Char[][] board) {
         for(int row=0;row<board.length;row++){
        for(int col=0;col<board[row].length;col++){
           System.out.println();
        }
    }
        
    }
}

