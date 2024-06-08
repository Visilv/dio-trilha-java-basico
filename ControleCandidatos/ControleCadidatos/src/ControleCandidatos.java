import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;
public class ControleCandidatos {
    public static void main(String[] args){
        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};
        for(String candidato: candidatos) {
            entrandoEmContato(candidato);
        }
    }

    public static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else 
                System.out.println("CONTATO REALIZADO COM SUCESSO!");
        }while(continuarTentando && tentativasRealizadas<3);
        
        if (atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM O " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM O " + candidato + ", NÚMERO MÁXIMO DE TENTATIVAS " + tentativasRealizadas + " REALIZADA");
    }

    //método auxiliar
    public static boolean atender() {
        return new Random().nextInt(3)==1;
    } 

    public static void imprimirSelecionados() {
        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};
        
        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento...");

        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de n°" + (indice+1) + " é o " + candidatos[indice]);
        }
        System.out.println("Forma abreviada de interação FOR EACH");

        for(String candidato: candidatos ) {
            System.out.println("O candidato selecionado para a vaga foi o " + candidato);
        }
    } 
    
    public static void selecaoCandidatos() {
        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE"};
            int candidatosSelecionados = 0;
            int candidatoAtual = 0;
            double salarioBase = 2000.0;
            while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
                String candidato = candidatos[candidatoAtual];
                double salarioPretendido = valorPretendido();

                System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido );
                if(salarioBase >= salarioPretendido) {
                    System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                    candidatosSelecionados++;
                }
                candidatoAtual++;
            }
    }
    public static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    public static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA CANDIDATO");
        }else if (salarioBase == salarioPretendido)
            System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");
        else{
            System.out.println("AGUARDAR RESULTADO DE OUTROS CANDIDATOS");
        }
            
    }
}
