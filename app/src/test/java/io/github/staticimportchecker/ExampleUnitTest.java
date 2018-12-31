package io.github.staticimportchecker;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class ExampleUnitTest {

    @Mock
    private ConnectionInfo connectionInfo;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void test() {
        ConnectionInfo connectionInfo = Mockito.mock(ConnectionInfo.class);
    }
}
