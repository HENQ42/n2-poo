public class Vendedor extends Funcionario {

    public Vendedor(String nome, String cpf, Endereco endereco, String matricula) {
        super(nome, cpf, endereco, matricula);
    }
    
 
    public void registrarPedido(Pedido p) {
        System.out.println("Vendedor " + getNome() + " (Matrícula: " + getMatricula() + ") registrou o pedido.");
    }
}

