package model.turn;

import java.util.ArrayList;

import model.player.Player;

/**
 * This class represents the turn of the game.
 * @version 1.0
 * @author Aleksandar - Mladenovic
 */
public class Turn {
	private ArrayList<Player> players;
	private int currentID;
    
    
    /**  Constructor.
     * <b>Precondition</b>players!=null and must have 4 players
     * <b>Postcondition</b>Creates a new instance of Turn with currentID=0,num=4, round_players=4, last_player=0,
     * Also the players array has been initialized with the players.
     * 
     * @param ArrayList players
     */
    public Turn(ArrayList <Player> players) {
    	this.players = players;
    	currentID=0;
    }
    
    /**
     * <b>Transformer:</b> Change currentID to the next player 
     * <b>Postcondition:</b> The next player has his turn.
     * @return Player
     */
    public Player nextPlayer() { return null; }
    
    /**
     * <b>Accessor:</b> Returns the current player ID.
     * <Postcondition:</b> The ID of the current player that has turn has been returned.
     * @return ID of a Player
     */
    public int getID(){return this.currentID;}
    
}
