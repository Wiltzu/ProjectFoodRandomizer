package org.wiltzu.foodrandomizer.service;

import java.util.List;
import java.util.Random;

import org.wiltzu.foodrandomizer.service.foodlistprovider.FoodListProvider;

public class PizzaFoodRandomizerService implements FoodRandomizerService {
	
	private FoodListProvider foodListProvider;
	private int taytteet;
	
	public void setFoodListProvider (FoodListProvider fListProvider) {
		this.foodListProvider = fListProvider;
	}

	public int getTaytteet() {
		return taytteet;
	}

	public void setTaytteet(int taytteet) {
		this.taytteet = taytteet;
	}

	@Override
	public String getFood() {
		// TODO Auto-generated method stub
		return randomizePizza(foodListProvider.getFoodList());
	}
	
	private String randomizePizza(List<String> foodList) {
		if(foodList.size() > 0) {
			Random r = new Random();
			int listLength = foodList.size();
			StringBuilder builder = new StringBuilder();
			
			for(int i = 1; i <= taytteet; i++) {
				int arvottu = r.nextInt(listLength);
				builder.append(foodList.get(arvottu));
				if(i != (taytteet)) builder.append(", ");
			}
			return builder.toString();
			
		}
else return "foodList is empty";
	}

}
