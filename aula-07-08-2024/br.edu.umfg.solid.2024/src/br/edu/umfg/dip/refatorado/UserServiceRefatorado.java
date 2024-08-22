package br.edu.umfg.dip.refatorado;

public class UserServiceRefatorado {
    private final String DEFAULT_EMAIL = "minha.empresa@email.com";
    private IEmailService emailService;

    //classe de alto nivel com recebe injeção/inversão
    // de depdencia via o metodo construtor
    public UserServiceRefatorado(IEmailService emailService) {
        this.emailService = emailService;
    }

    public void registrar(String email){
        String mensagem = "Bem vindo! Você foi registrado.";
        this.emailService.enviarEmail(DEFAULT_EMAIL, email, mensagem);
    }
}
