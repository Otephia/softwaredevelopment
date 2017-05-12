package medipol.softwaredevelopment;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class AppTest {
	public App app = new App();

	@Test
	public void testRegisterUser() {
		User user = app.registerUser("led zeppelin", "123456", null);
		assertTrue(user.getUserName().equalsIgnoreCase("led Zeppelin"));
	}

	@Test
	public void testgetUserList() {
		testRegisterUser();
		testRegisterUser();

		assertTrue(app.getUserList().size() == 2);
	}

	@Test
	public void testCreateSinger() {

		app.createSinger("bob marley", null, null);

		assertNotNull(app.findSingerByName("Bob marley"));
	}

	@Test
	public void getSingerList() {
		testCreateSinger();

		assertTrue(app.getSingerList().size() == 1);
	}

	@Test
	public void testFindSingerByName() {
		testCreateSinger();

		assertNotNull(app.findSingerByName("bob Marley"));
	}

	@Test
	public void testCreateAlbum() {
		Singer singer = new Singer("RAmstelin", null, null);
		Album album = new Album("Du hast");
		app.createAlbum(singer, album);

		assertTrue(app.findAlbumsBy(singer).contains(album));
	}

	@Test
	public void testFindAlbumsBy() {
		testCreateAlbum();
		assertNotNull(app.findAlbumsByName("Du hast"));
	}

	@Test
	public void testFindAlbumsBySinger() {

		Album album = new Album("Du hast");
		List<Album> albumList = new ArrayList();
		albumList.add(album);
		Singer singer = new Singer("RAmstelin", albumList, null);

		assertNotNull(singer.getAlbumList());
	}

}
}
