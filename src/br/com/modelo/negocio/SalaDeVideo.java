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

/**
 *
 * @author isequiel_borges
 */

@Entity
public class SalaDeVideo implements Serializable{
 @Id
 @GeneratedValue
    private int codigo;
 
    @ManyToOne()
    @JoinColumn(name = "CodigoProfessor", referencedColumnName = "codigo")
    private Professor professor;

    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date Reserva;
    private String Turno;
    private String Aula;

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
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
