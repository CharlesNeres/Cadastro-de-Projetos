/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insere;

import classes.Area;
import classes.Autor;
import classes.Evento;
import classes.Premio;
import classes.Projeto;
import dao.DaoFactory;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 02890117103
 */
public class InsereProjeto {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        DaoFactory factory = new DaoFactory();
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");

        Area area = new Area();
        area.setNome("Programação Web");

        Autor autor1 = new Autor();
        autor1.setId(5);

        Autor autor2 = new Autor();
        autor1.setId(7);

        List<Autor> autores = new ArrayList<>();
        autores.add(autor1);
        autores.add(autor2);
        
        Premio premio = new Premio();
        premio.setDataInicio(fmt.parse("20/09/2017"));
        premio.setDataFim(fmt.parse("02/10/2017"));
        premio.setNome("PROJETANDO");
        
        Projeto projeto = new Projeto();
        projeto.setArea(area);
        projeto.setAutores(autores);
        projeto.setPremioDisputado(premio);
        projeto.setResumo("Neste trabalho serão apresentados os conceitos fundamentais da Mineração\n"
                + "de Dados, principais tarefas e métodos.");
        projeto.setTitulo("Mineração de Dados: Conceitos, Tarefas, Métodos\n"
                + "e Ferramentas");
       
        
//        premio.setProjetoVencedor(projeto);
        
        factory.getProjetoDao().add(projeto);
//        factory.getPremioDao().add(premio);
    }

}
