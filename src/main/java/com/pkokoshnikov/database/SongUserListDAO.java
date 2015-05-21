package com.pkokoshnikov.database;

import com.pkokoshnikov.ServletContextClass;
import com.pkokoshnikov.ServletContextClass;
import com.pkokoshnikov.ServletContextClass;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SongUserListDAO implements LoadSongsList {
    final private ArrayList<Song> songs;
    final private Integer userId;

    public SongUserListDAO(Integer userId) {
        this.userId = userId;
        songs = new ArrayList<Song>();
    }

    @Override
    public void loadSongsList() {
        songs.clear();
        try {
            final Statement statement = ServletContextClass.getConnection().createStatement();
            final ResultSet rs = statement.executeQuery("SELECT song.id, song.name, song.text" +
                    " FROM song, usersong WHERE usersong.id_song = song.id AND usersong.id_user =" + userId);
            while (rs.next()) {
                songs.add(new Song(rs.getString("song.name"), rs.getString("song.text"), Integer.valueOf(rs.getString("song.id"))));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteSong(Integer songId) {
        try {
            final Statement statement = ServletContextClass.getConnection().createStatement();
            statement.executeUpdate("DELETE FROM usersong WHERE usersong.id_song=" + songId + " AND usersong.id_user =" + userId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<Song> getSongList() {
        return songs;
    }
}
