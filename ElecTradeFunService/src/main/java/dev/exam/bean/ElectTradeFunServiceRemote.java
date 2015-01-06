package dev.exam.bean;

import javax.ejb.Remote;

/**
 * 
 * @author phantuan
 *
 */
@Remote
public interface ElectTradeFunServiceRemote {
	public String getAllTrades();
}
