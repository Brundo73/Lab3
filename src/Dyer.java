public class Dyer extends Person {
    public Dyer() {
        super("Дайер");
    }
    public void congrat(Person recipient, String reason) {
        System.out.println(this.getName() + " поздравил " + recipient.getName() + " c " + reason);
    }
    public void feel(String feelings) {
        System.out.println(this.getName() + " испытывает " +  feelings);
    }

}
