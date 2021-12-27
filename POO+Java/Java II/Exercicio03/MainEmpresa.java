public class MainEmpresa {

    public static void main(String[] args) {

        Analista analista = new Analista("Pedro", "de Lara", "123.456.789-01");
        Tecnico tecnico = new Tecnico("Augusto", "Liberato", "121.212.313-11");
        Gerente gerente = new Gerente("Lebron", "James", "444.333.222-11");
        FuncionarioPJ pj = new FuncionarioPJ("Kayne", "West", "414.313.212-12", 35.00);
        Diretor diretor = new Diretor("Marshal", "Mathers", "656.545.434-32");


        
        System.out.println("=.=.=.=.=.=..=.=.=.CONTROLE DE FUNCIONÁRIOS =.=.=.=.=.=.=.=.=.=.=.=.=.=.=.");
        System.out.println("\n\n=.=.=.=.=.=..=.=.=.META  BATIDA =.=.=.=.=.=..=.=.=.====");

        System.out.println("\nTÉCNICOS\n");
        tecnico.pagarSalario(true);

        System.out.println("\nANALISTAS\n");
        analista.pagarSalario(true);

        System.out.println("\nGERENTES\n");
        gerente.pagarSalario(true);

        System.out.println("\n\n=.=.=.=.=.=..=.=.=.META NÃO BATIDA =.=.=.=.=.=..=.=.=.=");

        System.out.println("\n+TÉCNICOS\n");
        tecnico.pagarSalario(false);


        System.out.println("\nANALISTAS\n");
        analista.pagarSalario(false);
        
        System.out.println("\nGERENTES\n");
        gerente.pagarSalario(false);


        System.out.println("\n=.=.=.=.=.=..=.=.=.PAGAMENTO DOS DIRETORES =.=.=.=.=.=..=.=.=.\n");

        diretor.pagarSalario(1235000.00);


        System.out.println("\n=.=.=.=.=.=..=.=.=.PAGAMENTO DOS FUNCIONÁRIOS PJ=.=.=.=.=.=..=.=.=.\n");

        pj.pagarSalario(240);
        
    }
}
