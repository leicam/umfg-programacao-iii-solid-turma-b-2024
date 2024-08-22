package br.edu.umfg.dip;

import br.edu.umfg.dip.legado.UserService;
import br.edu.umfg.dip.refatorado.EmailServiceRefatorado;
import br.edu.umfg.dip.refatorado.IEmailService;
import br.edu.umfg.dip.refatorado.UserServiceRefatorado;

public class PrincipioDeInversaoDeDependencia {
    public static void executarLegado(){
        UserService userService = new UserService();
        userService.registarUsuario("teste1@mail.com");
    }

    //uso da classe UserServiceRefatorado com
    // injeção/inversão de dependencia
    public static void executarRefatorado(){
        IEmailService emailService
                = new EmailServiceRefatorado(); // pode ser substituido

        /*
        * A classe de alto nivel UserServiceRefatorado depende de
        * uma abstracao (interface IEmailService) em vez da implementação
        * (classe concreta EmailServiceRefatorado)
        * A classe de baixo nivel EmailServiceRefatorado imlpementa a
        * abstração (interface IEmailService), isso permite maior
        * flexibilidade e subistituição (por isso inversão de dependencias)*/
        UserServiceRefatorado usuarioService
                = new UserServiceRefatorado(emailService);

        usuarioService.registrar("teste1@email.com");
    }
}
