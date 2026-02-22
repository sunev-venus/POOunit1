import java.util.ArrayList;
import java.util.List;


public class SistemaEstacionamiento implements Ticketable{
    private String nombre;
    private static int totalEntradas=0;
    private static int totalSalidas=0;
    private static int consecutivoTicket =0; 
    private List<Espacio>espacios;
    private List<Ticket>tickets;


    public SistemaEstacionamiento(String nombre){
        this.nombre = nombre;
        this.espacios= new ArrayList<>();
        this.tickets= new ArrayList<>();
        
    }

    
    public Ticket registrarEntrada(Vehiculo vehiculo, Espacio espacio) {

        if (espacio == null) throw new IllegalArgumentException("El espacio es obligatorio");
        else {espacios.add(espacio);
        }
        espacio.ocupar(vehiculo); //1
        totalEntradas++;
        consecutivoTicket++;
        String horaEntrada = vehiculo.getHoraEntrada(); //2
        String folio = "T-" + consecutivoTicket;
        Ticket t = new Ticket(folio,horaEntrada, vehiculo, espacio);
        System.out.println("==========Registrar entrada==========");
        System.out.println("[" + nombre + "] Entrada registrada");
        System.out.println(" " + vehiculo.obtenerResumen());
        System.out.println(" " + t.obtenerDetalle());
        System.out.println(t.entregado());
return t;

}
    public void registrarSalidas (Espacio e, Ticket t,String horaSalida, int horas){  
        t.finalizar(horaSalida, horas);
        e.liberar();
        totalSalidas++;
        System.out.println("==========Registrar salida==========");
        System.out.println("Total salidas: " + totalSalidas);
        System.out.println("["+nombre+"] El espacio se ha liberado. Salida registrada");
    
    }

    
    public void generarTicket(Ticket t, int horas ){
    if (t == null) throw new IllegalArgumentException("El espacio es obligatorio");
        else {tickets.add(t);
        };
        
    System.out.println("==========Ticket==========");
    System.out.println(t.obtenerDetalle());
    }

   // 
    public static int getTotalEntradas(){
        return  totalEntradas;
    }
    public static int getTotalSalidas(){
        return totalSalidas;
    }
}
