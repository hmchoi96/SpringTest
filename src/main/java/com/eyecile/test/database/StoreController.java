package com.eyecile.test.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eyecile.test.database.bo.StoreBO;
import com.eyecile.test.database.model.Store;

@Controller
public class StoreController {
	
	@Autowired
	private StoreBO storeBO;
	
	// store테이블의 모든행을 json 으로 response에 전달 한다.
	@RequestMapping("/database/test01/1")
	@ResponseBody
	public List<Store> test01() {
		
		List<Store> list = storeBO.getStoreList();
		
		return list;
	}
	
	
}
