import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author ashraf_sarhan
 * 
 */
public class CSVReader {

	// Delimiter used in CSV file
	private static final String COMMA_DELIMITER = ",";

	static String line = "";

	static String splitBy = ",";
	// Student attributes index
	private static final int STUDENT_ID = 0;
	private static final int STUDENT_NAME = 1;
	private static final int STUDENT_COLLNAME = 2;
	private static final int STUDENT_JOINDATE = 3;
	private static final int STUDENT_MAIL = 4;
	private static final int STUDENT_DOMAIN = 5;

	private static Scanner sc;

	private static BufferedReader br;

	public static void readCsvFile(String fileName) {

		BufferedReader fileReader = null;

		try {

			// Create a new list of student to be filled by CSV file data
			List<Intern> students = new ArrayList<>();

			String line = "";

			// Create the file reader
			fileReader = new BufferedReader(new FileReader(fileName));

			// Read the CSV file header to skip it
			fileReader.readLine();

			// Read the file line by line starting from the second line
			while ((line = fileReader.readLine()) != null) {
				// Get all tokens available in line
				String[] tokens = line.split(COMMA_DELIMITER);
				if (tokens.length > 0) {
					// Create a new student object and fill his data
					Intern student = new Intern(
							Integer.parseInt(tokens[STUDENT_ID]),
							tokens[STUDENT_NAME], tokens[STUDENT_COLLNAME],
							tokens[STUDENT_JOINDATE], tokens[STUDENT_MAIL],
							tokens[STUDENT_DOMAIN]);
					students.add(student);
				}

			}

			// br.close();

			// Print the new student list
			for (Intern student : students) {
				System.out.println(student.toString());
			}
		} catch (Exception e) {
			System.out.println("Error in CsvFileReader !!!");
			e.printStackTrace();
		} finally {
			try {
				fileReader.close();
			} catch (IOException e) {
				System.out.println("Error while closing fileReader !!!");
				e.printStackTrace();
			}
		}

	}

	public static void readHireRatio(String fileName) throws IOException {

		String[] b = null;
		int count = 0, count1 = 0;
		float hire_ratio;
		br = new BufferedReader(new FileReader("test.csv"));
		sc = new Scanner(System.in);
		System.out.println("Enter College Name To View Details");
		String clg = sc.next();
		while ((line = br.readLine()) != null) {
			b = line.split(splitBy);
			if (b[2].equalsIgnoreCase(clg)) {
				count++;
				System.out.println(b[2] + " " + b[1]);

			}
			if (b[6].equalsIgnoreCase("yes") && b[2].equalsIgnoreCase(clg)) {
				count1++;

			}

		}
		System.out.println("No.of Students in" + clg + " College:" + count);
		System.out.println("No.of Students Hired in" + clg + "College:"
				+ count1);
		hire_ratio = ((float) count1 / (float) count);
		System.out.println("Hire Ratio of" + clg + "College:" + hire_ratio);

	}

	public static void ratioRank() throws IOException {

		TreeMap<String, Double> clg = new TreeMap<String, Double>();
		clg.put("Gietclg", 0.33);
		clg.put("Cietclg", 0.75);
		clg.put("Veltech", 0.5);
		clg.put("Srmclg", 0.5);

		for (Map.Entry hm : clg.entrySet()) {

			System.out.println("Ratios are:" + hm.getValue());
			System.out.println("Colleges are:" + hm.getKey());

		}

	}
}