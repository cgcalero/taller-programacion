/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.tallerprogramacion;

/**
 *
 * @author Christiam Calero
 */
public class Producto {

    private String codigo;
    private String imagen;
    private String descripcion;
    private double precio;
    private int unidades;

    public Producto() {
    }

    public Producto(String codigo, String imagen, String descripcion, double precio, int unidades) {
        this.codigo = codigo;
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.precio = precio;
        this.unidades = unidades;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return  String.format("""
                <tr>
                    <td>%s</td>
                    <td>%s</td>
                    <td>%.2f</td>
                    <td>%d</td>
                    <td><img src="%s"/></td>
                </tr>
                """, codigo, descripcion, precio, unidades, imagen);
    }
}
