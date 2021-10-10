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
   album.setTitle("Title");
   Assertions.assertEquals("Title", album.getTitle());
   album.setTitle("Title");
   Assertions.assertEquals("Happiness", album.getTitle());
   album.setTitle("Title");
   Assertions.assertEquals(1000, album.getTitle());
   album.setTitle("Title");
   Assertions.assertEquals("1000", album.getTitle());
   album.setTitle("Title");
   Assertions.assertEquals("Title", album.getTitle());

	}

}
