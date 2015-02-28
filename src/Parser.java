import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;


public class Parser
{

	public static void main(String[] args)
	{
		String csvfile = "/Users/michaeldaniels/Downloads/final_alert_file.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = "\\|";
		

		
	 
		try {
			FileReader in  = new FileReader(csvfile);
			
			java.io.PrintStream media = new java.io.PrintStream("media.txt");
			java.io.PrintStream mail = new java.io.PrintStream("mail.txt");
			java.io.PrintStream messenger = new java.io.PrintStream("messenger.txt");
			java.io.PrintStream flickr = new java.io.PrintStream("flickr.txt");
			java.io.PrintStream search = new java.io.PrintStream("search.txt");
			java.io.PrintStream revenue = new java.io.PrintStream("revenue.txt");
			java.io.PrintStream frontpage = new java.io.PrintStream("frontpage.txt");
	 
			br = new BufferedReader(new FileReader(csvfile));
			while ((line = br.readLine()) != null) {
	 
			        // use comma as separator
				String[] error = line.split(cvsSplitBy);

				switch (error[3])
				{
				case "Media":
					media.println("Severity: " + error[0] + " Count: " + error[1] +
							" Node: " + error[2] + " Property: " + error[3] + " First Occurrence: "
							+ error[4] + " Summary: " + error[5]);
					break;
				case "Search":
					search.println("Severity: " + error[0] + " Count: " + error[1] +
							" Node: " + error[2] + " Property: " + error[3] + " First Occurrence: "
							+ error[4] + " Summary: " + error[5]);
					break;
				case "Messenger":
					messenger.println("Severity: " + error[0] + " Count: " + error[1] +
							" Node: " + error[2] + " Property: " + error[3] + " First Occurrence: "
							+ error[4] + " Summary: " + error[5]);
					break;
				case "Flickr":
					flickr.println("Severity: " + error[0] + " Count: " + error[1] +
							" Node: " + error[2] + " Property: " + error[3] + " First Occurrence: "
							+ error[4] + " Summary: " + error[5]);
					break;
				case "Revenue":
					revenue.println("Severity: " + error[0] + " Count: " + error[1] +
							" Node: " + error[2] + " Property: " + error[3] + " First Occurrence: "
							+ error[4] + " Summary: " + error[5]);
					break;
				case "Mail":
					mail.println("Severity: " + error[0] + " Count: " + error[1] +
							" Node: " + error[2] + " Property: " + error[3] + " First Occurrence: "
							+ error[4] + " Summary: " + error[5]);
					break;
				case "Frontpage":
					frontpage.println("Severity: " + error[0] + " Count: " + error[1] +
							" Node: " + error[2] + " Property: " + error[3] + " First Occurrence: "
							+ error[4] + " Summary: " + error[5]);
					break;
				}
	 
			}
	 
		} catch (FileNotFoundException e) {
			System.out.println("File not found");;
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	 
		System.out.println("Done");
	}
	
}
