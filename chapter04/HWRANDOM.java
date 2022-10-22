package chapter04;

import java.util.Random;

public class HWRANDOM {
public static void main(String[] args) {
	Random random = new Random();
	while(true) {
	int random1=random.nextInt(6)+1;
	int random2=random.nextInt(6)+1;
	System.out.println("("+random1+","+random2+")");
	if ((random1 + random2) ==5){
	break;
	}
	}
}
}
