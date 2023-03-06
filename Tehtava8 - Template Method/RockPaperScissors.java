import java.util.Scanner;

public class RockPaperScissors extends Game {
    private final String[] moves = {"rock", "paper", "scissors"};
    private final Scanner scanner = new Scanner(System.in);
    private String[] playerNames;
    private int[] playerMoves;
    
    @Override
    void initializeGame() {
        System.out.println("Rock Paper Scissors");
        System.out.println("====================");
        System.out.print("Enter number of players: ");
        playerNames = new String[playersCount];
        playerMoves = new int[playersCount];
        for (int i = 0; i < playersCount; i++) {
            System.out.printf("Enter name for player %d: ", i + 1);
            playerNames[i] = scanner.nextLine();
        }
        System.out.println("Let's play!\n");
    }
    
    @Override
    void makePlay(int player) {
        System.out.printf("%s, enter your move (1 = rock, 2 = paper, 3 = scissors): ", playerNames[player]);
        int move = scanner.nextInt();
        playerMoves[player] = move;
    }
    
    @Override
    boolean endOfGame() {
        for (int i = 0; i < playersCount; i++) {
            if (playerMoves[i] == 0) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    void printWinner() {
        int[] moveCounts = new int[3];
        for (int i = 0; i < playersCount; i++) {
            moveCounts[playerMoves[i] - 1]++;
        }
        if (moveCounts[0] == playersCount || moveCounts[1] == playersCount || moveCounts[2] == playersCount) {
            System.out.println("It's a tie!");
        } else {
            int winningMove = (moveCounts[0] > moveCounts[1]) ? 0 : 1;
            winningMove = (moveCounts[winningMove] > moveCounts[2]) ? winningMove : 2;
            System.out.printf("%s wins with %s!\n", playerNames[getWinningPlayer(winningMove)], moves[winningMove]);
        }
    }
    
    private int getWinningPlayer(int winningMove) {
        for (int i = 0; i < playersCount; i++) {
            if (playerMoves[i] == winningMove + 1) {
                return i;
            }
        }
        return -1;
    }
}
