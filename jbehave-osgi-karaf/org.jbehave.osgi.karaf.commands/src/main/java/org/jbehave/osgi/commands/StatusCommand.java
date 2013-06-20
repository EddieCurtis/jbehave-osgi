package org.jbehave.osgi.commands;

import org.apache.felix.gogo.commands.Command;
import org.jbehave.osgi.services.EmbedderService;

/**
 * <p>
 * Command to show the Status of JBehave OSGi EmbedderService.
 * </p>
 * 
 * @author Cristiano Gavião
 */
@Command(scope = "jbehave", name = "status", description = "JBehave OSGi EmbedderService status")
public class StatusCommand extends EmbedderCommand {

	public Object doExecute() throws Exception {
        EmbedderService embedderService = getEmbedderService();
        embedderService.showStatus();
		return null;
	}

}
