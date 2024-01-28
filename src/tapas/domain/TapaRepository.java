package tapas.domain;

import java.util.ArrayList;

public interface TapaRepository {

    ArrayList<Tapa> obtainTapas();
    Tapa obtainTapa(String tapaNombre);
    void deleteTapa(String tapaNombre);
    void saveTapa(Tapa tapa);

    Tapa modifyTapa(String tapaNombre);
}
