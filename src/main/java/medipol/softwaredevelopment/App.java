package medipol.softwaredevelopment;

import java.util.ArrayList;
import java.util.List;

public class App implements Medify {

	public List<User> userList = new ArrayList<User>();
	public List<Singer> singerList = new ArrayList<Singer>();
	private List<Song> songList = new ArrayList<Song>();

	public static void main(String[] args) {
		System.out.println("Hello World!");
	}

	public User registerUser(String userName, String password, List<PlayList> playList) {

		User user = new User(userName, password, playList);
		userList.add(user);
		return user;

	}

	public List<User> getUserList() {
		return userList;

	}

	public Singer createSinger(String name, List<Album> albumList, List<Song> songList) {

		Singer singer = new Singer(name, albumList, songList);
		singerList.add(singer);
		return singer;
	}

	public List<Singer> getSingerList() {
		return singerList;

	}

	public Singer findSingerByName(String name) {

		for (Singer singer : singerList) {
			if (singer.getName().equalsIgnoreCase(name)) {
				return singer;
			}
		}

		return null;
	}

	public Album createAlbum(Singer singer, Album album) {

		if (singer.getAlbumList() == null) {
			singer.setAlbumList(new ArrayList<Album>());
		}
		singer.getAlbumList().add(album);
		return album;
	}

	public List<Album> findAllAlbums() {

		List<Album> albumList = new ArrayList<Album>();
		for (Singer singer : singerList) {
			if (singer.getAlbumList() != null) {
				for (Album album : singer.getAlbumList()) {

					albumList.add(album);

				}

			}
		}

		return albumList;

	}

	public Album findAlbumsByName(String name) {

		for (Singer singer : singerList) {
			if (singer.getAlbumList() != null) {
				for (Album album : singer.getAlbumList()) {

					if (album.getName().equalsIgnoreCase(name)) {
						return album;
					}

				}

			}
		}

		return null;

	}

	public List<Album> findAlbumsBy(Singer singer) {

		return singer.getAlbumList();
	}

	public Song createSong(String name, String singer, String duration, String url, String album) {

		Song song = new Song(name, singer, duration, url, album);
		songList.add(song);
		return song;

	}

	public void createPlayList(User user, PlayList playList) {

		if (user.getPlayList() == null) {
			user.setPlayList(new ArrayList<PlayList>());
		}
		user.getPlayList().add(playList);

	}

	public List<PlayList> findPlaylistByUser(String name) {

		for (User user : userList) {
			if (user.getUserName().equalsIgnoreCase(name)) {
				return user.getPlayList();
			}

		}
		return null;
	}

	public List<PlayList> findPlaylist() {
		List<PlayList> playLists = new ArrayList();
		for (User user : userList) {
			if (user.getPlayList() != null) {
				for (PlayList playList : user.getPlayList()) {
					playLists.add(playList);
				}
			}

		}
		return playLists;
	}

	public Song getSongDetail(String name) {

		for (Song song : songList) {

			if (song.getName().equals(name)) {
				return song;
			}

		}
		return null;

	}

}
