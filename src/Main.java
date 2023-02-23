import br.com.dio.desafio.dominio.Curso;
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

        System.out.println(curso1);
        System.out.println(curso2);

        System.out.println(mentoria1);
        System.out.println(mentoria2);
    }
}
