public class GuessMovieGame {
    public static void main(String[] args) {

        String filePath = "/home/maciejs/Desktop/PreeWorkProgram/GuessTheMovie/GuessTheMovie/src/movies.txt";
        MovieList movieList = new MovieList(filePath);
        String movie = movieList.getRandomMovie();

        Game game = new Game(movie);

        InputReader inputReader = new InputReader();

        Game.displayGameStatus(movie, game, inputReader);
    }
}