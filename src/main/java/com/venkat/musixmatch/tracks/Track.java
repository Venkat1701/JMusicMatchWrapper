package com.venkat.musixmatch.tracks;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

/**
 *  A Music Track operating on TrackInfo.
 * @author Venkat.
 * @since 1.0
 */
public class Track {

    @SerializedName("track")
    @Getter
    @Setter
    private TrackInfo info;
}
