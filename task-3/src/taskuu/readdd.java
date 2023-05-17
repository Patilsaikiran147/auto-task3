package taskuu;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readdd {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream("C:\\Users\\sp21440\\Desktop\\excel1.xlsx");
        XSSFWorkbook wrkbk=new XSSFWorkbook(file);
        XSSFSheet sheet1=wrkbk.getSheet("sheet1");
        int rowcount=sheet1.getLastRowNum();
        System.out.println(rowcount);
//        int colcount=sheet1.getRow(0).getLastCellNum();
//        System.out.println(colcount);
//        for(int i=0;i<=rowcount;i++)
//        {
//            XSSFRow crntrow=sheet1.getRow(i);
//            for(int j=0;j<colcount;j++)
//            {
//                String value=crntrow.getCell(j).toString();
//                System.out.print("   "+value);
//            }
//            System.out.println();
//        }
	}

}
