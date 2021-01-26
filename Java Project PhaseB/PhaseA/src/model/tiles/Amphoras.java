package model.tiles;

/**
 * Create an Amphoras with the specific Color that it has
 * @version 1.0
 * @author Aleksandar - Mladenovic
 */
public class Amphoras implements tile{
	private tileColor col;
	
	/**
     * Constructor.
     * 
     * <b>Postcondition</b>Creates a new Amphoras Tile with 'col' col.
     *
     * @param type
     */
	public Amphoras(tileColor col) {this.col = col;}
	
	/**
     * <b>Accessor:</b> Returns the Color of the Amphoras.
     * <Postcondition:</b> The Color of the Amphoras has been returned.
     * @return Color of the Amphoras
     */
	public tileColor getColor() {return this.col;}
}
