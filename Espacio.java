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
}

public void liberar(){
    // Está libre?

}

public boolean estaLibre(){
    return false;

}

}
