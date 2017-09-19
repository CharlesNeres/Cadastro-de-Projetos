/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insere;

import classes.Avaliador;
import dao.DaoFactory;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author 02890117103
 */
public class InsereAvaliador {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        
        DaoFactory factory = new DaoFactory ();
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");    
        Avaliador avaliador = new Avaliador();
        
        avaliador.setCpf("988665215");
        avaliador.setDataNascimento(fmt.parse("17/12/1989"));
        avaliador.setEmail("juliotevez@gmail.com");
        avaliador.setNome("Júlio Tevez");
        avaliador.setRg("98765478");
        avaliador.setTelefone("63 985956784");
        avaliador.setAreaFormacao("Desenvolvimento Agil");
        avaliador.setTitulacao("Doutor em Analises de Projetos");
        
        
        factory.getAvaliadorDao().add(avaliador);
        
    }
    
}
