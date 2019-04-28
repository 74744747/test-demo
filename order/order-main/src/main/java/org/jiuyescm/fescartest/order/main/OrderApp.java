package org.jiuyescm.fescartest.order.main;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author jiuye
 *
 */
public class OrderApp {
	private static Logger LOG = LoggerFactory.getLogger(OrderApp.class);
	private static ClassPathXmlApplicationContext context;
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("classpath:springContext.xml");
		context.start();
		LOG.info(">>>>>>>>>>> TMCApplication Service started!");
		try {
            
            System.in.read();
        } catch (IOException e) {
        	LOG.error(e.getLocalizedMessage(), e);
        } finally {
            if (null != context && context.isActive()) {
                try {
                    context.stop();
                } catch (Exception e) {
                	LOG.error(e.getLocalizedMessage(), e);
                }
            }
        }
	}
}
