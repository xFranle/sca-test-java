package sca;

// Java **no tiene lockfile**: se detecta desde el manifiesto y no hay nada que
// regenerar. Además la versión está en una propiedad `${...}`.
import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
    public static void main(String[] args) {
        System.out.println(new ObjectMapper());
    }
}
