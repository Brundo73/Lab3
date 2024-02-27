import java.util.Arrays;

public class DogSled extends Transport{
    public DogSled() {
        super(SpeedDegree.MIDDLE);
    }

    @Override
    public void transport(String[] pass) {
        System.out.println("Собачья упряжка" + speedDegree.getDescription() + "перевезла " + Arrays.toString(pass).replace("[", "").replace("]", ""));
    }
}
