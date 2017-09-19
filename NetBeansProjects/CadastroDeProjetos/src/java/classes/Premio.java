/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author 02890117103
 */
@Entity
public class Premio implements Serializable {
    @Id
    @SequenceGenerator(name = "premio_id", sequenceName = "premio_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "premio_id")
    private Integer id;
    private String nome;
    private String descricao;
    @Column (name = "data_inicio")
    @Temporal(TemporalType.DATE)
    private Date dataInicio;
    @Column (name = "data_fim")
    @Temporal(TemporalType.DATE)
    private Date dataFim;
    @OneToOne
    private Projeto projetoVencedor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public Projeto getProjetoVencedor() {
        return projetoVencedor;
    }

    public void setProjetoVencedor(Projeto projetoVencedor) {
        this.projetoVencedor = projetoVencedor;
    }
    
    
    
}
