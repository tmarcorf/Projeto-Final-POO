package ParteGrafica;

/**
 *Classe usada para criar um acesso para os usuários
 * atráves de login e senha.
 * @author Mathews
 */
public class Acesso {
    private String login;
    private String senha;
    
    /**
     * Método que retorna o login do usuário.
     * @return String
     */
    public String getLogin(){
        return login;
    }
    
    /**
     * Método que configura o login do usuário.
     * @param login
     */
    public void setLogin(String login) {
        this.login = login;
    }
    
    /**
     * Método que configura a senha de um usuário.
     * @param senha 
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
