package medipol.softwaredevelopment;

public class Song {
	private String name;
	private String singer;
	private String duration;
	private String url;
	private String album;

	public Song(String name, String singer, String duration, String url, String album) {
		super();
		this.name = name;
		this.singer = singer;
		this.duration = duration;
		this.url = url;
		this.album = album;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

}
