package dev.exam.bean;

import java.util.List;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class ElectTradeFunService
 */
@Stateless
public class ElectTradeFunService implements ElectTradeFunServiceRemote {

	@Override
	public List<String> getAllTrades() {
		// TODO Auto-generated method stub
		return null;
	}

}
