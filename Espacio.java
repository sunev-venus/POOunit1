class Espacio {
    
// Atributos
private int numero;
private String estado;
private Vehículo vehiculoActual;

//Constructores
public Espacio(int numero, String estado, Vehículo vehiculoActual){
    this.numero = numero;
    this.estado = estado;
    this.vehiculoActual = vehiculoActual;
}

// Métodos
public void ocupar(Vehículo vehiculo){
    // no va a funcionar por la clase de vehículo
    // Ya se ecupó?
}

public void liberar(){
    // Está libre?

}

public boolean estaLibre(){
    return false;

}

}
