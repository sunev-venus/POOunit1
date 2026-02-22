public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String placa, String horaEntrada, int cilindrada){
        super(placa, horaEntrada);
        this.cilindrada=cilindrada;
    }

    @Override
    public double calcularTarifa(int horas) {
        double total = horas * 15.00;
        return total;
    }

    @Override
    public String obtenerResumen(){
        
        return "El vehiculo con placas: " +placa + " Cilindraje: "+ cilindrada +  " Hora de entrada: " + horaEntrada ;
    }

    
}
