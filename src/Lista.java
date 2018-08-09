public class Lista {

    private No inicio;
    private int quantidade;

    //Criando a lista
    public Lista(){
        this.inicio = null;
        this.quantidade = 0;
    }

    //Verificando se a lista está vazia
    public boolean isVazia(){
        return this.inicio == null;
    }

    //Se a lista estiver vazia, aponte para o inicio o nó que está sendo passado
    //Senão, aponte o nó que está passando para o inicio e troque o inicio para o nó que está passando
    //É importante primeiro apontar para o inicial para depois trocar, senão perdemos a referência;
    public void inserirNoInicio(No no){
        if(isVazia()){
            this.inicio = no;
        }else{
            no.setProximo(this.inicio);
            this.inicio = no;
        }
        this.quantidade++;
    }

    //Imprimindo a lista
    public void imprimir(){
        if(isVazia()){
            System.out.println("A lista está vazia, chefe!");
        }else{
            No aux = inicio;
            while(aux != null){
                System.out.println(aux.getElemento());
                aux = aux.getProximo();
            }
        }
    }

    //Adicionando no fim da lista
    public void inserirNoFim(No no){
        if(isVazia()){
            this.inicio = no;
        }else{
            No aux = this.inicio;
            while(aux.getProximo() != null){
                aux = aux.getProximo();
            }
            aux.setProximo(no);
        }
        this.quantidade++;
    }

    //Inserir em qualquer posição da lista
    public void inserir(No no, int posicao){
        if(isVazia() || posicao <= 1){
            this.inserirNoInicio(no);
        }else if(posicao > quantidade){
            this.inserirNoFim(no);
        }else{
            No aux = this.inicio;
            No ant = null;

            for (int i = 1; i < posicao; i++){
                ant = aux;
                aux = aux.getProximo();
            }

            no.setProximo(ant.getProximo());
            ant.setProximo(no);
        }
        this.quantidade++;
    }
}
