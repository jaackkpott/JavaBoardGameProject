package controller;

import java.util.ArrayList;

import model.board.board;
import model.player.Player;
import model.tiles.bag;
import model.turn.Turn;

/**
 * Controller is the master of the game and controls all of the operations executed.
 * Also it connects the Model and View of the MVC model.
 * @version 1.0
 * @author Aleksandar - Mladenovic
 */
public class Controller {
	private ArrayList <Player> players;
	bag b;
	board GameBoard;
	private Turn turn;
	
	/**Constructor.
     * 
     * <b>Postcondition</b>Creates the players, the bag, the board and also an instance of the turn function 
     *
     */
	public Controller() {
        ArrayList <Player> players = new ArrayList<Player>();
        players.add(new Player("p1", 0));
        players.add(new Player("p2", 1));
        players.add(new Player("p3", 2));
        players.add(new Player("p4", 3));
        this.b = new bag();
        this.GameBoard = new board();
        turn = new Turn(players);
        
	}
	
	/**
     * <b>transformer(mutative)</b>: give the turn to the next player makes Model and View Changes
     * <p><b>Postcondition:</b> give the turn to the next player player</p>
     */ 
    public void next_Turn(){}
	
    
	/**
     * <b>accessor(selector)</b>:Returns which player has the turn <br />
     * 
     * <p><b>Postcondition:</b> Returns which player has the turn </p>
     *
     * @return which player has the turn (for example 0 if p1 has the turn )
     */
    public int seeTurn(){return turn.getID();}
	
    /**
     * <b>Observer</b>:Return true if a game has finished, false otherwise
     * <p><b>Postcondition:</b> return true if a game has finished, false otherwise
     * </p>
     * @return true if a game has finished, if 16 Landslides are in the Entries Area false otherwise
     */
     public boolean game_has_finished(){return false;}
	
}
