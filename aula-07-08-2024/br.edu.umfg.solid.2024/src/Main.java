import br.edu.umfg.dip.PrincipioDeInversaoDeDependencia;
import br.edu.umfg.isp.PrincipioDeSegregacaoDeInterfaces;
import br.edu.umfg.lsp.PrincipioDeSubstituicaoDeLiskov;
import br.edu.umfg.ocp.PrincipioAbertoFechado;
import br.edu.umfg.srp.PrincipioDeResponsabilidadeUnica;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        System.out.println("EXECUTA SRP:");
        PrincipioDeResponsabilidadeUnica.executarLegado();
        System.out.println("\n");
        PrincipioDeResponsabilidadeUnica.executarRefatorado();

        System.out.println("\n\n");
        System.out.println("EXECUTA OCP:");

        PrincipioAbertoFechado.executarLegado();
        System.out.println("\n");
        PrincipioAbertoFechado.executarRefatorado();

        System.out.println("\n\n");
        System.out.println("EXECUTA LSP: ");

        PrincipioDeSubstituicaoDeLiskov.executarLegado();
        System.out.println("\n");
        PrincipioDeSubstituicaoDeLiskov.executarRefatorado();

        System.out.println("\n\n");

        System.out.println("EXECUTA ISP: ");

        PrincipioDeSegregacaoDeInterfaces.executarLegado();
        System.out.println("\n");
        PrincipioDeSegregacaoDeInterfaces.executarRefatorado();

        System.out.println("\n\n");

        System.out.println("EXECUTA DIP: ");
        PrincipioDeInversaoDeDependencia.executarLegado();
        System.out.println("\n");
        PrincipioDeInversaoDeDependencia.executarRefatorado();

        System.out.println("TESTE GIT");
    }
}