//package first;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.testng.annotations.Test;
//
//public class WriteIntoExcel {
//
//	@Test
//	public void wte() throws IOException {
//		// TODO Auto-generated method stub
//		File src = File("‪C:\\Users\\sp21440\\Desktop\\excel1.xlsx");
//		FileInputStream fis = new FileInputStream(src);
//		XSSFWorkbook wrkbk=new XSSFWorkbook();
//		XSSFSheet sheet=wrkbk.createSheet();
//		 Object empdata[][]= {{"EmpId","Name","sal"},{21394,"harish",15000},{21343,"pravs",20000},{21345,"krishna",30000}};
//	    int rows=empdata.length;
//		int cols=empdata[0].length;
//		System.out.println(rows);
//		System.out.println(cols);
//		for(int r=0;r<rows;r++)
//		{
//	 XSSFRow row=sheet.createRow(r);
//	 for(int c=0;c<cols;c++)
//		{
//	XSSFCell cell=row.createCell(c);
//		 Object value=empdata[r][c];
//		if(value instanceof String)
//	{
//	cell.setCellValue((String)value);
//	 }
//		if(value instanceof Integer)
// {
//		 cell.setCellValue((Integer)value);
//	}
//if(value instanceof Boolean)
//{
//cell.setCellValue((Boolean)value);
//}
//		
//		 FileOutputStream ops=new FileOutputStream(src);
//		 wrkbk.write(ops);
//		 ops.close();
//		 System.out.println("Employee data written successfully");
//
//
//}
//}
//	}
//
//	private File File(String string) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//}
