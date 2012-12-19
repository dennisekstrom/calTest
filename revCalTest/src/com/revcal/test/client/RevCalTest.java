package com.revcal.test.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class RevCalTest implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		final BlockCalGrid blockCal = new BlockCalGrid(BlockCalAttributes.DEFAULT_ATTRIBUTES);

		// add the block calendar to the root panel
		RootPanel.get("blockCal").add(blockCal);
	}
}
