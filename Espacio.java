class Espacio {

    // Atributos
    private int numero;
    private String estado;
    private Vehículo vehiculoActual;

    //Constructores
    public Espacio(int numero, String estado, Vehículo vehiculoActual){
        this.numero = numero;
        this.estado = "Libre";
        this.vehiculoActual = null;
    }

    // Métodos
    public void ocupar(Vehículo vehiculo){
        this.vehiculoActual = vehiculo;
        this.estado = "Ocupado";
    }

    public void liberar(){
        this.vehiculoActual = null;
        this.estado = "Libre";
    }

    public boolean estaLibre(){
        return "LIBRE".equals(estado);
    }

}