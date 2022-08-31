package com.eyecile.test.lifecycle;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/lifecycle/test01")
public class Test01Controller {
	
	@RequestMapping("/1")
	@ResponseBody
	public String testString() {
		return "<h1>테스트 프로젝트 완성</h1> <h4>늦었지만 잘 부탁드립니다. 열심히 하겠습니다!!!</h4>";
	}
	
	@RequestMapping("/2")
	@ResponseBody
	public Map<String, Integer> ScoreMap() {
		Map<String, Integer> score = new HashMap<>();
		
		score.put("국어", 85);
		score.put("수학", 95);
		score.put("영어", 90);
	
		return score;
	}
	
}
