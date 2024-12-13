package Projects;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Rule {
    // Method to display game rules at the start of each level
    @SuppressWarnings("resource")
    public static String gameRule(int level) {
        System.out.println("\033c"); // Clears the screen
        System.out.println("🌟 WELCOME TO LEVEL " + level + "! 🌟");
        System.out.println("\n🎮 Welcome to the Guesser Game! 🎮");
        
        // Display the rules of the game
        System.out.println("\n📜 Rules of the Game/Level:");
        System.out.println("1. The Guesser will secretly select a random number between 1 and " + (level * 10) + ".");
        System.out.println("2. There are 3 players. Each player:");
        System.out.println("   - Will enter their name.");
        System.out.println("   - Will guess a number within the specified range.");
        System.out.println("   - Invalid guesses (numbers outside the range) must be re-entered.");
        System.out.println("3. Winners are determined as follows:");
        System.out.println("   - The player(s) whose guess matches the Guesser's number wins! 🏆");
        System.out.println("   - If no one guesses correctly, the Guesser wins, and the secret number is revealed. ❌");
        System.out.println("4. Points System:");
        System.out.println("   - The winner of Level 1 will get 1 point.");
        System.out.println("   - The winner of Level 2 will get 2 points, and so on.");
        System.out.println("5. The game continues until players decide to exit.");
        System.out.println("6. At the end of the game, the player with the highest total points will be declared the **Ultimate Winner**! 🏅");
        
        // Prompt to start the game or exit
        System.out.println("\n🤔 Think you can outguess the Guesser? Let's find out! 🚀");
        System.out.println("\nPress Enter to start the game...");
        System.out.println("Type 'exit' and hit Enter to exit the game...");
        
        // Wait for user input (Enter to continue or "exit" to quit)
        return new Scanner(System.in).nextLine();
    }
}

class Guesser {
    private int guesserNum;
    
    public int getGuesserNum(int level) {
        //Generate random number between 1 to level*10;
        Random rand = new Random();
        guesserNum = rand.nextInt(10*level)+1;
        return guesserNum;
    }
}

class Player {
    private String playerName;
    private int playerNum;
    private static Scanner scan = new Scanner(System.in);

    public String getPlayerName() {
        playerName = scan.nextLine();
        return playerName;
    }
    public int getPlayerNum() {
        playerNum = scan.nextInt();
        scan.nextLine();
        return playerNum;
    }
}

class Umpire {
    private int gusserNum;
    private int playerOneNum;
    private int playerTwoNum;
    private int playerThreeNum;
    private String playerOneName;
    private String playerTwoName;
    private String playerThreeName;
    private Player playerOne;
    private Player playerTwo;
    private Player playerThree;
    private Guesser guesser;

    public Umpire(){
        playerOne = new Player();
        playerTwo = new Player();
        playerThree = new Player();
        guesser = new Guesser();
    }
    
    //collecting number from gusser object
    public void collectNumFromGusser(int level) {
        gusserNum = guesser.getGuesserNum(level);
    }
    //collecting names from players
    public void getPlayersName() {
        System.out.print("Player 1, What is your name? ");
        playerOneName = playerOne.getPlayerName();
        System.out.print("Player 2, What is your name? ");
        playerTwoName = playerTwo.getPlayerName();
        System.out.print("Player 3, What is your name? ");
        playerThreeName = playerThree.getPlayerName();
    }
    //collecting guessed number from players
    public void collectNumFromPlayers(int level) {
        //details of player 1
        System.out.print(playerOneName+", What is your guessed number? ");
        playerOneNum = playerOne.getPlayerNum();
        while(playerOneNum>10*level || playerOneNum<1) {
            System.out.println(playerOneName+" you have guessed a INVALID NUMBER, try again!!");
            System.out.print(playerOneName+" ,What is your valid guessed number? ");
            playerOneNum = playerOne.getPlayerNum();
        }

        //details of player 2
        System.out.print(playerTwoName+", What is your guessed number? ");
        playerTwoNum = playerTwo.getPlayerNum();
        while(playerTwoNum>10*level || playerTwoNum<1) {
            System.out.println(playerTwoName+" you have guessed a INVALID NUMBER, try again!!");
            System.out.print(playerTwoName+", What is your valid guessed number? ");
            playerTwoNum = playerTwo.getPlayerNum();
        }

        //details of player 3
        System.out.print(playerThreeName+", What is your guessed number? ");
        playerThreeNum = playerThree.getPlayerNum();
        while(playerThreeNum>10*level || playerThreeNum<1) {
            System.out.println(playerThreeName+" you have guessed a INVALID NUMBER, try again!!");
            System.out.print(playerThreeName+", What is your valid guessed number? ");
            playerThreeNum = playerThree.getPlayerNum();
        }
        System.out.println();
    }

    public String result() {
        //declaration of winners
        String winnerName = null;
        if(playerOneNum==gusserNum && playerTwoNum!=gusserNum && playerThreeNum!=gusserNum) {
            System.out.println("🏆 "+playerOneName+", you're the winner!");
            winnerName = playerOneName;
        }
        else if(playerOneNum!=gusserNum && playerTwoNum==gusserNum && playerThreeNum!=gusserNum) {
            System.out.println("🏆 "+playerTwoName+", you're the winner!");
            winnerName = playerTwoName;
        }
        else if(playerOneNum!=gusserNum && playerTwoNum!=gusserNum && playerThreeNum==gusserNum) {
            System.out.println("🏆 "+playerThreeName+", you're the winner!");
            winnerName = playerThreeName;
        }
        else if(playerOneNum==gusserNum && playerTwoNum==gusserNum && playerThreeNum==gusserNum) {
            System.out.println("🏆🏆🏆 "+playerOneName+", "+playerTwoName+", "+playerThreeName+", you all guessed it right! Are you mind readers or what? 🤯");
            winnerName = playerOneName+", "+playerTwoName+", "+playerThreeName;
        }
        else if(playerOneNum==gusserNum && playerTwoNum==gusserNum && playerThreeNum!=gusserNum) {
            System.out.println("🏆🏆 "+playerOneName+", "+playerTwoName+", you both guessed it right! Are you mind readers or what? 🤯");
            winnerName = playerOneName+", "+playerTwoName;
        }
        else if(playerOneNum!=gusserNum && playerTwoNum==gusserNum && playerThreeNum==gusserNum) {
            System.out.println("🏆🏆 "+playerTwoName+", "+playerThreeName+", you both guessed it right! Are you mind readers or what? 🤯");
            winnerName = playerTwoName+", "+playerThreeName;
        }
        else if(playerOneNum==gusserNum && playerTwoNum!=gusserNum && playerThreeNum==gusserNum) {
            System.out.println("🏆🏆 "+playerOneName+", "+playerThreeName+", you both guessed it right! Are you mind readers or what? 🤯");
            winnerName = playerOneName+", "+playerThreeName;
        }
        else {
            System.out.println("❌ NO WINNERS THIS TIME! ❌");
            System.out.println("The correct number was "+gusserNum+" Better luck next time!");
        }
        return winnerName;
    }
    public void gameSummary(HashMap<Integer, String> winnerList) { //Method to find the ultimate winner/ print summary
        HashMap<String, Integer> totalScore = new HashMap<>(); //it stores the total score of each player
        if(winnerList.size() != 0) {
            System.out.println("🏆 Congratulations to the Winners of Each Level! 🏆\n");
            System.out.println("Levels"+"  "+"PlayerName");
        }
        for(int level : winnerList.keySet()) {
            String playerName = winnerList.get(level);
            System.out.println(level+"       "+playerName); //prints winner of given level

            //Calculating total score of each player
            String[] players = playerName.split(", ");
            for(int i=0; i<players.length; ++i) {
                if(totalScore.containsKey(players[i])) {
                    int currScore = totalScore.get(players[i]);
                    totalScore.put(players[i], level+currScore);
                }
                else {
                    totalScore.put(players[i], level);
                }
            }
        }
        System.out.println();

        //finding the ultimate winner
        List<String> ultimateWinners = new ArrayList<>();
        int ultimateScore = 0;
        for(String name : totalScore.keySet()) {
            int finalScore = totalScore.get(name);
            if(finalScore > ultimateScore) {
                ultimateWinners.clear();
                ultimateWinners.add(name);
                ultimateScore = finalScore;
            }
            else if(finalScore == ultimateScore) {
                ultimateWinners.add(name);
            }
        }

        //declaring the ultimate winner
        if(!ultimateWinners.isEmpty()) {
            System.out.println("🏅 CONGRATULATIONS! 🏅");
            System.out.println("The Ultimate Winner(s) of the Guesser Game is/are: "+String.join(", ", ultimateWinners)+" 🎉");
            System.out.println("With a total of " + ultimateScore + " points! 🏆");
        }
        else {
            System.out.println("❌ NO ULTIMATE WINNER! ❌");
            System.out.println("Unfortunately, no players scored any points in the Guesser Game. 😔");
        }
        System.out.println();
    }
}

public class GusserGame {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.println("\033c"); // Clears the screen
        HashMap<Integer, String> winnerList = new HashMap<>(); //stores the winner of each level
        Umpire u = new Umpire();
        System.out.println("🎮 LET THE GAME BEGIN! 🚀\n");
        System.out.println("👤 Players, please enter your names:\n");
        u.getPlayersName();
        System.out.println("Press Enter to continue...");
        new Scanner(System.in).nextLine(); // Waits for user to press Enter
        int level = 1;
        while(true) {
            String exitOrPlay = Rule.gameRule(level); //displays the rule
            if(exitOrPlay.equals("exit")){
                break; //players decide to exit the game
            }
            System.out.println("\033c"); // Clears the screen
            u.collectNumFromGusser(level);
            u.collectNumFromPlayers(level);
            String winnerName = u.result();
            if(winnerName != null){ //null means none of theree players guessed the correct number
                winnerList.put(level, winnerName);
                System.out.println("\n🎉 Congrats! You guessed it right and advanced to the NEXT LEVEL! 🚀");
                ++level;
            }
            else{
                System.out.println("\n❌ No one guessed the number correctly. 😔");
                System.out.println("You'll stay on the SAME LEVEL. Give it another try!");
            }
            System.out.println("Press Enter to continue...");
            new Scanner(System.in).nextLine(); // Waits for user to press Enter
        }
        System.out.println("\033c"); // Clears the screen
        u.gameSummary(winnerList); //prints the game summary
        System.out.println("🎉 THANK YOU FOR PLAYING! 🎉");
        System.out.println("Hope you had fun. See you next time! 👋");
    }
}
