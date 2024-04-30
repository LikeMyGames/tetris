import pkg.TetrisUtils;

import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class tetris{
    public static String[][] board;
    public static char input;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("please input the number of frames per seconds you want the game to run at (10-60 recommended)");
        double delay = 1.0/sc.nextDouble();

        JFrame frame = new JFrame("Key Listener Example");
        JTextField textField = new JTextField();

        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                input = e.getKeyChar();
                // Handle the key press (e.g., update UI or perform an action)
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // Not used in this example
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // Not used in this example
            }
        });

        frame.add(textField);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        board = TetrisUtils.generateGrid();
        TetrisUtils.printBoard(board);
        //TetrisUtils.step(board);

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                // Your code here (what you want to execute)
                step();
            }
        }, 0, (long)(delay * 1000));
        sc.close();
    }

    public static void step(){
        




        TetrisUtils.step(board, input);
        input = ' ';
    }

    public static void moveBlock(){
        System.out.println(input);
    }
}