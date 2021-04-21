import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Board implements Runnable {
    public List<Token> listTokens = new ArrayList<Token>();
    public List<Player> listPlayers = new ArrayList<Player>();
    public int checkPlayer;
    public int playerNumber;
    public boolean timeOut;


    public Board() {
        this.playerNumber = 0;
        this.checkPlayer = 1;
        this.timeOut = false;
        Random rand = new Random();
        listTokens.add(new Token(rand.nextInt(10)));
        listTokens.add(new Token(rand.nextInt(10)));
    }



    @Override
    public void run() {
        while (true) {
            try {
                if (playerNumber != checkPlayer) {
                    playerNumber = playerNumber + 1;
                    update(playerNumber);
                }
                else {
                    playerNumber = 0;
                    update(playerNumber);
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }


            if (timeOut) {
                if (listTokens.size() == 0) {
                    System.out.println("[Info] : There are no more tokens available, the game has ended.");
                    timeOut = true;
                    Thread.currentThread().interrupt();
                    return;
                }

                if (listPlayers.get(0).points < listPlayers.get(1).points) {
                    System.out.println("[Info] :  The winner is player 2");
                } else {
                    System.out.println("[Info] :  The winner is player 1");
                }

            }
        }
    }

    private void update(int x) throws InterruptedException {
        synchronized (this) {
            Thread.sleep(100);
            this.notifyAll();
        }
    }
}