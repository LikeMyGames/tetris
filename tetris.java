import pkg.TetrisUtils;

public class tetris{
    public static void main(String[] args){
        String[][] board = TetrisUtils.generateGrid();
        printBoard(board);
    }

    public static void printBoard(String[][] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}