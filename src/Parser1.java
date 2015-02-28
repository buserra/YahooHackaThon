import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class Parser
{

	public static void main(String[] args)
	{
		String csvfile = "final_alert_file.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = "\\|";
		

		
	 
		try {
			FileReader in  = new FileReader(csvfile);
			FileOutputStream fileout = new FileOutputStream("parse.xls");
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet worksheet = workbook.createSheet("Sheet1");
			boolean a = true;
			int x = 0;
			/*
			while(a)
			{
				HSSFRow row = worksheet.createRow((short) x);
				for(int i = 0; i < 6; i++)
				{
					HSSFCell cell = row.createCell(i);
				}
			
			}*/
			java.io.PrintStream media = new java.io.PrintStream("media.txt");
			java.io.PrintStream mail = new java.io.PrintStream("mail.txt");
			java.io.PrintStream messenger = new java.io.PrintStream("messenger.txt");
			java.io.PrintStream flickr = new java.io.PrintStream("flickr.txt");
			java.io.PrintStream search = new java.io.PrintStream("search.txt");
			java.io.PrintStream revenue = new java.io.PrintStream("revenue.txt");
			java.io.PrintStream frontpage = new java.io.PrintStream("frontpage.txt");
	 
			br = new BufferedReader(new FileReader(csvfile));
			while ((line = br.readLine()) != null) {
				a = true;
			        // use comma as separator
				String[] error = line.split(cvsSplitBy);
				while(a)
				{
					HSSFRow row = worksheet.createRow((short) x);
					for(int i = 0; i < 6; i++)
					{
						HSSFCell cell = row.createCell(i);
						if(x != 0)
						{
							if(i == 0 || i == 1)
							{
								cell.setCellValue(Integer.parseInt(error[i]));
							}
							else
								cell.setCellValue(error[i]);
						}
						else
							cell.setCellValue(error[i]);
					}
					x++;
					a = false;
				}
				
				/*
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
	 			*/
			}
			workbook.write(fileout);
			fileout.flush();
			fileout.close();
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
