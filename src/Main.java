import com.dio.prj.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição do curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição do curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJoaquim = new Dev();
        devJoaquim.setNome("Joaquim");
        devJoaquim.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: "+ devJoaquim.getConteudosInscritos() );
        devJoaquim.progressao();

        System.out.println("Conteúdos inscritos: "+ devJoaquim.getConteudosInscritos() );
        System.out.println("Conteúdos concluídos: "+ devJoaquim.getConteudosConcluidos() );

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: "+ devMaria.getConteudosInscritos() );
        devMaria.progressao();

        System.out.println("Conteúdos inscritos: "+ devMaria.getConteudosInscritos() );
        System.out.println("Conteúdos concluídos: "+ devMaria.getConteudosConcluidos() );

    }
}
