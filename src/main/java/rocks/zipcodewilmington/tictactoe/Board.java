package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character[][] board;
    public Board(Character[][] matrix) {
        this.board = matrix;
    }

    public Boolean isInFavorOfX() {

        return winningChoices('X');
    }

    public Boolean isInFavorOfO() {
        return winningChoices('O');
    }

    public Boolean isTie() {
        if(!isInFavorOfX() && !isInFavorOfO()){
            return true;
        }
            return false;

    }

    public String getWinner() {
        if(isInFavorOfX()){
            return "X";
        }
        else if(isInFavorOfO()){
            return "O";
        }
        else{
            return "";
        }
    }
    public Boolean winningChoices(Character selection){
        if(selection.equals(board[0][0]) && board[0][1].equals(board[0][2]) && board[0][1].equals(board[0][0])){
            return true;
        }
        else if(selection.equals(board[1][0]) && board[1][1].equals(board[1][2]) && board[1][1].equals(board[1][0])){
            return true;
        }
        else if(selection.equals(board[2][0]) && board[2][1].equals(board[2][2]) && board[2][1].equals(board[2][0])){
            return true;
        }
        else if(selection.equals(board[0][0]) && board[1][0].equals(board[2][0]) && board[1][0].equals(board[0][0])){
            return true;
        }
        else if(selection.equals(board[0][1]) && board[1][1].equals(board[2][1]) && board[1][1].equals(board[0][1])){
            return true;
        }
        else if(selection.equals(board[0][2]) && board[1][2].equals(board[2][2]) && board[1][2].equals(board[0][2])){
            return true;
        }
        else if(selection.equals(board[0][0]) && board[1][1].equals(board[2][2]) && board[1][1].equals(board[0][0])){
            return true;
        }
        else if(selection.equals(board[2][0]) && board[1][1].equals(board[0][2]) && board[1][1].equals(board[2][0])){
            return true;
        }
        else {
            return false;
        }

    }

}
