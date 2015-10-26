package id.thrawnca.ftlcheck;

import org.apache.maven.plugin.MojoExecutionException;
import org.testng.annotations.Test;

import static org.testng.Assert.fail;

/**
 * Sanity-check Freemarker Template check mojo.
 */
// unit tests don't need a aconstructor
@SuppressWarnings("PMD.AtLeastOneConstructor")
public final class CheckMojoTest {

    /**
     * Ensure a blank run succeeds.
     */
    @Test
    public void shouldScanFiles() {
        try {
            new CheckMojo().execute();
        } catch (MojoExecutionException e) {
            fail("Default Mojo execution failed");
        }
    }
}
