package br.edu.umfg.dip.legado;
//classe de alto nivel
public class UserService {
    private final String DEFAULT_EMAIL = "minha.empresa@email.com";

    private EmailService emailService;

    /*
    * A classe de alto nuvel UserService depende diretamente
    * da classe de baixo nivel EmailService.
    * Isso cria um acoplamento rigido e dificulta a subistiuição
    * do EmailService por outra implementação
    * */
    public UserService() {
        this.emailService = new EmailService(); // dependencia direta
    }

    public void registarUsuario(String email){
        String mensagem = "Bem vindo! Você foi registrado!";
        this.emailService.enviarEmail(DEFAULT_EMAIL, email, mensagem);
    }
}