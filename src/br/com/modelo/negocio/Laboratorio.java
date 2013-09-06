/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.modelo.negocio;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.xml.crypto.Data;

/**
 *
 * @author isequiel_borges
 */

@Entity
public class Laboratorio implements  Serializable {
 @Id
 @GeneratedValue
    private int codigo;
   
    @ManyToOne()
    @JoinColumn(name = "CodigoProfessor", referencedColumnName = "codigo")
    private Professor Professor;

   
    
    
 @Temporal(javax.persistence.TemporalType.DATE)
    private Date Reserva;
    private String Turno;
    private String Aula;

    public Professor getProfessor() {
        return Professor;
    }

    public void setProfessor(Professor Professor) {
        this.Professor = Professor;
    }

   
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getReserva() {
        return Reserva;
    }

    public void setReserva(Date Reserva) {
        this.Reserva = Reserva;
    }

    public String getTurno() {
        return Turno;
    }

    public void setTurno(String Turno) {
        this.Turno = Turno;
    }

    public String getAula() {
        return Aula;
    }

    public void setAula(String Aula) {
        this.Aula = Aula;
    }

   

}
