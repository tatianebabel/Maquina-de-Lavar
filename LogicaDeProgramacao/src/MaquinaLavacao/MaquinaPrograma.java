/**
 * 
 */
package MaquinaLavacao;

import java.util.Scanner;

/**
 * @author Tatiane
 *
 */
public class MaquinaPrograma {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException {
		Scanner entrada = new Scanner(System.in);

		int opcaoEscolhida, configurar, simular, sair, estagioDesejado;
		int kg = 0, voltagem = 0, lavacaoRapida = 0, duracaoEnxague = 0, duracaoCentrifugacao = 0, lavacaoPesada = 0,
				lavacaoNormal = 0;
		String modelo = null, nome = null;

		do {
			System.out.println("=============================");
			System.out.println("    Menu de Simulação    ");
			System.out.println("=============================\n");
			System.out.println("1 - Configurar a máquina de lavar ");
			System.out.println("2- Simular a máquina de lavar ");
			System.out.println("0 - Sair\n");
			System.out.print("Digite o código: ");
			opcaoEscolhida = entrada.nextInt();
			System.out.println("");

			switch (opcaoEscolhida) {

			case 1:
				System.out.println("=====================================");
				System.out.println("   Configuração da Maquina de Lavar    ");
				System.out.println("===================================\n");
				entrada.nextLine();
				System.out.println("Digite o modelo da máquina: ");
				modelo = entrada.nextLine();
				System.out.println("Digite o nome da máquina: ");
				nome = entrada.nextLine();
				System.out.println("Digite a voltagem da máquina (220v ou 110v :");
				voltagem = entrada.nextInt();
				System.out.println("Quantos Kg  ? ");
				kg = entrada.nextInt();
				System.out.println("Qual a duração de estágio de lavação pesada?");
				lavacaoPesada = entrada.nextInt();
				System.out.println("Qual a duração de estágio de lavação normal?");
				lavacaoNormal = entrada.nextInt();
				System.out.println("Qual a duração de estágio de lavação Rápida?");
				lavacaoRapida = entrada.nextInt();
				System.out.println("Qual a duração de estágio de lavação enxague?");
				duracaoEnxague = entrada.nextInt();
				System.out.println("Qual a duração de estágio de lavação centrífuga?");
				duracaoCentrifugacao = entrada.nextInt();

				entrada.nextLine();
				break;
			case 2:
				System.out.println("************************************");
				System.out.println("   Simulação da Maquina de lavar    ");
				System.out.println("***********************************\n");
				System.out.println(" Simulando o modelo: " + modelo + " - " + nome + " - " + " Voltagem: " + voltagem
						+ " - " + kg + " kg " + "\n");
				System.out.println(" ===================================");
				System.out.println("   Qual estágio você deseja começar? ");
				System.out.println("\n");
				System.out.println(" 1- Lavação Pesada ");
				System.out.println(" 2- Lavação Normal ");
				System.out.println(" 3- Lavação rápida ");
				System.out.println(" 4- Enxague ");
				System.out.println(" 5- Centrifugar \n ");
				System.out.print(" Selecione o estágio desejado: ");
				estagioDesejado = entrada.nextInt();

				float porcentagem = 0;
				float score = 0;

				switch (estagioDesejado) {

				case 1:
					while (porcentagem < 100) {
						porcentagem = (score * 50) / lavacaoPesada;
						System.out.println("Estágio 1 - Em lavação pesada: " + porcentagem + "%");
						Thread.sleep(500);
						score++;
					}
					porcentagem = 0;
					score = 0;
					System.out.println("  ");
				case 2:
					while (porcentagem < 100) {
						porcentagem = (score * 50) / lavacaoNormal;
						System.out.println("Estágio 2 - Em lavação normal: " + porcentagem + "%");
						Thread.sleep(500);
						score++;
					}
					porcentagem = 0;
					score = 0;
					System.out.println("  ");

				case 3:

					while (porcentagem < 100) {
						porcentagem = (score * 50) / lavacaoRapida;
						System.out.println("Estágio 3 - Em lavação Rápida: " + porcentagem + "%");
						Thread.sleep(500);
						score++;
					}
					porcentagem = 0;
					score = 0;
					System.out.println("  ");

				case 4:
					while (porcentagem < 100) {
						porcentagem = (score * 50) / duracaoEnxague;
						System.out.println("Estágio 4 - Em enxágue: " + porcentagem + "%");
						Thread.sleep(500);
						score++;
					}
					porcentagem = 0;
					score = 0;
					System.out.println("  ");
				case 5:
					while (porcentagem < 100) {
						porcentagem = (score * 50) / duracaoCentrifugacao;
						System.out.println("Estágio 5 - Em centrifugação: " + porcentagem + "%");
						Thread.sleep(500);
						score++;
					}
					break;
				default:
					System.out.println(" Escolha uma das opções abaixo ");

					break;
				}
			case 0:
				System.out.println("Sistema encerrado");
				break;
			default:
				System.out.println(" ERRO, escolha uma das opções abaixo ");
				break;
			}
		} while (opcaoEscolhida != 0);
	}
}