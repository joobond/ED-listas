public class TestarLista {

    public static void main(String[] args) {
        Lista lista = new Lista();

        /*lista.inserirNoInicio(new No(45));
        lista.inserirNoInicio(new No(30));
        lista.inserirNoInicio(new No(28));

        lista.inserirNoFim(new No(40));
        lista.inserirNoFim(new No(15));
        lista.inserir(new No(2), 2);
        lista.inserir(new No(3), 2);
        */


        /*
        try {
            System.out.println("Removido: "+lista.remover(1).getElemento());
        }catch(Exception e){
            System.out.println("Posição que o senhor tentou inserir não existe!");
        }
        */


        for (int i = 0; i < 10; i++){
            lista.inserirNoFim(new No(i));
        }

        lista.imprimir();
        System.out.println("------------------");
        System.out.println("Quantidade de números pares: "+lista.qtdNumerosPares());
        System.out.println("------------------");
        System.out.println("Número pares:");
        lista.numeroPares();
        System.out.println("------------------");
        System.out.println("Média lista:");
        System.out.println(lista.mediaLista());
        //lista.inserirApos(new No(4), new No(10));
        lista.imprimir();
        System.out.println("------------------");
        System.out.println("Lista invertida: ");
        lista.inverter(lista);
        System.out.println("------------------");
        System.out.println("Deu certo excluir? ");
        //System.out.println(lista.excluirN(lista,2));
        //lista.imprimir();
        System.out.println("------------------");
        System.out.println("Deu certo achar o maior? ");
        System.out.println(lista.maior());
        System.out.println("------------------");
        System.out.println("Trocar posição deu certo?? ");
        //System.out.println(lista.trocar(new No(0), new No(1)));


        //Lista clonada = new Lista();
        //clonada.clonar(lista);
        //clonada.imprimir();

        System.out.println("-------------------------------");
        // lista.adicionandoInvertendo(lista, lista);

        //System.out.println("Valor da soma: "+lista.somar(lista));

        Lista l2 = new Lista();
        l2.inserirNoInicio(new No(1));
        l2.inserirNoInicio(new No(2));
        lista.adicionarElementos(lista, l2);


    }
}
