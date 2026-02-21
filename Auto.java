public class Auto extends Vehiculo {

    private String tipo;

    public Auto(String placa, String horaSalida, String tipo){
        super(placa, horaSalida);
        this.tipo = tipo;
        
    }

    @Override
    public double calcularTarifa(int horas) {
        
        return horas * 25.00;
    }

    @Override
    public String obtenerResumen(){
        
        return "El vehiculo con placas: " +placa + "Tipo: "+ tipo +  "Hora de salida: " + horaSalida ;
    }


    
}
