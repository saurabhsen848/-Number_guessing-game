class Scorer {
    private final int correctNumber;
    private int attempts = 5;

    public Scorer(int correctNumber) {
        this.correctNumber = correctNumber;
    }

    public boolean checkAnswer(int guess) {
        attempts--;
        return guess == correctNumber;
    }

    public String getHint(int guess) {
        if (guess < correctNumber) {
            return "📉 Too low!";
        } else {
            return "📈 Too high!";
        }
    }

    public boolean isGameOver() {
        return attempts <= 0;
    }
}