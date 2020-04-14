package spring.in.action.ch01.soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import spring.in.action.ch01.video.DVDPlayer;

/**
 * The CDPlayerConfig class defines a Spring wiring specification, expressed in Java.
 * @ComponentScan will default to scanning the same package as the configuration class.
 * Therefore, because CDPlayerConfig is in the soundsystem package,
 * Spring will scan that package and any subpackages underneath it, looking for classes that are annotated with @Component.
 *
 *
 * AGAIN!
 * Any classes in or under the soundsystem package that are annotated with @Component will also be created as beans.
 */
@Configuration
//@ComponentScan //That means it will default to the configuration class’s package as its base package to scan for components.
//@ComponentScan("spring.in.action.ch01.soundsystem")
/**
 * You probably noticed that basePackages is plural. If you’re wondering whether that means you can specify multiple base packages, you can. All you need to do is set basePackages to an array of packages to be scanned
 */
//@ComponentScan(basePackages="spring.in.action.ch01.soundsystem")
// The one thing about setting the base packages as shown here is that they’re expressed as String values. That’s fine, I suppose, but it’s not very type-safe.
//@ComponentScan(basePackages={"spring.in.action.ch01.soundsystem", "spring.in.action.ch01.video"}) // caveat: you might change the package name, so this will be needed to be updated
// Rather than specify the packages as simple String values, @ComponentScan also offers you the option of specifying them via classes or interfaces that are in the packages:
@ComponentScan(basePackageClasses={SgtPeppers.class, DVDPlayer.class}) // Whatever packages those classes are in will be used as the base package for component scanning.
public class CDPlayerConfig {
}
