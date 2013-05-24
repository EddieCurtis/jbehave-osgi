package org.jbehave.osgi.interactive.config;

import java.util.List;

/**
 * 
 * @author Cristiano Gavião
 *
 */
public class StorySearchDTO {

	private String searchIn;
	private List<String> includes;
	private List<String> excludes;
	private String storyFinder;

	public StorySearchDTO() {
	}

	public String getSearchIn() {
		return searchIn;
	}

	public void setSearchIn(String searchIn) {
		this.searchIn = searchIn;
	}

	public List<String> getIncludes() {
		return includes;
	}

	public void setIncludes(List<String> includes) {
		this.includes = includes;
	}

	public List<String> getExcludes() {
		return excludes;
	}

	public void setExcludes(List<String> excludes) {
		this.excludes = excludes;
	}

	public String getStoryFinder() {
		return storyFinder;
	}

	public void setStoryFinder(String storyFinder) {
		this.storyFinder = storyFinder;
	}

}
