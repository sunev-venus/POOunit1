public class SistemaEstacionamiento {
    private String nombre;
    private static int totalEntradas=0;
    private static int totalSalidas=0;
    private static int consecutivoTicket =0; 
    private Espacio espacio;


    public SistemaEstacionamiento(String nombre){
        this.nombre = nombre;
    }
    public Ticket registrarEntrada(Vehiculo vehiculo, Espacio espacio) {

        espacio.ocupar(vehiculo);

        totalEntradas++;

        consecutivoTicket++;
        String horaEntrada = null;
        
        String folio = "T-" + consecutivoTicket;
        Ticket t = new Ticket(folio, horaEntrada, vehiculo, espacio);
        System.out.println("[" + nombre + "] Entrada registrada");
        System.out.println(" " + vehiculo.obtenerResumen());
        System.out.println(" " + t.obtenerDetalle());

return t;

}

    public void registrarSalidas (){
      espacio.liberar();
      totalSalidas++;
    }
    public int getTotalEntradas(){
        return  totalEntradas;
    }
    public int getTotalSalidas(){
        return totalSalidas;
    }
}
