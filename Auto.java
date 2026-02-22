
public class Auto extends Vehiculo {

    private String tipo;

    public Auto(String placa, String horaEntrada, String tipo){
        super(placa, horaEntrada);
        this.tipo = tipo;
        
    }

    @Override
    public double calcularTarifa(int horas) {
        
        return horas * 25.00;
    }

    @Override
    public String obtenerResumen(){
        
        return "El vehiculo con placas: " +placa + " Tipo: "+ tipo +  " Hora de entrada: " + horaEntrada;
    }


    
}
