import java.util.Scanner;
import java.time.LocalDate;
import java.util.Locale;
import java.time.format.DateTimeFormatter;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        //aqui faço a formatação para convenções brasileiras
        scanner.useLocale(new Locale("pt","BR"));

        // Obtém o mês atual com 2 dígitos
        LocalDate dataAtual = LocalDate.now();
        int mesAtual = dataAtual.getMonthValue();
        String mesFormatado = String.format("%02d", mesAtual);

        //Solicita o número da agência
        System.out.print("Informe o número da agência: ");
        int numeroAgencia = scanner.nextInt();

        // Obtém os dois primeiros dígitos da agência
        String primeirosDigitosAgenciaStr = String.valueOf(numeroAgencia).substring(0, 2);
        int primeirosDigitosAgencia = Integer.parseInt(primeirosDigitosAgenciaStr);
        // obtem os digitos finais da conta somando o digitos inicias da agência + 
        int digitosfinaisConta = primeirosDigitosAgencia + 1;
        String digitosfinaisContaString = Integer.toString(digitosfinaisConta);
        
        /*Obtendo o numero da conta concatenando
        os digitos inicias do número da agência + o mês 
        + a variavel digitosfinais */
        String conta = primeirosDigitosAgenciaStr + mesFormatado + digitosfinaisContaString;



		//Solicita o nome da agência Ex: o nome da cidade onde a agencia esta localizada.
		scanner.nextLine();
        System.out.print("Informe o nome da agência:  ");
        String agencia  = scanner.nextLine();
		
		//Solicita o nome do cliente
        System.out.print("Informe seu nome: ");
        String nomeCliente = scanner.nextLine();
		
		//expecifica o saldo em conta      
        double saldo = 500.00;

        // Concatenação do número da agência com o mês atual com 2 dígitos
        String resultado = String.valueOf(numeroAgencia) + mesFormatado;
        // Concatenação do número da agência + 1
        int numeroAgenciaProxima = numeroAgencia + 1;
        resultado += String.valueOf(numeroAgenciaProxima);
		


		
		//Retorna os dados informados pelo usário
        System.out.println("");
        System.out.println("============================");
        System.out.printf("Seja bem vindo Sr. %s, \nobrigado por abrir uma conta \nem nosso banco DIO Invest.\n",nomeCliente);
        System.out.println("");
        System.out.printf("Agência Nº:  %d.\n",numeroAgencia);
        System.out.printf("Nome Agência: %s. \n", agencia);
        System.out.printf("Número da Conta: %s. \n", conta);
        System.out.printf("Saldo: R$ %.2f%n", saldo);
        System.out.println("============================");

        scanner.close();      
        

    }
}