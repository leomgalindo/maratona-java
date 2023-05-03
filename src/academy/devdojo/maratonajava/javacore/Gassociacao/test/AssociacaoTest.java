package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        System.out.println("Vídeo 70 - Orientação Objetos - Associação pt 05 - Exercício Associação");
        Local local1 = new Local("EAD");
        Local local2 = new Local("Presencial");

        Aluno aluno1 = new Aluno("Leo", 25);
        Aluno aluno2 = new Aluno("Bia", 22);
        Aluno aluno3 = new Aluno("Enzo", 19);
        Aluno[] alunos1 = {aluno1, aluno3};
        Aluno[] alunos2 = {aluno2};

        Professor professor1 = new Professor("Cleber", "Back-end");
        Professor professor2 = new Professor("Tabata", "Front-ent");

        Seminario seminario1 = new Seminario("Java", alunos1, local1);
        Seminario seminario2 = new Seminario("HTML", alunos2, local2);
        Seminario[] seminarios1 = {seminario1, seminario2};
        Seminario[] seminarios2 = {seminario2};

        professor1.setSeminarios(seminarios1);
        professor2.setSeminarios(seminarios2);

        professor1.imprime();
        System.out.println("--------------------");
        professor2.imprime();
    }
}
