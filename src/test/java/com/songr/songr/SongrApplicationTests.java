package com.songr.songr;

import com.songr.songr.Model.Album;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SongrApplicationTests {

	@Test
	void contextLoads() {
	}


	@Test
	void testing(){
   Album album = new Album("Jadal", "La Tloo'Al-Daww", 1000, 1000, "https://i.ytimg.com/vi/4ADGYRJ4kIQ/maxresdefault.jpg");
//   album.setTitle("Title");
   Assertions.assertEquals("Jadal", album.getArtist());
//   album.setArtist("Artist");
   Assertions.assertEquals("La Tloo'Al-Daww", album.getTitle());
//   album.setSongCount(1000);
   Assertions.assertEquals(1000, album.getLength());
//   album.setLength(1000);
   Assertions.assertEquals(1000, album.getSongCount());
//   album.setImageUrl("Title");
   Assertions.assertEquals("https://i.ytimg.com/vi/4ADGYRJ4kIQ/maxresdefault.jpg", album.getImageUrl());

	}

}
