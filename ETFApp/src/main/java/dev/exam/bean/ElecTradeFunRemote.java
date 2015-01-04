package dev.exam.bean;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface ElecTradeFunRemote {

	public List<String> getTrade();
}
