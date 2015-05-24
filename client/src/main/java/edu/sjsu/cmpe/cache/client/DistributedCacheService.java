package edu.sjsu.cmpe.cache.client;

import java.util.List;

public class DistributedCacheService implements CacheServiceInterface {
	
	List<String> cacheServerUrlList ;
	CRDTController crdtController;

    public DistributedCacheService(List<String> cacheServerUrlList) {
        this.cacheServerUrlList = cacheServerUrlList;
        this.crdtController=new CRDTController(cacheServerUrlList);
    }

    
    @Override
    public String get(long key) {
        return crdtController.get(key);
    }

    
    @Override
    public void put(long key, String value) {
         crdtController.put(key, value);
    }

}
