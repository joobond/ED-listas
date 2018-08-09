public class TestarLista {

    public static void main(String[] args) {
        Lista lista = new Lista();

        /*lista.inserirNoInicio(new No(45));
        lista.inserirNoInicio(new No(30));
        lista.inserirNoInicio(new No(28));*/

        lista.inserirNoFim(new No(40));
        lista.inserirNoFim(new No(15));
        lista.inserir(new No(2), 2);
        lista.inserir(new No(3), 2);

        lista.imprimir();

        try {
            System.out.println("Removido: "+lista.remover(1).getElemento());
        }catch(Exception e){
            System.out.println("Posição que o senhor tentou inserir não existe!");
        }


    }
}
