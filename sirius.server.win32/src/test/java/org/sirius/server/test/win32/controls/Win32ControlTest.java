/**
 * 
 */
package org.sirius.server.test.win32.controls;

import org.junit.Ignore;
import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

/**
 * @author Myk Kolisnyk
 *
 */
@RunWith(Cucumber.class)
@Cucumber.Options(
        format = {"html:target/cucumber-html-report", 
                "json:target/cucumber.json",
                "pretty:target/cucumber-pretty.txt",
                "usage:target/cucumber-usage.json"
                },
        features = {"src/test/java/org/sirius/server/test/features/win32/controls"},
        glue = {"org/sirius/server/test/steps/win32/controls"},
        tags={"@none"}
)
@Ignore
public class Win32ControlTest {
    
}
