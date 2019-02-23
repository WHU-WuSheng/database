package eight;

import java.io.IOException;  
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
    
  
public class selectServlet extends HttpServlet {  
    public void doPost(HttpServletRequest request,  
                       HttpServletResponse response)  
            throws ServletException, IOException {     
        
    	  ResultSet rs = null;
    	  request.setCharacterEncoding("UTF-8"); 
    	  
    	  //获取选择目标
    	  String goal="";
		  String []tj=request.getParameterValues("tj");
		  
		  if(tj==null)
		  {
			  goal="sb";
		  }
		  else if(tj.length>1)
		  {
		    for(int i=0;i<=tj.length-2;i++)
		   {
		    	goal=goal+tj[i]+",";
		   }
		    goal+=tj[tj.length-1];
		  }
		  else if(tj.length==1)
		  {
			  goal=tj[0];
		  }
		  
		  //获取表格
		  String table=request.getParameter("table");
		  
		  //获取条件
		  String condition="";
		  String singal;
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
				  break;
				  
		      case "leave_apply":
				  singal="";
				  if(!request.getParameter("applynum2").equals(""))
				  {
					  condition=condition+singal+" applynumnum = "+request.getParameter("applynum2")+" ";
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
				  break;
		  }
    
		  String sql="";
		  if(condition=="")
		  {
			  sql="select "+goal+" from "+table;
		  }
		  else
		  {
			  sql="select "+goal+" from "+table+" where "+condition;
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
		   
		   x="表格为"+table+"表\n"+x;
		   request.setAttribute("response", x);
		   
		   //传送给输出jsp
       RequestDispatcher rd=request.getRequestDispatcher("/select.jsp");  
        rd.forward(request, response); 
        
        
    }   
	
    public void doGet(HttpServletRequest request,   
                      HttpServletResponse response)  
      throws ServletException, IOException {  
            doPost(request,response);  
    	
    }  
}  