package br.edu.umfg.dip.legado;
//classe de baixo nivel
public class EmailService {
    public void enviarEmail(String remetente,
                          String destinatario,
                          String mensagem){
        System.out.println("De: " + remetente + "\n" +
                "Para: " + destinatario + "\n" +
                "Mensagem: " + mensagem);
    }
}
