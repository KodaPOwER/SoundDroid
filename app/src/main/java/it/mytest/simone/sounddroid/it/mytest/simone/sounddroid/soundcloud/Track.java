package it.mytest.simone.sounddroid.it.mytest.simone.sounddroid.soundcloud;

import com.google.gson.annotations.SerializedName;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Simone on 25/01/2015.
 */
public class Track {
    @SerializedName("title")
    private String mTitle;

    @SerializedName("stream_url")
    private String mStreamURL;

    @SerializedName("id")
    private int mID;

    @SerializedName("artwork_url")
    private String artworkURL;

    public String getArtworkURL() { return artworkURL; }

    public String getAvatarURL() {
        String avatarURL = artworkURL;
        if(avatarURL != null){
            avatarURL = artworkURL.replace("large","tiny");
        }
        return avatarURL;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getStreamURL() {
        return mStreamURL;
    }

    public int getID() {
        return mID;
    }

    public void setID(int ID) {
        mID = ID;
    }

}
