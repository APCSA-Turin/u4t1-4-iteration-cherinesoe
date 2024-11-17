public class CoinGame {


    private int startingCoins;  // starting number of coins
    private int maxRounds;      // maximum number of rounds played
    private int roundTracker = 1; // ADDED TO ENABLE TESTING
    
    
    public CoinGame(int s, int r) {
    startingCoins = s;
    maxRounds = r;
    }
     
    /** Returns the number of coins (1, 2, or 3) that player 1 will spend.
        THIS WAS AN "implementation not shown" METHOD IN THE ORIGINAL FRQ,
        BUT IS INCLUDED HERE TO ENABLE TESTING
      */
    public int getPlayer1Move() {
      int result;
      if (roundTracker == 1 || roundTracker == 2 || roundTracker == 4) {
        result = 2;
      } else if (roundTracker == 3) {
        result = 1;
      } else {
        result = 3;
      }
      roundTracker++;
      return result;
    }
     
    /** Returns the number of coins (1, 2, or 3) that player 2 will spend,
      * as described in part (a).
      */
      public int getPlayer2Move(int round) {
        // your code here
        if (round % 3 == 0) {
              return 3;
        } else if (round % 2 == 0) {
            return 2;
        } else {
            return 1;
        }
      }
      
    
    
    /** Plays a simulated game between two players, as described in part
      * (b).
      */
      public void playGame() {
        // your code here
          int coinsP1 = startingCoins;
          int coinsP2 = startingCoins;
          int round = 1;
        //   int spentP1 = getPlayer1Move();
        //   int spentP2 = getPlayer2Move(round);
        //   coinsP1 -= spentP1;
        //   coinsP2 -= spentP2;
          boolean gameOver = false;
          while (!gameOver) {
            int spentP1 = getPlayer1Move();
            int spentP2 = getPlayer2Move(round);
            coinsP1 -= spentP1;
            coinsP2 -= spentP2;
            if (spentP1 == spentP2) {
                coinsP2++;
            } else if (Math.abs(spentP1 - spentP2) == 1) {
                coinsP2++;
            } else {
                coinsP1 += 2;
            }
            
            if (round == maxRounds || coinsP1 < 3 || coinsP2 < 3) {
                gameOver = true;
            }
            round++;
           }
      if (coinsP1 == coinsP2) {
        System.out.println("tie game");
      } else if (coinsP1 > coinsP2) {
        System.out.println("player 1 wins");
      } else {
        System.out.println("player 2 wins");
      }
    }
      
}
    