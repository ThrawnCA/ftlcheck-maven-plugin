package id.thrawnca.ftlcheck;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

/**
 * Mojo that scans Freemarker templates in the project looking for problems,
 * eg cross-site scripting vulnerabilities.
 */
// Maven plugins use setter-based dependency injection
@SuppressWarnings("PMD.AtLeastOneConstructor")
@Mojo(name = "check", defaultPhase = LifecyclePhase.VERIFY)
public final class CheckMojo extends AbstractMojo {

    /**
     * Run the scan.
     * @exception MojoExecutionException If the scan fails to run,
     * eg due to file access problems.
     */
    @Override
    public void execute() throws MojoExecutionException {
        getLog().error("Not implemented yet");
    }
}
