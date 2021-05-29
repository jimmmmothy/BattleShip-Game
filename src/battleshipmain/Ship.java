package battleshipmain;

public class Ship {
    public int length;
    public boolean isVertical = true;
    
    private int health;
    
    public Ship(int length, boolean isVertical){
        this.length = length;
        this.isVertical = isVertical;
        
        health = length;
    }
    
    public void hit(){
        health--;
    }
    
    public boolean isAlive(){
        return health > 0;
    }
}
