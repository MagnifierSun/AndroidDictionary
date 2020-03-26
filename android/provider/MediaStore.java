/*      */ package android.provider;
/*      */ 
/*      */ import android.content.ContentResolver;
/*      */ import android.content.Context;
/*      */ import android.database.Cursor;
/*      */ import android.graphics.Bitmap;
/*      */ import android.graphics.BitmapFactory;
/*      */ import android.net.Uri;
/*      */ import java.io.FileNotFoundException;
/*      */ import java.io.IOException;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public final class MediaStore
/*      */ {
/*      */   public static final String ACTION_IMAGE_CAPTURE = "android.media.action.IMAGE_CAPTURE";
/*      */   public static final String ACTION_IMAGE_CAPTURE_SECURE = "android.media.action.IMAGE_CAPTURE_SECURE";
/*      */   public static final String ACTION_VIDEO_CAPTURE = "android.media.action.VIDEO_CAPTURE";
/*      */   public static final String AUTHORITY = "media";
/*      */   public static final String EXTRA_DURATION_LIMIT = "android.intent.extra.durationLimit";
/*      */   public static final String EXTRA_FINISH_ON_COMPLETION = "android.intent.extra.finishOnCompletion";
/*      */   public static final String EXTRA_FULL_SCREEN = "android.intent.extra.fullScreen";
/*      */   public static final String EXTRA_MEDIA_ALBUM = "android.intent.extra.album";
/*      */   public static final String EXTRA_MEDIA_ARTIST = "android.intent.extra.artist";
/*      */   public static final String EXTRA_MEDIA_FOCUS = "android.intent.extra.focus";
/*      */   public static final String EXTRA_MEDIA_GENRE = "android.intent.extra.genre";
/*      */   public static final String EXTRA_MEDIA_PLAYLIST = "android.intent.extra.playlist";
/*      */   public static final String EXTRA_MEDIA_RADIO_CHANNEL = "android.intent.extra.radio_channel";
/*      */   public static final String EXTRA_MEDIA_TITLE = "android.intent.extra.title";
/*      */   public static final String EXTRA_OUTPUT = "output";
/*      */   
/*      */   public MediaStore() {
/*   38 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */   public static final String EXTRA_SCREEN_ORIENTATION = "android.intent.extra.screenOrientation"; public static final String EXTRA_SHOW_ACTION_ICONS = "android.intent.extra.showActionIcons"; public static final String EXTRA_SIZE_LIMIT = "android.intent.extra.sizeLimit"; public static final String EXTRA_VIDEO_QUALITY = "android.intent.extra.videoQuality"; public static final String INTENT_ACTION_MEDIA_PLAY_FROM_SEARCH = "android.media.action.MEDIA_PLAY_FROM_SEARCH"; public static final String INTENT_ACTION_MEDIA_SEARCH = "android.intent.action.MEDIA_SEARCH"; @Deprecated
/*      */   public static final String INTENT_ACTION_MUSIC_PLAYER = "android.intent.action.MUSIC_PLAYER"; public static final String INTENT_ACTION_STILL_IMAGE_CAMERA = "android.media.action.STILL_IMAGE_CAMERA"; public static final String INTENT_ACTION_STILL_IMAGE_CAMERA_SECURE = "android.media.action.STILL_IMAGE_CAMERA_SECURE"; public static final String INTENT_ACTION_TEXT_OPEN_FROM_SEARCH = "android.media.action.TEXT_OPEN_FROM_SEARCH"; public static final String INTENT_ACTION_VIDEO_CAMERA = "android.media.action.VIDEO_CAMERA"; public static final String INTENT_ACTION_VIDEO_PLAY_FROM_SEARCH = "android.media.action.VIDEO_PLAY_FROM_SEARCH"; public static final String MEDIA_IGNORE_FILENAME = ".nomedia"; public static final String MEDIA_SCANNER_VOLUME = "volume"; public static final String META_DATA_STILL_IMAGE_CAMERA_PREWARM_SERVICE = "android.media.still_image_camera_preview_service"; public static final String UNKNOWN_STRING = "<unknown>";
/*      */   
/*      */   public static Uri getMediaScannerUri() {
/*   44 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String getVersion(Context context) {
/*   55 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Uri getDocumentUri(Context context, Uri mediaUri) {
/*   80 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final class Audio
/*      */   {
/*      */     public Audio() {
/*  415 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static String keyFor(String name) {
/*  433 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static interface AlbumColumns
/*      */     {
/*      */       public static final String ALBUM = "album";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String ALBUM_ART = "album_art";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String ALBUM_ID = "album_id";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String ALBUM_KEY = "album_key";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String ARTIST = "artist";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String FIRST_YEAR = "minyear";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String LAST_YEAR = "maxyear";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String NUMBER_OF_SONGS = "numsongs";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String NUMBER_OF_SONGS_FOR_ARTIST = "numsongs_by_artist";
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final class Albums
/*      */       implements BaseColumns, AlbumColumns
/*      */     {
/*      */       public static final String CONTENT_TYPE = "vnd.android.cursor.dir/albums";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String DEFAULT_SORT_ORDER = "album_key";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String ENTRY_CONTENT_TYPE = "vnd.android.cursor.item/album";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public Albums() {
/*  521 */         throw new RuntimeException("Stub!");
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static Uri getContentUri(String volumeName) {
/*  531 */         throw new RuntimeException("Stub!");
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  557 */       public static final Uri EXTERNAL_CONTENT_URI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  564 */       public static final Uri INTERNAL_CONTENT_URI = null;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static interface ArtistColumns
/*      */     {
/*      */       public static final String ARTIST = "artist";
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String ARTIST_KEY = "artist_key";
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String NUMBER_OF_ALBUMS = "number_of_albums";
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String NUMBER_OF_TRACKS = "number_of_tracks";
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final class Artists
/*      */       implements BaseColumns, ArtistColumns
/*      */     {
/*      */       public static final String CONTENT_TYPE = "vnd.android.cursor.dir/artists";
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String DEFAULT_SORT_ORDER = "artist_key";
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String ENTRY_CONTENT_TYPE = "vnd.android.cursor.item/artist";
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public Artists() {
/*  609 */         throw new RuntimeException("Stub!");
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static Uri getContentUri(String volumeName) {
/*  619 */         throw new RuntimeException("Stub!");
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  645 */       public static final Uri EXTERNAL_CONTENT_URI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  652 */       public static final Uri INTERNAL_CONTENT_URI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final class Albums
/*      */         implements MediaStore.Audio.AlbumColumns
/*      */       {
/*      */         public Albums() {
/*  661 */           throw new RuntimeException("Stub!");
/*      */         } public static Uri getContentUri(String volumeName, long artistId) {
/*  663 */           throw new RuntimeException("Stub!");
/*      */         }
/*      */       }
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static interface AudioColumns
/*      */       extends MediaStore.MediaColumns
/*      */     {
/*      */       public static final String ALBUM = "album";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String ALBUM_ID = "album_id";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String ALBUM_KEY = "album_key";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String ARTIST = "artist";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String ARTIST_ID = "artist_id";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String ARTIST_KEY = "artist_key";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String BOOKMARK = "bookmark";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String COMPOSER = "composer";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String DURATION = "duration";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String IS_ALARM = "is_alarm";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String IS_MUSIC = "is_music";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String IS_NOTIFICATION = "is_notification";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String IS_PODCAST = "is_podcast";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String IS_RINGTONE = "is_ringtone";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String TITLE_KEY = "title_key";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String TRACK = "track";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String YEAR = "year";
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final class Genres
/*      */       implements BaseColumns, GenresColumns
/*      */     {
/*      */       public static final String CONTENT_TYPE = "vnd.android.cursor.dir/genre";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String DEFAULT_SORT_ORDER = "name";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String ENTRY_CONTENT_TYPE = "vnd.android.cursor.item/genre";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public Genres() {
/*  810 */         throw new RuntimeException("Stub!");
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static Uri getContentUri(String volumeName) {
/*  820 */         throw new RuntimeException("Stub!");
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static Uri getContentUriForAudioId(String volumeName, int audioId) {
/*  831 */         throw new RuntimeException("Stub!");
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  857 */       public static final Uri EXTERNAL_CONTENT_URI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  864 */       public static final Uri INTERNAL_CONTENT_URI = null;
/*      */       
/*      */       public static final class Members implements MediaStore.Audio.AudioColumns { public static final String AUDIO_ID = "audio_id";
/*      */         public static final String CONTENT_DIRECTORY = "members";
/*      */         public static final String DEFAULT_SORT_ORDER = "title_key";
/*      */         public static final String GENRE_ID = "genre_id";
/*      */         
/*      */         public Members() {
/*  872 */           throw new RuntimeException("Stub!");
/*      */         } public static Uri getContentUri(String volumeName, long genreId) {
/*  874 */           throw new RuntimeException("Stub!");
/*      */         } }
/*      */     
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static interface GenresColumns
/*      */     {
/*      */       public static final String NAME = "name";
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final class Media
/*      */       implements AudioColumns
/*      */     {
/*      */       public static final String CONTENT_TYPE = "vnd.android.cursor.dir/audio";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String DEFAULT_SORT_ORDER = "title_key";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String ENTRY_CONTENT_TYPE = "vnd.android.cursor.item/audio";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public Media() {
/*  923 */         throw new RuntimeException("Stub!");
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static Uri getContentUri(String volumeName) {
/*  933 */         throw new RuntimeException("Stub!");
/*      */       } public static Uri getContentUriForPath(String path) {
/*  935 */         throw new RuntimeException("Stub!");
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  961 */       public static final Uri EXTERNAL_CONTENT_URI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String EXTRA_MAX_BYTES = "android.provider.MediaStore.extra.MAX_BYTES";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  977 */       public static final Uri INTERNAL_CONTENT_URI = null;
/*      */ 
/*      */       
/*      */       public static final String RECORD_SOUND_ACTION = "android.provider.MediaStore.RECORD_SOUND";
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public static final class Playlists
/*      */       implements BaseColumns, PlaylistsColumns
/*      */     {
/*      */       public static final String CONTENT_TYPE = "vnd.android.cursor.dir/playlist";
/*      */ 
/*      */       
/*      */       public static final String DEFAULT_SORT_ORDER = "name";
/*      */ 
/*      */       
/*      */       public static final String ENTRY_CONTENT_TYPE = "vnd.android.cursor.item/playlist";
/*      */ 
/*      */       
/*      */       public Playlists() {
/*  998 */         throw new RuntimeException("Stub!");
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static Uri getContentUri(String volumeName) {
/* 1008 */         throw new RuntimeException("Stub!");
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1034 */       public static final Uri EXTERNAL_CONTENT_URI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1041 */       public static final Uri INTERNAL_CONTENT_URI = null;
/*      */       public static final class Members implements MediaStore.Audio.AudioColumns { public static final String AUDIO_ID = "audio_id"; public static final String CONTENT_DIRECTORY = "members";
/*      */         public static final String DEFAULT_SORT_ORDER = "play_order";
/*      */         public static final String PLAYLIST_ID = "playlist_id";
/*      */         public static final String PLAY_ORDER = "play_order";
/*      */         public static final String _ID = "_id";
/*      */         
/*      */         public Members() {
/* 1049 */           throw new RuntimeException("Stub!");
/*      */         } public static Uri getContentUri(String volumeName, long playlistId) {
/* 1051 */           throw new RuntimeException("Stub!");
/*      */         }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         public static boolean moveItem(ContentResolver res, long playlistId, int from, int to) {
/* 1062 */           throw new RuntimeException("Stub!");
/*      */         } }
/*      */     
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static interface PlaylistsColumns
/*      */     {
/*      */       public static final String DATA = "_data";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String DATE_ADDED = "date_added";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String DATE_MODIFIED = "date_modified";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String NAME = "name";
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final class Radio
/*      */     {
/*      */       public static final String ENTRY_CONTENT_TYPE = "vnd.android.cursor.item/radio";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       Radio() {
/* 1156 */         throw new RuntimeException("Stub!");
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final class Files
/*      */   {
/*      */     public Files() {
/* 1177 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static Uri getContentUri(String volumeName) {
/* 1187 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static Uri getContentUri(String volumeName, long rowId) {
/* 1198 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static interface FileColumns
/*      */       extends MediaStore.MediaColumns
/*      */     {
/*      */       public static final String MEDIA_TYPE = "media_type";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final int MEDIA_TYPE_AUDIO = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final int MEDIA_TYPE_IMAGE = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final int MEDIA_TYPE_NONE = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final int MEDIA_TYPE_PLAYLIST = 4;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final int MEDIA_TYPE_VIDEO = 3;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String MIME_TYPE = "mime_type";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String PARENT = "parent";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String TITLE = "title";
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final class Images
/*      */   {
/*      */     public Images() {
/* 1277 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static interface ImageColumns
/*      */       extends MediaStore.MediaColumns
/*      */     {
/*      */       public static final String BUCKET_DISPLAY_NAME = "bucket_display_name";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String BUCKET_ID = "bucket_id";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String DATE_TAKEN = "datetaken";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String DESCRIPTION = "description";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String IS_PRIVATE = "isprivate";
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String LATITUDE = "latitude";
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String LONGITUDE = "longitude";
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String MINI_THUMB_MAGIC = "mini_thumb_magic";
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String ORIENTATION = "orientation";
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String PICASA_ID = "picasa_id";
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final class Media
/*      */       implements ImageColumns
/*      */     {
/*      */       public static final String CONTENT_TYPE = "vnd.android.cursor.dir/image";
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String DEFAULT_SORT_ORDER = "bucket_display_name";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public Media() {
/* 1359 */         throw new RuntimeException("Stub!");
/*      */       } public static Cursor query(ContentResolver cr, Uri uri, String[] projection) {
/* 1361 */         throw new RuntimeException("Stub!");
/*      */       } public static Cursor query(ContentResolver cr, Uri uri, String[] projection, String where, String orderBy) {
/* 1363 */         throw new RuntimeException("Stub!");
/*      */       } public static Cursor query(ContentResolver cr, Uri uri, String[] projection, String selection, String[] selectionArgs, String orderBy) {
/* 1365 */         throw new RuntimeException("Stub!");
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static Bitmap getBitmap(ContentResolver cr, Uri url) throws FileNotFoundException, IOException {
/* 1376 */         throw new RuntimeException("Stub!");
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static String insertImage(ContentResolver cr, String imagePath, String name, String description) throws FileNotFoundException {
/* 1389 */         throw new RuntimeException("Stub!");
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static String insertImage(ContentResolver cr, Bitmap source, String title, String description) {
/* 1402 */         throw new RuntimeException("Stub!");
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static Uri getContentUri(String volumeName) {
/* 1412 */         throw new RuntimeException("Stub!");
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1434 */       public static final Uri EXTERNAL_CONTENT_URI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1441 */       public static final Uri INTERNAL_CONTENT_URI = null;
/*      */     }
/*      */ 
/*      */     
/*      */     public static class Thumbnails
/*      */       implements BaseColumns
/*      */     {
/*      */       public static final String DATA = "_data";
/*      */       
/*      */       public static final String DEFAULT_SORT_ORDER = "image_id ASC";
/*      */       
/*      */       public Thumbnails() {
/* 1453 */         throw new RuntimeException("Stub!");
/*      */       } public static final Cursor query(ContentResolver cr, Uri uri, String[] projection) {
/* 1455 */         throw new RuntimeException("Stub!");
/*      */       } public static final Cursor queryMiniThumbnails(ContentResolver cr, Uri uri, int kind, String[] projection) {
/* 1457 */         throw new RuntimeException("Stub!");
/*      */       } public static final Cursor queryMiniThumbnail(ContentResolver cr, long origId, int kind, String[] projection) {
/* 1459 */         throw new RuntimeException("Stub!");
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static void cancelThumbnailRequest(ContentResolver cr, long origId) {
/* 1470 */         throw new RuntimeException("Stub!");
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static Bitmap getThumbnail(ContentResolver cr, long origId, int kind, BitmapFactory.Options options) {
/* 1484 */         throw new RuntimeException("Stub!");
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static void cancelThumbnailRequest(ContentResolver cr, long origId, long groupId) {
/* 1496 */         throw new RuntimeException("Stub!");
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static Bitmap getThumbnail(ContentResolver cr, long origId, long groupId, int kind, BitmapFactory.Options options) {
/* 1511 */         throw new RuntimeException("Stub!");
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static Uri getContentUri(String volumeName) {
/* 1521 */         throw new RuntimeException("Stub!");
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1549 */       public static final Uri EXTERNAL_CONTENT_URI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final int FULL_SCREEN_KIND = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String HEIGHT = "height";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String IMAGE_ID = "image_id";
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1572 */       public static final Uri INTERNAL_CONTENT_URI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String KIND = "kind";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final int MICRO_KIND = 3;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final int MINI_KIND = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String THUMB_DATA = "thumb_data";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String WIDTH = "width";
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static interface MediaColumns
/*      */     extends BaseColumns
/*      */   {
/*      */     public static final String DATA = "_data";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String DATE_ADDED = "date_added";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String DATE_MODIFIED = "date_modified";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String DISPLAY_NAME = "_display_name";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String HEIGHT = "height";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String MIME_TYPE = "mime_type";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String SIZE = "_size";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String TITLE = "title";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String WIDTH = "width";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final class Video
/*      */   {
/*      */     public static final String DEFAULT_SORT_ORDER = "_display_name";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Video() {
/* 1683 */       throw new RuntimeException("Stub!");
/*      */     } public static Cursor query(ContentResolver cr, Uri uri, String[] projection) {
/* 1685 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */     
/*      */     public static final class Media
/*      */       implements VideoColumns
/*      */     {
/*      */       public static final String CONTENT_TYPE = "vnd.android.cursor.dir/video";
/*      */       public static final String DEFAULT_SORT_ORDER = "title";
/*      */       
/*      */       public Media() {
/* 1695 */         throw new RuntimeException("Stub!");
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static Uri getContentUri(String volumeName) {
/* 1705 */         throw new RuntimeException("Stub!");
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1725 */       public static final Uri EXTERNAL_CONTENT_URI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1732 */       public static final Uri INTERNAL_CONTENT_URI = null;
/*      */     }
/*      */ 
/*      */     
/*      */     public static class Thumbnails
/*      */       implements BaseColumns
/*      */     {
/*      */       public static final String DATA = "_data";
/*      */       
/*      */       public static final String DEFAULT_SORT_ORDER = "video_id ASC";
/*      */ 
/*      */       
/*      */       public Thumbnails() {
/* 1745 */         throw new RuntimeException("Stub!");
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static void cancelThumbnailRequest(ContentResolver cr, long origId) {
/* 1756 */         throw new RuntimeException("Stub!");
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static Bitmap getThumbnail(ContentResolver cr, long origId, int kind, BitmapFactory.Options options) {
/* 1770 */         throw new RuntimeException("Stub!");
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static Bitmap getThumbnail(ContentResolver cr, long origId, long groupId, int kind, BitmapFactory.Options options) {
/* 1785 */         throw new RuntimeException("Stub!");
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static void cancelThumbnailRequest(ContentResolver cr, long origId, long groupId) {
/* 1797 */         throw new RuntimeException("Stub!");
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static Uri getContentUri(String volumeName) {
/* 1807 */         throw new RuntimeException("Stub!");
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1835 */       public static final Uri EXTERNAL_CONTENT_URI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final int FULL_SCREEN_KIND = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String HEIGHT = "height";
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1851 */       public static final Uri INTERNAL_CONTENT_URI = null;
/*      */       public static final String KIND = "kind";
/*      */       public static final int MICRO_KIND = 3;
/*      */       public static final int MINI_KIND = 1;
/*      */       public static final String VIDEO_ID = "video_id";
/*      */       public static final String WIDTH = "width";
/*      */     }
/*      */     
/*      */     public static interface VideoColumns extends MediaStore.MediaColumns {
/*      */       public static final String ALBUM = "album";
/*      */       public static final String ARTIST = "artist";
/*      */       public static final String BOOKMARK = "bookmark";
/*      */       public static final String BUCKET_DISPLAY_NAME = "bucket_display_name";
/*      */       public static final String BUCKET_ID = "bucket_id";
/*      */       public static final String CATEGORY = "category";
/*      */       public static final String DATE_TAKEN = "datetaken";
/*      */       public static final String DESCRIPTION = "description";
/*      */       public static final String DURATION = "duration";
/*      */       public static final String IS_PRIVATE = "isprivate";
/*      */       public static final String LANGUAGE = "language";
/*      */       public static final String LATITUDE = "latitude";
/*      */       public static final String LONGITUDE = "longitude";
/*      */       public static final String MINI_THUMB_MAGIC = "mini_thumb_magic";
/*      */       public static final String RESOLUTION = "resolution";
/*      */       public static final String TAGS = "tags";
/*      */     }
/*      */   }
/*      */ }


/* Location:              M:\learn_android\android.jar!\android\provider\MediaStore.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */