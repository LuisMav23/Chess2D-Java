package renderer;

import java.awt.Dimension;
import javax.swing.JFrame;

public class MainWindowGUI{
    public static JFrame window = new JFrame();

    public static void Render() {
        Board board = new Board();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("Chess 2D");
        window.setSize(new Dimension(Board.BORDER_WIDTH + 15, Board.BORDER_HEIGHT + 37));
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        System.out.println(board.BoardSquare[1][1].piece.getImage());
    } 
}

