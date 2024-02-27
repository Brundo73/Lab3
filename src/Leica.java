public class Leica extends Person implements Radioman {
    public Leica() {
        super("Лейк");
    }

    public void autopsyPrep(String specimen) {
        System.out.println(this.getName() + " подготовил к вскрытию " + specimen);
    }


    @Override
    public void send(Radioman gainer) {
        System.out.println(this.getName()+ " отправил сообщение. " + gainer.getAnswer());
        gainer.gain();
    }

    @Override
    public void gain() {
        System.out.println(this.getName() + " получил сообщение");
    }
    @Override
    public String getAnswer() {
        return "Получатель: " + this.getName();
    }
}
