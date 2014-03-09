package org.uwiga.dao;

import java.util.List;

import org.uwiga.model.Product;
import org.uwiga.model.SalesDetail;

public interface SalesDetailDao {
	void saveOrUpdateDetail(SalesDetail obj);

	void deleteDetail(SalesDetail obj);

	List<SalesDetail> findAllDetail();

	List<SalesDetail> findByIdDetail();	
	
}
