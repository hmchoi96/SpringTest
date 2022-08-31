package com.eyecile.test.lifecycle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // controller + responsebody
public class Test02RestController {

	@RequestMapping("/lifecycle/test02/1")
	public List<Map<String, Object>> movieList() {
		
		List<Map<String, Object>> movieList = new ArrayList<>();
		
		Map<String, Object> movie = new HashMap<>();
		movie.put("rate", 15);
		movie.put("director", "봉준호");
		movie.put("time", 131);
		movie.put("title","기생충");
		
		movieList.add(movie);
		
		//무비라는 변수는 단지 만들어진 객체의 위치를 저장하는것만 함 - 이름 중복되도 무관
		//실제 객체는 new hashmap 으로 만들어진 것
		movie = new HashMap<>();
		movie.put("rate", 0);
		movie.put("director", "로베르토 베니니");
		movie.put("time", 116);
		movie.put("title","인생은 아름다워");
		
		movieList.add(movie);

		movie = new HashMap<>();
		movie.put("rate", 12);
		movie.put("director", "크리스토퍼 놀란");
		movie.put("time", 147);
		movie.put("title","인셉션");
		
		movieList.add(movie);

		
		return movieList;
	}
}
