public class Lista {

    private No inicio;

    //Criando a lista
    public Lista(){
        this.inicio = null;
    }

    //Verificando se a lista está vazia
    public boolean isVazia(){
        return this.inicio == null;
    }

    //Se a lista estiver vazia, aponte para o inicio o nó que está sendo passado
    //Senão, aponte o nó que está passando para o inicio e troque o inicio para o nó que está passando
    public void inserirNoInicio(No no){
        if(isVazia()){
            this.inicio = no;
        }else{
            no.setProximo(this.inicio);
            this.inicio = no;
        }
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
}
