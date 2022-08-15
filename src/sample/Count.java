package sample;

public class Count {
    int count;

    public Count(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void increase() {
        this.count ++;
    }

    public void decrease() {
        while (this.count > 0) {
            this.count --;
        }
    }
}
