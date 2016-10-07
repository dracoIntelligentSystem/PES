package presentation;

import org.apache.poi.ss.usermodel.Sheet;

import business.File_xls_manager;

/**
 * 
 * @author Alessandro Balestrucci
 * @nick Drago
 * @category Pattern Recognition & ML
 * @version: 1.0
 *
 */
public class Main {

	public static void main(String[] args) {
		
		File_xls_manager playersFile = new File_xls_manager();
		Sheet playesrLists = playersFile.set_sheet_details();
		playersFile.FillAndScanPlayerList(playesrLists);
		
	}

}
