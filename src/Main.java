import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Curso da plataforma DIO");
        curso1.setCargaHoraria(22);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso de Javascript");
        curso2.setDescricao("Curso da plataforma DIO");
        curso2.setCargaHoraria(14);

        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("Mentoria sobre Java");
        mentoria1.setDescricao("Palestra sobre POO em Java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();

        mentoria2.setTitulo("Mentoria sobre Javascript");
        mentoria2.setDescricao("Palestra sobre assuntos em Javascript");
        mentoria2.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//
//        System.out.println(mentoria1);
//        System.out.println(mentoria2);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp para ajudar na carreira de Desenvolvedor Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(mentoria2);

        Dev devPaulo = new Dev();
        devPaulo.setNome("Paulo");
        devPaulo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Paulo: " + devPaulo.getConteudosInscritos());
        devPaulo.progredir();
        devPaulo.progredir();
        System.out.println("-----------");
        System.out.println("Conteúdos Inscritos Paulo: " + devPaulo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Paulo: " + devPaulo.getConteudosConcluidos());
        System.out.println("XP: " + devPaulo.calcularTotalXp());

        System.out.println("******************");


        Dev devArthur = new Dev();
        devPaulo.setNome("Arthur");
        devArthur.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Arthur: " + devArthur.getConteudosInscritos());
        devArthur.progredir();
        devArthur.progredir();
        devArthur.progredir();
        System.out.println("-----------");
        System.out.println("Conteúdos Inscritos Arthur: " + devArthur.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Arthur: " + devArthur.getConteudosConcluidos());
        System.out.println("XP: " + devArthur.calcularTotalXp());
    }
}
