package com.bs.apibs.client.utils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

/**
 * Carga de fichero de propiedades.
 */
public class PropertiesUtil extends PropertyPlaceholderConfigurer {
	private static Map<String, String> propertiesMap;
	
	/** Parámetro ruta de servidor */
	public static final String RUTA_SERVIDOR = "rutaServidor";

	@SuppressWarnings("deprecation")
	@Override
	protected void processProperties(
			ConfigurableListableBeanFactory beanFactory, Properties props)
			throws BeansException {
		super.processProperties(beanFactory, props);

		propertiesMap = new HashMap<String, String>();
		for (Object key : props.keySet()) {
			String keyStr = key.toString();
			propertiesMap.put(
					keyStr,
					parseStringValue(props.getProperty(keyStr), props,
							new HashSet()));
		}
	}

	public String getProperty(String name) {
		return propertiesMap.get(name);
	}
	
	public void setProperty(String name,String value){
		propertiesMap.put(name, value);
	}
}
