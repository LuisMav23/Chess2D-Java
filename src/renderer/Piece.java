package renderer;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;


public class Piece extends JComponent{
    char type;
    char color;
    BufferedImage img;
    JLabel imgLabel;
    
    public Piece( char _color, char _type) {
        color = _color;
        type = _type;
        this.setVisible(true);
        setImage();
        imgLabel = new JLabel(new ImageIcon(img));
        imgLabel.setVisible(true);
    }

    private void setImage(){
        try{
            switch(this.color){
                case 'D':
                    switch(this.type){
                        case 'b': img = ImageIO.read(new File("src\\Pieces\\Chess_Db.png"));break;
                        case 'k': img = ImageIO.read(new File("src\\Pieces\\Chess_Dk.png"));break;
                        case 'n': img = ImageIO.read(new File("src\\Pieces\\Chess_Dn.png"));break;
                        case 'p': img = ImageIO.read(new File("src\\Pieces\\Chess_Dp.png"));break;
                        case 'q': img = ImageIO.read(new File("src\\Pieces\\Chess_Dq.png"));break;
                        case 'r': img = ImageIO.read(new File("src\\Pieces\\Chess_Dr.png"));break;
                    }
                    break;
                case 'L':
                    switch(this.type){
                        case 'b': img = ImageIO.read(new File("src\\Pieces\\Chess_Lb.png"));break;
                        case 'k': img = ImageIO.read(new File("src\\Pieces\\Chess_Lk.png"));break;
                        case 'n': img = ImageIO.read(new File("src\\Pieces\\Chess_Ln.png"));break;
                        case 'p': img = ImageIO.read(new File("src\\Pieces\\Chess_Lp.png"));break;
                        case 'q': img = ImageIO.read(new File("src\\Pieces\\Chess_Lq.png"));break;
                        case 'r': img = ImageIO.read(new File("src\\Pieces\\Chess_Lr.png"));break;
                    }
                    break;
            }
        }
        catch(IOException e){
            System.out.print(e);
        }
    }

    public JLabel getImage(){
        return this.imgLabel;
    }
}