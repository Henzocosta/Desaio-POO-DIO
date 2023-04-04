package br.com.dio.desafio.dominio;


import java.time.LocalDate;
import java.util.Deque;


public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descricao curso JavaScript");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descricao Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
        */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("BootCamp Java Developer");
        bootcamp.setDescricao("Descricao BootCamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Henzo");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: " + dev.getConteudosIncristos());
        dev.progredir();
        dev.progredir();
        System.out.println("----------------------");
        System.out.println("Conteudos Inscritos: " + dev.getConteudosIncristos());
        System.out.println("Conteudos Concluidos: " + dev.getConteudosConcluidos());
        System.out.println("XP: " + dev.calculartotalXp());


        System.out.println("----------------------");

        Dev dev2 = new Dev();
        dev.setNome("Esmeralda");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos: " + dev2.getConteudosIncristos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("----------------------");
        System.out.println("Conteudo Inscritos: " + dev2.getConteudosIncristos());
        System.out.println("Conteudo Concluidos: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calculartotalXp());



    }
}
