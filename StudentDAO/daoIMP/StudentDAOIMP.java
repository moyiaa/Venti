package daoIMP;
import bean.Student;
import dao.StudentDAO;
import java.sql.*;

import connection.DataBaseConnection;

public class StudentDAOIMP implements StudentDAO{
	// 添加操作
	    public void insert(Student s){
	      String sql = "INSERT INTO student (id, name) values (?,?)";
	    PreparedStatement pstmt = null;
	    DataBaseConnection conn  = null;
	    //针对数据库的具体操作
	    try{
	        conn = new DataBaseConnection();
	        
	        pstmt = conn.getConnection().prepareStatement(sql);
	        pstmt.setLong(1,s.getID());
	        //pstmt.setString(1,s.getID());
	        pstmt.setString(2,s.getName());
	  
	        pstmt.executeUpdate();
	        pstmt.close();
	        conn.close();
	        }
	     catch(Exception e){  }
	      }

	    public void update(Student s）{
		 String sql = "update student SET name="+?+",id="+?+"where id="+s.getID();
      	        PreparedStatement pstmt = null;
	        DataBaseConnection conn  = null;

		try{
		 con=new DateBaseConnection();
		 pstmt = conn.getConnection().prepareStatement(sql);
	        pstmt.executeUpdate();
		 pstmt.close();
	        conn.close();

              
    		}

	      }

           public void delete(String iD){  	 
		 String sql = "delete from student where id="+iD;
      	        PreparedStatement pstmt = null;
	        DataBaseConnection conn  = null;
		 

		 try{
		 	con=new DateBaseConnection();
			pstmt = conn.getConnection().prepareStatement(sql);
			pstmt.excuteUpdate();
pstmt.close();
	        	conn.close();
    		}catch(Exception e){}
    }
	    
	    public List findAll(){ 
		List<Student>stulist=new Arraylist<student>();
		 String sql = "select*from student";
      	        PreparedStatement pstmt = null;
	        DataBaseConnection conn  = null;
              ResultSet result=null;

		 try{
			con=new DateBaseConnection();
			pstmt = conn.getConnection().prepareStatement(sql);
			result=pstmt.executeQuery(sql);
			while(result.next())
			{
                    	Student s=new Student(); 
			   	s.setID(resultSet.getInt("id"));
				s.setName(resultSet.getString("id"));
				stulist.add(s);
                    }
			pstmt.close();
	       	 conn.close();

              	return stulist;
			
    		}catch(Exception){}
		 
	     }

           public Student findByID(long iD){   	 
		 String sql = "select*from student where id=ID";
      	        PreparedStatement pstmt = null;
	        DataBaseConnection conn  = null;
		 ResultSet result=null;

		 try{
		 	con=new DateBaseConnection();
			pstmt = conn.getConnection().prepareStatement(sql);
			result=pstmt.executeQuery(sql);
			Student s=new Student(); 
			s.setID(resultSet.getInt("id"));
			s.setName(resultSet.getString("Name"));
			pstmt.close();
	        	conn.close();

			return s;	
			}
			
    		    }catch(Exception e){}
  		}

         }
