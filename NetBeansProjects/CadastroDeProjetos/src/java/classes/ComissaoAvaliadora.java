/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author 02890117103
 */
@Entity
public class ComissaoAvaliadora implements Serializable {
    
    @Id
    @SequenceGenerator(name = "comissao_id", sequenceName = "comissao_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "comissao_id")
    private Integer id;
    @OneToMany
    private List<Avaliador> avaliadores = new ArrayList<>();
    @OneToOne
    private Avaliacao avaliacao;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Avaliador> getAvaliadores() {
        return avaliadores;
    }

    public void setAvaliadores(List<Avaliador> avaliadores) {
        this.avaliadores = avaliadores;
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }

    
    
}
