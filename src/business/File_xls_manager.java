package business;

import integration.Players;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



/**
 * 
 * @author DragoHome
 *
 */
public class File_xls_manager{

	private int rows;
	private int columns;
	
	public Sheet set_sheet_details(String datasource, String id_sheet){
		Sheet sheet = null;
		try {
			InputStream inp = new FileInputStream(datasource);
			Workbook wb = WorkbookFactory.create(inp);
			sheet = wb.getSheet(id_sheet);
			
			wb.close();
			rows = sheet.getPhysicalNumberOfRows();
			columns = sheet.getRow(0).getPhysicalNumberOfCells();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sheet;
	}

	public int getNumberOfRows() {
		return rows;
	}

	public int getNumberOfColumns() {
		return columns;
	}

	public void FillAndScanPlayerList(Sheet playesrLists) {
	
		for (Row row : playesrLists) {
			Players player = new Players();
			player.setPosizione(row.getCell(0).getStringCellValue());
			
		}
		
	}

}
