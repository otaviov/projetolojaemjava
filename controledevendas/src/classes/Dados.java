package classes;

import javax.swing.JOptionPane;


public class Dados {
    
    private int maxUsu = 50;
    //Criando produtos
    private int maxPro = 20;
    // Criando usuarios
    private Usuario msUsuarios[] = new Usuario[maxUsu];
    // Criando produtos
    private Produto msProdutos[] = new Produto[maxPro];
    
    private int conUsu = 0;
    private int conPro = 0;

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
        mProduto = new Produto ("1", "Arroz", 10, 0, "ggg");
        msProdutos[conPro] = mProduto;
        conPro++;
        
        
        mProduto = new Produto ("2", "Feijão", 15, 2, "feijão preto");
        msProdutos[conPro] = mProduto;
        conPro++;
        
       
        mProduto = new Produto ("3", "Açucar", 2, 0, "Açucar branco");
        msProdutos[conPro] = mProduto;
        conPro++;
        
        

    }

    public int numeroUsuarios() {
        return conUsu;
    }
    
    public int numeroProdutos() {
        return conPro;
    }

    public Usuario[] getUsuarios() {
        return msUsuarios;
    }
    
    public Produto[] getProdutos() {
        return msProdutos;
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

    public int posicaoUsuario(String usuario) {

        for (int i = 0; i < conUsu; i++) {
            if (msUsuarios[i].getIdUsuario().equals(usuario)) {
                return i;
            }

        }
        return -1;

    }

    public int posicaoProduto(String produto) {

        for (int i = 0; i < conPro; i++) {
            if (msProdutos[i].getIdProduto().equals(produto)) {
                return i;
            }

        }
        return -1;

    }
    
    public String adicionarUsuario(Usuario mUsuario) {
        if (conUsu == maxUsu) {
            return "Não é possível cadastrar mais usuarios (Número Máximo atingido)";
        }

        msUsuarios[conUsu] = mUsuario;
        conUsu++;
        return "Usuário cadastrado com sucesso" ;
    }
    
    public String adicionarProduto(Produto mProduto) {
        if (conPro == maxPro) {
            return "Não é possível cadastrar mais produtos (Número Máximo atingido)";
        }

        msProdutos[conPro] = mProduto;
        conPro++;
        return "Produto cadastrado com sucesso" ;
    }

    public String editarUsuario(Usuario mUsuario, int pos) {
        msUsuarios[pos].setNome(mUsuario.getNome());
        msUsuarios[pos].setSnome(mUsuario.getSnome());
        msUsuarios[pos].setPerfil(mUsuario.getPerfil());
        msUsuarios[pos].setSenha(mUsuario.getSenha());

        return "Usuario editado com sucesso";
    }
    
    public String editarProduto(Produto mProduto, int pos) {
        msProdutos[pos].setDescricao(mProduto.getDescricao());
        msProdutos[pos].setPreco(mProduto.getPreco());
        msProdutos[pos].setImposto(mProduto.getImposto());
        msProdutos[pos].setAnotacao(mProduto.getAnotacao());

        return "Produto editado com sucesso";
    }


    public String deletarUsuario(int pos) {
        for (int i = pos; i < conUsu - 1; i++) {
            msUsuarios[i] = msUsuarios[i + 1];
        }
        conUsu--;
        
        return "Usuário deletado com sucesso";
    }
    
    public String deletarProduto(int pos) {
        for (int i = pos; i < conPro - 1; i++) {
            msProdutos[i] = msProdutos[i + 1];
        }
        conPro--;
        
        return "Produto deletado com sucesso";
    }
    

}
