import java.util.Locale;
import java.util.Scanner;


    public class Contador {

	public static void main(String[] args) {
		
		 Scanner terminal = new Scanner(System.in).useLocale(Locale.US);
		 
		 System.out.println("Por favor, digite o primeiro número ");
		 int primeiroNumero = terminal.nextInt();
		 System.out.println("Por favor, digite o segundo número ");
		 int segundoNumero = terminal.nextInt();

         try {   
            contar(primeiroNumero, segundoNumero);

         }catch (ParametrosInvalidosException exception){

			System.out.println("O segundoNumero deve ser maior do que o primeiro");
         }
		 
	}
        static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException {
		
		if(primeiroNumero > segundoNumero){

		throw new ParametrosInvalidosException();

		}
		int contagem = segundoNumero - primeiroNumero;
		System.out.println("Quantidade de números que serão contados: " + contagem);
		for(int index = primeiroNumero; index <= segundoNumero; index++){
		System.out.println("imprimindo o número " + index);
		
		}
	
	}

}
