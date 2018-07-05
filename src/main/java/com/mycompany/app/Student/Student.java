/**
 * @author SURYA PAVAN KOTHA
 * this class contains the details of the student
 */
package com.mycompany.app.Student;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Student {//contains private variables
	private int IdNo;
	private String FName;
	private String LName;
	private String Branch;
	private int Year;
	Student(int IdNo,String FName,String LName,String Branch,int Year)//constructor used to initialize private variables
	{
		this.IdNo=IdNo;
		this.FName=FName;
		this.LName=LName;
		this.Branch=Branch;
		this.Year=Year;
	}
	//getter methods are used since they are private
	public int getIdNo() {
		return IdNo;
	}
	public String getFName() {
		return FName;
	}
	public String getLName() {
		return LName;
	}
	public String getBranch() {
		return Branch;
	}
	public int getYear() {
		return Year;
	}
	public String toString(){
		return IdNo+" "+FName+" "+LName+" "+Branch+" "+Year;
	}
	
}
