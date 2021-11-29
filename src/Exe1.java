import java.util.Scanner;

public class Exe1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre, apellidos, calle, provincia;
		int edad, numero, cp;
		boolean estudiante;
		double altura;

		System.out.println("Ahora necesito que me proporciones ciertos datos");
		System.out.println("Nombre:");
		nombre = sc.nextLine();

		System.out.println("apellidos:");
		apellidos = sc.nextLine();

		System.out.println("edad:");
		edad = sc.nextInt();

		System.out.print("Direccion:\n" + "\tCalle:");
		calle = sc.nextLine();

		System.out.print("\n\tNúmero:");
		numero = sc.nextInt();

		System.out.print("\tCodigo postal");
		cp = sc.nextInt();

		System.out.print("\t Provincia:");
		provincia = sc.nextLine();

		System.out.println("¿Estudias? (True/false)");
		estudiante = sc.nextBoolean();

		System.out.println("Altura exaxta");
		altura = sc.nextDouble();

		System.out.println("Confirmame si los siguientes datos son correctos:\n Te llamas " + nombre + " " + apellidos
				+ "tienes" + edad + "vives en " + calle + numero + cp + provincia
				+ "a la pregunta de que si estudias o trabajas:" + "y mides altura" + altura);

	}

}
