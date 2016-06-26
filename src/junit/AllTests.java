package junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ QuicksortTest.class, MergesortTest.class, ArrayOnlyIntHashTableTest.class, ArrayOnlyStringHashTableTest.class  })
public class AllTests {

}
