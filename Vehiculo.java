abstract class Vehiculo {
    
    protected String placa;
    protected String horaEntrada;

    //validaciones
    public Vehiculo (String placa, String horaEntrada){
        this.horaEntrada = horaEntrada;
        this.placa = placa;

    }

    public abstract double calcularTarifa(int horas);

    public String obtenerResumen(){      
        return "El vehiculo con placas: " +placa +  "Hora de entrada: " + horaEntrada ;
    }

    public String getPlacas(){
        return placa;
    }   

    public String getHoraEntrada(){
        return horaEntrada;
    }
    
}
