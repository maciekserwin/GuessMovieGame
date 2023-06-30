import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MovieList {

    private List<String> movies;

    public MovieList(String filePath) {
        movies = new ArrayList<>();
        readMoviesFromFile(filePath);
    }

    private void readMoviesFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                movies.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading the movie file: " + e.getMessage());
        }
    }

    public String getRandomMovie() {
        Random random = new Random();
        int randomIndex = random.nextInt(movies.size());
        return movies.get(randomIndex);
    }
}
