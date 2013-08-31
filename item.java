public interface Item { 
  
    public void favorita(); 
  
    public Usuario getUsuarioAtual(); 
  
    /** 
     * Altera o detentor atual do objeto para um novo. 
     *  
     * @param usuario 
     *            - Objeto da classe Usuario. 
     */
  
    public void setUsuarioAtual(Usuario usuario); 
  
    /** 
     * A categoria do item que está sendo tratado. 
     *  
     * @return String - o tipo do objeto. Ex:(software, livro, apostila, 
     *         documentario, e etc). 
     */
    public String tipo(); 
  
} 
