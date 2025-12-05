import java.util.Date;

public class Cliente extends Pessoa {
    private Date dataNascimento;

    public Cliente(String nome, String cpf, Endereco endereco, Date dataNascimento) {
        super(nome, cpf, endereco);
        this.dataNascimento = dataNascimento;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }
}

