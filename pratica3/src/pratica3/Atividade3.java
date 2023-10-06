package pratica3;
import java.util.*;
import java.util.Scanner;
public class Atividade3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> channelAudience = new HashMap<>();
        int totalAudience = 0;

        while (true) {
            System.out.println("digite o numero do canal (0 para sair):");
            int channel = scanner.nextInt();
            if (channel == 0) {
                break;
            }

            System.out.println("Digite o número de pessoas assistindo a este canal:");
            int audience = scanner.nextInt();
            totalAudience += audience;

            if (channelAudience.containsKey(channel)) {
                channelAudience.put(channel, channelAudience.get(channel) + audience);
            } else {
                channelAudience.put(channel, audience);
            }
        }

        for (Map.Entry<Integer, Integer> entry : channelAudience.entrySet()) {
            double percentage = ((double) entry.getValue() / totalAudience) * 100;
            System.out.println("Canal " + entry.getKey() + ": " + percentage + "% de audiência");
			
			}
			
		}
		
	}


