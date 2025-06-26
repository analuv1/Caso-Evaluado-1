/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainempresa;

/**
 *
 * @author Dell 7490
 */
public class AgenteVentas {

    private String nombre; //nombre del agente 
    private String cedula; // cedula del agente
    private String codigo; //codigo del agente
    private String sucursal; //sucursal a la que pertenece el agente
    private String vehiculoPropio;

    public AgenteVentas() { //constructor vacio para crear el objeto en el main
    }

    public AgenteVentas(String nombre, String cedula, String codigo, String sucursal) { //constructor con datos
        this.nombre = nombre;
        this.cedula = cedula;
        this.codigo = codigo;
        this.sucursal = sucursal;

    }

    //setter and getter para cada atributo
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String isVehiculoPropio() {
        return vehiculoPropio;
    }

    public void setVehiculoPropio(String vehiculoPropio) {
        this.vehiculoPropio = vehiculoPropio;
    }

    @Override
    public String toString() { //salida
        return "AgenteVentas: \n"
                + "nombre=" + nombre + "\n"
                + ", cedula=" + cedula + "\n"
                + ", codigo=" + codigo + "\n"
                + ", sucursal=" + sucursal;
    }

}
