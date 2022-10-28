import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Start {

	public static void main(String[] args)throws IOException {
		System.out.println("Welcome To Student Management App");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("Press 1 to ADD student");
			System.out.println("Press 2 to DELETE student");
			System.out.println("Press 3 to DISPLAY student");
			System.out.println("Press 4 to Exit App");
			int c=Integer.parseInt(br.readLine());
			
			if(c==1)
			{
				//add student
				System.out.println("Enter User name:");
				String name=br.readLine();
				
				System.out.println("Enter user Phone:");
				String phone=br.readLine();
				
				System.out.println("Enter User City:");
				String city=br.readLine();
				
				// Create student obj to store student
				Student st= new Student(name,phone,city);
				boolean ans=StudentDao.insertStudentToDB(st);
				if(ans)
				{
					System.out.println("Success");
				}else
				{
					System.out.println("Error");
				}
				System.out.println(st);
				
			}else if(c==2)
			{
				//delete student
				System.out.println("Enter Student ID To Delete:");
				int id=Integer.parseInt(br.readLine());
				boolean ans=StudentDao.deleteStudent(id);
				if(ans)
				{
					System.out.println("Success");
				}else 
				{
					System.out.println("Error");
				}
			}else if(c==3)
			{
				//display student
				StudentDao.showAllStudents();
			}else if(c==4)
			{
				//exit
				break;
			}else 
			{
				
			}						
		}
		System.out.println("Thank You For Using My Application");
		System.out.println("Created By Pranav...");
		
		
	}

}
