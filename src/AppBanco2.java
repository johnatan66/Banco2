import model.Conta2;
import java.util.Scanner;

public class AppBanco2 {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int entraconta;
		Conta2[] contas; //defino um conjunto de referencias para conta
		
		// essa instrucao cria 10 variaveis de referencia para conta
		// sao 10 objetos?? naooo!!!
		
		contas = new Conta2[10];
		
		// criei as contas
		for (int pos=0; pos <= contas.length-1; pos++) {
			contas[pos] = new Conta2("111.111.111-1"+pos, 10000+pos, pos);
			contas[pos].creditar(1000 + (pos*100));
		}
		
		// exibir as informacoes
		for(int pos = 0; pos < contas.length; pos++) {
			System.out.println(contas[pos].exibirInfo());
		}
		
		System.out.println("Entre uma conta: ");
		entraconta = teclado.nextInt();	
	
		
		boolean achou = false;
		
		for (int pos = 0; pos < contas.length && !achou; pos++) {
			if(contas[pos].getNumeroConta() == entraconta) {
				System.out.println("Conta encontrada");
				System.out.println("CPF do titular "+contas[pos].getCpf());
				System.out.println("Saldo R$ "+contas[pos].getSaldo());
				achou = true;
			}
		}
		if(!achou) {
			System.out.println("Conta nao encontrada");
		}
	}
}
