/*
 * Copyright (C) 2016  Hendrik Borghorst
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package andrompd.org.andrompd.mpdservice.profilemanagement;


import android.database.sqlite.SQLiteDatabase;

public class MPDServerProfileTable {
    /**
     * Table name of the SQL table inside a database
     */
    public static final String SQL_TABLE_NAME = "andrompd_mpd_server_profiles";

    /**
     * Column descriptions
     */
    public static final String COLUMN_PROFILE_NAME = "profile_name";
    public static final String COLUMN_SERVER_HOSTNAME = "server_hostname";
    public static final String COLUMN_SERVER_PASSWORD = "server_password";
    public static final String COLUMN_SERVER_PORT = "server_port";
    public static final String COLUMN_PROFILE_AUTO_CONNECT = "autoconnect";

    /**
     * Projection string array used for queries on this table
     */
    public static final String[] PROJECTION_SERVER_PROFILES = {COLUMN_PROFILE_NAME, COLUMN_PROFILE_AUTO_CONNECT,
        COLUMN_SERVER_HOSTNAME, COLUMN_SERVER_PASSWORD, COLUMN_SERVER_PORT
    };


    /**
     * String to initially create the table
     */
    public static final String DATABASE_CREATE = "create table if not exists " +  SQL_TABLE_NAME + " (" +
            COLUMN_PROFILE_NAME + " text," + COLUMN_PROFILE_AUTO_CONNECT + " integer," +
            COLUMN_SERVER_HOSTNAME + " text," + COLUMN_SERVER_PASSWORD + " integer," +
            COLUMN_SERVER_PORT + " integer );";

    /**
     * Creates the inital database table.
     * @param database Database to use for table creation.
     */
    public static void onCreate(SQLiteDatabase database) {
        /*
         * Create table in the given database here.
         */
        database.execSQL(DATABASE_CREATE);
    }
}