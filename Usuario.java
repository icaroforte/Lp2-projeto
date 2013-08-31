import excecoes.TamanhoSenhaException; 
  
public class Usuario { 
  
    private String algarobatest;
    private String nome; 
    private String senha; 
    private String email; 
    private String fone; 
    private String endereco; 
  
    private final int TAMANHO_SENHA_MINIMA = 6; 
    private final int TAMANHO_SENHA_MAXIMA = 20; 
  
    public Usuario(String nome, String senha, String email, String endereco) { 
  
        if (nome.trim().equals("") || nome == null) 
            throw new NullPointerException("'nome' nao pode ser vazio ou null"); 
        if (endereco.trim().equals("") || endereco == null) 
            throw new NullPointerException( 
                    "'endereco' nao pode ser vazio ou null"); 
        if (email.trim().equals("") || email == null) 
            throw new NullPointerException( 
                    "'endereco' nao pode ser vazio ou null"); 
        /* 
         * Falta o tratamento para emails ja cadastrados. Aguardando a classe 
         * com o mapa de usuarios para poder implementar este tratamento. 2bjs 
         * para voces! 
         */
        if (senha.length() < TAMANHO_SENHA_MINIMA 
                || senha.length() > TAMANHO_SENHA_MAXIMA) 
            throw new TamanhoSenhaException( 
                    "A senha deve ter entre 6 e 20 elementos"); 
          
        // O sistema da gente vai permitir caracteres especiais na senha? 
          
        this.nome = nome; 
        this.email = email; 
        setEndereco(endereco); 
        setSenha(senha); 
        this.fone = ""; 
    } 
  
    /** 
     * Recupera o numero do telefone do usuario. 
     *  
     * @return String - numero do telefone 
     */
  
    public String getFone() { 
        return fone; 
    } 
  
    /** 
     * Altera o numero do telefone 
     *  
     * @param fone 
     *            - String - novo numero 
     */
  
    public void setFone(String fone) { 
        this.fone = fone; 
    } 
  
    public String getEndereco() { 
        return endereco; 
    } 
  
    public void setEndereco(String endereco) { 
        this.endereco = endereco; 
    } 
  
    public String getNome() { 
        return nome; 
    } 
  
    public String getEmail() { 
        return email; 
    } 
  
    public void setSenha(String senha) { 
        this.senha = senha; 
    } 
  
    @Override
    public String toString() { 
        return "Usuario [Nome=" + nome + ", Email=" + email + ", Fone=" + fone 
                + ", Endereco=" + endereco + "]"; 
    } 
  
    @Override
    public int hashCode() { 
        final int prime = 31; 
        int result = 1; 
        result = prime * result + ((email == null) ? 0 : email.hashCode()); 
        return result; 
    } 
  
    @Override
    public boolean equals(Object obj) { 
        if (obj instanceof Usuario) { 
            Usuario objeto = (Usuario) obj; 
            return getEmail().equals(objeto.getEmail()); 
        } 
        return false; 
    } 
  
} 
