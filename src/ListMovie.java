import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ListMovie {

    private final ArrayList <String> listMovies;

    public ListMovie() {
        listMovies = new ArrayList<>();
        File file = new File("movies.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                listMovies.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist.");
        }
    }

    private String getRandomMovie() {
        Random random = new Random();
        int randomIndex = random.nextInt(listMovies.size());
        return listMovies.get(randomIndex);
    }
}
