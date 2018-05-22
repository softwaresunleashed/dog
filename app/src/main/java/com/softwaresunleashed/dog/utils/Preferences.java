package com.softwaresunleashed.dog.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class Preferences {


    public static final String SHARED_PREF_NAME = "DOG_SHARED_PREFS";

    //Shared Preferences Keys
    public static final String SHARED_PREF_CURRENT_NPI_DB = "current_npi_database";
    public static final String SHARED_PREF_CURRENT_DUMP_FILE = "current_dump_file";


    public static String getCurrentNPIDB(Context context) {
        if (context != null) {
            SharedPreferences sp = context.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
            return sp.getString(SHARED_PREF_CURRENT_NPI_DB, null);
        } else
            return null;
    }

    public static void setCurrentNPIDB(Context context, String value) {
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
            SharedPreferences.Editor sharedPreferencesEditor = sharedPreferences.edit();
            sharedPreferencesEditor.putString(SHARED_PREF_CURRENT_NPI_DB, value);
            sharedPreferencesEditor.apply();
        }
    }


    public static String getCurrentDumpFile(Context context) {
        if (context != null) {
            SharedPreferences sp = context.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
            return sp.getString(SHARED_PREF_CURRENT_DUMP_FILE, null);
        } else
            return null;
    }

    public static void setCurrentDumpFile(Context context, String value) {
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
            SharedPreferences.Editor sharedPreferencesEditor = sharedPreferences.edit();
            sharedPreferencesEditor.putString(SHARED_PREF_CURRENT_DUMP_FILE, value);
            sharedPreferencesEditor.apply();
        }
    }



}
