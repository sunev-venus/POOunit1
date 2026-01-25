public class main {
    public static void main(String[] args) {

        // Crear 3 objetos
        // obj. de Clase entidad
        Ticket tic1 = new Ticket("A001", "10:55", "12:30");
        //obj. de Clase cooridinadora
        Espacio es1 = new Espacio("12", "ocupado", Vehículo);
        Espacio es2 = new Espacio("5", "libre", Vehículo);

        // ejecutar los 4 mensajes

        System.out.println( "Espacio: " + es1.Espacio.estaLibre(tic1));
        System.out.println("Ticket: " + tic1.Ticket.obrenerDetalle(es1));
        System.out.println("Espacio: " + es2.Espacio.liberar(tic1));
        System.out.println("Ticket: " + tic1.Ticket.obtenerDetalle());
        // No va a funcionar debido a que se necesita la clase de Vehículo

    }
    
}
