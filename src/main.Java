public class Main 
{
    public static void main(String[] args) {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(8);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição do curso JavaScript");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria de Java");
        mentoria.setData(LocalDate.now());
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria de Java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJuliana = new Dev();
        devJuliana.setNome("Juliana");
        devJuliana.inscreverBootcamp(bootcamp);
        System .out.println("Conteúdos Inscritos: " + devJuliana.getConteudosInscritos());
        
        DevJuliana.progredir();

        System.out.println("-");
        System .out.println("Conteúdos Inscritos: " + devJuliana.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + devJuliana.getConteudosConcluidos());
        System.out.println("XP: " + devJuliana.calcularTotalXp());

        System.out.println("------");

        Dev devPablo = new Dev();
        devPablo.setNome("Pablo");
        devPablo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + devPablo.getConteudosInscritos());
        devPablo.progredir();
        devPablo.progredir();
        devPablo.progredir();
        devPablo.println("-");
        System.out.println("Conteúdos Inscritos: " + devPablo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + devPablo.getConteudosConcluidos());
    System.out.println("XP: " + devPablo.calcularTotalXp());
        
    }
}