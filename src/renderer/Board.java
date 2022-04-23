package renderer;

public class Board {
    public Piece p = new Piece('D', 'p');
    public static final int DEFAULT_TILE_SIZE = 16; //16x16 tiles
    public static final int TILE_SIZE_MULTIPLIER = 5; //scale multiplier
    public static final int TILE_SIZE = DEFAULT_TILE_SIZE * TILE_SIZE_MULTIPLIER; //Tile Size
    public static final int RANKS = 8; //number of RANKS
    public static final int FILES = 8; // number of RANKS
    public static final int BORDER_HEIGHT = TILE_SIZE * RANKS;
    public static final int BORDER_WIDTH = TILE_SIZE * FILES;
    
    //Initialize Board Squares Panel Array 
    public Square[][] BoardSquare = new Square[RANKS][FILES];
    
    public Board() {
        GenerateBoard();
        RenderBoard();
    }

    //Generates each square panel
    public void GenerateBoard() {
        int xPos = 0;
        int yPos = 0;
        for (int i = 0; i < FILES; i++) {
            xPos = 0;
            for (int j = 0; j < RANKS; j++) {
                BoardSquare[i][j] = new Square(p, xPos, yPos, i, j);   
                xPos += TILE_SIZE;
            }
            yPos += TILE_SIZE;
        }
    }

    public void RenderBoard() {
        for (int i = 0; i < FILES; i++) {
            for(int j = 0; j < RANKS; j++) {
                MainWindowGUI.window.add(BoardSquare[i][j]);
            }
        }
    }    
}

