package spring.in.action.ch01.soundsystem;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();


    @Autowired
    private MediaPlayer player;

    @Autowired
    private CompactDisc compactDisc;

    @Test
    public void cdShouldNotBeNull() {
        /**
         * If it’s not null, that means Spring was able to discover the CompactDisc class, automatically create it as a bean in the Spring application context, and inject it into the test.
         */
        assertNotNull(compactDisc);
    }

    @Test
    public void play() {
        player.play();
        /**
         * Testing code that uses System.out.println() is a tricky business. Therefore, this example uses StandardOutputStreamLog, a JUnit rule from the System Rules library (http://stefanbirkner.github.io/system-rules/index.html) that lets you make asser- tions against whatever is written to the console.
         */
        assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\n", systemOutRule.getLog());
    }

}
