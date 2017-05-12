package medipol.softwaredevelopment;

import java.util.List;

public class User {

	private String userName;
	private String password;
	private List<PlayList> playList;

	public User(String userName, String password, List<PlayList> playList) {
		super();
		this.userName = userName;
		this.password = password;
		this.playList = playList;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<PlayList> getPlayList() {
		return playList;
	}

	public void setPlayList(List<PlayList> playList) {
		this.playList = playList;
	}

}