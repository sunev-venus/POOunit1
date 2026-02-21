public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String placa, String horaSalida, int cilindrada){
        super(placa, horaSalida);
        this.horaSalida = horaSalida;
    }

    @Override
    public double calcularTarifa(int horas) {
        return horas * 15.00;
    }

    @Override
    public String obtenerResumen(){
        
        return "El vehiculo con placas: " +placa + "Cilindraje: "+ cilindrada +  "Hora de salida: " + horaSalida ;
    }
    
}
