package com.meowsier;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class LevelAnnouncementsPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(LevelAnnouncementsPlugin.class);
		RuneLite.main(args);
	}
}