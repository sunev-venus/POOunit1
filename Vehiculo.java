abstract class Vehiculo {
    
    protected String placa;
    protected String horaSalida;

    public Vehiculo (String placa, String horaSalida){
        this.horaSalida = horaSalida;
        this.placa = placa;

    }

    public abstract double calcularTarifa(int horas);

    public String obtenerResumen(){
        
        return "El vehiculo con placas: " +placa +  "Hora de salida: " + horaSalida ;
    }
    
}
