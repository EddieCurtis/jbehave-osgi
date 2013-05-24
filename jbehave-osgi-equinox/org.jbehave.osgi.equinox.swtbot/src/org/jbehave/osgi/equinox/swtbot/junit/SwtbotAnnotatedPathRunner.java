package org.jbehave.osgi.equinox.swtbot.junit;

import org.eclipse.swtbot.swt.finder.junit.ScreenshotCaptureListener;
import org.jbehave.core.junit.AnnotatedPathRunner;
import org.junit.runner.notification.RunListener;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.model.InitializationError;

/**
 * 
 * @author Cristiano Gavião
 *
 */
public class SwtbotAnnotatedPathRunner extends AnnotatedPathRunner {

	public SwtbotAnnotatedPathRunner(Class<?> testClass)
			throws InitializationError {
		super(testClass);
		
	}
	public void run(RunNotifier notifier) {
		RunListener failureSpy = new ScreenshotCaptureListener();
		notifier.removeListener(failureSpy); // remove existing listeners that could be added by suite or class runners
		notifier.addListener(failureSpy);
		try {
			super.run(notifier);
		} finally {
			notifier.removeListener(failureSpy);
		}
	}
}
