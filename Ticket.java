public class Ticket {
    private String folio;
    private String horaEntrada;
    private String horaSalida;
    private String estado;
    private Vehiculo vehiculo;
    private Espacio espacio;

    public Ticket (String folio, String horaEntrada, Vehiculo vehiculo, Espacio espacio){
        if (vehiculo == null) throw new IllegalArgumentException("Nombre es obligatorio");
        if (folio == null) throw new IllegalArgumentException("Nombre es obligatorio");
        if (horaEntrada == null) throw new IllegalArgumentException("Nombre es obligatorio");   
        this.folio = folio;
        this.horaEntrada = horaEntrada;
        this.horaSalida= "N/A";
        this.estado = "Abierto";
        this.vehiculo =vehiculo;
        this.espacio = espacio;
    }
    
    //cerrado
    public void finalizar (String horaSalida){
        this.estado = "Cerrado";
        System.out.println("Hora salida: "+horaSalida + " Hora entrada: "+horaEntrada +" - Estado: "+ this.estado);
    }

    public String obtenerDetalle(){
        String situacion= entregado()? "Vehiculo recogido" : "Vehiculo estacionado";
        if (vehiculo !=null){
            String placa = vehiculo.getPlacas(); //4 //se duplicaba por eso lo elimine al igual que la hotraEntrada//5

            return "Folio: " +folio+". \n"+"PLaca: "+ placa+". \n" +". \n"+ "Hora de salida: " + horaSalida+". \n" + "Estado: " + estado+". \n" + "Situación: " + situacion ;
        }
            else {
            return "No fueron proporcionados los datos completos";}
    
    }

    //está cerrado
    public boolean entregado(){
        return "Cerrado".equals(estado);
    }
    
}
