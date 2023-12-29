/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package universitydatabasemanagementsystem.Connection;

/**
 * The DataBaseConnection class provides information about the database connection settings.
 * It specifies the driver path and the database file path used for establishing a connection.
 * 
 * @author
 * @version 
 * @since 
 */

public class DataBaseConnection {
	
	/**
     * The driver path for the UCanAccess JDBC driver.
     * This path is used for connecting to the Microsoft Access database.
     */
    public static String DriverPath = "net.ucanaccess.jdbc.UcanaccessDriver";
    
    /**
     * The database file path for the University Access Database.
     * This path specifies the location of the Microsoft Access database file.
     */
    public static String DatabaseFile = "jdbc:ucanaccess://C:\\Users\\hp\\Desktop\\SC_Project\\University-Database-Management-System-main\\UniversityAccessDatabase.accdb";
        
}
