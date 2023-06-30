public class Game {
    private String movie;
    private StringBuilder hiddenTitle;
    private StringBuilder wrongGuesses;
    private int wrongGuessCount;

    public Game(String movie) {
        this.movie = movie.toLowerCase();
        hiddenTitle = new StringBuilder(movie.length());
        wrongGuesses = new StringBuilder();
        wrongGuessCount = 0;
        initializeHiddenTitle();
    }

    public String getHiddenTitle() {
        return hiddenTitle.toString();
    }

    private void initializeHiddenTitle() {
        for (int i = 0; i < movie.length(); i++) {
            char c = movie.charAt(i);
            if (Character.isLetter(c)) {
                hiddenTitle.append('_');
            } else {
                hiddenTitle.append(c);
            }
        }
    }

    public void guessLetter(char letter) {
        letter = Character.toLowerCase(letter);
        boolean correctGuess = false;
        for (int i = 0; i < movie.length(); i++) {
            char c = movie.charAt(i);
            if (Character.toLowerCase(c) == Character.toLowerCase(letter)) {
                hiddenTitle.setCharAt(i, c);
                correctGuess = true;
            }
        }
        if (!correctGuess) {
            if (wrongGuesses.indexOf(Character.toString(letter)) == -1) {
                wrongGuesses.append(letter);
                wrongGuessCount++;
            }
        }
    }

    public boolean isGameOver() {
        return wrongGuessCount >= 10;
    }

    public boolean isGameWon() {
        return !hiddenTitle.toString().contains("_");
    }

    public void displayGameStatus() {
        System.out.println("Movie: " + hiddenTitle.toString());
        System.out.println("Wrong guesses: " + wrongGuesses.toString());
        System.out.println("Wrong guess count: " + wrongGuessCount);
    }

}
