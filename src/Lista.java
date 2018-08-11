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
    public int qtdNumerosPares(){
        No aux = null;
        int contador = 0;
        if(!isVazia()){
            aux = this.inicio;
            while(aux != null){
                if(aux.getElemento()%2 == 0){
                    contador++;
                    aux = aux.getProximo();
                }else{
                    aux = aux.getProximo();
                }
            }
            return contador;
        }else{
            System.out.println("A lista está vazia!");
            return contador;
        }
    }

    //Número pares da lista
    public void numeroPares(){
        No aux = null;
        if(!isVazia()){
            aux = this.inicio;
            while(aux != null){
                if(aux.getElemento()%2 == 0){
                    System.out.println(aux.getElemento());
                    aux = aux.getProximo();
                }else{
                    aux = aux.getProximo();
                }
            }
        }else{
            System.out.println("A lista está vazia!");
        }
    }

    //Média da lista
    public double mediaLista(){
        No aux = null;
        double media = 0;
        double quantidade = 0;
        double acumulador = 0;
        if(!isVazia()){
            aux = this.inicio;
            while(aux != null){
                acumulador += aux.getElemento();
                quantidade++;
                aux = aux.getProximo();
            }
            media = acumulador/quantidade;
            return media;
        }else{
            System.out.println("A lista está vazia!");
            return media;
        }
    }

    //Insesir valor após valor determinado
    public void inserirApos(No n1, No n2){
        No aux = null;
        if(isVazia()){
            this.inserirNoInicio(n2);
        }else{
            aux = this.inicio;
            int posi = 1;
            while(aux != null){
                if(aux.getElemento() == n1.getElemento()){
                    this.inserir(n2, posi+1);
                    System.out.println("Inserido na posição "+(posi+1));
                    break;
                }else{
                    aux = aux.getProximo();
                    posi++;
                }
            }
        }
    }

    public void inverter(){
        No aux = null;
        No aux1 = inicio;
        No temp = aux1.getProximo();
        Lista invertida = new Lista();
        if(!isVazia()){
            while(aux1 != null){
                aux = aux1;
                aux1 = temp;
                invertida.inserirNoInicio(temp);
            }
        }else{
            System.out.println("A lista está vazia!");
        }
    }

    public boolean excluirN(int n){
        if(!isVazia() && n<this.quantidade){
            for(int i = 0; i <= n; i++){
                this.remover(i);
                System.out.println(i);
            }
            return true;
        }else{
            return false;
        }
    }

    public boolean maior(){
        No aux = null;
        int maiorPosicao = 0;
        int maiorValor = 0;
        int contador = 0;
        if(!isVazia()){
            aux = this.inicio;
            while(aux != null){
                if(aux.getElemento()>maiorValor){
                    maiorValor = aux.getElemento();
                    maiorPosicao = contador;
                }
                contador++;
                aux = aux.getProximo();
            }
            System.out.println("Maior Valor: "+maiorValor);
            System.out.println("Posição: "+(maiorPosicao+1));
            return true;
        }else{
            return false;
        }
    }

}
