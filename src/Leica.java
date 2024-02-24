public class Leica extends Person implements Radioman {
    public Leica() {
        super("Лейк");
    }

    public void autopsyPrep(String specimen) {
        System.out.println(this.getName() + " подготовил к вскрытию " + specimen);
    }

    @Override
    public void send(Gainers gainer) {
        switch (gainer) {
            case LEICA -> System.out.println(this.getName() + " отправил сообщение Лейке");
            case ARKHEM -> System.out.println(this.getName() + " отправил сообщение 'Аркхему'");
            case BIGWORLD -> System.out.println(this.getName() + " отправил сообщение остальному миру");
        }
    }




}
