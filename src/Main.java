import java.util.ArrayList;

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
        BigWorldRadio worldRadio = new BigWorldRadio();

        Dyer.feel("чувства, которые тяжело описать словами");
        Pebody.feel("чувства, которые тяжело описать словами");
        arkhemStaff.rejoice();
        Leic.send(radioArkhem);
        Mactai.translate("английский");
        radioArkhem.send(Leic);
        Dyer.congrat(Leic, "находками");
        Sherman.congrat(Leic, "находками");
        Douglas.congrat(Leic, "находками");
        Dyer.say("находках");
        radioArkhem.send(worldRadio);
        Leic.say("доставке экземпляров в лагерь");
        Leic.send(radioArkhem);
        Leic.say("ухудшение погоды в горах");
        Leic.send(radioArkhem);
        Dyer.feel("разочарование");
        dogs.transport(new String[]{"9 человек", "14 находок"});
        campStaff.build("укрытие из снега");
        Leic.say("перевозке находок в лагерь");
        Leic.send(radioArkhem);
        Dyer.feel("жгучий интерес");
        campStaff.place("на плотном снегу рядом с палатками", "Все экземпляры, кроме одного,");
        Leic.autopsyPrep("один из экземплеров");
    }
}