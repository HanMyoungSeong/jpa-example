package kr.ac.jejuuniv.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "kr.ac.jejuuniv", excludeFilters = { @Filter(Configuration.class) })
@Import({ JpaConfig.class })
public class CommponentScanOrJpaconfigTestRunner {

}
