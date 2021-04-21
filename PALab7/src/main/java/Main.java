import java.util.Timer;
import java.util.TimerTask;

public class Main
{
    public static void main(String[] args)
    {
        Timer to = new Timer(true);
        Board board = new Board();
        TimerTask stopTheGame = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Time Out");
                board.timeOut=true;
            }
        };


        Thread gameBoard = new Thread(board, "Board");
        gameBoard.start();

        Thread player1 = new Thread(new Player(board,"Player1 ",0), "Player 1");
        player1.start();
        Thread player2 = new Thread(new Player(board, "Player2 ",1), "Player 2");
        player2.start();

        to.schedule(stopTheGame,10000);

    }
}