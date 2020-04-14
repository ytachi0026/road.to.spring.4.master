package spring.in.action.ch01.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc disc;

//    @Autowired
//    public CDPlayer(final CompactDisc compactDisc) {
//        this.disc = compactDisc;
//    }

    @Override
    public void play() {
        disc.play();
    }

    /**
     * After Spring has instantiated the bean, it will try to satisfy the dependencies expressed through methods such as the setCompactDisc() method that are annotated with @Autowired.
     * Actually, there’s nothing special about setter methods. @Autowired can also be applied on any method on the class.
     * @param disc
     */
    @Autowired(required = false) //If there are no matching beans, Spring will throw an exception as the application context is being created. To avoid that exception, you can set the required attribute on @Autowired to false
    public void setCompactDisc(final CompactDisc disc) {// the method can be named to anything else.
        this.disc = disc;
    }
}
