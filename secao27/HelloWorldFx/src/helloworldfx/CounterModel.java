package helloworldfx;

public class CounterModel {
    
    private int count;

    public int getCount() {
        return count;
    }

    public void increment() {
        count++;
    }

    public void reset() {
        count = 0;
    }

}
