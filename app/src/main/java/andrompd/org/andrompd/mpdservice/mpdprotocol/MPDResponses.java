package andrompd.org.andrompd.mpdservice.mpdprotocol;

/**
 * Created by hendrik on 17.07.16.
 */
public class MPDResponses {
    public static final String MPD_RESPONSE_ALBUM_NAME = "Album: ";
    public static final String MPD_RESPONSE_ALBUM_MBID = "MUSICBRAINZ_ALBUMID: ";

    public static final String MPD_RESPONSE_ARTIST_NAME = "Artist: ";
    public static final String MPD_RESPONSE_FILE = "file: ";
    public static final String MPD_RESPONSE_TRACK_TITLE = "Title: ";
    public static final String MPD_RESPONSE_ALBUM_ARTIST_NAME = "AlbumArtist: ";
    public static final String MPD_RESPONSE_TRACK_TIME = "Time: ";
    public static final String MPD_RESPONSE_DATE = "Date: ";
    public static final String MPD_RESPONSE_TRACK_MBID = "MUSICBRAINZ_TRACKID: ";
    public static final String MPD_RESPONSE_ARTIST_MBID = "MUSICBRAINZ_ARTISTID: ";
    public static final String MPD_RESPONSE_TRACK_NUMBER = "Track: ";
    public static final String MPD_RESPONSE_DISC_NUMBER = "Disc: ";

    /* MPD currentstatus responses */
    public static final String MPD_RESPONSE_VOLUME = "volume: ";
    public static final String MPD_RESPONSE_REPEAT = "repeat: ";
    public static final String MPD_RESPONSE_RANDOM = "random: ";
    public static final String MPD_RESPONSE_SINGLE = "single: ";
    public static final String MPD_RESPONSE_CONSUME = "consume: ";
    public static final String MPD_RESPONSE_PLAYLIST_VERSION = "playlist: ";
    public static final String MPD_RESPONSE_PLAYLIST_LENGTH = "playlistlength: ";
    public static final String MPD_RESPONSE_CURRENT_SONG_INDEX = "song: ";
    public static final String MPD_RESPONSE_CURRENT_SONG_ID = "songid: ";
    public static final String MPD_RESPONSE_NEXT_SONG_INDEX = "nextsong: ";
    public static final String MPD_RESPONSE_NEXT_SONG_ID = "nextsongid: ";
    public static final String MPD_RESPONSE_TIME_INFORMATION_OLD = "time: ";
    public static final String MPD_RESPONSE_ELAPSED_TIME = "elapsed: ";
    public static final String MPD_RESPONSE_DURATION = "duration: ";
    public static final String MPD_RESPONSE_BITRATE = "bitrate: ";
    public static final String MPD_RESPONSE_AUDIO_INFORMATION = "audio: ";
    public static final String MPD_RESPONSE_UPDATING_DB = "updating_db: ";
    public static final String MPD_RESPONSE_ERROR = "error: ";

    public static final String MPD_RESPONSE_PLAYBACK_STATE = "state: ";
    public static final String MPD_PLAYBACK_STATE_RESPONSE_PLAY = "play";
    public static final String MPD_PLAYBACK_STATE_RESPONSE_PAUSE = "pause";
    public static final String MPD_PLAYBACK_STATE_RESPONSE_STOP = "stop";
}