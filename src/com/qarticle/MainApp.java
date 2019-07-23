package com.qarticle;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		
		
		//Initialize Bean
		ApplicationContext context = new ClassPathXmlApplicationContext("Articles.xml");
		Article article = (Article) context.getBean("article1");

		//Get Article from Beans.xml
		article.getArticle();
		
		
		System.out.println(" ");
		((ClassPathXmlApplicationContext) context).close();

	}
}