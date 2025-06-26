/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainempresa;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell 7490
 */
public class MainEmpresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ana Lucía Varela Jiménez

        AgenteVentas a = new AgenteVentas();
        a.setNombre(JOptionPane.showInputDialog("Digite el nombre del agente")); //ingresa el nombre del agente
        a.setCedula(JOptionPane.showInputDialog("Digite la cedula del agente")); //ingresa la cedula del agente
        a.setCodigo(JOptionPane.showInputDialog("Digite el codigo del agente")); //ingresa el codigo del agente
        a.setSucursal(JOptionPane.showInputDialog("Digite la sucursal")); //ingresa la sucursal
        a.setVehiculoPropio(JOptionPane.showInputDialog("Tiene vehiculo propio (si o no)")); //ingresa si tiene vehículo(no me sirvio el boolean)

        int cantFacturas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de facturas:")); //preguntar la cantidad de facturas
        int i = 0; //inicializar contador en 0

        while (i < cantFacturas) { //bucle para repedtir cada factura
            Facturas f = new Facturas();
            f.setNombreC(JOptionPane.showInputDialog("Digite el nombre del cliente")); //ingresa el nombre del cliente
            f.setCedulaC(JOptionPane.showInputDialog("Digite la cedula del cliente")); //ingresa la cedula del cliente
            f.setCodigoF(JOptionPane.showInputDialog("Digite el codigo de la factura")); //ingresa el codigo de la factura
            f.setMontoF(Double.parseDouble(JOptionPane.showInputDialog("Digite el monto de la factura"))); //ingresa el monto de la factura
            f.setMes(Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de mes correspondiente(enero=1, febrero=2...)"))); //ingresa el mes de la factura
            f.setProducElec(Double.parseDouble(JOptionPane.showInputDialog("Digite la cantidad de productos electrico(Si no tiene digite 0)"))); //ingresa la cantidad de productos electrico facturados
            f.setProducAuto(Double.parseDouble(JOptionPane.showInputDialog("Digite la cantidad de productos automotrices(Si no tiene digite 0)"))); //ingresa la cantidad de productos automotrices facturados
            f.setProducCons(Double.parseDouble(JOptionPane.showInputDialog("Digite la cantidad de productos construccion(Si no tiene digite 0)"))); //ingresa la cantidad de productos construccion facturados
            f.setBonoExtra(Double.parseDouble("Digite si obtuvo bono extra:")); //ingresa si obtuvo bono extra

            JOptionPane.showMessageDialog(null, f.toString()); // muestra los datos de la factura
            JOptionPane.showMessageDialog(null, a.toString()); // muestra los datos del agente

            i++; // incrementa el contador para pasar a la siguiente factura
        }

    }

}
