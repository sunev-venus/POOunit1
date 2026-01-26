class TicketVen {
    //Atributos
    private String folio;
    private String horaEntrada;
    private String horaSalida;
    private Espacio espacio;
    private String estado;
    private Vehículo vehiculo;


    // Constructor parametrizaddo
    public TicketVen(String folio, String horaEntrada, String horaSalida, Vehículo vehiculo, Espacio espacio){
        this.folio = folio;
        this.horaEntrada = horaEntrada;
        this.horaSalida = "N/A";
        this.estado = "ABIERTO";
        this.vehiculo = vehiculo;
        this.espacio = espacio;

    }

    // Métodos
    public void finalizar(String horaSalida){
        // Ya se está yendo

    }

    public String obrenerDetalle(){
        return "";

    }

    public boolean entregado(){
        return false;

    }

    
}
