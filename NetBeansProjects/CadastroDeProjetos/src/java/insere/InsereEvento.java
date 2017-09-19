/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insere;

import classes.Evento;
import classes.Premio;
import dao.DaoFactory;

/**
 *
 * @author 02890117103
 */
public class InsereEvento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DaoFactory factory = new DaoFactory();
        
        Evento evento = new Evento();
        
        Premio premio = new Premio();
        premio.setProjetoVencedor(projetoVencedor);
        evento.setPremio(premio);
    }
    
}
