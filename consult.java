package eight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.*;

public class consult {
	public static String query(ResultSet rs) {
		
		String back=" ";
		try {
			if(rs!=null)
			{
			int count=rs.getMetaData().getColumnCount();
			if(rs.next())
			{
			   do
			   {
				   for(int i=1;i<=count;i++)
				   {
					back+=rs.getString(i)+" ";
				   }
				   back+="\n"+" ";
			   }while(rs.next());
			}
			}
			else
			{
				back+="语句输入不正确，请重新输入";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return back;
}
}