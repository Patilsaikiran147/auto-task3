package com.bppayout.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class ConfigLoader {

	 public final static Config config = ConfigFactory.load("env");

	    public final static String environment = System.getProperty("env") == null ? "dev-int" : System.getProperty("env");

	    private static final Logger log = LoggerFactory.getLogger(ConfigLoader.class);


	    public static Config load() {

	        if (config.hasPath(environment)) {
	            log.info("Running the tests against:" + environment);
	            return config.getConfig(environment).withFallback(config);
	        }
	        return config;
	    }
}
