package eight;

import java.io.IOException;  
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
    
  
public class updateServlet extends HttpServlet {  
    public void doPost(HttpServletRequest request,  
                       HttpServletResponse response)  
            throws ServletException, IOException {     
        
    	  ResultSet rs = null;
    	  request.setCharacterEncoding("UTF-8"); 
    	  
		  //获取表格
		  String table=request.getParameter("table");
		  
		  //获取条件
		  String condition="";//更新的条件
		  String condition1="";//更新的字段
		  String singal;
		  String singal1;
		  switch(table)
		  {
		  
		      case "student":
			  singal="";
			  if(!request.getParameter("studentnum2").equals(""))
			  {
				  condition=condition+singal+" studentnum = '"+request.getParameter("studentnum2")+"' ";
				  singal="and";
			  }
			  if(!request.getParameter("studentname2").equals(""))
			  {
				  condition=condition+singal+" studentname = '"+request.getParameter("studentname2")+"' ";
				  singal="and";
			  }
			  if(!request.getParameter("sex2").equals(""))
			  {
				  condition=condition+singal+" sex = '"+request.getParameter("sex2")+"' ";
				  singal="and";
			  }
			  if(!request.getParameter("class2").equals(""))
			  {
				  condition=condition+singal+" class = "+request.getParameter("class2")+" ";
				  singal="and";
			  }
			  if(!request.getParameter("password2").equals(""))
			  {
				  condition=condition+singal+" password = '"+request.getParameter("password2")+"' ";
				  singal="and";
			  }
			  if(!request.getParameter("idcard2").equals(""))
			  {
				  condition=condition+singal+" idcard = '"+request.getParameter("idcard2")+"' ";
				  singal="and";
			  }
			  
			  singal1="";
			  if(!request.getParameter("studentnum").equals(""))
			  {
				  condition1=condition1+singal1+" studentnum = '"+request.getParameter("studentnum")+"' ";
				  singal1="and";
			  }
			  if(!request.getParameter("studentname").equals(""))
			  {
				  condition1=condition1+singal1+" studentname = '"+request.getParameter("studentname")+"' ";
				  singal1="and";
			  }
			  if(!request.getParameter("sex").equals(""))
			  {
				  condition1=condition1+singal1+" sex = '"+request.getParameter("sex")+"' ";
				  singal1="and";
			  }
			  if(!request.getParameter("class").equals(""))
			  {
				  condition1=condition1+singal1+" class = "+request.getParameter("class")+" ";
				  singal1="and";
			  }
			  if(!request.getParameter("password").equals(""))
			  {
				  condition1=condition1+singal1+" password = '"+request.getParameter("password")+"' ";
				  singal1="and";
			  }
			  if(!request.getParameter("idcard").equals(""))
			  {
				  condition1=condition1+singal1+" idcard = '"+request.getParameter("idcard")+"' ";
				  singal1="and";
			  }
			  break;
			  
			  
		      case "teacher":
				  singal="";
				  if(!request.getParameter("teachernum2").equals(""))
				  {
					  condition=condition+singal+" teachernum = '"+request.getParameter("teachernum2")+"' ";
					  singal="and";
				  }
				  if(!request.getParameter("teachername2").equals(""))
				  {
					  condition=condition+singal+" teachername = '"+request.getParameter("teachername2")+"' ";
					  singal="and";
				  }
				  if(!request.getParameter("sex2").equals(""))
				  {
					  condition=condition+singal+" sex = '"+request.getParameter("sex2")+"' ";
					  singal="and";
				  }
				  if(!request.getParameter("title2").equals(""))
				  {
					  condition=condition+singal+" title = '"+request.getParameter("title2")+"' ";
					  singal="and";
				  }
				  if(!request.getParameter("password2").equals(""))
				  {
					  condition=condition+singal+" password = '"+request.getParameter("password2")+"' ";
					  singal="and";
				  }
				  
				  
				  
				  singal1="";
				  if(!request.getParameter("teachernum").equals(""))
				  {
					  condition1=condition1+singal1+" teachernum = '"+request.getParameter("teachernum")+"' ";
					  singal1="and";
				  }
				  if(!request.getParameter("teachername").equals(""))
				  {
					  condition1=condition1+singal1+" teachername = '"+request.getParameter("teachername")+"' ";
					  singal1="and";
				  }
				  if(!request.getParameter("sex").equals(""))
				  {
					  condition1=condition1+singal1+" sex = '"+request.getParameter("sex")+"' ";
					  singal1="and";
				  }
				  if(!request.getParameter("title").equals(""))
				  {
					  condition1=condition1+singal1+" title = '"+request.getParameter("title")+"' ";
					  singal1="and";
				  }
				  if(!request.getParameter("password").equals(""))
				  {
					  condition1=condition1+singal1+" password = '"+request.getParameter("password")+"' ";
					  singal1="and";
				  }
				  break;
				  
		      case "message":
				  singal="";
				  if(!request.getParameter("messagenum2").equals(""))
				  {
					  condition=condition+singal+" messagenum = "+request.getParameter("messagenum2")+" ";
					  singal="and";
				  }
				  if(!request.getParameter("content2").equals(""))
				  {
					  condition=condition+singal+" content = '"+request.getParameter("content2")+"' ";
					  singal="and";
				  }
				  if(!request.getParameter("applynum2").equals(""))
				  {
					  condition=condition+singal+" applynum = "+request.getParameter("applynum2")+" ";
					  singal="and";
				  }
				  if(!request.getParameter("studentnum2").equals(""))
				  {
					  condition=condition+singal+" studentnum = '"+request.getParameter("studentnum2")+"' ";
					  singal="and";
				  }
				  if(!request.getParameter("time2").equals(""))
				  {
					  condition=condition+singal+" time = '"+request.getParameter("time2")+"' ";
					  singal="and";
				  }
				  
				  
				  
				  singal1="";
				  if(!request.getParameter("messagenum").equals(""))
				  {
					  condition1=condition1+singal1+" messagenum = "+request.getParameter("messagenum")+" ";
					  singal1="and";
				  }
				  if(!request.getParameter("content").equals(""))
				  {
					  condition1=condition1+singal1+" content = '"+request.getParameter("content")+"' ";
					  singal1="and";
				  }
				  if(!request.getParameter("applynum").equals(""))
				  {
					  condition1=condition1+singal1+" applynum = "+request.getParameter("applynum")+" ";
					  singal1="and";
				  }
				  if(!request.getParameter("studentnum").equals(""))
				  {
					  condition1=condition1+singal1+" studentnum = '"+request.getParameter("studentnum")+"' ";
					  singal1="and";
				  }
				  if(!request.getParameter("time").equals(""))
				  {
					  condition1=condition1+singal1+" time = '"+request.getParameter("time")+"' ";
					  singal1="and";
				  }
				  break;
				  
		      case "lesson":
				  singal="";
				  if(!request.getParameter("lessonnum2").equals(""))
				  {
					  condition=condition+singal+" lessonnum = '"+request.getParameter("lessonnum2")+"' ";
					  singal="and";
				  }
				  if(!request.getParameter("lessonname2").equals(""))
				  {
					  condition=condition+singal+" lessonname = '"+request.getParameter("lessonname2")+"' ";
					  singal="and";
				  }
				  if(!request.getParameter("year2").equals(""))
				  {
					  condition=condition+singal+" year = '"+request.getParameter("year2")+"' ";
					  singal="and";
				  }
				  if(!request.getParameter("term2").equals(""))
				  {
					  condition=condition+singal+" term = '"+request.getParameter("term2")+"' ";
					  singal="and";
				  }
				  if(!request.getParameter("credit2").equals(""))
				  {
					  condition=condition+singal+" credit = "+request.getParameter("credit2")+" ";
					  singal="and";
				  }
				  if(!request.getParameter("teachernum2").equals(""))
				  {
					  condition=condition+singal+" teachernum = '"+request.getParameter("teachernum2")+"' ";
					  singal="and";
				  }
				  if(!request.getParameter("beforelessonnum2").equals(""))
				  {
					  condition=condition+singal+" beforelessonnum = '"+request.getParameter("beforelessonnum2")+"' ";
					  singal="and";
				  }
				  
				  
				  
				  singal1="";
				  if(!request.getParameter("lessonnum").equals(""))
				  {
					  condition1=condition1+singal1+" lessonnum = '"+request.getParameter("lessonnum")+"' ";
					  singal1="and";
				  }
				  if(!request.getParameter("lessonname").equals(""))
				  {
					  condition1=condition1+singal1+" lessonname = '"+request.getParameter("lessonname")+"' ";
					  singal1="and";
				  }
				  if(!request.getParameter("year").equals(""))
				  {
					  condition1=condition1+singal1+" year = '"+request.getParameter("year")+"' ";
					  singal1="and";
				  }
				  if(!request.getParameter("term").equals(""))
				  {
					  condition1=condition1+singal1+" term = '"+request.getParameter("term")+"' ";
					  singal1="and";
				  }
				  if(!request.getParameter("credit").equals(""))
				  {
					  condition1=condition1+singal1+" credit = "+request.getParameter("credit")+" ";
					  singal1="and";
				  }
				  if(!request.getParameter("teachernum").equals(""))
				  {
					  condition1=condition1+singal1+" teachernum = '"+request.getParameter("teachernum")+"' ";
					  singal1="and";
				  }
				  if(!request.getParameter("beforelessonnum").equals(""))
				  {
					  condition1=condition1+singal1+" beforelessonnum = '"+request.getParameter("beforelessonnum")+"' ";
					  singal1="and";
				  }
				  break;
				  
		      case "stu_choose_lesson":
				  singal="";
				  if(!request.getParameter("studentnum2").equals(""))
				  {
					  condition=condition+singal+" studentnum = '"+request.getParameter("studentnum2")+"' ";
					  singal="and";
				  }
				  if(!request.getParameter("lessonnum2").equals(""))
				  {
					  condition=condition+singal+" lessonnum = '"+request.getParameter("lessonnum2")+"' ";
					  singal="and";
				  } 
				  
				  singal1="";
				  if(!request.getParameter("studentnum").equals(""))
				  {
					  condition1=condition1+singal1+" studentnum = '"+request.getParameter("studentnum")+"' ";
					  singal1="and";
				  }
				  if(!request.getParameter("lessonnum").equals(""))
				  {
					  condition1=condition1+singal1+" lessonnum = '"+request.getParameter("lessonnum")+"' ";
					  singal1="and";
				  } 
				  
				  
				  break;
				  
		      case "leave_apply":
				  singal="";
				  if(!request.getParameter("applynum2").equals(""))
				  {
					  condition=condition+singal+" applynumnum = "+request.getParameter("lessonnum2")+" ";
					  singal="and";
				  }
				  if(!request.getParameter("applytime2").equals(""))
				  {
					  condition=condition+singal+" applytime = '"+request.getParameter("applytime2")+"' ";
					  singal="and";
				  }
				  if(!request.getParameter("reason2").equals(""))
				  {
					  condition=condition+singal+" reason = '"+request.getParameter("reason2")+"' ";
					  singal="and";
				  }
				  if(!request.getParameter("state2").equals(""))
				  {
					  condition=condition+singal+" state = '"+request.getParameter("state2")+"' ";
					  singal="and";
				  }
				  if(!request.getParameter("studentnum2").equals(""))
				  {
					  condition=condition+singal+" studentnum = "+request.getParameter("studentnum2")+" ";
					  singal="and";
				  }
				  if(!request.getParameter("teachernum2").equals(""))
				  {
					  condition=condition+singal+" teachernum = '"+request.getParameter("teachernum2")+"' ";
					  singal="and";
				  }
				  if(!request.getParameter("lessonnum2").equals(""))
				  {
					  condition=condition+singal+" lessonnum = '"+request.getParameter("lessonnum2")+"' ";
					  singal="and";
				  }
				  
				  
				  singal1="";
				  if(!request.getParameter("applynum").equals(""))
				  {
					  condition1=condition1+singal1+" applynumnum = "+request.getParameter("lapplynum")+" ";
					  singal1="and";
				  }
				  if(!request.getParameter("applytime").equals(""))
				  {
					  condition1=condition1+singal1+" applytime = '"+request.getParameter("applytime")+"' ";
					  singal1="and";
				  }
				  if(!request.getParameter("reason").equals(""))
				  {
					  condition1=condition1+singal1+" reason = '"+request.getParameter("reason")+"' ";
					  singal1="and";
				  }
				  if(!request.getParameter("state").equals(""))
				  {
					  condition1=condition1+singal1+" state = '"+request.getParameter("state")+"' ";
					  singal1="and";
				  }
				  if(!request.getParameter("studentnum").equals(""))
				  {
					  condition1=condition1+singal1+" studentnum = "+request.getParameter("studentnum")+" ";
					  singal1="and";
				  }
				  if(!request.getParameter("teachernum").equals(""))
				  {
					  condition1=condition1+singal1+" teachernum = '"+request.getParameter("teachernum")+"' ";
					  singal1="and";
				  }
				  if(!request.getParameter("lessonnum").equals(""))
				  {
					  condition1=condition1+singal1+" lessonnum = '"+request.getParameter("lessonnum")+"' ";
					  singal1="and";
				  }
				  break;
				  
		  }
    
		  String sql="";
		  if(condition=="")
		  {
			  sql="update "+table+" set "+condition1;
		  }
		  else
		  {
			  sql="update "+table+" set "+condition1+" where "+condition;
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
			   x="更新成功";
		   }
		   x="表格为"+table+"表\n"+x;
		   request.setAttribute("response", x);
		   
		   //传送给输出jsp
       RequestDispatcher rd=request.getRequestDispatcher("/update.jsp");  
        rd.forward(request, response); 
        
        
    }   
	
    public void doGet(HttpServletRequest request,   
                      HttpServletResponse response)  
      throws ServletException, IOException {  
            doPost(request,response);  
    	
    }  
}  
