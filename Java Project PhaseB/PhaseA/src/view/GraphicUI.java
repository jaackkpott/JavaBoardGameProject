package view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.player.Player;

/**
 * In this class we handle the GUI
 * @version 1.0
 * @author Aleksandar - Mladenovic
 */
public class GraphicUI {
	private Image image;
    private JButton NextTurnButton;
    private JButton PlayButton,newGame,Exit,HundButton;
    private myDesktopPane basic_panel;
    private JDesktopPane board;
    private JPanel jPanel1;
    private JTextField jTextField1;
    private URL imageURL;
    private ClassLoader cldr;  
	
	/**
	 * Constructor
	 * <b>constructor</b>: Creates a new Window and initializes the Areas of the tiles on the board<br />
	 * <b>postconditions</b>: Creates a new Window and initializes the Areas of the tiles on the board and starting a new game.
	 */
    public GraphicUI() {}
    
    /**
	 * <b>transformer(mutative)</b>:initializes some buttons and labels <br />
	 * <p><b>Postcondition:</b> initializes some buttons and labels </p>
	 *
     */
    private void initComponents() {}
    
    /**
	 * <b>transformer(mutative)</b>:add 4 tiles to the board from the bag<br />
	 * <p><b>Postcondition:</b> add 4 tiles to the board from the bag </p>
	 *
     */
    public void nextTurn(){}
    
    /**
     * <b>transformer(mutative)</b>: changes the player area to a next player
     * <p><b>Postcondition:</b> change the info of the player area to a new player</p>
     */ 
    public void changePlayer(Player p){}
}
/* a class which is used for doing some action after a tile have been press on the board*/  
private class TileListener implements ActionListener{}

/* a class which is used for doing some action after a Card have been press on the board*/  
private class CardListener implements ActionListener{}

/* a class which is used for putting a background image*/  
public class myDesktopPane extends JDesktopPane{}

/* a class which is used for doing some action after play button has been pushed */
private class PlayListener implements ActionListener {}



