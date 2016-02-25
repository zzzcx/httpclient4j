package com.sobey.httpclient4j;

import org.junit.Test;

import com.sobey.httpclient4j.HttpRequest;

/**
 * @author Teddy.
 *
 */
public class HttpRequestTest {

	@Test
	public void get() {
		System.out.println(new HttpRequest().get("http://www.baidu.com"));
	}

	@Test
	public void post() {
		System.out.println(new HttpRequest().post("http://www.baidu.com"));
	}
}
