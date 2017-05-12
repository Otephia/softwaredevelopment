package medipol.softwaredevelopment;

import java.util.List;

public class PlayList {

	private String name;
	private String totalDuration;
	private List<Song> songList;

	public PlayList(String name, String totalDuration, List<Song> songList) {
		super();
		this.name = name;
		this.totalDuration = totalDuration;
		this.songList = songList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTotalDuration() {
		return totalDuration;
	}

	public void setTotalDuration(String totalDuration) {
		this.totalDuration = totalDuration;
	}

	public List<Song> getSongList() {
		return songList;
	}

	public void setSongList(List<Song> songList) {
		this.songList = songList;
	}

}
