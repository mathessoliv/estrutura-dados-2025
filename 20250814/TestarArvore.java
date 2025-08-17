public class TestarArvore {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        arvore.inserir(20);
        arvore.inserir(10);
        arvore.inserir(30);
        arvore.inserir(40);
        arvore.inserir(5);
        arvore.inserir(35);

        arvore.imprimirEstrutura();
    }
}
