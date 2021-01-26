package model.tiles;

import java.util.ArrayList;


/**
 * This class creates a new Bag with a Collection of tiles.
 * @version 1.0
 * @author Aleksandar - Mladenovic
 */
public class bag {
	private ArrayList<tile> tiles;
	
	/**Constructor.
     * 
     * <b>Postcondition</b>Creates a new Bag with a new tiles ArrayList.
     *
     */
    public bag(){
    	this.tiles = new ArrayList<tile>();
    	this.init_tiles();
    }
    
    /**
     * <b>Transformer:</b> Initializes the 135 tiles.
     * <b>Postcondition:</b> The tiles have been initialised in the bag and ready to get pulled.
     */
    private void init_tiles(){
    	//Add Mosaics
    	for(int i=0;i<9;i++) {
    		tiles.add(new Mosaics(tileColor.GREEN));
    	}
    	for(int i=0;i<9;i++) {
    		tiles.add(new Mosaics(tileColor.RED));
    	}
    	for(int i=0;i<9;i++) {
    		tiles.add(new Mosaics(tileColor.YELLOW));
    	}
    	
    	//Add MarbleStatues
    	for(int i=0;i<12;i++) {
    		tiles.add(new MarbleStatues(marbleTypes.Caryatids));
    	}
    	for(int i=0;i<12;i++) {
    		tiles.add(new MarbleStatues(marbleTypes.Sphinxes));
    	}
    	
    	//Add Amphoras
    	for(int i=0;i<5;i++) {
    		tiles.add(new Amphoras(tileColor.BLUE));
    	}
    	for(int i=0;i<5;i++) {
    		tiles.add(new Amphoras(tileColor.BROWN));
    	}
    	for(int i=0;i<5;i++) {
    		tiles.add(new Amphoras(tileColor.RED));
    	}
    	for(int i=0;i<5;i++) {
    		tiles.add(new Amphoras(tileColor.GREEN));
    	}
    	for(int i=0;i<5;i++) {
    		tiles.add(new Amphoras(tileColor.YELLOW));
    	}
    	for(int i=0;i<5;i++) {
    		tiles.add(new Amphoras(tileColor.PURPLE));
    	}
    	
    	//Add Landslides
    	for(int i=0;i<24;i++) {
    		tiles.add(new Landslides());
    	}
    	
    	//Add Skeletons
    	for(int i=0;i<10;i++) {
    		tiles.add(new Skeletons(skeletonParts.UPBIG));
    	}
    	for(int i=0;i<10;i++) {
    		tiles.add(new Skeletons(skeletonParts.DOWNBIG));
    	}
    	for(int i=0;i<5;i++) {
    		tiles.add(new Skeletons(skeletonParts.UPSMALL));
    	}
    	for(int i=0;i<5;i++) {
    		tiles.add(new Skeletons(skeletonParts.DOWNSMALL));
    	}
    }
    
    /**
     * <b>Observer:</b> Returns true if this list is empty.
     * <b>Postcondition:</b> Returns true if this list contains no elements.
     * @return true if this list contains no elements
     */
    public boolean isEmpty(){return false;}
    
    /**
     * <b>Transformer:</b> Adds a tile to the list.
     * <b>Postcondition:</b> A tile has been added to the list.
     * @param i
     */
    public void addTile(tile i){  }
    
    /**
     * <b>Transformer:</b> Removes a tile from the end of the list.
     * <b>Postcondition:</b> A tile has been removed from the of end of the list.
     * @return the last tile of the bag
     */
    public void removeTile(){}
	
    /**
     * <b>Accessor:</b> Returns the size of a list.
     * <Postcondition:</b> The size of the list has been returned.
     * @return size of the list
     */
    public int size(){return tiles.size();}
	
    /**
     * <b>Transformer:</b> Clears an ArrayList 
     * <b>Postcondition:</b> An ArrayList is cleared.
     */
     public void clearAll(){}
     
     /**
      * <b>Accessor:</b> returns the 4 tiles in the end
      * <b>Postcondition:</b> the 4 tile in the end has been returned
      * @return the 4 tiles in the end has been returned
      * */
     public ArrayList<tile> return4Tiles() { return tiles;}
     
     /**
      * <b>Transformer:</b> Remove 4 tiles from the end of the bag 
      * <b>Postcondition:</b> 4 tiles from the bag have been removed.
      */
      public void remove4Tiles(){}
      
      /**
       * <b>Transformer:</b> Randomizes the tiles in the bag
       * <b>Postcondition:</b> The content in the bag have been randomized
       */
      public void ranmdoizeBag() {}
}
