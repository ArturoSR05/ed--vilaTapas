package tapas.data;

import tapas.domain.Tapa;
import tapas.domain.TapaRepository;

import java.util.ArrayList;

public class TapaDataRepository implements TapaRepository {

    private static TapaDataRepository instance= null;

    private ArrayList<Tapa> localTapas = new ArrayList<>();
    private TapaDataRepository(){
        initData();
    }

    @Override
    public ArrayList<Tapa> obtainTapas() {
        return localTapas;
    }

    @Override
    public Tapa obtainTapa(String tapaNombre){
        for (Tapa tapa : localTapas){
            if (tapa.getNombreTapa().equals(tapaNombre)){
                return tapa;
            }
        }
        return null;
    }

    @Override
    public void deleteTapa(String tapaNombre){
        for (int i=0; i<localTapas.size(); i++){
            if (localTapas.get(i).getNombreTapa().equals(tapaNombre))
                localTapas.remove(i);
        }
    }

    @Override
    public void saveTapa(Tapa tapa){localTapas.add(tapa);}

    @Override
    public Tapa modifyTapa(String tapaNombre) {
        return null;
    }


    private void initData(){
        localTapas.add(new Tapa("Infierno", "El colibri","30","50","100","100","tomate, patata, salchicha y picante"));
    }

    public static TapaDataRepository newInstance(){
        if (instance==null){
            instance= new TapaDataRepository();
        }
        return instance;
    }
}
