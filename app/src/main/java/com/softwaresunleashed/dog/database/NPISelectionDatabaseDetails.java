package com.softwaresunleashed.dog.database;

import java.util.ArrayList;


public class NPISelectionDatabaseDetails {


    public String NPIDisplayName;
    public String NPI_DB_Name;


    public static ArrayList<NPISelectionDatabaseDetails> db_details = new ArrayList<NPISelectionDatabaseDetails>();

    static{
        db_details.add(new NPISelectionDatabaseDetails("LA1575-simulator", "LA1575-simulator.sqlite"));
        db_details.add(new NPISelectionDatabaseDetails("LA1575", "LA1575.sqlite"));
        db_details.add(new NPISelectionDatabaseDetails("LA1785-simulator", "LA1785-simulator.sqlite"));
        db_details.add(new NPISelectionDatabaseDetails("LS1012A", "LS1012A.sqlite"));
        db_details.add(new NPISelectionDatabaseDetails("LS1023A", "LS1023A.sqlite"));
        db_details.add(new NPISelectionDatabaseDetails("LS1026A", "LS1026A.sqlite"));
        db_details.add(new NPISelectionDatabaseDetails("LS1028A-emu", "LS1028A-emu.sqlite"));
        db_details.add(new NPISelectionDatabaseDetails("LS1028A-simulator", "LS1028A-simulator.sqlite"));
        db_details.add(new NPISelectionDatabaseDetails("LS1028A", "LS1028A.sqlite"));
        db_details.add(new NPISelectionDatabaseDetails("LS1043A-simulator", "LS1043A-simulator.sqlite"));
        db_details.add(new NPISelectionDatabaseDetails("LS1043A", "LS1043A.sqlite"));
        db_details.add(new NPISelectionDatabaseDetails("LS1044A", "LS1044A.sqlite"));
        db_details.add(new NPISelectionDatabaseDetails("LS1046A-simulator", "LS1046A-simulator.sqlite"));
        db_details.add(new NPISelectionDatabaseDetails("LS1046A", "LS1046A.sqlite"));
        db_details.add(new NPISelectionDatabaseDetails("LS1048A", "LS1048A.sqlite"));
        db_details.add(new NPISelectionDatabaseDetails("LS1084A", "LS1084A.sqlite"));
        db_details.add(new NPISelectionDatabaseDetails("LS1088A-simulator", "LS1088A-simulator.sqlite"));
        db_details.add(new NPISelectionDatabaseDetails("LS1088A", "LS1088A.sqlite"));
        db_details.add(new NPISelectionDatabaseDetails("LS2040A", "LS2040A.sqlite"));
        db_details.add(new NPISelectionDatabaseDetails("LS2041A", "LS2041A.sqlite"));
        db_details.add(new NPISelectionDatabaseDetails("LS2044A", "LS2044A.sqlite"));
        db_details.add(new NPISelectionDatabaseDetails("LS2045A-simulator", "LS2045A-simulator.sqlite"));
        db_details.add(new NPISelectionDatabaseDetails("LS2045A", "LS2045A.sqlite"));
        db_details.add(new NPISelectionDatabaseDetails("LS2048A", "LS2048A.sqlite"));
        db_details.add(new NPISelectionDatabaseDetails("LS2080A", "LS2080A.sqlite"));
        db_details.add(new NPISelectionDatabaseDetails("LS2081A", "LS2081A.sqlite"));
        db_details.add(new NPISelectionDatabaseDetails("LS2084A", "LS2084A.sqlite"));
        db_details.add(new NPISelectionDatabaseDetails("LS2085A-simulator", "LS2085A-simulator.sqlite"));
        db_details.add(new NPISelectionDatabaseDetails("LS2085A", "LS2085A.sqlite"));
        db_details.add(new NPISelectionDatabaseDetails("LS2088A-simulator", "LS2088A-simulator.sqlite"));
        db_details.add(new NPISelectionDatabaseDetails("LS2088A", "LS2088A.sqlite"));
        db_details.add(new NPISelectionDatabaseDetails("LX2160A-simulator", "LX2160A-simulator.sqlite"));
        db_details.add(new NPISelectionDatabaseDetails("LX2160A", "LX2160A.sqlite"));
    };


    public NPISelectionDatabaseDetails(String NPIDisplayName, String NPI_DB_Name) {
        this.NPIDisplayName = NPIDisplayName;
        this.NPI_DB_Name = NPI_DB_Name;
    };


    public String getNPIDisplayName() {
        return NPIDisplayName;
    }

    public void setNPIDisplayName(String NPIDisplayName) {
        this.NPIDisplayName = NPIDisplayName;
    }

    public String getNPI_DB_Name() {
        return NPI_DB_Name;
    }

    public void setNPI_DB_Name(String NPI_DB_Name) {
        this.NPI_DB_Name = NPI_DB_Name;
    }

}
