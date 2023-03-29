import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Descricao curso Javascript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descricao Java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Orange Tech");
        bootcamp.setDescricao("Descricao Bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        System.out.println(bootcamp);


        Dev dev1 = new Dev();
        dev1.setNome("Bel");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos de " + dev1.getNome() + " :" + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteudos inscritos de " + dev1.getNome() + " :" + dev1.getConteudosInscritos());
        System.out.println("Conteudos concluidos de " + dev1.getNome() + " :" + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularXp());

        System.out.println();

        Dev dev2 = new Dev();
        dev2.setNome("Jorge");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos de " + dev2.getNome() + " :"+ dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteudos inscritos de " + dev2.getNome() + " :"+ dev2.getConteudosInscritos());
        System.out.println("Conteudos concluidos de " + dev2.getNome() + " :" + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularXp());
    }
}