package tapas.domain;

public class Tapa {
    private String nombre;
    private String establecimientoTapa;
    private String totalPuntos;
    private String mediaVotos;
    private String numParticipantes;
    private String totalVotos;
    private String ingredientes;

    public Tapa(String nombre, String establecimientoTapa, String totalPuntos, String mediaVotos, String numParticipantes, String totalVotos, String ingredientes) {
        this.nombre = nombre;
        this.establecimientoTapa = establecimientoTapa;
        this.totalPuntos = totalPuntos;
        this.mediaVotos = mediaVotos;
        this.numParticipantes = numParticipantes;
        this.totalVotos = totalVotos;
        this.ingredientes = ingredientes;
    }

    public String getNombreTapa() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstablecimientoTapa() {
        return establecimientoTapa;
    }

    public void setEstablecimientoTapa(String establecimientoTapa) {
        this.establecimientoTapa = establecimientoTapa;
    }

    public String getTotalPuntos() {
        return totalPuntos;
    }

    public void setTotalPuntos(String totalPuntos) {
        this.totalPuntos = totalPuntos;
    }

    public String getMediaVotos() {
        return mediaVotos;
    }

    public void setMediaVotos(String mediaVotos) {
        this.mediaVotos = mediaVotos;
    }

    public String getNumParticipantes() {
        return numParticipantes;
    }

    public void setNumParticipantes(String numParticipantes) {
        this.numParticipantes = numParticipantes;
    }

    public String getTotalVotos() {
        return totalVotos;
    }

    public void setTotalVotos(String totalVotos) {
        this.totalVotos = totalVotos;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
}
