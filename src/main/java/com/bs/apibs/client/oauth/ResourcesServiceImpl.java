package com.bs.apibs.client.oauth;

import java.net.URI;
import java.nio.charset.Charset;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.token.ClientTokenServices;

/**
 * Servicio de recursos ofrecidos
  */
public class ResourcesServiceImpl implements ResourcesService {
	private OAuth2RestTemplate restTemplate;
	private ClientTokenServices tokenServices;

	public String getHolaContent(String urlHola) {
		byte[] content = (getRestTemplate().getForObject(URI.create(urlHola), byte[].class));
		return new String(content, Charset.forName("UTF-8"));
	}

	public String getMovimientoContent(String UrlMovimientosFechas) {
		byte[] content = (getRestTemplate().getForObject(URI.create(UrlMovimientosFechas), byte[].class));
		if (content != null) {
			return new String(content, Charset.forName("UTF-8"));
		}
		return "";
	}

	@Override
	public String getPosicionGlobalContent(String UrlPosicionGlobal) {
		byte[] content = (getRestTemplate().getForObject(URI.create(UrlPosicionGlobal), byte[].class));
		if (content != null) {
			return new String(content, Charset.forName("UTF-8"));
		}
		return "";
	}

	public OAuth2RestTemplate getRestTemplate() {
		return restTemplate;
	}

	public void setRestTemplate(OAuth2RestTemplate cvRestTemplate) {
		this.restTemplate = cvRestTemplate;
	}

	public ClientTokenServices getTokenServices() {
		return tokenServices;
	}

	public void setTokenServices(ClientTokenServices tokenServices) {
		this.tokenServices = tokenServices;
	}
}
