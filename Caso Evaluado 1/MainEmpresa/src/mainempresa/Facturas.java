/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainempresa;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell 7490
 */
public class Facturas {

    private String nombreC; //nombre del cliente
    private String cedulaC; //cedula del cliente
    private String codigoF; //codigo de la factura
    private double montoF; //monto de la factura
    private int mes; // mes de la factura, se debe validar
    private double producElec; //si la factura contiene productos electricos
    private double producAuto; //si la factura contiene productos automotrices
    private double producCons; //si la factura contiene productos construccion
    private int cantPuntos = 0; //cantidad de puntos que obtendra el vendedor
    private double bonoExtra = 0; //el bono extra que se obtendra si contiene ciertas condiciones
    private double comisionTodo = 0; // si se tiene los tres tipos de producto tendra una comision
    private double comisionElec = 0; // si tiene mas de tres productos electricos tendra bono
    private double comisionAuto = 0; //si la factura contiene mas de 4 productos automotrices
    private double comisionCons = 0; //si contiene productos de contruccion obtendra bono
    private double montoMayor = 0; //si el monto es mayor a 50000 se agrega un 5 porciento al total de la factura
    private double logroVendedor = 0; //si el vendedor logro colocar mas de 3 facturas al mes o vender un monto mayor a 3000000
    private boolean obtuvoBONOEXTRA = true; //Si el vendedor obtendra bono extra
    private double comisionTotal; //suma todas las comisiones
    private int puntosTotal;
    private double cantFacturas;

    public Facturas() { //constructor vacio para crear el objeto en el main
    }

    public Facturas(String nombreC, String cedulaC, String codigoF, double montoF, int mes, double producElec, double producAuto, double producCons, double comisionTotal, int puntosTotal) { //constructor con datos
        this.nombreC = nombreC;
        this.cedulaC = cedulaC;
        this.codigoF = codigoF;
        this.montoF = montoF;
        this.mes = mes;
        this.producElec = producElec;
        this.producAuto = producAuto;
        this.producCons = producCons;
        this.comisionTotal = comisionTotal;
        this.puntosTotal = puntosTotal;

    }

    public String getNombreC() { //setter and getter para cada atributo
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public String getCedulaC() {
        return cedulaC;
    }

    public void setCedulaC(String cedulaC) {
        this.cedulaC = cedulaC;
    }

    public String getCodigoF() {
        return codigoF;
    }

    public void setCodigoF(String codigoF) {
        this.codigoF = codigoF;
    }

    public double getMontoF() {
        return montoF;
    }

    public void setMontoF(double montoF) {
        this.montoF = montoF;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public double isProducElec() {
        return producElec;
    }

    public void setProducElec(double producElec) {
        this.producElec = producElec;
    }

    public double isProducAuto() {
        return producAuto;
    }

    public void setProducAuto(double producAuto) {
        this.producAuto = producAuto;
    }

    public double isProducCons() {
        return producCons;
    }

    public void setProducCons(double producCons) {
        this.producCons = producCons;
    }

    public int getCantPuntos() {
        return cantPuntos;
    }

    public void setCantPuntos(int cantPuntos) {
        this.cantPuntos = cantPuntos;
    }

    public double getBonoExtra() {
        return bonoExtra;
    }

    public void setBonoExtra(double bonoExtra) {
        this.bonoExtra = bonoExtra;
    }

    public double getComisionTodo() {
        return comisionTodo;
    }

    public void setComisionTodo(double comisionTodo) {
        this.comisionTodo = comisionTodo;
    }

    public double getComisionElec() {
        return comisionElec;
    }

    public void setComisionElec(double comisionElec) {
        this.comisionElec = comisionElec;
    }

    public double getComisionAuto() {
        return comisionAuto;
    }

    public void setComisionAuto(double comisionAuto) {
        this.comisionAuto = comisionAuto;
    }

    public double getComisionCons() {
        return comisionCons;
    }

    public void setComisionCons(double comisionCons) {
        this.comisionCons = comisionCons;
    }

    public double getMontoMayor() {
        return montoMayor;
    }

    public void setMontoMayor(double montoMayor) {
        this.montoMayor = montoMayor;
    }

    public double getLogroVendedor() {
        return logroVendedor;
    }

    public void setLogroVendedor(double logroVendedor) {
        this.logroVendedor = logroVendedor;
    }

    public boolean isObtuvoBONOEXTRA() {
        return obtuvoBONOEXTRA;
    }

    public void setObtuvoBONOEXTRA(boolean obtuvoBONOEXTRA) {
        this.obtuvoBONOEXTRA = obtuvoBONOEXTRA;
    }

    public double getComisionTotal() {
        return comisionTotal;
    }

    public void setComisionTotal(double comisionTotal) {
        this.comisionTotal = comisionTotal;
    }

    public int getPuntosTotal() {
        return puntosTotal;
    }

    public void setPuntosTotal(int puntosTotal) {
        this.puntosTotal = puntosTotal;
    }

    public double getCantFacturas() {
        return cantFacturas;
    }

    public void setCantFacturas(double cantFacturas) {
        this.cantFacturas = cantFacturas;
    }

    public void calComisionExtraP() { // Calcula las comisiones y puntos extra
        // 
        if (producElec >= 3) { //si se compra procuto electrico
            bonoExtra = montoF * 0.04;
            puntosTotal = cantPuntos + 3;

        } else if (producElec < 3) {
            bonoExtra = montoF * 0.02;
        }
        if (producAuto >= 4) {
            bonoExtra = montoF * 0.04;
            puntosTotal = cantPuntos + 1;

        } else if (producAuto < 4) {
            bonoExtra = montoF * 0.02;
        }
        if (producCons >= 1) {
            bonoExtra = montoF * 0.08;
            puntosTotal = cantPuntos + 2;
        }
        if (montoMayor > 50000) {
            bonoExtra = montoF * 0.05;
            puntosTotal = cantPuntos + 1;
        }
        if (cantFacturas > 3 || montoF > 300000) {
            comisionTotal = comisionTotal + 20000;

        }
        comisionTotal = comisionElec + comisionAuto + comisionCons + comisionTodo; //suma de las comisiones

        /**
         *
         * @param opcionesMes
         */
        boolean valido = false;
        while (!valido) {
            mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de mes:"));
            if (mes <= 12) {
                switch (mes) { //intento de que se ponga que mes es cada número
                    case 1:
                        JOptionPane.showMessageDialog(null, "enero");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "febrero");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "marzo");
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "abril");
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "mayo");
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "junio");
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "julio");
                        break;
                    case 8:
                        JOptionPane.showMessageDialog(null, "agosto");
                        break;
                    case 9:
                        JOptionPane.showMessageDialog(null, "septiembre");
                        break;
                    case 10:
                        JOptionPane.showMessageDialog(null, "octubre");
                        break;
                    case 11:
                        JOptionPane.showMessageDialog(null, "noviembre");
                        break;
                    case 12:
                        JOptionPane.showMessageDialog(null, "diciembre");
                        break;
                }

            }

        }

    }

    @Override
    public String toString() { //salida
        return "Facturas\n"
                + "montoF=" + montoF + "\n"
                + ", mes=" + mes + "\n"
                + ", total de puntos" + puntosTotal + "\n"
                + ", obtuvo bono extra=" + bonoExtra + "\n"
                + ", comisionTotal=" + comisionTotal;

    }

}
