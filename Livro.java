import java.io.File; 
import java.io.FileNotFoundException; 
  
public class Livro implements Item { 
  
    private String titulo; 
    private String autor; 
    private String editora; 
    private String versao; 
    private String genero; 
    private double estrelas; 
    private Usuario usuarioAtual; 
    private File capa; 
  
    public Livro(String titulo, String autor, String editora, String genero, 
            String versao, Usuario doador) { 
  
        if (titulo.trim().equals("") || titulo == null) 
            throw new NullPointerException( 
                    "'titulo' nao pode ser vazio ou null"); 
        if (autor.trim().equals("") || autor == null) 
            throw new NullPointerException("'autor' nao pode ser vazio ou null"); 
        if (genero.trim().equals("") || genero == null) 
            throw new NullPointerException( 
                    "'genero' nao pode ser vazio ou null"); 
        if (editora.trim().equals("") || editora == null) 
            throw new NullPointerException( 
                    "'editora' nao pode ser vazio ou null"); 
        if (versao.trim().equals("") || versao == null) 
            throw new NullPointerException( 
                    "'versao' nao pode ser vazio ou null"); 
  
        this.titulo = titulo; 
        this.autor = autor; 
        this.editora = editora; 
        this.versao = versao; 
        this.estrelas = 0.0; 
        setUsuarioAtual(doador); 
  
    } 
  
    /*
     * testando
     */
    public Livro(String titulo, String autor, String editora, String genero, 
            String versao, Usuario doador, File capa) 
            throws FileNotFoundException { 
        this(titulo, autor, editora, genero, versao, doador); 
  
        /* 
         * Nao eh só com este if que faz a verificacao de um arquivo, geralmente 
         * eh com try cacth, vou pesquisar depois como é que faz com imagens. Um 
         * exemplo eh saber se o arquivo eh realmente uma imagem, pois pode 
         * muito bem ser um arquivo texto, e etc. 
         */
  
        if (capa == null) 
            throw new FileNotFoundException("Arquivo inexistente"); 
  
        setCapa(capa); 
    } 
  
    public String getGenero() { 
        return genero; 
    } 
  
    public double getEstrelas() { 
        return estrelas; 
    } 
  
    @Override
    public Usuario getUsuarioAtual() { 
        return usuarioAtual; 
    } 
  
    @Override
    public void setUsuarioAtual(Usuario usuario) { 
        usuarioAtual = usuario; 
    } 
  
    @Override
    public void favorita() { 
  
        // PENDENTE 
  
    } 
  
    public String getTitulo() { 
        return titulo; 
    } 
  
    public String getAutor() { 
        return autor; 
    } 
  
    public String getEditora() { 
        return editora; 
    } 
  
    public String getVersao() { 
        return versao; 
    } 
  
    public File getCapa() { 
        return capa; 
    } 
  
    public void setCapa(File capa) { 
        this.capa = capa; 
    } 
  
    @Override
    public String tipo() { 
        return "Livro"; 
    } 
  
    @Override
    public String toString() { 
        return "Livro [Titulo=" + titulo + ", Autor=" + autor + ", Editora="
                + editora + ", Versao=" + versao + ", Genero=" + genero + "]"; 
    } 
  
    @Override
    public int hashCode() { 
        final int prime = 31; 
        int result = 1; 
        result = prime * result + ((autor == null) ? 0 : autor.hashCode()); 
        result = prime * result + ((titulo == null) ? 0 : titulo.hashCode()); 
        return result; 
    } 
  
    @Override
    public boolean equals(Object obj) { 
        if (obj instanceof Livro) { 
            Livro objeto = (Livro) obj; 
            return getTitulo().equals(objeto.getTitulo()) 
                    && getAutor().equals(objeto.getAutor()); 
        } 
        return false; 
    } 
  
} 
