package com.sobey.httpclient4j;

import java.util.Map;
import java.util.TreeMap;

public class Parameters {

	private Map<String, String> paramsMap;

	public Parameters(Map<String, String> map) {
		this.paramsMap = map;
	}

	public Parameters() {
		this(new TreeMap<String, String>());
	}

	public void add(String name, String value) {
		this.paramsMap.put(name, value);
	}

	public void addAll() {

	}
}
