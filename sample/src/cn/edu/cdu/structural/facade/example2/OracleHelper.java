package cn.edu.cdu.structural.facade.example2;

public class OracleHelper {

    public static String getOracleDBConnection() {
        //get Oracle DB connection using connection parameters
        return "Oracle-Conn";
    }

    public void generateOraclePDFReport(String tableName, String con) {
        System.out.println("using the conn " + con + " and get data from " + tableName + " and generate pdf report");
    }

    public void generateOracleHTMLReport(String tableName, String con) {
        System.out.println("using the conn " + con + " and get data from " + tableName + " and generate html report");
    }

}