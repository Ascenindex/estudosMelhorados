public class Banco {
     private int numberOfBank;
     public String name;
     public int age;
     public String type;
     private boolean state = false;
          
     public void abrirConta(Boolean state) {
          if (!this.state) {
               System.out.println("Abrindo a conta");
          }
     }
}    
