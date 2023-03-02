import java.util.Scanner;

public class ProduTeste {
    public Produto psoduto = new Produto();
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        ProduTeste teste = new ProduTeste();
        int opcao = 0;
        do{
            System.out.println("Menu");
            System.out.println("1. Cadastrar");
            System.out.println("2. Consultar");
            System.out.println("3. Registrar entrada");
            System.out.println("4. Registrar saida");
            System.out.println("5. Valor em reais do produto");
            System.out.println("9. Sair");
            System.out.println("Escolha sua opcao: ");
            opcao = Integer.parseInt(teste.sc.nextLine());
            switch (opcao) {
                case 1:
                    teste.execCadastrar();
                    break;
                case 2:
                    teste.execConsultar();
                    break;
                case 3:
                    teste.execRegistrarEntrada();
                    break;
                case 4:
                    teste.execRegistrarSaida();
                    break;
                case 5:
                    teste.execValorEmReais();
                    break;
                case 9:
                    System.out.println("Fim do Programa");
                    break;
                default:
                    System.out.println("Opcao Invalida!");
            }

        }while(opcao!=9);
    }
    public void execCadastrar(){
            System.out.println("Digite o codigo do produto: ");
            psoduto.setCodigo(Integer.parseInt(sc.nextLine()));
            System.out.println("Digite a descricao do produto: ");
            psoduto.setDescricao(sc.nextLine());
            System.out.println();
    }
    public void execConsultar(){
        psoduto.imprimir();
    }
    public void execRegistrarEntrada(){
        int qnt;
        System.out.println("Digite a quantidade a entrar no estoque: ");
        qnt = Integer.parseInt(sc.nextLine());
        psoduto.setQuantidadeEstoque(qnt);
        System.out.println("Quantidade adicionada com sucesso!");
    }
    public void execRegistrarSaida(){
        int qnt;
        System.out.println("Digite a quantidade a ser retirada do estoque: ");
        qnt = Integer.parseInt(sc.nextLine());
        boolean darSaida = psoduto.darSaida(qnt);
        if(darSaida){
            System.out.println("estoque retirado com sucesso!");
        }else{
            System.out.println("Nao possui produtos em estoque!");
        }
    }
    public void execValorEmReais(){
        double valorEmReais;
        System.out.println("Digite o valor do produto: ");
        valorEmReais = Double.parseDouble(sc.nextLine());
        psoduto.setValor(valorEmReais);
        System.out.println("Valor definido com sucesso!");
    }
}