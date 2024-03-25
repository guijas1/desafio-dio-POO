import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){


          Curso cs = new Curso();
          cs.setTitulo("JAVA EM 10 ANOS");
          cs.setDescricao("Aprenda java em 10 anos muito rápido e prático");
          cs.setCargaHoraria(87600);

          Curso cs1 = new Curso();
          cs.setTitulo("PHP BRABO");
          cs.setDescricao("php em 5 horas");
          cs.setCargaHoraria(60 * 5);

        Mentoria mt = new Mentoria();
        mt.setTitulo("Como atingir o sucesso");
        mt.setDescricao("eu carlos paviocchi te ensino a atingir o sucesso");
        mt.getData();


        BootCamp bt = new BootCamp();
        bt.setNome("Bootcamp java developer");
        bt.setDescricao("Descrição foda Bootcamp Java developer");
        bt.getConteudos().add(cs);
        bt.getConteudos().add(cs1);
        bt.getConteudos().add(mt);

        Dev dvG = new Dev();
        dvG.setNome("Guizin");
        dvG.inscreveBootcamp(bt);
        System.out.println("Contéudos Inscritos" + dvG.getCi());
        dvG.progredir();
        System.out.println("Conteúdos Concluidos" + dvG.getCc());
        System.out.println("XP: " + dvG.calcularXp());


        Dev devJoana = new Dev();
        devJoana.setNome("Joana");
         devJoana.inscreveBootcamp(bt);
        System.out.println("Contéudos Inscritos" + devJoana.getCi());
        devJoana.progredir();
        System.out.println("Conteúdos Concluidos" + devJoana.getCc());
        System.out.println("XP: " + devJoana.calcularXp());
    }
}