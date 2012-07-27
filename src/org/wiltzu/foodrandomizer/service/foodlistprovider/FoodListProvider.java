package org.wiltzu.foodrandomizer.service.foodlistprovider;

import java.util.List;

import org.wiltzu.foodrandomizer.service.foodlistprovider.ResourceHelper.ResourceLoaderHelper;

public interface FoodListProvider {
	
	public void setFilePath(String path);
	public void setResourceLoaderHelper(ResourceLoaderHelper rsLoaderHelper);
	public List<String> getFoodList();
}
