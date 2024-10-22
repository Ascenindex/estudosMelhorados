public class Biblioteca {
     private String nomeDoLivro;
     private String nomeDoAutor;
     private String dataDePublicacao;
     private String genero;
     private String editora;
     private String idioma;


     // Construtor
     public Biblioteca(String nomeDoLivro, String nomeDoAutor, String dataDePublicacao, String genero, String editora, String idioma) {
          this.nomeDoLivro = nomeDoLivro;
          this.nomeDoAutor = nomeDoAutor;
          this.dataDePublicacao = dataDePublicacao;
          this.genero = genero;
          this.editora = editora;
          this.idioma = idioma;
     }
     
     // Método para imprimir as informações do livro
     public void imprimirLivro() {
          System.out.println("Nome do Livro: " + nomeDoLivro);
          System.out.println("Nome do Autor: " + nomeDoAutor);
          System.out.println("Data de Publicação: " + dataDePublicacao);
          System.out.println("Genero: " + genero);
          System.out.println("Editora: " + editora);
          System.out.println("Idioma: " + idioma);
     }

     // Método para adicionar livros a biblioteca
     public void adicionarLivro(String nomeDoLivro, String nomeDoAutor, String dataDePublicacao, String genero, String editora, String idioma) {
          this.nomeDoLivro = nomeDoLivro;
          this.nomeDoAutor = nomeDoAutor;
          this.dataDePublicacao = dataDePublicacao;
          this.genero = genero;
          this.editora = editora;
          this.idioma = idioma;
          System.out.println("Livro adicionado com sucesso!");
          imprimirLivro();
     }

     // Getters and Setters
     public String getNomeDoLivro() {
          return nomeDoLivro;
     }

     public void setNomeDoLivro(String nomeDoLivro) {
          this.nomeDoLivro = nomeDoLivro;
     }

     public String getNomeDoAutor() {
          return nomeDoAutor;
     }

     public void setNomeDoAutor(String nomeDoAutor) {
          this.nomeDoAutor = nomeDoAutor;
     }

     public String getDataDePublicacao() {
          return dataDePublicacao;
     }

     public void setDataDePublicacao(String dataDePublicacao) {
          this.dataDePublicacao = dataDePublicacao;
     }

     public String getGenero() {
          return genero;
     }

     public void setGenero(String genero) {
          this.genero = genero;
     }

     public String getEditora() {
          return editora;
     }

     public void setEditora(String editora) {
          this.editora = editora;
     }

     public String getIdioma() {
          return idioma;
     }

     public void setIdioma(String idioma) {
          this.idioma = idioma;
     }


}
