package com.pkokoshnikov.database;

import com.pkokoshnikov.ServletContextClass;
import com.pkokoshnikov.ServletContextClass;
import com.pkokoshnikov.ServletContextClass;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SongCategoryListDAO implements LoadSongsList {
    final private ArrayList<Song> songs;
    final private String category;
    final private Integer userId;

    public SongCategoryListDAO(String category, Integer userId) {
        this.category = category;
        this.userId = userId;
        songs = new ArrayList<Song>();
    }

    @Override
    public void loadSongsList() {
        songs.clear();
        try {
            final Statement statement = ServletContextClass.getConnection().createStatement();
            final ResultSet rs = statement.executeQuery("SELECT song.id, song.name, song.text" +
                    " FROM song WHERE song." + category + "= 1");
            while (rs.next()) {
                songs.add(new Song(rs.getString("song.name"), rs.getString("song.text"), Integer.valueOf(rs.getString("song.id"))));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addSong(Integer songId) {
        try {
            final Statement statement = ServletContextClass.getConnection().createStatement();
            statement.executeUpdate("INSERT INTO usersong (id_song, id_user) VALUES (" + songId + ", " + userId + ")");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<Song> getSongList() {
        return songs;
    }
}
