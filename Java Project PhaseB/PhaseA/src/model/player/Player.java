package model.player;

import java.util.ArrayList;

import model.cards.archaeologist;
import model.cards.assistant;
import model.cards.card;
import model.cards.digger;
import model.cards.professor;
import model.tiles.tile;

/**
 * Contains the methods signatures needed for creating a Player for the game.
 * @version 1.0
 * @author Aleksandar - Mladenovic
 */
public class Player {
	private int ID;
	private String name;
	private ArrayList<card> cards;
	private ArrayList<tile> tiles;
	
	/**
     * <b>constructor</b>: Constructs a new Player with the given parameter name and initialize the Cards he hold 
     * and the tiles he poses.<br />
     * <b>postcondition</b>: Creates and initializes a player with the givenname.
     * Also initializes some variables (Cards ArrayList, and Tiles ArrayList)
     * @param name is the name of the player.
     */
	public Player(String name, int ID) {
		this.name = name;
		this.ID = ID;
		this.cards = new ArrayList<card>();
		this.tiles = new ArrayList<tile>();
		addCards(new archaeologist());
		addCards(new assistant());
		addCards(new digger());
		addCards(new professor());
	}
	
	/**
     * <b>Accessor:</b> Returns the Name of the Player has.
     * <Postcondition:</b> The name of the Player.
     * @return the name of the Player.
     */
	public int getID() { return this.ID;}
	/**
     * <b>Accessor:</b> Returns the Name of the Player has.
     * <Postcondition:</b> The name of the Player.
     * @return the name of the Player.
     */
	public String getName() { return this.name;}
	
	/**
     * <b>Transformer:</b> Adds a Card to the Cards that the Player has.
     * <b>Postcondition:</b> A card has been added to the cards.
     * @param c
     */
	private void addCards(card c) {cards.add(c);}
	
	/**
     * <b>Transformer:</b> Adds a Tile to the Tiles that the Player has.
     * <b>Postcondition:</b> A tile has been added to the Tiles.
     * @param t
     */
	public void addTile(tile t) {tiles.add(t);}
	
	/**
     * <b>Accessor:</b> Returns the points that the Player has.
     * <Postcondition:</b> The points of the Player.
     * @return points of the Player.
     */
	public int calculatePoints() { return 1;}
}
