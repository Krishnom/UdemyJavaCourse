package exercise28;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import static org.junit.Assert.assertEquals;

@RunWith(Suite.class)
@Suite.SuiteClasses({PaintJobTest1.class, PaintJobTest2.class,PaintJobTest3.class})
public class TestRunner{
}