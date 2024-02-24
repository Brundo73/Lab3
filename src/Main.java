public class Main {
    public static void main(String[] args) {
        ArkhemStaff arkhemStaff = new ArkhemStaff();
        Dyer Dyer = new Dyer();
        Leica Leic = new Leica();
        Mactai Mactai = new Mactai();
        ArkhemRadioman radioArkhem = new ArkhemRadioman();
        Pebody Pebody = new Pebody();
        Sherman Sherman = new Sherman();
        Douglas Douglas = new Douglas();
        DogSled dogs = new DogSled();
        CampStaff campStaff = new CampStaff();

        Dyer.feel("чувства, которые тяжело описать словами");
        Pebody.feel("чувства, которые тяжело описать словами");
        arkhemStaff.rejoice();
        Leic.send(Gainers.ARKHEM);
        Mactai.translate("английский");
        radioArkhem.send(Gainers.LEICA);
        Dyer.congrat(Leic, "находками");
        Sherman.congrat(Leic, "находками");
        Douglas.congrat(Leic, "находками");
        Dyer.say("находках");
        radioArkhem.send(Gainers.BIGWORLD);
        Leic.say("доставке экземпляров в лагерь");
        Leic.send(Gainers.ARKHEM);
        Leic.say("ухудшение погоды в горах");
        Leic.send(Gainers.ARKHEM);
        Dyer.feel("разочарование");
        dogs.transport(new String[]{"9 человек", "14 находок"});
        campStaff.build("укрытие из снега");
        Leic.say("перевозке находок в лагерь");
        Leic.send(Gainers.ARKHEM);
        Dyer.feel("жгучий интерес");
        campStaff.place("на плотном снегу рядом с палатками", "Все экземпляры, кроме одного,");
        Leic.autopsyPrep("один из экземплеров");

    }
}