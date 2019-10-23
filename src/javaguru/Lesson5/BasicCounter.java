package javaguru.Lesson5;

public class BasicCounter {

    private int counterValue;

    public void increment() {
        counterValue++;
    }

    public void decrement() {
        counterValue--;
    }

    public void clear() {
        counterValue = 0;
    }

    public int getValue() {
        return counterValue;
    }

    public void setValue(int counterValue) {
        this.counterValue = counterValue > 0 ? counterValue : 0;

        // if (counterValue > 0){
        //   this.counterValue = counterValue;
        // } else{
        //   this.counterValue = 0;
        // }

    }
}
