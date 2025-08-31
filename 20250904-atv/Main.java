public class Main {
    public static void main(String[] args) {

        ArvoreBinaria<Comment> arvore = new ArvoreBinaria<>();
        
        Comment comment1 = new Comment("User1", "This is 1 post", "This is 1 comment", "this is 1 image");
        Comment comment2 = new Comment("User2", "This is 2 post", "This is 2 comment", "this is 2 image");
        Comment comment3 = new Comment("User3", "This is 3 post", "This is 3 comment", "this is 3 image");
        Comment comment4 = new Comment("User4", "This is 4 post", "This is 4 comment", "this is 4 image");
        Comment comment5 = new Comment("User5", "This is 5 post", "This is 5 comment", "this is 5 image");
        Comment comment6 = new Comment("User6", "This is 6 post", "This is 6 comment", "this is 6 image");
        Comment comment7 = new Comment("User7", "This is 7 post", "This is 7 comment", "this is 7 image");


        arvore.inserir(comment4);
        arvore.inserir(comment1);
        arvore.inserir(comment7);
        arvore.inserir(comment3);
        arvore.inserir(comment6);
        arvore.inserir(comment5);        
        arvore.inserir(comment2);



        System.out.println("Pré-fixado:");
        arvore.imprimePreFixado();
        System.out.println();
        System.out.println();
        
        System.out.println("Pos-fixado:");
        arvore.imprimePosFixado();
        System.out.println();
        System.out.println();

        System.out.println("In-ordem:");
        arvore.imprimeInOrdem();
    }
}
