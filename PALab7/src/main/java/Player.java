import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Player implements Runnable {

    private final int Id;
    private final String name;
    private Board board;
    private List<Token> myTokens = new ArrayList<Token>();
    private int index = 0;
    public int points;

    Scanner sc = new Scanner(System.in);
    Random rand = new Random();


    public Player(Board board, String name, int id) {
        this.points = 0;
        this.Id = id;
        this.board = board;
        this.name = name;
        board.listPlayers.add(this);
    }

    @Override
    public void run() {
        while (true) {
            try {
                consume();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void consume() throws InterruptedException {
        synchronized (board) {
            while (board.playerNumber != Id) {
                System.out.println(name + "must wait.");
                board.wait();
            }


            Thread.sleep(1000);
            System.out.println("\nThe tokens are :");
            System.out.println("\nSelect one by typing 0 or 1.");
            for (int numbeer = 0; numbeer < board.listTokens.size(); numbeer++) {
                System.out.print(board.listTokens.get(numbeer).getValue() + " ");
            }
            System.out.println("");
            System.out.println(name + "Please pick a token");
            try {
                index = sc.nextInt();
                if (index == -1) {
                    index = rand.nextInt(board.listTokens.size());
                }
            } catch (NullPointerException e) {
                System.out.println("Nothing has been written.");
            }
            board.listTokens.remove(index);
            System.out.println(name + "chose token : " + index);
            board.notifyAll();
            board.wait();
        }
    }
}