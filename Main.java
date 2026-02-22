public class Main {
    public static void main (String [] args){
    
        SistemaEstacionamiento SistemaE= new SistemaEstacionamiento("Tec-S");

        Vehiculo A1= new Auto("123", "8 am", "Auto");
        Vehiculo A2= new Auto("124", "10 am", "Auto");
        Vehiculo A3= new Auto("125", "5 pm", "Auto");
        Vehiculo M1= new Moto ("221", "8 am", 1569);
        Vehiculo M2= new Moto ("222", "11 am", 1976);
        Vehiculo M3= new Moto ("223", "5 pm", 5789);


        Espacio es1= new Espacio (1);
        Espacio es2 = new Espacio(2);
        Espacio es3 = new Espacio(3);

      

        Ticket t1= SistemaE.registrarEntrada(A1, es1);
        Ticket t2= SistemaE.registrarEntrada(A2, es2);
        Ticket t3= SistemaE.registrarEntrada(M1, es3);
        //Ticket t4= SistemaE.registrarEntrada(M2, es2);

        

        t1.finalizar("11 am");
        t2.finalizar("10 am");
        SistemaE.registrarSalidas(es1, t1);
        SistemaE.registrarSalidas(es2, t2);
        SistemaE.generarTicket(t1,7);
        SistemaE.generarTicket(t2,2);

        
}
}
