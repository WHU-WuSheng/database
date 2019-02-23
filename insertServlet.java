package eight;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class insertServlet extends HttpServlet {  
    public void doPost(HttpServletRequest request,  
                       HttpServletResponse response)  
            throws ServletException, IOException {     
        
    	  ResultSet rs = null;
    	  request.setCharacterEncoding("UTF-8"); 
    	  
		  
		  //获取表格
		  String table=request.getParameter("table");
		  
		  //获取条件
    	  String goal="";
		  String condition="";
		  String singal;
		  switch(table)
		  {
		  
		      case "student":
			  singal="";
			  if(!request.getParameter("studentnum").equals(""))
			  {
				  goal=goal+singal+"studentnum";
				  condition=condition+singal+"'"+request.getParameter("studentnum")+"'";
				  singal=",";
			  }
			  if(!request.getParameter("studentname").equals(""))
			  {
				  goal=goal+singal+"studentname";
				  condition=condition+singal+"'"+request.getParameter("studentname")+"'";
				  singal=",";
			  }
			  if(!request.getParameter("sex").equals(""))
			  {
				  goal=goal+singal+"sex";
				  condition=condition+singal+"'"+request.getParameter("sex")+"'";
				  singal=",";
			  }
			  if(!request.getParameter("class").equals(""))
			  {
				  goal=goal+singal+"class";
				  condition=condition+singal+request.getParameter("class");
				  singal=",";
			  }
			  if(!request.getParameter("password").equals(""))
			  {
				  goal=goal+singal+"password";
				  condition=condition+singal+"'"+request.getParameter("password")+"'";
				  singal=",";
			  }
			  if(!request.getParameter("idcard").equals(""))
			  {
				  goal=goal+singal+"idcard";
				  condition=condition+singal+"'"+request.getParameter("idcard")+"'";
				  singal=",";
			  }
			  break;
			  
		      case "teacher":
				  singal="";
				  if(!request.getParameter("teachernum").equals(""))
				  {
					  goal=goal+singal+"teachernum";
					  condition=condition+singal+"'"+request.getParameter("teachernum")+"'";
					  singal=",";
				  }
				  if(!request.getParameter("teachername").equals(""))
				  {
					  goal=goal+singal+"teachername";
					  condition=condition+singal+"'"+request.getParameter("teachername")+"'";
					  singal=",";
				  }
				  if(!request.getParameter("sex").equals(""))
				  {
					  goal=goal+singal+"sex";
					  condition=condition+singal+"'"+request.getParameter("sex")+"'";
					  singal=",";
				  }
				  if(!request.getParameter("title").equals(""))
				  {
					  goal=goal+singal+"title";
					  condition=condition+singal+"'"+request.getParameter("title")+"'";
					  singal=",";
				  }
				  if(!request.getParameter("password").equals(""))
				  {
					  goal=goal+singal+"password";
					  condition=condition+singal+"'"+request.getParameter("password")+"'";
					  singal=",";
				  }
				  break;
				  
		      case "message":
				  singal="";
				  if(!request.getParameter("messagenum").equals(""))
				  {
					  goal=goal+singal+"messagenum";
					  condition=condition+singal+request.getParameter("messagenum");
					  singal=",";
				  }
				  if(!request.getParameter("content").equals(""))
				  {
					  goal=goal+singal+"content";
					  condition=condition+singal+"'"+request.getParameter("content")+"'";
					  singal=",";
				  }
				  if(!request.getParameter("applynum").equals(""))
				  {
					  goal=goal+singal+"applynum";
					  condition=condition+singal+request.getParameter("applynum");
					  singal=",";
				  }
				  if(!request.getParameter("studentnum").equals(""))
				  {
					  goal=goal+singal+"studentnum";
					  condition=condition+singal+"'"+request.getParameter("studentnum")+"'";
					  singal=",";
				  }
				  if(!request.getParameter("time").equals(""))
				  {
					  goal=goal+singal+"time";
					  condition=condition+singal+"'"+request.getParameter("time")+"'";
					  singal=",";
				  }
				  break;
				  
		      case "lesson":
				  singal="";
				  if(!request.getParameter("lessonnum").equals(""))
				  {
					  goal=goal+singal+"lessonnum";
					  condition=condition+singal+"'"+request.getParameter("lessonnum")+"'";
					  singal=",";
				  }
				  if(!request.getParameter("lessonname").equals(""))
				  {
					  goal=goal+singal+"lessonname";
					  condition=condition+singal+"'"+request.getParameter("lessonname")+"'";
					  singal=",";
				  }
				  if(!request.getParameter("year").equals(""))
				  {
					  goal=goal+singal+"year";
					  condition=condition+singal+""+request.getParameter("year")+"'";
					  singal=",";
				  }
				  if(!request.getParameter("term").equals(""))
				  {
					  goal=goal+singal+"term";
					  condition=condition+singal+"'"+request.getParameter("term")+"'";
					  singal=",";
				  }
				  if(!request.getParameter("credit").equals(""))
				  {
					  goal=goal+singal+"credit";
					  condition=condition+singal+request.getParameter("credit");
					  singal=",";
				  }
				  if(!request.getParameter("teachernum").equals(""))
				  {
					  goal=goal+singal+"teachernum";
					  condition=condition+singal+"'"+request.getParameter("teachernum")+"'";
					  singal=",";
				  }
				  if(!request.getParameter("beforelessonnum").equals(""))
				  {
					  goal=goal+singal+"beforenum";
					  condition=condition+singal+"'"+request.getParameter("beforelessonnum")+"'";
					  singal=",";
				  }
				  break;
				  
		      case "stu_choose_lesson":
				  singal="";
				  if(!request.getParameter("studentnum").equals(""))
				  {
					  goal=goal+singal+"studentnum";
					  condition=condition+singal+"'"+request.getParameter("studentnum")+"'";
					  singal=",";
				  }
				  if(!request.getParameter("lessonnum").equals(""))
				  {
					  goal=goal+singal+"lessonnum";
					  condition=condition+singal+"'"+request.getParameter("lessonnum")+"'";
					  singal=",";
				  } 
				  break;
				  
		      case "leave_apply":
				  singal="";
				  if(!request.getParameter("applynum").equals(""))
				  {
					  goal=goal+singal+"applynum";
					  condition=condition+singal+request.getParameter("applynum");
					  singal=",";
				  }
				  if(!request.getParameter("applytime").equals(""))
				  {
					  goal=goal+singal+"applytime";
					  condition=condition+singal+"'"+request.getParameter("applytime")+"'";
					  singal=",";
				  }
				  if(!request.getParameter("reason").equals(""))
				  {
					  goal=goal+singal+"reason";
					  condition=condition+singal+"'"+request.getParameter("reason")+"'";
					  singal="，";
				  }
				  if(!request.getParameter("state").equals(""))
				  {
					  goal=goal+singal+"state";
					  condition=condition+singal+"'"+request.getParameter("state")+"'";
					  singal=",";
				  }
				  if(!request.getParameter("studentnum").equals(""))
				  {
					  goal=goal+singal+"studentnum";
					  condition=condition+singal+request.getParameter("studentnum");
					  singal=",";
				  }
				  if(!request.getParameter("teachernum").equals(""))
				  {
					  goal=goal+singal+"teachernum";
					  condition=condition+singal+"'"+request.getParameter("teachernum")+"'";
					  singal=",";
				  }
				  if(!request.getParameter("lessonnum").equals(""))
				  {
					  goal=goal+singal+"lessonnum";
					  condition=condition+singal+"'"+request.getParameter("lessonnum")+"'";
					  singal=",";
				  }
				  break;
		  }
    
		  String sql="";
		 
			  sql="insert into "+table+"("+goal+") values("+condition+")";
		  
		  System.out.println(sql);
		  
		  try {
		   Class.forName("oracle.jdbc.driver.OracleDriver"); //加载mysq驱动
		  } catch (ClassNotFoundException e) {
		   e.printStackTrace();//打印出错详细信息
		   System.out.print("驱动错误");
		  }
		   String url ="jdbc:oracle:thin:@localhost:1521:oracle";
		   String user = "scott";
		   String password = "123456";
		   try {
			Connection conn = (Connection) DriverManager.getConnection(url,user,password);
			Statement stmt = (Statement) conn.createStatement();
			   rs = stmt.executeQuery(sql);	   
			   
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   consult con=new consult();
		   String x=con.query(rs);
		   
		   if(x==" ")
		   {
			   x="插入成功";
		   }
		   x="表格为"+table+"表\n"+x;
		   request.setAttribute("response", x);
		   
		   //传送给输出jsp
       RequestDispatcher rd=request.getRequestDispatcher("/insert.jsp");  
        rd.forward(request, response); 
        
        
    }   
	
    public void doGet(HttpServletRequest request,   
                      HttpServletResponse response)  
      throws ServletException, IOException {  
            doPost(request,response);  
    	
    }  
} 