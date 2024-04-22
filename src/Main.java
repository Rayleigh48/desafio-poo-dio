
import br.com.dio.desafio.Bootcamp;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Dev;
import br.com.dio.desafio.Mentoria;



import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();


        curso1.setTitulo("curso java");
        curso1.setDescricao("curso de java da prof camila");
        curso1.setcargaHoraria(8);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria");
        mentoria.setDescricao("curso de java");
        mentoria.setData(LocalDate.now());


       // System.out.println(curso1);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descrição bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devGean = new Dev();
        devGean.setNome("Gean");
        devGean.inscreverBootcamp(bootcamp);
        System.out.println(devGean.getConteudosInscritos());
        devGean.progredir();

        System.out.println(devGean.getConteudosInscritos());
        System.out.println(devGean.getConteudosConcluidos());
        System.out.println("XP" + devGean.calcularTotalXp());

    }



}

