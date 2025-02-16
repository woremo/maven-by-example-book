package org.sonatype.mavenbook.weather;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import org.apache.log4j.Logger;

public class YahooRetriever {

    private static Logger log = Logger.getLogger(YahooRetriever.class);

    public InputStream retrieve(String zipcode) throws Exception {
        log.info("Retrieving Weather Data from static XML file");
        return getClass().getClassLoader().getResourceAsStream("weather.xml");
    }
}