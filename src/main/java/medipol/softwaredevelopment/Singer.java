package medipol.softwaredevelopment;

import java.util.List;

public class Singer {

	private String name;
	private List<Album> albumList;
	private List<Song> songList;

	public Singer(String name, List<Album> albumList, List<Song> songList) {
		super();
		this.name = name;
		this.albumList = albumList;
		this.songList = songList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Album> getAlbumList() {
		return albumList;
	}

	public void setAlbumList(List<Album> albumList) {
		this.albumList = albumList;
	}

	@Override
	public String toString() {
		return "Singer [name=" + name + ", albumList=" + albumList + ", songList=" + songList + "]";
	}

}
