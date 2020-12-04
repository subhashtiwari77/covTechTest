package com.covea.techtest.baseClasses;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
    private final Properties prop;

    public ConfigReader(final String propertyFile) {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propertyFile);
        prop = new Properties();
        try {
            prop.load(inputStream);
        } catch (final IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getProperty(final String propName) {
        return prop.getProperty(propName);
    }
}
