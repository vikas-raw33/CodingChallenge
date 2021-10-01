package com.ubs.springmvc.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * 
 * @author Vikas
 * Central Configuration file enabling web based mvc.
 * Scans com.ubs.springmvc packages to generate beans
 *
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.ubs.springmvc")
public class PrimeNumConfiguration {

}
