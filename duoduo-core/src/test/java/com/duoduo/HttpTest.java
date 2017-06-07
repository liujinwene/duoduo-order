package com.duoduo;

import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Test;

public class HttpTest {

	@Test
	public void test() {
		HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
		httpClientBuilder.build();
	}

}
