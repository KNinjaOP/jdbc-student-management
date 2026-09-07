import java.sql.*;

public class StudentDAO {

    public void addStudent(Student s){

        String sql = 
        "INSERT INTO students VALUES(?, ?, ?, ?)";

        try(
            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql)
        ) {
            ps.setInt(1, s.getId());
            ps.setString(2, s.getName());
            ps.setInt(3, s.getAge());
            ps.setString(4, s.getCourse());

            int rows = ps.executeUpdate();

            if(rows > 0){
                System.out.println("Student Added.");
            }
        }

        catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void viewStudents(){

        String sql = 
        "SELECT * FROM students";

        try (
            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery()
        ){
            while(rs.next()){
                System.out.println(
                    rs.getInt("id") + " "
                    +
                    rs.getString("name") + " "
                    +
                    rs.getInt("age") + " "
                    +
                    rs.getString("course")
                );
            }
        }

        catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void searchStudent(int id){
        String sql = 
        "SELECT * FROM students WHERE id = ?";

        try(
            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql)
        ){
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if(rs.next()){
                System.out.println(
                    rs.getInt("id") + " "
                    +
                    rs.getString("name") + " "
                    +
                    rs.getInt("age") + " "
                    +
                    rs.getString("course")
                );
            } 
            
            else {
                System.out.println(
                    "Student not found."
                );
            }

            rs.close();
        }

        catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public void updateStudent(int id, String course){

        String sql =
        "UPDATE students SET course=? WHERE id=?";

        try(
            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql)
        ){
            ps.setString(1, course);

            ps.setInt(2, id);

            int rows = ps.executeUpdate();

            System.out.println(rows + " row updated");
        }

        catch(SQLException e){
            e.printStackTrace();
        }

    }

    public void deleteStudent(int id){

        String sql =
        "DELETE FROM students WHERE id=?";

        try(
            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql)
        ){
            ps.setInt(1,id);

            int rows = ps.executeUpdate();

            System.out.println(rows + " row deleted");
        }

        catch(SQLException e){
            e.printStackTrace();
        }

    }
}
