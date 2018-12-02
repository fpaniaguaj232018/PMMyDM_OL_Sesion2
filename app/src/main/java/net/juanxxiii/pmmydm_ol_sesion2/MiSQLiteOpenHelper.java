package net.juanxxiii.pmmydm_ol_sesion2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MiSQLiteOpenHelper extends SQLiteOpenHelper {
    public static final String NOMBRE_BBDD = "BBDD_USUARIOS";
    public static final String NOMBRE_TABLA = "T_USUARIOS";
    public static final String[] COLUMNAS = {"EMAIL", "PASSWORD"};
    private static final int VERSION = 1;

    public MiSQLiteOpenHelper(Context context){
        super(context, NOMBRE_BBDD, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqldb){
        sqldb.execSQL(
                "CREATE TABLE " +
                        NOMBRE_TABLA +
                        " (" +
                        COLUMNAS[0] +
                        " TEXT ," +
                        COLUMNAS[1]+
                        " TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqldb, int oldVersion, int newVersion){
        //NO HAGO NADA
    }

}