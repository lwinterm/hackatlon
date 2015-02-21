package com.bs.apibs.client.oauth.impl;

import org.springframework.security.oauth2.client.filter.state.DefaultStateKeyGenerator;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
import org.springframework.security.oauth2.common.util.RandomValueStringGenerator;

public class ApiBsDefaultStateKeyGenerator extends DefaultStateKeyGenerator {
	private RandomValueStringGenerator generator = new RandomValueStringGenerator();

	public void setGenerator(RandomValueStringGenerator generator) {
		this.generator = generator;
	}

	@Override
	public String generateKey(OAuth2ProtectedResourceDetails resource) {
		return generator.generate();
	}
}
