class Espacio {

    // Atributos
    private int numero;
    private String estado;
    private Vehiculo vehiculoActual;


    public Espacio(int numero, String estado, Vehiculo vehiculoActual){
        this.numero = numero;
        this.estado = (estado != null )? "Libre": null ;
        this.vehiculoActual = (estado != null )? vehiculoActual :null;//
    }

    // Métodos
    public void ocupar(Vehiculo vehiculo){
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
    public int getNumero(){  //
        return numero;
    }
    

}
