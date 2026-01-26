public class Main {
    public static void main (String [] args){

        //SistemaEstacioinamiento
        SistemaEstacionamiento smN1 = new SistemaEstacionamiento("Lucas");
        SistemaEstacionamiento smN2 = new SistemaEstacionamiento("Paola");
        SistemaEstacionamiento smN3= new SistemaEstacionamiento("Lulu");
        //Vehiculo
        Vehiculo v1= new Vehiculo("MYT45-45", "Standar","12:12 pm");
        Vehiculo v2= new Vehiculo("SDT02-78", "Standar","2:00 pm");
        Vehiculo v3= new Vehiculo("AOI21-54", "Standar","2:00 pm");
        //Espacio
        Espacio es1= new Espacio (1, "Libre", v1);
        Espacio es2 = new Espacio(12, " ", v2);
        Espacio es3 = new Espacio(5, "Libre", v1);
        //Ticket
        TicketAs tic1 = new TicketAs("A001", "12:05", v1, es1);
        TicketAs tic2 = new TicketAs("A005", "10:59", v2, es2);
        TicketAs tic3 = new TicketAs("A008", "9:10", v3, es3);
       

       System.out.println(v1.obtenerResumen());
       System.out.println(" \n");

       System.out.println("======REGISTRO DE ENTRADAS======\n");
       System.out.println(smN1.registrarEntrada(v3, es3));
       System.out.println(" \n");
       System.out.println(smN2.registrarEntrada(v1, es1));
       System.out.println(" \n");
       System.out.println(smN3.registrarEntrada(v2, es2));
       System.out.println(" \n");
       System.out.println(tic3.obtenerDetalle());

       System.out.println("\n Ticket totales:" + SistemaEstacionamiento.getTotalEntradas());

        
    }
}
