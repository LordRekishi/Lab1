package se.iths.java21.patrik.lab1.tools;

public class ValueLookup {
    private int largest;
    private int secondLargest;
    private int smallest;
    private int secondSmallest;

    public ValueLookup(int[] array) {
        largest = array[0];
        secondLargest = array[0];
        smallest = array[0];
        secondSmallest = array[0];

        for (int value : array) {
            if (secondSmallest == smallest)
                secondSmallest = value;

            if (secondLargest == largest)
                secondLargest = value;

            if (secondSmallest > smallest && value < secondSmallest){
                secondSmallest = value;
            }
            if (secondLargest < largest && value > secondLargest) {
                secondLargest = value;
            }

            if (largest < value) {
                secondLargest = largest;
                largest = value;
            }
            if (smallest > value) {
                secondSmallest = smallest;
                smallest = value;
            }
        }
    }

    public int getLargest() {
        return largest;
    }

    public void setLargest(int largest) {
        this.largest = largest;
    }

    public int getSecondLargest() {
        return secondLargest;
    }

    public void setSecondLargest(int secondLargest) {
        this.secondLargest = secondLargest;
    }

    public int getSmallest() {
        return smallest;
    }

    public void setSmallest(int smallest) {
        this.smallest = smallest;
    }

    public int getSecondSmallest() {
        return secondSmallest;
    }

    public void setSecondSmallest(int secondSmallest) {
        this.secondSmallest = secondSmallest;
    }
}
