package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.componentscan.ComponentDAO;
import com.in28minutes.spring.basics.springin5steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.awt.*;

@SpringBootApplication
@ComponentScan("com.in28minutes.spring.basics.componentscan")
public class ComponentScanApplication {

	// What are the beans?
	// What are the dependencies of a bean?
	// Where to search for beans? => No need

	public static void main(String[] args) {
		Logger LOGGER = LoggerFactory.getLogger(ComponentScanApplication.class);
		// BinarySearchImpl binarySearch =
		// new BinarySearchImpl(new QuickSortAlgorithm());
		// Application Context
		ApplicationContext applicationContext =
				SpringApplication.run(ComponentScanApplication.class, args);
		ComponentDAO componentDao =
				applicationContext.getBean(ComponentDAO.class);
	/*	PersonDAO personDao2 =
				applicationContext.getBean(PersonDAO.class);
		LOGGER.info("{}",personDao);
		LOGGER.info("{}",personDao.getJdbcConnection());
		LOGGER.info("{}",personDao2);
		LOGGER.info("{}",personDao2.getJdbcConnection()); */
	/*	BinarySearchImpl binarySearch1 =
				applicationContext.getBean(BinarySearchImpl.class);
		int result =
				binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3);
		int result1 =
				binarySearch1.binarySearch1(new int[] { 142, 434, 6 }, 1);
		System.out.println(result);
		System.out.println(result1);*/
		LOGGER.info("{}",componentDao);
		LOGGER.info("{}",componentDao.getJdbcConnection());
	}
}