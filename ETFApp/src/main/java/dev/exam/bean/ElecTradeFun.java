package dev.exam.bean;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class ElecTradeFun
 */
@Stateless(mappedName = "etf/remote")
@LocalBean
public class ElecTradeFun implements ElecTradeFunRemote {

    public ElecTradeFun() {
       
    }

	@Override
	public List<String> getTrade() {
		List<String> tradeLst = new ArrayList<>(10);
		
		for (int i = 1; i <= 10; i++) {
			StringBuilder trade = new StringBuilder();
			trade.append("COM_" + i);
			trade.append(",");
			trade.append(Math.random() * i * 10);
			trade.append(",");
			trade.append(Math.random() * 100);
			
			tradeLst.add(trade.toString());
		}
		
		return tradeLst;
	}


}
