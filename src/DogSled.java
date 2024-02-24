import java.util.Arrays;

public class DogSled {
    public DogSled() {}
    public void transport(String[] pass) {
        System.out.println("Собачья упряжка перевезла " + Arrays.toString(pass).replace("[", "").replace("]", ""));
    }
}
