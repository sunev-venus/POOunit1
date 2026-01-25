class Ticket {
    //Atributos
    private String folio;
    private String horaEntrada;
    private String horaSalida;

    // Constructor parametrizaddo
    public Ticket(String folio, String horaEntrada, String horaSalida){
        this.folio = folio;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
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
