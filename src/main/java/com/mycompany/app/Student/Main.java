/**
 * @author SURYA PAVAN KOTHA
 * This class is the main class and this class is used to load the data and to perform sorting and searching mechanisms
 */
package com.mycompany.app.Student;
import java.lang.Package;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	private static ArrayList<Student> StudentList=new ArrayList<Student>();//ArrayList
	
	public static ArrayList<Student> getStudentList() {
		return StudentList;
	}
	void intialize()//Load data from csv file
	{
		try {
			FileReader File_Reader = new FileReader("student_list.csv");
			BufferedReader Buffered_Reader = new BufferedReader(File_Reader);
			String column=null;
			try {
				while((column = Buffered_Reader.readLine()) != null) {
					try {
						String ColumnData[]=column.split(",");
						int temp1=Integer.parseInt(ColumnData[0]);
						int temp2=Integer.parseInt(ColumnData[4]);
						StudentList.add(new Student(temp1,ColumnData[1],ColumnData[2],ColumnData[3],temp2));
					}
					catch(Exception e) {
						System.out.println("Invalid Data");
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Invalid Column");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Invalid File");
		}	
	}
	static void print(){
		for(Student studentobject:StudentList)
 		  {
 			  System.out.println(studentobject.toString());
 		  }
	}
	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner ScannerObject=new Scanner(System.in);
		Main studentobj=new Main();
		studentobj.intialize();
		boolean loopcondition=true;
		while(loopcondition)
		{
		System.out.println("Welcome!!!Select an option\n 1.Sort\n 2.Search \n 3.Exit");
		int Option=ScannerObject.nextInt();
		switch(Option)
	   	{
		case 1:System.out.println("Select the element used for sorting\n 1.Id\n 2.FName\n 3.LName\n 4.Year\n 5.Branch");//Sorting
		       int Option2=ScannerObject.nextInt();
		       switch(Option2)// switch used to select the option
		       {
		       case 1:Collections.sort(StudentList,new SortbyIdNo());Main.print();break;
		       case 2:Collections.sort(StudentList,new SortbyFName()); Main.print();break;
		       case 3:Collections.sort(StudentList,new SortbyLName());Main.print();break;
		       case 4:Collections.sort(StudentList,new SortbyYear());Main.print();break;
		       case 5:Collections.sort(StudentList,new SortbyBranch());Main.print();break;
		       default:System.out.println("Enter the corrrect option");
		       }
		       break;
			case 2:System.out.println("Select the option used for searcing\n 1.Idno\n 2.FName");//Searching
					int Option3=ScannerObject.nextInt();
					switch(Option3)//switch used to select the option
					{
					case 1:System.out.println("Enter the id no used for searching");
							 int searchid=ScannerObject.nextInt();
								       boolean temp=true;
							  for(Student sobj:StudentList)
								       {
								    	   if(sobj.getIdNo()==searchid)
								    	   {
								    		   System.out.println("Element found!!!");
								    		   System.out.println(sobj.toString());temp=false;break;
								    	   }
								    		   
								       }
								       if(temp)
								    	   System.out.println("No record found :(");
										
								       break;
					case 2:System.out.println("Enter the fname used for searching");
					 String searchfname=ScannerObject.next();
						       boolean temp1=true;
					  for(Student sobj:StudentList)
						       {
						    	   if(sobj.getFName().equalsIgnoreCase(searchfname))
						    	   {
						    		   System.out.println("Element found!!!");
						    		   System.out.println(sobj.toString());temp1=false;break;
						    	   }
						    		   
						       }
						       if(temp1)
						    	   System.out.println("No record found :(");
								
						       break;
					default:System.out.println("Enter correct option");
								      
					}
			case 3:loopcondition=false;break;
		default: System.out.println("Enter the correct option");
		}
		}
	}
}
