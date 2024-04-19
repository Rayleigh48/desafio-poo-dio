import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        Mentoria mentoria = new Mentoria();

        curso1.setTitulo("curso java");
        curso1.setDescricao("curso de java da prof camila");
        curso1.setCargaHoraria(9);

        mentoria.setTitulo("Mentoria");
        mentoria.setDescricao("curso de java");
        mentoria.setData(LocalDate.now());


        System.out.println(curso1);
        System.out.println(mentoria);

    }



}

