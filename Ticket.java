

public class Ticket {
    private String folio;
    private String horaEntrada;
    private String horaSalida;
    private String estado;
    private Vehiculo vehiculo;
    private Espacio espacio;
    private double totalPagar;
    private int horasEstacionado;

    public Ticket (String folio, String horaEntrada, Vehiculo vehiculo, Espacio espacio){
        if (vehiculo == null) throw new IllegalArgumentException("Nombre es obligatorio");
        if (folio == null) throw new IllegalArgumentException("Nombre es obligatorio");
        if (horaEntrada == null) throw new IllegalArgumentException("Nombre es obligatorio");   
        this.folio = folio;
        this.horaEntrada = horaEntrada;
        this.horaSalida= "N/A"; // = null
        this.estado = "Abierto";
        this.vehiculo =vehiculo;
        this.espacio = espacio;
        this.totalPagar = 0.0;
        
    }
    
    //cerrado
    public void finalizar (String horaSalida, int horas){
        this.horasEstacionado = horas;
        this.estado = "Cerrado";
        this.horaSalida = horaSalida;
        this.totalPagar = vehiculo.calcularTarifa(horas);
        System.out.println("Hora salida: "+ this.horaSalida + " Hora entrada: "+horaEntrada +" - Estado: "+ this.estado + "horas Estacionado: "+ this.horasEstacionado);
    }

    public String obtenerDetalle(){
        String situacion= entregado()? "Vehiculo recogido" : "Vehiculo estacionado";
        if (vehiculo !=null){
            String placa = vehiculo.getPlacas(); //4 //se duplicaba por eso lo elimine al igual que la hotraEntrada//5

            return "Folio: " +folio+". \n"+"PLaca: "+ placa+". \n" +". \n"+ "Hora de salida: " + horaSalida+". \n" + "Estado: " + estado+". \n" + "Situación: " + situacion+". \n"  + "total a pagar:"+  totalPagar ;
        }
            else {
            return "No fueron proporcionados los datos completos";}
    
    }

    //está cerrado
    public boolean entregado(){
        return "Cerrado".equals(estado);
    }
    
}
