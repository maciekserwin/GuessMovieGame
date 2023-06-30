import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ListMovie {

    private ArrayList <String> listMovies;

    private void ReadAllMoviesFromFile(String pathname) {
        listMovies = new ArrayList();
        File file = new File(pathname);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                listMovies.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist.");
        }
    }

}
