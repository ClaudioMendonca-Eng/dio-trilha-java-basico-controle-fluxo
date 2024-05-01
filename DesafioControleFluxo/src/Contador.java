import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
        System.out.println("===================================================================== ");
        System.out.println(" ██████╗ ██████╗ ███╗   ██╗████████╗ █████╗ ██████╗  ██████╗ ██████╗ \n" +
                            "██╔════╝██╔═══██╗████╗  ██║╚══██╔══╝██╔══██╗██╔══██╗██╔═══██╗██╔══██╗\n" +
                            "██║     ██║   ██║██╔██╗ ██║   ██║   ███████║██║  ██║██║   ██║██████╔╝\n" +
                            "██║     ██║   ██║██║╚██╗██║   ██║   ██╔══██║██║  ██║██║   ██║██╔══██╗\n" +
                            "╚██████╗╚██████╔╝██║ ╚████║   ██║   ██║  ██║██████╔╝╚██████╔╝██║  ██║\n" +
                            " ╚═════╝ ╚═════╝ ╚═╝  ╚═══╝   ╚═╝   ╚═╝  ╚═╝╚═════╝  ╚═════╝ ╚═╝  ╚═╝");
        System.out.println("===================================================================== ");
		System.out.print("                    Digite o primeiro parâmetro: ");
		int parametroUm = terminal.nextInt();
		System.out.print("                    Digite o segundo parâmetro: ");
		int parametroDois = terminal.nextInt();
        System.out.println("===================================================================== \n");
        
        System.out.println("============== - Segundo parâmetro menos o primeiro - =============== \n");
        System.out.println("                         O Valor ficou igual: " + (parametroDois - parametroUm) + "\n");
        System.out.println("===================================================================== \n");
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);

		
		}catch (ParametrosInvalidosException exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("=============================== - ERRO - ============================ \n");
            System.out.println("          O segundo parâmetro deve ser maior que o primeiro \n");
            System.out.println("===================================================================== \n");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException(); 
        }
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
            
        System.out.println("                      ====== - CONTAGEM - ======");

        for (int i = 0; i <= contagem; i++) {
            System.out.println("                      ||          " + String.format("%03d", i) + "          ||");
        }        
        
        System.out.println("                      === - FIM DA CONTAGEM - === \n");

	}
}