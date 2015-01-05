package dev.exam.utils;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public final class ClientUtil {
	private static Context initialContext;
	private static final String CLIENT_NAMING = "org.jboss.ejb.client.naming";
	
	private ClientUtil() {}
	
	public static Context getInitialContext() throws NamingException {
		if (initialContext == null) {
			Properties properties = new Properties();
			properties.put(Context.URL_PKG_PREFIXES, CLIENT_NAMING);
			initialContext = new InitialContext(properties);
		}
		
		return initialContext;
	}

	/*
	 * Create a look up string name
	 */
	public static String getLookupName(String appName, String moduleName, String distinctName, String beanName, String interfaceName) {
        return "ejb:" + appName + "/" + moduleName + "/" + distinctName
                + "/" + beanName + "!" + interfaceName;
	}
}
