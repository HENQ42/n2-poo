
public class Main {
    public static void main(String[] args) {
      
	
        Endereco endLoja = new Endereco("Avenida Goias", 100, "Goiânia", "GO");
        Endereco endCli = new Endereco("Endereco 2", 50, "Goiânia", "GO");
        
        Empresa minhaLoja = new Empresa("Tecnologia", "00.000/0001-00", endLoja);


        Vendedor vendedor = new Vendedor("Carlao", "123.456.789-00", endLoja, "V-01");
        Cliente cliente = new Cliente("Joao", "111.111.111-11", endCli, new Date());

        
        Categoria catEletronicos = new Categoria("Eletronicos");
        Fabricante fabDell = new Fabricante("Dell");
        
        Produto mouse = new Produto("Mouse", 50.00, catEletronicos, fabDell);
        Produto teclado = new Produto("Teclado", 150.00, catEletronicos, fabDell);

        
        Pedido pedido01 = new Pedido(cliente, vendedor, minhaLoja);
        
        pedido01.adicionarItem(mouse, 2);
        pedido01.adicionarItem(teclado, 1);
        
        
        TipoPagamento pix = new TipoPagamento("Pix");
        pedido01.setPagamento(pix);
        
        
        vendedor.registrarPedido(pedido01);

        System.out.println("Valor total do pedido: R$ " + pedido01.getValorTotal());
    }
}

