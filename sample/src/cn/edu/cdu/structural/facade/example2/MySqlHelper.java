package cn.edu.cdu.structural.facade.example2;

public class MySqlHelper {

    public static String getMySqlDBConnection() {
        //get MySql DB connection using connection parameters
        return "MySQL-conn";
    }

    public void generateMySqlPDFReport(String tableName, String con) {
        System.out.println("using the conn " + con + " and get data from " + tableName + " and generate pdf report");
    }

    public void generateMySqlHTMLReport(String tableName, String con) {
        //get data from table and generate pdf report
        System.out.println("using the conn " + con + " and get data from " + tableName + " and generate html report");
    }
}