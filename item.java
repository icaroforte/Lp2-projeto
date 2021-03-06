import java.util.Calendar;

public abstract class Item implements Pesquisavel { 
  
    private String nome; 
    private String historicoUsuario;
    private Usuario usuarioAtual;
    private int numDeEmprestimos;
    private int numDeFavoritar;
    private double estrelas;
    private Calendar date;
  
    
   public Item(String nome, Usuario usuarioAtual){
	   
	   this.nome = nome;
	   this.usuarioAtual = usuarioAtual;
	   date = Calendar.getInstance();
	   numDeEmprestimos = 1;
	   numDeFavoritar = 0;
   }
   
  /*
   * metodo para favoritar o item, ele é void porque substitui diretamente o valor da variável "estrelas".
   * Tive de criar uma outra variável que é pra contabilizar quantas vezes este item já foi favoritado
   * começando em 0 e acrescentando 1 a medida que alguém quer favorita-lo!
   */
public void Favoritar (int valor){
	
	numDeFavoritar += 1;   
    estrelas = (estrelas + valor) / numDeFavoritar;
   
   }

public String getHistoricoUsuario() {
	return historicoUsuario;
}

public void setHistoricoUsuario(String historicoUsuario) {
	this.historicoUsuario = historicoUsuario;
}

public Usuario getUsuarioAtual() {
	return usuarioAtual;
}

public void setUsuarioAtual(Usuario usuarioAtual) {
	this.usuarioAtual = usuarioAtual;
}

public double getEstrelas() {
	return estrelas;
}


public String getNome() {
	return nome;
}

public int getNumDeEmprestimos() {
	return numDeEmprestimos;
}

public Calendar getDate() {
	return date;
}
   
} 