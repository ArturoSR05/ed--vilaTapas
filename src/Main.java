import tapas.domain.Tapa;
import tapas.presentation.MainTapas;

public class Main {

    public static void main(String[] args) {
        MainTapas.printTapas();
        Tapa tapa1= new Tapa(
                "Gredos",
                "Bar Mas",
                "43",
                "80",
                "90",
                "85",
                "harina, jamon, queso y huevo"
        );
        MainTapas.createTapa(tapa1);

        Tapa tapaToModify = new Tapa(
                "Sauna",
                "Bar Mas",
                "45",
                "80",
                "95",
                "90",
                "patata, huevo, jamon y sal"
        );
        MainTapas.deleteTapa(tapa1.getNombreTapa());
    }
}
