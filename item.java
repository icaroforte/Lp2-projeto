public abstract class Item { 
  
    private String nome; 
    private String historicoUsuario;
    private Usuario usuarioAtual;
    private int numDeEmprestimos;
    private double estrelas;
    private Calendar date;
  
    
   public Item(String nome, Usuario doador){
	   
	   this.nome = nome;
	   this.doador = doador;
   }
   
    
   
   
} 
