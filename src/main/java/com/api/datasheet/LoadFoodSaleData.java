package com.api.datasheet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.api.model.Customer;

public class LoadFoodSaleData {

	
	public List<Customer> load() throws IOException {
		
		List<Customer> custtList = new ArrayList();
	    XSSFWorkbook workbook = new XSSFWorkbook("G:\\sampledatafoodsales\\studentsdata.xlsx");
	    XSSFSheet worksheet = workbook.getSheetAt(0);
	    
	    for(int i=1;i<worksheet.getPhysicalNumberOfRows() ;i++) {
	           
	        XSSFRow row = worksheet.getRow(i);
	            String firstName=row.getCell(0).getStringCellValue();
	            String lastName=row.getCell(1).getStringCellValue();
	            String companyName=row.getCell(2).getStringCellValue();
	            String addr=row.getCell(3).getStringCellValue();
	            String city=row.getCell(4).getStringCellValue();
	            String state=row.getCell(5).getStringCellValue();
	            String phone=row.getCell(6).getStringCellValue();
	            String email=row.getCell(7).getStringCellValue();
	            String site=row.getCell(8).getStringCellValue();
//	            System.out.println(firstName+","+lastName+","+companyName+","+addr+","+city+","+state+""+email+","+site);
	            Customer cust=new Customer();
	            cust.setFirstName(firstName);
	            cust.setLastName(lastName);
	            cust.setCompanyName(companyName);
	            cust.setAddress(addr);
	            cust.setCity(city);
	            cust.setState(state);
	            cust.setPhoneNo(phone);
	            cust.setEmail(email);
	            cust.setWebSite(site);
	            custtList.add(cust);
	    }
	    return custtList;
	}
}
