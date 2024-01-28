package tapas.domain;

public class ModifyTapaUseCase {

    private TapaRepository tapaRepository;

    public ModifyTapaUseCase(TapaRepository tapaRepository){
        this.tapaRepository= tapaRepository;
    }

    public Tapa execute(String tapaNombre){ return this.tapaRepository.modifyTapa(tapaNombre);}
}
