public class Main {
  public static void main(String[] args) {
    Banco conta1 = new Banco("João", 31241234123L, 123456, 50, true);
    Banco conta2 = new Banco("Maria", 41234123412L, 321123, 50, false);
    conta1.abrirConta();
    conta1.depositar(100);
    conta1.sacar(50);
    conta1.fecharConta();
    conta1.transferir(50, conta2);
  }
}
