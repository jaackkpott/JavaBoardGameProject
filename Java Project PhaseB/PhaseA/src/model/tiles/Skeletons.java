package model.tiles;

/**
 * Create a Skeleton and specify the part 
 * @version 1.0
 * @author Aleksandar - Mladenovic
 */
public class Skeletons implements tile{
	private skeletonParts part;

	/**
     * Constructor.
     * 
     * <b>Postcondition</b>Creates a new Skeleton Tile with 'part' part.
     *
     * @param part
     */
	public Skeletons(skeletonParts part) {
		this.part = part;
	}
	
	/**
     * <b>Accessor:</b> Returns the part of the Skeletons.
     * <Postcondition:</b> The part of the Skeletons has been returned.
     * @return part of the Skeletons
     */
	public skeletonParts getPart() {return this.part;}
}
