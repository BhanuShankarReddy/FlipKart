package org.ass.flipkart;

import java.sql.Date;
import java.time.LocalDate;

import org.ass.flipkart.dto.OrderDto;
import org.ass.flipkart.dto.ProductDto;
import org.ass.flipkart.repository.FlipkartRepository;

/**
 * Hello world!
 *
 */   
//  Hibernate project
public class App 
{
    public static void main( String[] args )
    {
    	ProductDto dto = new ProductDto();
    	dto.setName("fan");
    	dto.setManufactureDate(Date.valueOf(LocalDate.now()));
    	dto.setDescription("things");
    	dto.setPrice(400);
    	dto.setProductId("46fdsc81");
    	dto.setProductType("Electronics");
    	dto.setQuantity(1);
    	
    	FlipkartRepository repository = new FlipkartRepository();
    	repository.productAndStockInfo(dto);
    
    }
}
