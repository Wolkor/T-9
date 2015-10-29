
package t9_p2;

import java.util.Scanner;

public class T9_P2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Veiculo vei = new Veiculo();
        System.out.println("Digite a placa");
        String s = scanner.nextLine();
        vei.setPlaca(s);
        System.out.println("Digite o tipo do 0 para carro e 1 para moto");
        int i = scanner.nextInt();
        vei.setTipo(i);
        System.out.println("Digite a hora de entrada");
        long l = scanner.nextLong();
        vei.setHora_entrada(l);
        Estacionamento est = new Estacionamento();
        
    }
    
}
