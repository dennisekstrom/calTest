package com.revcal.test.client;

import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SimplePanel;

/**
 * TODO
 * 
 * @author Dennis
 */
public class BlockCalGrid extends Composite {

	private static final int HOURS_PER_DAY = 24;

	// private BlockCalAttributes attributes = new BlockCalAttributes();

	private AbsolutePanel grid = new AbsolutePanel();

	/**
	 * Create a new <code>BlockCalGrid</code>.
	 * 
	 * @param attributes
	 *            the attributes to assign to this <code>BlockCalGrid</code>
	 */
	public BlockCalGrid(BlockCalAttributes attributes) {

		// important stuff
		super.initWidget(grid);

		/* TODO TEMP */
		this.setStyleName("temp");
		/* ********* */

		// remember the attributes
		// this.attributes = attributes;

		// set the size of this grid (side lines go away)
		int pixelWidth = attributes.getPixelsPerDay() * attributes.getNumDays()
				- BlockCalAttributes.VERTICAL_BORDER_WIDTH;
		int pixelHeight = attributes.getPixelsPerTimeInterval() * HOURS_PER_DAY
				* attributes.getIntervalsPerHour() - BlockCalAttributes.HORIZONTAL_BORDER_WIDTH;
		this.setPixelSize(pixelWidth, pixelHeight);

		// horizontal lines
		SimplePanel block;
		// TODO is this compatible with all browsers?
		String blockHeight = attributes.getPixelsPerTimeInterval()
				- BlockCalAttributes.HORIZONTAL_BORDER_WIDTH + "px";
		int workingHoursStart = attributes.getWorkingHoursStart();
		int workingHoursEnd = attributes.getWorkingHoursEnd();
		int blocksPerHour = attributes.getIntervalsPerHour();
		for (int hour = 0; hour < HOURS_PER_DAY; hour++) {

			boolean isWorkingHours = (workingHoursStart <= hour && hour <= workingHoursEnd);

			// block(s) to display interval line(s)
			for (int i = 1; i < blocksPerHour; i++) {
				block = new SimplePanel();
				block.setHeight(blockHeight);
				block.setStyleName("interval-separator");
				if (!isWorkingHours)
					block.addStyleName("non-working-hours");
				grid.add(block);
			}

			// blocks to display hour lines
			block = new SimplePanel();
			block.setHeight(blockHeight);
			block.setStyleName("hour-separator");
			if (!isWorkingHours)
				block.addStyleName("non-working-hours");
			grid.add(block);
		}

		// vertical lines
		// TODO is this compatible with all browsers?
		String blockWidth = attributes.getPixelsPerDay() - BlockCalAttributes.VERTICAL_BORDER_WIDTH
				+ "px";
		for (int day = 0; day < attributes.getNumDays(); day++) {

			int horPos = day * attributes.getPixelsPerDay();

			// block to display day-separating line
			block = new SimplePanel();
			block.setStyleName("day-separator");
			block.setWidth(blockWidth);
			grid.add(block, horPos, 0);
		}
	}
}