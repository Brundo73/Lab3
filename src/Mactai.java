public class Mactai extends Person implements Translator{
    public Mactai() {
        super("Мактай");
    }
    @Override
    public void translate(String lang) {
        System.out.println(this.getName() + " перевел на " + lang);
    }
}
