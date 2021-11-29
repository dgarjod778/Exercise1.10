import java.util.*;
public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double centimo ;
		System.out.printf("Dime que cantidad de dinero quieres duplicar cada dia en un mes:\n");
		centimo=sc.nextInt();
//		int cont=1;
//		double resultado=0;
		for(int i=1;i<=30;i++) {
			centimo=centimo*2;
			System.out.printf("El dia %d llevarias %f \n",i,centimo);
		}
//		System.out.print(centimo);
	}

}
