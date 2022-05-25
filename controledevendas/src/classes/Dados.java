package classes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dados {

    // Criando usuarios
    private int maxUsu = 12;
    //Criando produtos
    private int maxPro = 10;
    // Criando Clientes
    private int maxCli = 10;

    private Usuario msUsuarios[] = new Usuario[maxUsu];
    // Criando produtos
    private Produto msProdutos[] = new Produto[maxPro];

    private Cliente msClientes[] = new Cliente[maxCli];

    private int conUsu = 0;
    private int conPro = 0;
    private int conCli = 0;

    public Dados() {
        //Criando usuarios manuais
        Usuario mUsuario;
        mUsuario = new Usuario("adm", "Otavio", "Oliveira", "123", 1);
        msUsuarios[conUsu] = mUsuario;
        conUsu++;
        mUsuario = new Usuario("momo", "Emilia", "Santos", "123", 1);
        msUsuarios[conUsu] = mUsuario;
        conUsu++;
        mUsuario = new Usuario("prinxexa", "Joaquina", "Oliveira", "123", 2);
        msUsuarios[conUsu] = mUsuario;
        conUsu++;
        mUsuario = new Usuario("neneco", "Inacio", "Silva", "123", 1);
        msUsuarios[conUsu] = mUsuario;
        conUsu++;
        mUsuario = new Usuario("nenem", "Jose", "Januario", "123", 2);
        msUsuarios[conUsu] = mUsuario;
        conUsu++;
        mUsuario = new Usuario("negao", "Black", "Caetano", "123", 1);
        msUsuarios[conUsu] = mUsuario;
        conUsu++;
        mUsuario = new Usuario("bola", "Jose", "Vitorio", "123", 2);
        msUsuarios[conUsu] = mUsuario;
        conUsu++;
        mUsuario = new Usuario("pleta", "Milu", "Maria", "123", 1);
        msUsuarios[conUsu] = mUsuario;
        conUsu++;
        mUsuario = new Usuario("memegan", "Megan", "Maria", "123", 2);
        msUsuarios[conUsu] = mUsuario;
        conUsu++;
        mUsuario = new Usuario("cleitin", "Cleiton", "Jose", "123", 2);
        msUsuarios[conUsu] = mUsuario;
        conUsu++;
        mUsuario = new Usuario("rodolfo", "Rodolfo", "Jose", "123", 1);
        msUsuarios[conUsu] = mUsuario;
        conUsu++;

        //Cadastrando produtos
        Produto mProduto;
        mProduto = new Produto("1", "Arroz", 10, 0, "ggg");
        msProdutos[conPro] = mProduto;
        conPro++;
        mProduto = new Produto("2", "Feijão", 15, 2, "feijão preto");
        msProdutos[conPro] = mProduto;
        conPro++;
        mProduto = new Produto("3", "Açucar", 2, 0, "Açucar branco");
        msProdutos[conPro] = mProduto;
        conPro++;

        //Cadastrando Clientes
        Cliente mCliente;
        mCliente = new Cliente("1", "Lucas", "Andrade", Ultilidades.StringtoDate("1995/10/20"),
                "Rua Galileu Galilei", 81998586698, 1, 2, 1,"oi");
        msClientes[conCli] = mCliente;
        conCli++;
        mCliente = new Cliente("2", "Will", "Alves", Ultilidades.StringtoDate("1985/12/14"),
                "Rua da pinga", 819857-16354, 2, 1, 2, "");
        msClientes[conCli] = mCliente;
        conCli++;

    }

    // Usuarios
    public int numeroUsuarios() {
        return conUsu;
    }

    public Usuario[] getUsuarios() {
        return msUsuarios;
    }

    public boolean validarUsuario(String usuario, String senha) {

        boolean aux = false;
        for (int i = 0; i < conUsu; i++) {
            if (msUsuarios[i].getIdUsuario().equals(usuario)
                    && msUsuarios[i].getSenha().equals(senha)) {
                return true;
            }

        }
        return false;

    }

    public String adicionarUsuario(Usuario mUsuario) {
        if (conUsu == maxUsu) {
            return "Não é possível cadastrar mais usuarios (Número Máximo atingido)";
        }

        msUsuarios[conUsu] = mUsuario;
        conUsu++;
        return "Usuário cadastrado com sucesso";
    }

    public int posicaoUsuario(String usuario) {

        for (int i = 0; i < conUsu; i++) {
            if (msUsuarios[i].getIdUsuario().equals(usuario)) {
                return i;
            }

        }
        return -1;

    }

    public String editarUsuario(Usuario mUsuario, int pos) {
        msUsuarios[pos].setNome(mUsuario.getNome());
        msUsuarios[pos].setSnome(mUsuario.getSnome());
        msUsuarios[pos].setPerfil(mUsuario.getPerfil());
        msUsuarios[pos].setSenha(mUsuario.getSenha());

        return "Usuario editado com sucesso";
    }

    public String deletarUsuario(int pos) {
        for (int i = pos; i < conUsu - 1; i++) {
            msUsuarios[i] = msUsuarios[i + 1];
        }
        conUsu--;

        return "Usuário deletado com sucesso";
    }

    // Produtos
    public int numeroProdutos() {
        return conPro;
    }

    public Produto[] getProdutos() {
        return msProdutos;
    }

    public int posicaoProduto(String produto) {

        for (int i = 0; i < conPro; i++) {
            if (msProdutos[i].getIdProduto().equals(produto)) {
                return i;
            }

        }
        return -1;

    }

    public String adicionarProduto(Produto mProduto) {
        if (conPro == maxPro) {
            return "Não é possível cadastrar mais produtos (Número Máximo atingido)";
        }

        msProdutos[conPro] = mProduto;
        conPro++;
        return "Produto cadastrado com sucesso";
    }

    public String editarProduto(Produto mProduto, int pos) {
        msProdutos[pos].setDescricao(mProduto.getDescricao());
        msProdutos[pos].setPreco(mProduto.getPreco());
        msProdutos[pos].setImposto(mProduto.getImposto());
        msProdutos[pos].setAnotacao(mProduto.getAnotacao());

        return "Produto editado com sucesso";
    }

    public String deletarProduto(int pos) {
        for (int i = pos; i < conPro - 1; i++) {
            msProdutos[i] = msProdutos[i + 1];
        }
        conPro--;

        return "Produto deletado com sucesso";
    }

    // Clientes 
    public int numeroCliente() {
        return conCli;
    }

    public Cliente[] getCliente() {
        return msClientes;
    }

    public int posicaoCliente(String cliente) {

        for (int i = 0; i < conCli; i++) {
            if (msClientes[i].getIdCliente().equals(cliente)) {
                return i;
            }

        }
        return -1;

    }

    public String adicionarCliente(Cliente mCliente) {
        if (conCli == maxCli) {
            return "Não é possível cadastrar mais clientes (Número Máximo atingido)";
        }

        msClientes[conCli] = mCliente;
        conCli++;
        return "Cliente cadastrado com sucesso";
    }

    public String editarCliente(Cliente mCliente, int pos) {
        msClientes[pos].setNome(mCliente.getNome());
        msClientes[pos].setSNome(mCliente.getSNome());
        msClientes[pos].setNascimento(mCliente.getNascimento());
        msClientes[pos].setEndereço(mCliente.getEndereço());
        msClientes[pos].setTelefone(mCliente.getTelefone());
        msClientes[pos].setIdTipo(mCliente.getIdTipo());
        msClientes[pos].setEstado(mCliente.getEstado());
        msClientes[pos].setIdcidade(mCliente.getIdcidade());
        msClientes[pos].setData(mCliente.getData());

        return "Cliente editado com sucesso";
    }

    public String deletarCliente(int pos) {
        for (int i = pos; i < conCli - 1; i++) {
            msClientes[i] = msClientes[i + 1];
        }
        conCli--;

        return "Cliente deletado com sucesso";
    }

}
