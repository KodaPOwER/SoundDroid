package it.mytest.simone.sounddroid.it.mytest.simone.sounddroid.soundcloud;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by Simone on 25/01/2015.
 */
public interface SoundCloudService {

    static final String CLIENT_ID = "d11ca2b73e0a68de7abf2dcac66fd073";

    @GET("/tracks?client_id=" + CLIENT_ID)
    public void searchSongs(@Query("q") String query, Callback<List<Track>> cb);

    @GET("/tracks?client_id=" + CLIENT_ID)
    public void getMostRecentSong(@Query("created_at[from]") String date, Callback<List<Track>> cb);
}
