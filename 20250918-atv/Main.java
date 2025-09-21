import java.util.concurrent.TimeUnit;

public class Main {
 
    public static void main(String[] args) throws InterruptedException {

        Comment comment1 = new Comment("UserC", "Post1", "This is a comment from UserC", "imageC.jpg");
        TimeUnit.MILLISECONDS.sleep(10);

        Comment comment2 = new Comment("UserA", "Post2", "This is a comment from UserA", "imageA.jpg");
        TimeUnit.MILLISECONDS.sleep(10);

        Comment comment3 = new Comment("UserB", "Post3", "This is a comment from UserB", "imageB.jpg");


        System.out.println(" --- Árvore ordenada por User usando compareTO --- ");
        ArvoreBinaria<Comment> arvoreUser = new ArvoreBinaria<>();

        arvoreUser.inserir(comment1);
        arvoreUser.inserir(comment2);
        arvoreUser.inserir(comment3);

        System.out.println("Pré-fixado Arvore User (mostrando a estrutura): ");
        arvoreUser.imprimePreFixado();
        System.out.println();

        System.out.print("Em-ordem Arvore User (mostrando ordenado): ");
        arvoreUser.imprimeEmOrdem();
        System.out.println();

        System.out.println("\n\n --- Árvore ordenada por Data de Criação usando Comparator --- ");
        ArvoreBinariaAlternativa<Comment> arvoreData = new ArvoreBinariaAlternativa<>(new CommentCreatedAtComparator());

        arvoreData.inserir(comment1);
        arvoreData.inserir(comment2);
        arvoreData.inserir(comment3);

        System.out.print("Pré-fixado Arvore Data (mostrando a estrutura): ");
        arvoreData.imprimePreFixado();
        System.out.println();

        System.out.print("Em-ordem Arvore Data (mostrando ordenado): ");
        arvoreData.imprimeEmOrdem();   
        System.out.println();
        

        // Existe diferenças em como as árvores são estruturadas.

        // Na árvore ordenada por User (compareTo), a ordem alfabética dos nomes dos usuários determina a estrutura.
        // Já na árvore ordenada por Data de Criação (Comparator), a ordem cronológica dos comentários determina a estrutura.

        // Isso pode levar a diferentes formas de árvore, mesmo com os mesmos elementos, como exemplificado abaixo:
        
        // Árvore ordenada por User (compareTo): UserA -> UserB -> UserC
        // Árvore ordenada por Data de Criação (Comparator): UserC -> UserA -> UserB

        // Isso ocorre pela forma como elas foram criadas, uma usando compareTo e outra com Comparator.
    }

}
