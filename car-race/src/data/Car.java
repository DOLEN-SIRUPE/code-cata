package data;

public class Car {
    private int goCount = 0;
    
    public void go() {
        this.goCount++;
    }
    
    public int getGoCount() {
        return goCount;
    }
}
