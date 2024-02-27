public class Pebody extends Person{
    public Pebody() {
        super("Пэбоди");
    }
    public void feel(String feelings) {
        System.out.println(this.getName() + " испытывает " +  feelings);
    }
    @Override
    public void say(String theme) {
        System.out.println(this.getName() + " сказала о " + theme);
    }
}
