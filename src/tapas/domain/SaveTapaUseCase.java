package tapas.domain;

public class SaveTapaUseCase {

    public TapaRepository tapaRepository;

    public SaveTapaUseCase(TapaRepository tapaRepository){
        this.tapaRepository= tapaRepository;
    }

    public void execute(Tapa tapa){
        this.tapaRepository.saveTapa(tapa);
    }
}
