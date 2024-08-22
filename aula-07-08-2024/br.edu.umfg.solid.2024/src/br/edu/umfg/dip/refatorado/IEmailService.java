package br.edu.umfg.dip.refatorado;
//abstração
public interface IEmailService {
    void enviarEmail(String remetente,
                     String destinatario,
                     String mensagem);
}