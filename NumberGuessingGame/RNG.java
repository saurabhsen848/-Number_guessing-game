import java.util.Random;

class RNG {
    private final int number;

    public RNG() {
        this.number = generateNumber();
    }

    public int generateNumber() {
        return new Random().nextInt(100) + 1;
    }

    public int getNumber() {
        return number;
    }
}