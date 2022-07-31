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
			System.out.println("    Menu de Simula��o    ");
			System.out.println("=============================\n");
			System.out.println("1 - Configurar a m�quina de lavar ");
			System.out.println("2- Simular a m�quina de lavar ");
			System.out.println("0 - Sair\n");
			System.out.print("Digite o c�digo: ");
			opcaoEscolhida = entrada.nextInt();
			System.out.println("");

			switch (opcaoEscolhida) {

			case 1:
				System.out.println("=====================================");
				System.out.println("   Configura��o da Maquina de Lavar    ");
				System.out.println("===================================\n");
				entrada.nextLine();
				System.out.println("Digite o modelo da m�quina: ");
				modelo = entrada.nextLine();
				System.out.println("Digite o nome da m�quina: ");
				nome = entrada.nextLine();
				System.out.println("Digite a voltagem da m�quina (220v ou 110v :");
				voltagem = entrada.nextInt();
				System.out.println("Quantos Kg  ? ");
				kg = entrada.nextInt();
				System.out.println("Qual a dura��o de est�gio de lava��o pesada?");
				lavacaoPesada = entrada.nextInt();
				System.out.println("Qual a dura��o de est�gio de lava��o normal?");
				lavacaoNormal = entrada.nextInt();
				System.out.println("Qual a dura��o de est�gio de lava��o R�pida?");
				lavacaoRapida = entrada.nextInt();
				System.out.println("Qual a dura��o de est�gio de lava��o enxague?");
				duracaoEnxague = entrada.nextInt();
				System.out.println("Qual a dura��o de est�gio de lava��o centr�fuga?");
				duracaoCentrifugacao = entrada.nextInt();

				entrada.nextLine();
				break;
			case 2:
				System.out.println("************************************");
				System.out.println("   Simula��o da Maquina de lavar    ");
				System.out.println("***********************************\n");
				System.out.println(" Simulando o modelo: " + modelo + " - " + nome + " - " + " Voltagem: " + voltagem
						+ " - " + kg + " kg " + "\n");
				System.out.println(" ===================================");
				System.out.println("   Qual est�gio voc� deseja come�ar? ");
				System.out.println("\n");
				System.out.println(" 1- Lava��o Pesada ");
				System.out.println(" 2- Lava��o Normal ");
				System.out.println(" 3- Lava��o r�pida ");
				System.out.println(" 4- Enxague ");
				System.out.println(" 5- Centrifugar \n ");
				System.out.print(" Selecione o est�gio desejado: ");
				estagioDesejado = entrada.nextInt();

				float porcentagem = 0;
				float score = 0;

				switch (estagioDesejado) {

				case 1:
					while (porcentagem < 100) {
						porcentagem = (score * 50) / lavacaoPesada;
						System.out.println("Est�gio 1 - Em lava��o pesada: " + porcentagem + "%");
						Thread.sleep(500);
						score++;
					}
					porcentagem = 0;
					score = 0;
					System.out.println("  ");
				case 2:
					while (porcentagem < 100) {
						porcentagem = (score * 50) / lavacaoNormal;
						System.out.println("Est�gio 2 - Em lava��o normal: " + porcentagem + "%");
						Thread.sleep(500);
						score++;
					}
					porcentagem = 0;
					score = 0;
					System.out.println("  ");

				case 3:

					while (porcentagem < 100) {
						porcentagem = (score * 50) / lavacaoRapida;
						System.out.println("Est�gio 3 - Em lava��o R�pida: " + porcentagem + "%");
						Thread.sleep(500);
						score++;
					}
					porcentagem = 0;
					score = 0;
					System.out.println("  ");

				case 4:
					while (porcentagem < 100) {
						porcentagem = (score * 50) / duracaoEnxague;
						System.out.println("Est�gio 4 - Em enx�gue: " + porcentagem + "%");
						Thread.sleep(500);
						score++;
					}
					porcentagem = 0;
					score = 0;
					System.out.println("  ");
				case 5:
					while (porcentagem < 100) {
						porcentagem = (score * 50) / duracaoCentrifugacao;
						System.out.println("Est�gio 5 - Em centrifuga��o: " + porcentagem + "%");
						Thread.sleep(500);
						score++;
					}
					break;
				default:
					System.out.println(" Escolha uma das op��es abaixo ");

					break;
				}
			case 0:
				System.out.println("Sistema encerrado");
				break;
			default:
				System.out.println(" ERRO, escolha uma das op��es abaixo ");
				break;
			}
		} while (opcaoEscolhida != 0);
	}
}