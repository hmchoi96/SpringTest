package com.eyecile.test.database.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eyecile.test.database.dao.StoreDAO;
import com.eyecile.test.database.model.Store;

@Service
public class StoreBO {

	@Autowired
	private StoreDAO storeDAO;
	
	public List<Store> getStoreList() {
		
		List<Store> list = storeDAO.selectStoreList();
		
		return list;
	}
	
	
}
