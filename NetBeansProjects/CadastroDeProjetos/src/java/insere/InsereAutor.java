/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insere;

import classes.Autor;
import dao.DaoFactory;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author 02890117103
 */
public class InsereAutor {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here

        DaoFactory factory = new DaoFactory();
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");

        Autor autor = new Autor();
        
        autor.setCpf("98965432112");
        autor.setDataNascimento(fmt.parse("21/08/1990"));
        autor.setEmail("joaoalmeida@gmail.com");
        autor.setNome("Joao Almeida");
        autor.setRg("325198");
        autor.setTelefone("63 985984611");
        autor.setGraduacao("Ciencia da Computacao");
        autor.setNumeroMatricula("2544414165132");
        
        factory.getAutorDao().add(autor);

    }

}
