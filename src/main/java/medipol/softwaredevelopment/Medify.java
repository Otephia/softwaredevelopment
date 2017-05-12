package medipol.softwaredevelopment;

import java.util.List;

public interface Medify {

	User registerUser(String userName, String password, List<PlayList> playList);

	Singer createSinger(String name, List<Album> albumList, List<Song> songList);

	List<Singer> getSingerList();

	Singer findSingerByName(String name);

	Album createAlbum(Singer singer, Album album);

	List<Album> findAllAlbums();

	Album findAlbumsByName(String name);

	List<Album> findAlbumsBy(Singer singer);

	public List<User> getUserList();

	Song createSong(String name, String singer, String duration, String url, String album);

	void createPlayList(User user, PlayList playList);

	List<PlayList> findPlaylistByUser(String name);

	List<PlayList> findPlaylist();

	Song getSongDetail(String name);

}
