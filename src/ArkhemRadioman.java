public class ArkhemRadioman extends Person implements Radioman {
    public ArkhemRadioman() {super("Радист с Аркхема");}
    @Override
    public void send(Gainers gainer) {
        switch (gainer) {
            case LEICA -> System.out.println(this.getName() + " отправил сообщение Лейке");
            case ARKHEM -> System.out.println(this.getName() + " отправил сообщение 'Аркхему'");
            case BIGWORLD -> System.out.println(this.getName() + " отправил сообщение остальному миру");
        }
    }
}
