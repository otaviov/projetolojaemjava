package classes;

import formularios.frmClientes;
import formularios.frmProdutos;
import formularios.frmUsuarios;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
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

    // Salvar vendas
    private int numFatura = 0;

    public Dados() {
        //Criando usuarios manuais

        // Usuario mUsuario;
        /* mUsuario = new Usuario("adm", "Otavio", "Oliveira", "123", 1);
        msUsuarios[conUsu] = mUsuario;
        conUsu++;
         */
 /* Metodo para anular o metodo acima de criar usuarios manuais, chamando um por um
        e chamar todos com apenas um metodo
         */
        preencherUsuarios();

        //Cadastrando produtos
        preencherProdutos();

        //Cadastrando Clientes
        preencherClientes();

        preencherConfiguracao();

    }

    public int getNumeroFatura() {
        return numFatura;
    }

    public void setNumeroFatura(int nFatura) {
        this.numFatura = numFatura;
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

    //Validar se o usuario é administrador ou usuario comum
    public int getPerfil(String usuario) {

        for (int i = 0; i < conUsu; i++) {
            if (msUsuarios[i].getIdUsuario().equals(usuario)) {
                return msUsuarios[i].getPerfil();
            }
        }
        return -1;
    }

    public void trocarSenha(String usuario, String senha) {

        for (int i = 0; i < conUsu; i++) {
            if (msUsuarios[i].getIdUsuario().equals(usuario)) {
                msUsuarios[i].setSenha(senha);
                return;
            }
        }
    }

    public String adicionarUsuario(Usuario mUsuario) {
        if (conUsu == maxUsu) {
            return "Não é possível cadastrar mais usuarios (Número Máximo atingido)";
        }
        // Pegar nome e sobrenome do usuario
        String nomeUsu = frmUsuarios.txtNome.getText();
        String sobrNomeUsu = frmUsuarios.txtsnome.getText();
        
        msUsuarios[conUsu] = mUsuario;
        conUsu++;
        return "Usuário " + nomeUsu + " " + sobrNomeUsu + " cadastrado com sucesso";
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

        // Pegar nome do usuario
        String nomeUsu = frmUsuarios.txtNome.getText();
        String sobrNomeUsu = frmUsuarios.txtsnome.getText();
        
        return "Usuario " + nomeUsu + " " + sobrNomeUsu + " editado com sucesso";
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

        // Pegar o produto digitado
        String produtoNome = frmProdutos.txtDescricao.getText();
        
        msProdutos[conPro] = mProduto;
        conPro++;
        return "Produto " + produtoNome + " cadastrado com sucesso";
    }

    public String editarProduto(Produto mProduto, int pos) {
        msProdutos[pos].setDescricao(mProduto.getDescricao());
        msProdutos[pos].setPreco(mProduto.getPreco());
        msProdutos[pos].setImposto(mProduto.getImposto());
        msProdutos[pos].setAnotacao(mProduto.getAnotacao());

        // Pegar o produto digitado
        String produtoNome = frmProdutos.txtDescricao.getText();
        
        return "Produto " + produtoNome + " editado com sucesso";
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
        
        //pegar o nome ddo cliente digitado 
        String nome = frmClientes.txtNome.getText();
        String sobreNome = frmClientes.txtSNome.getText();
        
        msClientes[conCli] = mCliente;
        conCli++;
        return "Cliente " + nome + " " + sobreNome + " cadastrado com sucesso ";
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
        
        //pegar o nome ddo cliente digitado 
        String nome = frmClientes.txtNome.getText();
        String sobreNome = frmClientes.txtSNome.getText();

        return "Cliente " + nome + " " + sobreNome + " editado com sucesso";
    }

    public String deletarCliente(int pos) {
        for (int i = pos; i < conCli - 1; i++) {
            msClientes[i] = msClientes[i + 1];
        }
        conCli--;

        return "Cliente deletado com sucesso";
    }

    public void salvarTodo() {
        salvarUsuarios();
        salvarClientes();
        salvarProdutos();
        salvarConfiguracao();

    }

    public void salvarUsuarios() {
        FileWriter fw = null;
        // Escrever os usuarios cadastrados
        PrintWriter pw = null;

        try {
            fw = new FileWriter("Data/usuarios.txt");
            pw = new PrintWriter(fw);

            for (int i = 0; i < conUsu; i++) {
                pw.println(msUsuarios[i].toString());

            }
        } catch (Exception e1) {
            e1.printStackTrace();

        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void salvarClientes() {

        FileWriter fw = null;
        PrintWriter pw = null;

        try {
            fw = new FileWriter("Data/clientes.txt");
            pw = new PrintWriter(fw);

            for (int i = 0; i < conCli; i++) {
                pw.println(msClientes[i].toString());

            }
        } catch (Exception e1) {
            e1.printStackTrace();

        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void salvarProdutos() {

        FileWriter fw = null;
        PrintWriter pw = null;

        try {
            fw = new FileWriter("Data/produtos.txt");
            pw = new PrintWriter(fw);

            for (int i = 0; i < conPro; i++) {
                pw.println(msProdutos[i].toString());

            }
        } catch (Exception e1) {
            e1.printStackTrace();

        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void salvarConfiguracao() {
        FileWriter fw = null;
        PrintWriter pw = null;

        try {
            fw = new FileWriter("Data/Configuracao.ini");
            pw = new PrintWriter(fw);

            pw.println("[Geral]");
            pw.println("FaturaAtual=" + numFatura);

        } catch (Exception e1) {
            e1.printStackTrace();

        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void preencherUsuarios() {

        File arquivo = null;
        // Ler os arquivos que foram escritos
        FileReader fr = null;
        BufferedReader br = null;

        try {
            arquivo = new File("Data/usuarios.txt");
            fr = new FileReader(arquivo);
            br = new BufferedReader(fr);

            int pos;
            String aux;
            String linha;

            String idUsuario;
            String nome;
            String snome;
            String senha;
            int perfil;

            while ((linha = br.readLine()) != null) {

                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                idUsuario = aux;
                linha = linha.substring(pos + 1);

                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                nome = aux;
                linha = linha.substring(pos + 1);

                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                snome = aux;
                linha = linha.substring(pos + 1);

                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                senha = aux;
                linha = linha.substring(pos + 1);

                perfil = Integer.parseInt(linha);

                Usuario mUsuario = new Usuario(
                        idUsuario,
                        nome,
                        snome,
                        senha,
                        perfil
                );
                msUsuarios[conUsu] = mUsuario;
                conUsu++;
            }

        } catch (Exception e1) {
            e1.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();

            }
        }

    }

    public void preencherProdutos() {

        File arquivo = null;
        // Ler os arquivos que foram escritos
        FileReader fr = null;
        BufferedReader br = null;

        try {
            arquivo = new File("Data/produtos.txt");
            fr = new FileReader(arquivo);
            br = new BufferedReader(fr);

            int pos;
            String aux;
            String linha;

            String idProduto;
            String descricao;
            float preco;
            int imposto;
            String anotacao;

            while ((linha = br.readLine()) != null) {

                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                idProduto = aux;
                linha = linha.substring(pos + 1);

                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                descricao = aux;
                linha = linha.substring(pos + 1);

                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                preco = Float.parseFloat(aux);
                linha = linha.substring(pos + 1);

                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                imposto = Integer.parseInt(aux);
                linha = linha.substring(pos + 1);

                anotacao = linha;

                Produto mProduto = new Produto(
                        idProduto,
                        descricao,
                        preco,
                        imposto,
                        anotacao
                );
                msProdutos[conPro] = mProduto;
                conPro++;
            }

        } catch (Exception e1) {
            e1.printStackTrace();

        } finally {

            try {
                if (fr != null) {
                    fr.close();

                }
            } catch (Exception e2) {
                e2.printStackTrace();

            }
        }
    }

    public void preencherClientes() {

        File arquivo = null;
        // Ler os arquivos que foram escritos
        FileReader fr = null;
        BufferedReader br = null;

        try {
            arquivo = new File("Data/clientes.txt");
            fr = new FileReader(arquivo);
            br = new BufferedReader(fr);

            int pos;
            String aux;
            String linha;

            String idCliente;
            String nome;
            String SNome;
            Date Nascimento;
            String endereço;
            String telefone;
            int idTipo;
            int estado;
            int idcidade;
            String Data;

            while ((linha = br.readLine()) != null) {

                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                idCliente = aux;
                linha = linha.substring(pos + 1);

                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                nome = aux;
                linha = linha.substring(pos + 1);

                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                SNome = aux;
                linha = linha.substring(pos + 1);

                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                Nascimento = Ultilidades.StringtoDate(aux);
                linha = linha.substring(pos + 1);

                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                endereço = aux;
                linha = linha.substring(pos + 1);

                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                telefone = aux;
                linha = linha.substring(pos + 1);

                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                idTipo = Integer.parseInt(aux);
                linha = linha.substring(pos + 1);

                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                estado = Integer.parseInt(aux);
                linha = linha.substring(pos + 1);

                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                idcidade = Integer.parseInt(aux);
                linha = linha.substring(pos + 1);

                Data = linha;

                Cliente mCliente = new Cliente(
                        idCliente,
                        nome,
                        SNome,
                        Nascimento,
                        endereço,
                        telefone,
                        idTipo,
                        estado,
                        idcidade,
                        Data
                );
                msClientes[conCli] = mCliente;
                conCli++;
            }

        } catch (Exception e1) {
            e1.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();

            }
        }

    }

    public void preencherConfiguracao() {

        File arquivo = null;
        // Ler os arquivos que foram escritos
        FileReader fr = null;
        BufferedReader br = null;

        try {
            arquivo = new File("Data/Configuracao.ini");
            fr = new FileReader(arquivo);
            br = new BufferedReader(fr);

            String linha;

            while ((linha = br.readLine()) != null) {
                if (linha.startsWith("FaturaAtual=")) {
                    numFatura = Integer.parseInt((linha.substring(12)));
                }
            }

        } catch (Exception e1) {
            e1.printStackTrace();

        } finally {

            try {
                if (fr != null) {
                    fr.close();

                }
            } catch (Exception e2) {
                e2.printStackTrace();

            }
        }
    }
}
