package Modelo;
// Generated 8/08/2016 10:26:50 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Noticias generated by hbm2java
 */
public class Noticias  implements java.io.Serializable {


     private Integer id;
     private Usuarios usuarios;
     private String titular;
     private String texto;
     private Date fecha;

    public Noticias() {
    }

    public Noticias(Usuarios usuarios, String titular, String texto, Date fecha) {
       this.usuarios = usuarios;
       this.titular = titular;
       this.texto = texto;
       this.fecha = fecha;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Usuarios getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }
    public String getTitular() {
        return this.titular;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public String getTexto() {
        return this.texto;
    }
    
    public void setTexto(String texto) {
        this.texto = texto;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }




}

