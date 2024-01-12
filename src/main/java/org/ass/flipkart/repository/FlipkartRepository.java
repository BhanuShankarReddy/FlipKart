package org.ass.flipkart.repository;

import java.util.Properties;

import org.ass.flipkart.Entity.OrderEntity;
import org.ass.flipkart.Entity.ProductEntity;
import org.ass.flipkart.Entity.StockEntity;
import org.ass.flipkart.dto.OrderDto;
import org.ass.flipkart.dto.ProductDto;
import org.ass.flipkart.util.ConnectionUtil;
import org.ass.flipkart.util.SessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


public class FlipkartRepository 
{
	public void productAndStockInfo(ProductDto pd)
	{
		ProductEntity entity = new ProductEntity();
		entity.setName(pd.getName());
		entity.setProductType(pd.getProductType());
		entity.setPrice(pd.getPrice());
		entity.setDescription(pd.getDescription());
		entity.setManufactureDate(pd.getManufactureDate());
		
		StockEntity entity2 = new StockEntity();
		 entity2.setProductId(pd.getProductId());
		 entity2.setQuantity(pd.getQuantity());
		 entity2.setPrice(pd.getPrice());
		 
		 SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		 Session session = sessionFactory.openSession();
		 Transaction transaction = session.beginTransaction();
		 Object merge = session.merge(entity);
		 Object merge2 = session.merge(entity2);
		
		 transaction.commit();
	}
	public OrderEntity order(OrderDto or)
	{
	    OrderEntity oe = new OrderEntity();
		oe.setProductId(or.getProductId());
		oe.setQuantity(or.getQuantity());
		oe.setPaymentMode(or.getPaymentMode());
	    oe.setSoldDate(or.getSoldDate());
	    
	    SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
	    Session session = sessionFactory.openSession();
	    Transaction transaction = session.beginTransaction();
	    Query query = session.createQuery("select price from StockEntity where productId=?1");
	    query.setParameter(1,or.getProductId());
	    
	    double result2 = (double)(query.uniqueResult());
	    oe.setTotalPrice(result2*or.getQuantity());
	    
	    OrderEntity merge = (OrderEntity) session.merge(oe);
	    
	    transaction.commit();
	    
	    return merge;
	    		
	}

}
