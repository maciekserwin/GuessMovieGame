public class GuessMovieGame {
    public static void main(String[] args) {

        String filePath = "/home/maciejs/Desktop/PreeWorkProgram/GuessTheMovie/GuessTheMovie/src/movies.txt";
        MovieList movieList = new MovieList(filePath);
        String movie = movieList.getRandomMovie();

        Game game = new Game(movie);

        InputReader inputReader = new InputReader();

        while (!game.isGameOver() && !game.isGameWon()) {
            game.displayGameStatus();
            char guess = inputReader.readGuess();
            game.guessLetter(guess);
        }

        if (game.isGameWon()) {
            System.out.println("Congratulations! You guessed the movie correctly: " + game.getHiddenTitle());
        } else {
            System.out.println("Game over! The movie was: " + movie);
        }
    }
}