/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.tallerprogramacion.reporte;

import pe.edu.utp.tallerprogramacion.Producto;

/**
 *
 * @author Christiam Calero
 */
public class Body {
    private String titleReport;
    private Table tablaReporte;

    public Body(String titleReport, Table tablaReporte) {
        this.titleReport = titleReport;
        this.tablaReporte = tablaReporte;
    }

    public String getTitleReport() {
        return titleReport;
    }

    public void setTitleReport(String titleReport) {
        this.titleReport = titleReport;
    }

    public Table getTablaReporte() {
        return tablaReporte;
    }

    public void setTablaReporte(Table tablaReporte) {
        this.tablaReporte = tablaReporte;
    }
        
    @Override
    public String toString() {
        return "<body><h2>"+titleReport+"</h2>" + tablaReporte + "</body>";
    }        
}
