package renderer;

import java.awt.Color;
import javax.swing.JPanel;

public class Square extends JPanel {
    public int file;
    public int rank;
    public int xPos;
    public int yPos;
    public Color color;
    public Piece piece = null;

    public Square (Piece _piece,int _xPos, int _yPos, int _file, int _rank) {
        xPos = _xPos;
        yPos = _yPos;
        file = _file;
        rank = _rank;
        this.setBounds(xPos, yPos, Board.TILE_SIZE, Board.TILE_SIZE);
        this.setDoubleBuffered(true);
        setColor(file, rank);
        setPiece(_piece);
        this.add(this.piece.getImage());
    }

    //sets the color of the square based on its file and rank
    private void setColor(int file, int rank){
        if (file % 2 == 0){
            if (rank % 2 ==0){
                color = Color.decode("#efdcbc");
            }
            else if (rank % 2 != 0){
                color = Color.decode("#4e4330");
            }
        }

        else if (file % 2 != 0){
            if (rank % 2 ==0){
                color = Color.decode("#4e4330");
            }
            else if (rank % 2 != 0){
                color = Color.decode("#efdcbc");
            }
        }
        this.setBackground(color);
    }

    public Color getColor() {
        return color;
    }

    public void setPiece(Piece _Piece) {
        this.piece = _Piece;
    }
}
