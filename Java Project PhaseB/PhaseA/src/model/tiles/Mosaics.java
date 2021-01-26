package model.tiles;


/**
 * Create a Mosaics with the specific color that it has
 * @version 1.0
 * @author Aleksandar - Mladenovic
 */
public class Mosaics implements tile{
	private tileColor col;
	
	/**
     * Constructor.
     * 
     * <b>Postcondition</b>Creates a new Mosaic Tile with 'col' col.
     *
     * @param col
     */
	public Mosaics(tileColor col) {this.col = col;}
	
	/**
     * <b>Accessor:</b> Returns the Color of the Amphoras.
     * <Postcondition:</b> The Color of the Amphoras has been returned.
     * @return Color of the Amphoras
     */
	public tileColor getColor() {return this.col;}
}
