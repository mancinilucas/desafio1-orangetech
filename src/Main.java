import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("curso java", "descricao curso java", 8);
        Curso curso2 = new Curso("curso javascript", "descricao curso javascript", 4);

        Mentoria mentoria1 = new Mentoria("mentoria de java", "descricao mentoria java", LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
    }
}