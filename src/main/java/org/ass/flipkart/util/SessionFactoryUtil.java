package org.ass.flipkart.util;

import org.ass.flipkart.Entity.OrderEntity;
import org.ass.flipkart.Entity.ProductEntity;
import org.ass.flipkart.Entity.StockEntity;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil
{
	private static SessionFactory sessionFactory= null;
	
	public static SessionFactory getSessionFactory()
	{
		if(sessionFactory== null)
		{
			Configuration cfg = new Configuration();
			cfg.setProperties(ConnectionUtil.getDbproerties());
			cfg.addAnnotatedClass(OrderEntity.class);
			cfg.addAnnotatedClass(ProductEntity.class);
			cfg.addAnnotatedClass(StockEntity.class);
			sessionFactory = cfg.buildSessionFactory();
		}
		  return sessionFactory;
	}

}
