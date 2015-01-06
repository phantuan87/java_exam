package dev.exam.bean;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class ElectTradeFunService
 */
@Stateless
public class ElectTradeFunService implements ElectTradeFunServiceRemote {

	@Override
	public List<String> getAllTrades() {
		List<String> allTrades = new ArrayList<String>(10);
		
		for (int i = 0; i <10; i++) {
			allTrades.add(Math.random() * 10000 + ", " + Math.random() * 100);
		}
		
		return allTrades;
	}

}
