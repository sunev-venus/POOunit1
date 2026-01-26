public class TicketAs {
    private String folio;
    private String horaEntrada;
    private String horaSalida;
    private String estado;
    private Vehiculo vehiculo;
    private Espacio espacio;

    public TicketAs(String folio, String horaEntrada, Vehiculo vehiculo, Espacio espacio){
        this.folio = folio;
        this.horaEntrada = horaEntrada;
        this.horaSalida= "N/A";
        this.estado = "Abierto";
        this.vehiculo = vehiculo;
        this.espacio = espacio;
    }
    
    public static void finalizar (String horaSalida, String estado){
        horaSalida = horaSalida;
        estado = "Cerrado";
        System.out.println("Hora salida: "+horaSalida +" - Estado: "+ estado );
    }

    public String obtenerDetalle(){ 
        if (vehiculo!= null && espacio !=null){
            String placa = vehiculo.getPlacas(); //4
            int esp= espacio.getNumero(); //5
             return "Folio: " + folio+". " + "\n Placa: "+ placa+". " +"\n Espacio: "+ esp+". "+"\n Hora de entrada: " + horaEntrada +". " + " Hora de salida: " + horaSalida+". " + "\n Estado: " + estado+". ";
        }


        else {
            return null;
        }
    }

    public boolean entregado(){
        return "Cerrado".equals(espacio);
    }
    
}
