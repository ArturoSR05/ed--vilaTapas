package tapas.presentation;

import tapas.data.TapaDataRepository;
import tapas.domain.*;

import java.util.ArrayList;

public class MainTapas {

    public static void printTapas(){
        GetTapasUseCase getTapasUseCase= new GetTapasUseCase(TapaDataRepository.newInstance());
        ArrayList<Tapa> tapas= getTapasUseCase.execute();
        System.out.println(tapas.toString());
    }

    public static void printTapa(String tapaNombre){
        GetTapaUseCase getTapaUseCase= new GetTapaUseCase(TapaDataRepository.newInstance());
        Tapa tapa= getTapaUseCase.execute(tapaNombre);
        System.out.println(tapa.toString());
    }

    public static void deleteTapa(String tapaNombre){
        DeleteTapaUseCase deleteTapaUseCase= new DeleteTapaUseCase(TapaDataRepository.newInstance());
        deleteTapaUseCase.execute(tapaNombre);
    }

    public static void createTapa(Tapa tapa){
        TapaDataRepository tapaDataRepository= TapaDataRepository.newInstance();
        SaveTapaUseCase saveTapaUseCase= new SaveTapaUseCase(tapaDataRepository);
        saveTapaUseCase.execute(tapa);
    }

    public static void modifyTapa(String tapaNombre){
        ModifyTapaUseCase modifyTapaUseCase= new ModifyTapaUseCase(TapaDataRepository.newInstance());
        modifyTapaUseCase.execute(tapaNombre);
    }
}
