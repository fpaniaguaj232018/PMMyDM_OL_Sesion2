package net.juanxxiii.pmmydm_ol_sesion2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class BBDDContactos {
    private Context contexto;
    public BBDDContactos (Context _contexto){
        this.contexto = _contexto;
    }

    public void addContacto(String email, String password){
        MiSQLiteOpenHelper msqloh = new MiSQLiteOpenHelper(contexto);
        SQLiteDatabase sqldb = msqloh.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(MiSQLiteOpenHelper.COLUMNAS[0], email);
        cv.put(MiSQLiteOpenHelper.COLUMNAS[1], password);
        sqldb.insert(MiSQLiteOpenHelper.NOMBRE_TABLA, null, cv);
        sqldb.close();
    }

    public void consultarContactos(){
        MiSQLiteOpenHelper msqloh = new MiSQLiteOpenHelper(contexto);
        SQLiteDatabase sqldb = msqloh.getReadableDatabase();
        Cursor cursor = sqldb.rawQuery(
                "SELECT * FROM " + MiSQLiteOpenHelper.NOMBRE_TABLA,
                new String[]{});
        while (cursor.moveToNext()){
            Log.d("SALIDA. EMAIL",cursor.getString(0));
            Log.d("SALIDA. PASSWORD",cursor.getString(1));
        }
    }

}
