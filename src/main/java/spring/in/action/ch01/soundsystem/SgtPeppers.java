package spring.in.action.ch01.soundsystem;

import org.springframework.stereotype.Component;

/**
 * This simple annotation identifies this class as a component class and serves as a clue to Spring that a bean should be created for the class.
 */
//@Component
@Component("lonelyHeartsClub")
//@Named("lonelyHeartsClub"), you have to import: import javax.inject.Named;
public class SgtPeppers implements CompactDisc{
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
