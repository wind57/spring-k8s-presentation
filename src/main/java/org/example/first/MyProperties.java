package org.example.first;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "my")
record MyProperties(String password) {

}
