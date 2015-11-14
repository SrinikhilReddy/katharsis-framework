package io.katharsis.spring.boot;

import io.katharsis.spring.KatharsisFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

@Configuration
@EnableConfigurationProperties(KatharsisSpringBootProperties.class)
public class KatharsisConfig {

    @Autowired
    private KatharsisSpringBootProperties properties;

    @Bean
    public Filter springBootSampleKatharsisFilter() {
        KatharsisFilter filter = new KatharsisFilter();
        filter.setResourceSearchPackage(properties.getResourcePackage());
        filter.setResourceDomain(properties.getDomainName());
        filter.setPathPrefix(properties.getPathPrefix());
        return filter;
    }
}
