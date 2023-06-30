public class Game {
    private String movie;
    private StringBuilder hiddenTitle;
    private StringBuilder wrongGuesses;
    private int wrongGuessCount;

    public void guessLetter(char letter) {
        letter = Character.toLowerCase(letter);
        boolean correctGuess = false;
        for (int i = 0; i < movie.length(); i++) {
            char c = movie.charAt(i);
            if (Character.toLowerCase(c) == letter) {
                hiddenTitle.setCharAt(i, c);
                correctGuess = true;
            }
            if (!correctGuess) {
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
