package Application;

import java.time.LocalDate;

import entities.Bootcamp;
import entities.Curso;
import entities.Dev;
import entities.Mentoria;

public class Main {

	public static void main (String [] args) {
		
		Curso curso1 = new Curso();
        curso1.setTitulo("curso de POO java");
        curso1.setDescricao("Curso de Programação Orientada Objeto em Java ");
        curso1.setCargaHoraria(60);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javascript");
        curso2.setDescricao("Curso nivel iniciante de javascript");
        curso2.setCargaHoraria(30);

        Mentoria mentoriajava = new Mentoria();
        mentoriajava.setTitulo("mentoria de java");
        mentoriajava.setDescricao("Mentoria de POO");
        mentoriajava.setData(LocalDate.now());

        Mentoria mentoriajavascript = new Mentoria();
        mentoriajavascript.setTitulo("mentoria de javascript");
        mentoriajavascript.setDescricao("Mentoria de POO");
        mentoriajavascript.setData(LocalDate.now());
     

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(mentoriajava);
        
        
        Bootcamp bootcamp2 = new Bootcamp();
        bootcamp2.setNome("Bootcamp Javascript ");
        bootcamp2.setDescricao("Descrição Bootcamp Javascript");
        bootcamp2.getConteudos().add(curso2);
        bootcamp2.getConteudos().add(mentoriajavascript);

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos Inscritos Gabriel:" + devGabriel.getConteudosInscritos());
        devGabriel.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Gabriel:" + devGabriel.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Gabriel:" + devGabriel.getConteudosConcluidos());
        System.out.println("XP:" + devGabriel.calcularTotalXp());

        System.out.println("-------");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp2);
        System.out.println("Conteúdos Inscritos Maria:" + devMaria.getConteudosInscritos());
        devMaria.progredir();
        devMaria.progredir();
        devMaria.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Maria:" + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Maria:" + devMaria.getConteudosConcluidos());
        System.out.println("XP:" + devMaria.calcularTotalXp());

		
		
	
	}
}
