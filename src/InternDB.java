import java.util.Scanner;

public class InternDB {
	private static Scanner input;

	public static void main(String[] args) throws Exception {

		String fileName = "test.csv";
		int opt;
		;

		do {

			System.out.println("Enter your choice");
			System.out
					.println(" 1.VIEW ALL INTERN DETAILS\n 2.HIRE RATIO \n 3.HireRankOrder \n 0.EXIT");
			input = new Scanner(System.in);
			opt = input.nextInt();
			switch (opt) {

			case 1:

				CSVReader.readCsvFile(fileName);
				break;

			case 2:
				
				CSVReader.readHireRatio(fileName);
				break;

			case 3:
				
				CSVReader.ratioRank();
				break;
			case 0:
				
				System.exit(0);
				break;
			default:
				
				System.out.println("Please Enter Correct Number");
			}
		} while (opt > 0);
	}
}
