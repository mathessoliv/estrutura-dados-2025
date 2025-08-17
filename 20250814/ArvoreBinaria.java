public class ArvoreBinaria implements Arvore {

    private NodoArvore raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    // --- MÉTODO DE INSERÇÃO ---
    // Escreva seus métodos de inserção considerando
    // o método de pesquisa e pesquisaRecursiva como modelo
    // Você deve criar um método inserirRecursivo e
    // chamá-lo a partir do método inserir

    @Override
    public void inserir(int valor) {
        this.raiz = inserirRecursivo(raiz, valor);
    }

    private NodoArvore inserirRecursivo(NodoArvore noAtual, int valor) {
        if (noAtual == null) {
            return new NodoArvore(valor);
        } else if (noAtual.chave == valor) {
            return noAtual;
        }

        if (valor < noAtual.chave) {
            noAtual.filhoEsquerda = inserirRecursivo(noAtual.filhoEsquerda, valor);
            return noAtual;
        } else {
            noAtual.filhoDireita = inserirRecursivo(noAtual.filhoDireita, valor);
            return noAtual;
        }
    }

    // --- MÉTODO DE PESQUISA ---
    // Esse método é um modelo do tipo de recursão que pode
    // ser utilizado para implementar a pesquisa
    // em outras estruturas de dados e na inserção de
    // valores na árvore
    /**
     * Método público para pesquisar um valor na árvore.
     * 
     * @param valor O valor a ser procurado.
     * @return O nó que contém o valor, ou null se não for encontrado.
     */
    @Override
    public NodoArvore pesquisa(int valor) {
        return pesquisaRecursivo(this.raiz, valor);
    }

    /**
     * Método auxiliar recursivo para buscar um valor. [cite: 7]
     * Compara o valor com o nó atual e decide se continua a busca
     * na subárvore esquerda ou direita. [cite: 1, 7]
     *
     * @param noAtual O nó raiz da subárvore de busca.
     * @param valor   O valor a ser procurado.
     * @return O nó encontrado ou null.
     */
    private NodoArvore pesquisaRecursivo(NodoArvore noAtual, int valor) {
        if (noAtual == null || noAtual.chave == valor) {
            return noAtual;
        }

        if (valor < noAtual.chave) {
            return pesquisaRecursivo(noAtual.filhoEsquerda, valor);
        } else {
            return pesquisaRecursivo(noAtual.filhoDireita, valor);
        }
    }

    @Override
    public void remover(int valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remover'");
    }

    @Override
    public void imprime_preFixado() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'imprime_preFixado'");
    }

    public void imprimirEstrutura() {
        System.out.println("Estrutura da árvore (com direções):");
        if (raiz != null) {
            System.out.println("Raiz: " + raiz.chave);
            imprimirEstrutura(raiz, "", true);
        } else {
            System.out.println("Árvore vazia");
        }
    }

    private void imprimirEstrutura(NodoArvore no, String prefixo, boolean isUltimo) {
        if (no != null) {
            // Imprimir filhos
            if (no.filhoEsquerda != null || no.filhoDireita != null) {
                if (no.filhoEsquerda != null) {
                    System.out.println(prefixo + (no.filhoDireita != null ? "├── " : "└── ") +
                            "ESQ: " + no.filhoEsquerda.chave);
                    imprimirEstrutura(no.filhoEsquerda,
                            prefixo + (no.filhoDireita != null ? "│   " : "    "),
                            no.filhoDireita == null);
                }
                if (no.filhoDireita != null) {
                    System.out.println(prefixo + "└── DIR: " + no.filhoDireita.chave);
                    imprimirEstrutura(no.filhoDireita, prefixo + "    ", true);
                }
            }
        }
    }

}
