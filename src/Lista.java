
public class Lista {

    private No inicio;
    private int quantidade;

    //Criando a lista
    public Lista() {
        this.inicio = null;
        this.quantidade = 0;
    }

    //Verificando se a lista está vazia
    public boolean isVazia() {
        return this.inicio == null;
    }

    //Se a lista estiver vazia, aponte para o inicio o nó que está sendo passado
    //Senão, aponte o nó que está passando para o inicio e troque o inicio para o nó que está passando
    //É importante primeiro apontar para o inicial para depois trocar, senão perdemos a referência;
    public void inserirNoInicio(No no) {
        if (isVazia()) {
            this.inicio = no;
        } else {
            no.setProximo(this.inicio);
            this.inicio = no;
        }
        this.quantidade++;
    }

    //Imprimindo a lista
    public void imprimir() {
        if (isVazia()) {
            System.out.println("A lista está vazia, chefe!");
        } else {
            No aux = inicio;
            while (aux != null) {
                System.out.println(aux.getElemento());
                aux = aux.getProximo();
            }
        }
    }

    //Adicionando no fim da lista
    public void inserirNoFim(No no) {
        if (isVazia()) {
            this.inicio = no;
        } else {
            No aux = this.inicio;
            while (aux.getProximo() != null) {
                aux = aux.getProximo();
            }
            aux.setProximo(no);
        }
        this.quantidade++;
    }

    //Inserir em qualquer posição da lista
    public void inserir(No no, int posicao) {
        if (isVazia() || posicao <= 1) {
            this.inserirNoInicio(no);
        } else if (posicao > quantidade) {
            this.inserirNoFim(no);
        } else {
            No aux = this.inicio;
            No ant = null;

            for (int i = 1; i < posicao; i++) {
                ant = aux;
                aux = aux.getProximo();
            }

            no.setProximo(ant.getProximo());
            ant.setProximo(no);
        }
        this.quantidade++;
    }

    //Remover
    public No remover(int posicao) {
        No aux = null;
        if (!isVazia()) {
            aux = this.inicio;
            No ant = null;

            if (posicao == 1) {
                this.inicio = this.inicio.getProximo();
                this.quantidade--;
            } else if (posicao <= this.quantidade) {
            }
            for (int i = 1; i < posicao; i++) {
                ant = aux;
                aux = aux.getProximo();
            }

            ant.setProximo(aux.getProximo());
            aux.setProximo(null);
            this.quantidade--;
        }

        return aux;
    }

    //Quantidade de número pares
    public int qtdNumerosPares() {
        No aux = null;
        int contador = 0;
        if (!isVazia()) {
            aux = this.inicio;
            while (aux != null) {
                if (aux.getElemento() % 2 == 0) {
                    contador++;
                    aux = aux.getProximo();
                } else {
                    aux = aux.getProximo();
                }
            }
            return contador;
        } else {
            System.out.println("A lista está vazia!");
            return contador;
        }
    }

    //Número pares da lista
    public void numeroPares() {
        No aux = null;
        if (!isVazia()) {
            aux = this.inicio;
            while (aux != null) {
                if (aux.getElemento() % 2 == 0) {
                    System.out.println(aux.getElemento());
                    aux = aux.getProximo();
                } else {
                    aux = aux.getProximo();
                }
            }
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    //Média da lista
    public double mediaLista() {
        No aux = null;
        double media = 0;
        double quantidade = 0;
        double acumulador = 0;
        if (!isVazia()) {
            aux = this.inicio;
            while (aux != null) {
                acumulador += aux.getElemento();
                quantidade++;
                aux = aux.getProximo();
            }
            media = acumulador / quantidade;
            return media;
        } else {
            System.out.println("A lista está vazia!");
            return media;
        }
    }

    //Insesir valor após valor determinado
    public void inserirApos(No n1, No n2) {
        No aux = null;
        if (isVazia()) {
            this.inserirNoInicio(n2);
        } else {
            aux = this.inicio;
            int posi = 1;
            while (aux != null) {
                if (aux.getElemento() == n1.getElemento()) {
                    this.inserir(n2, posi + 1);
                    System.out.println("Inserido na posição " + (posi + 1));
                    break;
                } else {
                    aux = aux.getProximo();
                    posi++;
                }
            }
        }
    }

    public void inverter(Lista l) {
        No aux = null;
        Lista invertida = null;
        Lista listaaux = l;
        if (!isVazia()) {
            aux = listaaux.inicio;
            invertida = new Lista();
            while (aux != null) {
                invertida.inserirNoInicio(new No(aux.getElemento()));
                aux = aux.getProximo();
            }
            invertida.imprimir();
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public boolean excluirN(Lista l, int n) {
        No aux = null;
        int posi = 0;
        Lista lista;
        if (!isVazia()) {
            lista = new Lista();
            aux = this.inicio;
            while (aux != null) {
                while (posi != n) {
                    lista.inserirNoFim(new No(aux.getElemento()));
                    aux = aux.getProximo();
                    posi++;
                }
                aux = aux.getProximo();
            }
            lista.imprimir();
            return true;
        } else {
            return false;
        }
    }

    public boolean maior() {
        No aux = null;
        int maiorPosicao = 0;
        int maiorValor = 0;
        int contador = 0;
        if (!isVazia()) {
            aux = this.inicio;
            while (aux != null) {
                if (aux.getElemento() > maiorValor) {
                    maiorValor = aux.getElemento();
                    maiorPosicao = contador;
                }
                contador++;
                aux = aux.getProximo();
            }
            System.out.println("Maior Valor: " + maiorValor);
            System.out.println("Posição: " + (maiorPosicao + 1));
            return true;
        } else {
            return false;
        }
    }

    //Manter lista atualizada
    public boolean atualizar() {
        return true;
    }

    //Trocar dos elementos de posição (9)
    public boolean trocar(No n1, No n2) {
        No aux = null;
        if (!isVazia()) {
            aux = this.inicio;
            int posi = 1;
            int p1 = 0;
            int p2 = 0;
            while (aux != null) {
                if (n1.getElemento() == aux.getElemento()) {
                    p1 = posi;
                }
                if (n2.getElemento() == aux.getElemento()) {
                    p2 = posi;
                }
                aux = aux.getProximo();
                posi++;

                if (p1 != 0 && p2 != 0) {
                    this.remover(p2);
                    this.inserir(new No(n1.getElemento()), p2);

                    this.remover(p1);
                    this.inserir(new No(n2.getElemento()), p1);

                }
            }
            return true;
        } else {
            System.out.println("A lista está vazia!\nOperação não realizada.");
            return false;
        }
    }

    //Clonar lista
    public boolean clonar(Lista original) {
        No aux = null;
        if (original != null) {
            aux = original.inicio;
            while (aux != null) {
                this.inserirNoFim(new No(aux.getElemento()));
                aux = aux.getProximo();
            }
            return true;
        } else {
            System.out.println("A lista está vazia!");
            return false;
        }
    }

    //Somar valores
    public int somar(Lista l) {
        No aux = null;
        int acumulador = 0;
        if (!isVazia()) {
            aux = l.inicio;
            while (aux != null) {
                acumulador += aux.getElemento();
                aux = aux.getProximo();
            }
            return acumulador;
        } else {
            System.out.println("A lista está vazia!");
            return 0;
        }
    }

    //Adicionar elementos da lista 1 na lista 2
    public void adicionarElementos(Lista lista1, Lista lista2) {
        No aux = null;
        aux = lista1.inicio;
        while (aux != null) {
            lista2.inserirNoFim(new No(aux.getElemento()));
            aux = aux.getProximo();
        }
        lista2.imprimir();
    }

    //Invertendo l1 e adicionando em l2
    public void adicionandoInvertendo(Lista lista1, Lista lista2) {
        No aux = null;
        lista1.inverter(lista1);
        aux = lista1.inicio;
        while (aux != null) {
            lista2.inserirNoFim(new No(aux.getElemento()));
            aux = aux.getProximo();
        }
        lista2.imprimir();
    }

    public void eliminarRepetidos(Lista lista1, Lista lista2) {
        No aux = null;
        No aux1 = null;
        aux = lista1.inicio;
        while (aux != null) {
            if(this.contem(aux, lista1)){

            }

        }
        lista2.imprimir();
    }

    public int contem(No n1, Lista l1){
        No aux = null;
        int posi = 0;
        if(l1 != null){
            aux = l1.inicio;
            while(aux != null){
                if(aux.getElemento() == n1.getElemento()){
                    return posi+1;
                }
                aux.getProximo();
                posi++;
            }
        }else{
            System.out.println("Como pesquisar se a lista ta vázia?");
            return false;
        }
    }
}
