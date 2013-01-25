package com.attask.jenkins;

import hudson.model.Build;

import java.io.File;
import java.io.IOException;

/**
 * User: Joel Johnson
 * Date: 6/22/12
 * Time: 2:47 PM
 */
public class FeatherWeightBuild extends Build<FeatherWeightProject,FeatherWeightBuild> {
	public FeatherWeightBuild(FeatherWeightProject project) throws IOException {
		super(project);
	}

	public FeatherWeightBuild(FeatherWeightProject project, File buildDir) throws IOException {
		super(project, buildDir);
	}

	@Override
	public void run() {
		run(createRunner());
	}
}
