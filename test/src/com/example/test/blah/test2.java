package com.example.test.blah;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class test2 {

	Logger LOG;

	public test2() {

		LOG = LoggerFactory.getLogger(test2.class);
		LOG.trace("test2 - trace");
		LOG.info("test2 - info");
		LOG.debug("test2 - debug");
		LOG.warn("test2 - warn");
		LOG.error("test2 - error");
	}
}
