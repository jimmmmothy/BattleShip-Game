package battleshipmain;

class Cell {
    public boolean isOccupied = false;
    public boolean isExploded = false;
    
    public void explode(){
        isExploded = true;
    }
}
