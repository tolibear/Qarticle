package com.qarticle;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Article {
	private String todayDate;
	private String beanDate;
	private String title;
	private String message;
	private String link;
	private Boolean dateMatch;

	public Article() {
		setTodayDate();
	}

	public void getArticle() {
		dateMatch = todayDate.equals(beanDate);
		if (dateMatch) {
			System.out.println("Here is today's article:\n");
			System.out.println("Bean Date: " + beanDate);
			System.out.println("Title: " + title);
			System.out.println("Message: " + message);
			System.out.println("Link: " + link);
		} else {
			System.out.println("No Article Today\n");
		}
	}
	
	
	//Getters + Setters

	public String getTodayDate() {
		return todayDate;
	}

	public void setTodayDate() {
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		Date d = new Date();
		todayDate = df.format(d);
	}

	public String getBeanDate() {
		return beanDate;
	}

	public void setBeanDate(String beanDate) {
		this.beanDate = beanDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

}