import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Gtictactoe {

    static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
    static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();
    public static void main(String[] args) {
        char [][] gameBoard = {{' ' , '|' , ' ' , '|' , ' '} , 
                               {'-' , '+' , '-' , '+' , '-'} , 
                               {' ' , '|' , ' ' , '|' , ' '} , 
                               {'-' , '+' , '-' , '+' , '-'} ,
                               {' ' , '|' , ' ' , '|' , ' '}};
                            printGameBoard(gameBoard);

        while(true) {
            Scanner poo = new Scanner(System.in);
            System.out.println("enter placement please (1-9):");
            int playerPos = poo.nextInt();
            while(playerPositions.contains(playerPos) || cpuPositions.contains(playerPos)) {
                System.out.println("position is taken. re-enter");
                playerPos = poo.nextInt();
            }
                    placePiece(gameBoard , playerPos , "player");

                String result = checkWinner();
                    if (result.length() > 0) {
                        printGameBoard(gameBoard);
                        System.out.println(result);
                        break;
                    }

            Random pee = new Random();
            int cpuPos = pee.nextInt(9) + 1;
            while(playerPositions.contains(cpuPos) || cpuPositions.contains(cpuPos)) {
                cpuPos = pee.nextInt(9)+ 1;
            }
                    placePiece(gameBoard, cpuPos, "cpu");

            result = checkWinner();
                if (result.length() > 0) {
                    printGameBoard(gameBoard);
                    System.out.println(result);
                    break;
                }
        printGameBoard(gameBoard);
        
        }
    }   

// methods

    public static void printGameBoard (char[][] gameBoard) {
        for(char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }   
    }

    public static void placePiece (char[][] gameBoard , int pos , String user) {
        char symbol = ' ';

        if(user.equals("player")) {
            symbol = 'X';
            playerPositions.add(pos);
        }
        else if(user.equals("cpu")) {
            symbol = '0';
            cpuPositions.add(pos);
        }
            switch(pos) {
                case 1:
                    gameBoard [0][0] = symbol;
                    break;
                case 2:
                    gameBoard [0][2] = symbol;
                    break;
                case 3:
                    gameBoard [0][4] = symbol;
                    break;
                case 4:
                    gameBoard [2][0] = symbol;
                    break;
                case 5:
                    gameBoard [2][2] = symbol;
                    break;
                case 6:
                    gameBoard [2][4] = symbol;
                    break;
                case 7:
                    gameBoard [4][0] = symbol;
                    break;
                case 8:
                    gameBoard [4][2] = symbol;
                    break;
                case 9:
                    gameBoard [4][4] = symbol;
                    break;
                   default:
                    break;
            }
    } 

    public static String checkWinner() {
        List toprow = Arrays.asList(1,2,3);
        List midrow = Arrays.asList(4,5,6);
        List botrow = Arrays.asList(7,8,9);
        List leftcol = Arrays.asList(1,4,7);
        List midcol = Arrays.asList(2,5,8);
        List rightcol = Arrays.asList(3,6,9);
        List cross1 = Arrays.asList(1,5,9);
        List cross2 = Arrays.asList(7,5,3);

        List<List> winning = new ArrayList<List>();

            winning.add(toprow);
            winning.add(midrow);
            winning.add(botrow);
            winning.add(leftcol);
            winning.add(midcol);
            winning.add(rightcol);
            winning.add(cross1);
            winning.add(cross2);

        for (List l : winning) {
            if(playerPositions.containsAll(l)) {
                return "Congrats player wins :)";
            }   
            else if(cpuPositions.containsAll(l)) {
                return "Looks like CPU won... sorry :(";
            }
            else if(playerPositions.size() + cpuPositions.size() == 9) {
                return "TIE!!";
            }
        }

        return "";

    }
}
