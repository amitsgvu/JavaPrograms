import com.aspose.cells.SaveFormat;

/**
 * 
 */

/**
 * @author amisharm25
 *
 */
public class csvconvert {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String dirPath = System.getProperty("user.dir");

		// Load your sample CSV file inside the Workbook object.
		com.aspose.cells.Workbook wb = new com.aspose.cells.Workbook(dirPath + "\\string-array-sample.csv");

		// Save CSV file to XLS format.
		wb.save(dirPath + "\\outputConvertCSVToExcelFormats.xls", SaveFormat.EXCEL_97_TO_2003);
	}

}
