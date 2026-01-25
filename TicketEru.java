
public class TicketEru {
    
    private String folio ;
    private String horaEntrada ;
    private String horaSalida ;
    private boolean entregado ;
    private String estado ;


    public TicketEru(String folio, String horaEntrada, String horaSalida){
        this.folio = folio ;
        this.horaEntrada = horaEntrada ;
        this.horaSalida = horaSalida ;
        this.entregado = false ;
        this.estado = "activo" ;
    }

    public void finalizar(String horaSalida){
        this.horaSalida = horaSalida ;
        this.entregado = true ;
        this.estado = "finalizado" ;

    }
    public String obtenerDetalles(){
        return "Folio: " + folio + " Hora de entrada: " + horaEntrada + " Hora de salida: " + horaSalida + " Estado: " + estado ;
    }

    public boolean entregado(){
        return entregado ;
    }

    

    
}
