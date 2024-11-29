package org.example;

import io.github.nahuel92.wiremock.micronaut.ConfigureWireMock;
import io.github.nahuel92.wiremock.micronaut.EnableWireMock;
import io.micronaut.context.annotation.Property;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@MicronautTest
@EnableWireMock(@ConfigureWireMock(name = "wiremock", properties = "my.property"))
class MicronautWiremockIssuesTest {

    @Property(name = "my.property")
    String myProperty;

    @Property(name = "wiremock.server.port")
    String wiremockServerPort;

    @Test
    void myPropertyShouldNotBeEmtpyNorNull() {
        Assertions.assertTrue(myProperty != null && !myProperty.isEmpty());
    }
}
