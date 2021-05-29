package battleshipmain;

class Cell {
    public boolean isOccupied = false;
    public boolean isExploded = false;
    public boolean isHighlighted = false;
    
    public void explode(){
        isExploded = true;
    }
    
    public void highlight(){
        isHighlighted = true;
    }
    
    public void unHighlight(){
        isHighlighted = false;
    }
}
