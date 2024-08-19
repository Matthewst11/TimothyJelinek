/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;

@Named(value = "staff")
@ApplicationScoped
public class Staff {
    String id, lastName, firstName, mi, address, city, state, telephone, email, status;
    PreparedStatement psView, psInsert, psUpdate;

    

    /**
     * Creates a new instance of Staff
     */
    public Staff() {
        id = lastName = firstName = mi = address = city = state = telephone = email = status = "";
        initDb();
    }

    private void initDb() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded");
            
            Connection connection = DriverManager.getConnection("jdbc:mysql://prometheus.gtc.edu/tjelinek_test?" +
                    "user=tjelinek&password=GTC$@mple22");
            System.out.println("Database Connected");
            
            String queryForView = "select lastName, firstName, " +
                    "mi, address, city, state, telephone, email from Staff " +
                    " where id = ?";
            
            psView = connection.prepareStatement(queryForView);

            String queryForInsert = "insert into Staff (id, lastName, firstName, "
                    + "mi, address, city, state, telephone, email) values "
                    + "(?, ?, ?, ?, ?, ?, ?, ?, ?) ";
            
            psInsert = connection.prepareStatement(queryForInsert);

            String queryForUpdate = "update Staff set lastName = ?, "
                    + "firstName = ?, mi = ?, address = ?, city = ?, state = ?, "
                    + "telephone = ?, email = ? where id = ?";
            
            psUpdate = connection.prepareStatement(queryForUpdate);

        }
        catch (Exception Ex) {
            System.out.println("Something is wrong with the Database. HELP!!!!!" +  Ex);
            status = "Database Connection Failed. Is your VPN active? Password correct?";
        }
    }
    
    public void insert(){
        try{
            psInsert.setString(1, id);
            psInsert.setString(2, lastName);
            psInsert.setString(3, firstName);
            psInsert.setString(4, mi);
            psInsert.setString(5, address);
            psInsert.setString(6, city);
            psInsert.setString(7, state);
            psInsert.setString(8, telephone);
            psInsert.setString(9, email);
            psInsert.executeUpdate();
            status = "Data successfully inserted.";
        }
        catch (SQLException ex) {
            status = "There is a problem with the database. Cannot insert data.";
        }
    }
    
    public void update(){
        try{
            psUpdate.setString(9, id);
            psUpdate.setString(1, lastName);
            psUpdate.setString(2, firstName);
            psUpdate.setString(3, mi);
            psUpdate.setString(4, address);
            psUpdate.setString(5, city);
            psUpdate.setString(6, state);
            psUpdate.setString(7, telephone);
            psUpdate.setString(8, email);
            psUpdate.executeUpdate();
            status = "Data successfully updated.";
        }
        catch (SQLException ex) {
            ex.printStackTrace();
            status = "There is a problem with the database. Cannot update data.";
        }
    }

    public void view() {
        System.out.print("the current record is: " + id);
        try {
            psView.setString(1, id);
            ResultSet rset = psView.executeQuery();
            if(rset.next()){
                lastName = rset.getString(1);
                firstName = rset.getString(2);
                mi = rset.getString(3);
                address = rset.getString(4);
                city = rset.getString(5);
                state = rset.getString(6);
                telephone = rset.getString(7);
                email = rset.getString(8);
                status = "Data retrieved";
            }
            else {
                System.out.println(id + " record not found");
                status = id + " record NOT FOUND";
            }
        }
        catch(SQLException ex) {
            status = "There is a problem with the database - Cannot generate view.";
            System.out.println(ex + " that db query didn't work");
        }
    }
    
    public void clear() {
        id = lastName = firstName = mi = address = city = state = telephone = email = status = "";
        System.out.println("The form has been cleared\n\n");
        status = "Form is Cleared";
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMi() {
        return mi;
    }

    public void setMi(String mi) {
        this.mi = mi;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PreparedStatement getPsView() {
        return psView;
    }

    public void setPsView(PreparedStatement psView) {
        this.psView = psView;
    }

    public PreparedStatement getPsInsert() {
        return psInsert;
    }

    public void setPsInsert(PreparedStatement psInsert) {
        this.psInsert = psInsert;
    }

    public PreparedStatement getPsUpdate() {
        return psUpdate;
    }

    public void setPsUpdate(PreparedStatement psUpdate) {
        this.psUpdate = psUpdate;
    }
}
