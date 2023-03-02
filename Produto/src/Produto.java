public class Produto {
    private int codigo;
    private String descricao;
    private double valor;
    private int quantidadeEstoque;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao(String s) {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidadeEstoque(int qnt) {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int qnt) {
        this.quantidadeEstoque = qnt;
    }
    void imprimir(){
        System.out.println("Codigo do produto: "+ codigo);
        System.out.println("Descico do produto: "+ descricao);
        System.out.println("Valor do produto: "+ valor);
        System.out.println("Quantidade em estoque do produto: "+ quantidadeEstoque);
    }
    void darEntrada(int qnt){
        qnt += quantidadeEstoque;
    }
    public boolean darSaida(int qnt){
        if(quantidadeEstoque >= qnt){
            quantidadeEstoque -= qnt;
            return true;
        }
         return false;
        }
    }

