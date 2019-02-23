package eight;

import java.io.IOException;  
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
    
  
public class deleteServlet extends HttpServlet {  
    public void doPost(HttpServletRequest request,  
                       HttpServletResponse response)  
            throws ServletException, IOException {     
        
    	  ResultSet rs = null;
    	  request.setCharacterEncoding("UTF-8"); 
    	  
		  //获取表格
		  String table=request.getParameter("table");
		  
		  //获取条件
		  String condition="";
		  String singal;
		  switch(table)
		  {
		  
		      case "student":
			  singal="";
			  if(!request.getParameter("studentnum").equals(""))
			  {
				  condition=condition+singal+" studentnum = '"+request.getParameter("studentnum")+"' ";
				  singal="and";
			  }
			  if(!request.getParameter("studentname").equals(""))
			  {
				  condition=condition+singal+" studentname = '"+request.getParameter("studentname")+"' ";
				  singal="and";
			  }
			  if(!request.getParameter("sex").equals(""))
			  {
				  condition=condition+singal+" sex = '"+request.getParameter("sex")+"' ";
				  singal="and";
			  }
			  if(!request.getParameter("class").equals(""))
			  {
				  condition=condition+singal+" class = "+request.getParameter("class")+" ";
				  singal="and";
			  }
			  if(!request.getParameter("password").equals(""))
			  {
				  condition=condition+singal+" password = '"+request.getParameter("password")+"' ";
				  singal="and";
			  }
			  if(!request.getParameter("idcard").equals(""))
			  {
				  condition=condition+singal+" idcard = '"+request.getParameter("idcard")+"' ";
				  singal="and";
			  }
			  break;
			  
		      case "teacher":
				  singal="";
				  if(!request.getParameter("teachernum").equals(""))
				  {
					  condition=condition+singal+" teachernum = '"+request.getParameter("teachernum")+"' ";
					  singal="and";
				  }
				  if(!request.getParameter("teachername").equals(""))
				  {
					  condition=condition+singal+" teachername = '"+request.getParameter("teachername")+"' ";
					  singal="and";
				  }
				  if(!request.getParameter("sex").equals(""))
				  {
					  condition=condition+singal+" sex = '"+request.getParameter("sex")+"' ";
					  singal="and";
				  }
				  if(!request.getParameter("title").equals(""))
				  {
					  condition=condition+singal+" title = '"+request.getParameter("title")+"' ";
					  singal="and";
				  }
				  if(!request.getParameter("password").equals(""))
				  {
					  condition=condition+singal+" password = '"+request.getParameter("password")+"' ";
					  singal="and";
				  }
				  break;
				  
		      case "message":
				  singal="";
				  if(!request.getParameter("messagenum").equals(""))
				  {
					  condition=condition+singal+" messagenum = "+request.getParameter("messagenum")+" ";
					  singal="and";
				  }
				  if(!request.getParameter("content").equals(""))
				  {
					  condition=condition+singal+" content = '"+request.getParameter("content")+"' ";
					  singal="and";
				  }
				  if(!request.getParameter("applynum").equals(""))
				  {
					  condition=condition+singal+" applynum = "+request.getParameter("applynum")+" ";
					  singal="and";
				  }
				  if(!request.getParameter("studentnum").equals(""))
				  {
					  condition=condition+singal+" studentnum = '"+request.getParameter("studentnum")+"' ";
					  singal="and";
				  }
				  if(!request.getParameter("time").equals(""))
				  {
					  condition=condition+singal+" time = '"+request.getParameter("time")+"' ";
					  singal="and";
				  }
				  break;
				  
		      case "lesson":
				  singal="";
				  if(!request.getParameter("lessonnum").equals(""))
				  {
					  condition=condition+singal+" lessonnum = '"+request.getParameter("lessonnum")+"' ";
					  singal="and";
				  }
				  if(!request.getParameter("lessonname").equals(""))
				  {
					  condition=condition+singal+" lessonname = '"+request.getParameter("lessonname")+"' ";
					  singal="and";
				  }
				  if(!request.getParameter("year").equals(""))
				  {
					  condition=condition+singal+" year = '"+request.getParameter("year")+"' ";
					  singal="and";
				  }
				  if(!request.getParameter("term").equals(""))
				  {
					  condition=condition+singal+" term = '"+request.getParameter("term")+"' ";
					  singal="and";
				  }
				  if(!request.getParameter("credit").equals(""))
				  {
					  condition=condition+singal+" credit = "+request.getParameter("credit")+" ";
					  singal="and";
				  }
				  if(!request.getParameter("teachernum").equals(""))
				  {
					  condition=condition+singal+" teachernum = '"+request.getParameter("teachernum")+"' ";
					  singal="and";
				  }
				  if(!request.getParameter("beforelessonnum").equals(""))
				  {
					  condition=condition+singal+" beforelessonnum = '"+request.getParameter("beforelessonnum")+"' ";
					  singal="and";
				  }
				  break;
				  
		      case "stu_choose_lesson":
				  singal="";
				  if(!request.getParameter("studentnum").equals(""))
				  {
					  condition=condition+singal+" studentnum = '"+request.getParameter("studentnum")+"' ";
					  singal="and";
				  }
				  if(!request.getParameter("lessonnum").equals(""))
				  {
					  condition=condition+singal+" lessonnum = '"+request.getParameter("lessonnum")+"' ";
					  singal="and";
				  } 
				  break;
				  
		      case "leave_apply":
				  singal="";
				  if(!request.getParameter("applynum").equals(""))
				  {
					  condition=condition+singal+" applynumnum = "+request.getParameter("applynum")+" ";
					  singal="and";
				  }
				  if(!request.getParameter("applytime").equals(""))
				  {
					  condition=condition+singal+" applytime = '"+request.getParameter("applytime")+"' ";
					  singal="and";
				  }
				  if(!request.getParameter("reason").equals(""))
				  {
					  condition=condition+singal+" reason = '"+request.getParameter("reason")+"' ";
					  singal="and";
				  }
				  if(!request.getParameter("state").equals(""))
				  {
					  condition=condition+singal+" state = '"+request.getParameter("state")+"' ";
					  singal="and";
				  }
				  if(!request.getParameter("studentnum").equals(""))
				  {
					  condition=condition+singal+" studentnum = "+request.getParameter("studentnum")+" ";
					  singal="and";
				  }
				  if(!request.getParameter("teachernum").equals(""))
				  {
					  condition=condition+singal+" teachernum = '"+request.getParameter("teachernum")+"' ";
					  singal="and";
				  }
				  if(!request.getParameter("lessonnum").equals(""))
				  {
					  condition=condition+singal+" lessonnum = '"+request.getParameter("lessonnum")+"' ";
					  singal="and";
				  }
				  break;
		  }
    
		  String sql="";
		  if(condition=="")
		  {
			  sql="delete from "+table;
		  }
		  else
		  {
			  sql="delete from "+table+" where "+condition;
		  }
		  
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
			   x="删除成功";
		   }
		   x="表格为"+table+"表\n"+x;
		   request.setAttribute("response", x);
		   
		   //传送给输出jsp
       RequestDispatcher rd=request.getRequestDispatcher("/delete.jsp");  
        rd.forward(request, response); 
        
        
    }   
	
    public void doGet(HttpServletRequest request,   
                      HttpServletResponse response)  
      throws ServletException, IOException {  
            doPost(request,response);  
    	
    }  
}  