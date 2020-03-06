package ca.ibodrov.testcontainersexample;

import org.junit.Rule;
import org.junit.Test;
import org.testcontainers.containers.GenericContainer;

public class SimpleTest {

    @Rule
    public GenericContainer<?> redis = new GenericContainer<>("redis:5.0.3-alpine")
            .withExposedPorts(6379);

    @Test
    public void test() throws Exception {
        System.out.println("!!! " + redis.getContainerIpAddress() + ":" + redis.getFirstMappedPort());
    }
}
