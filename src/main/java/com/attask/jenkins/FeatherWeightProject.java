package com.attask.jenkins;

import hudson.Extension;
import hudson.model.*;

/**
 * User: Joel Johnson
 * Date: 6/22/12
 * Time: 2:47 PM
 */
public class FeatherWeightProject extends Project<FeatherWeightProject,FeatherWeightBuild> implements Queue.FlyweightTask, TopLevelItem {
	@Extension
	public static final DescriptorImpl DESCRIPTOR = new DescriptorImpl();

	public FeatherWeightProject(ItemGroup parent, String name) {
		super(parent, name);
	}

	@Override
	protected Class<FeatherWeightBuild> getBuildClass() {
		return FeatherWeightBuild.class;
	}

	public DescriptorImpl getDescriptor() {
		return DESCRIPTOR;
	}

	public static final class DescriptorImpl extends AbstractProjectDescriptor {
		public String getDisplayName() {
			return "Feather Weight Project";
		}

		public FeatherWeightProject newInstance(ItemGroup parent, String name) {
			return new FeatherWeightProject(parent,name);
		}
	}
}
