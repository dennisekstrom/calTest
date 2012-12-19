package com.revcal.test.client;

public class BlockCalAttributes extends CalAttributes {

	public static final BlockCalAttributes DEFAULT_ATTRIBUTES = new BlockCalAttributes();

	public static final int HORIZONTAL_BORDER_WIDTH = 1;
	public static final int VERTICAL_BORDER_WIDTH = 1;

	private int pixelsPerTimeInterval = 15;
	private int pixelsPerDay = 120;
	private int intervalsPerHour = 2;
	private int numDays = 5;

	/**
	 * Creates a <code>BlockCalAttributes</code> object with default settings.
	 */
	public BlockCalAttributes() {
	}

	public int getPixelsPerTimeInterval() {
		return pixelsPerTimeInterval;
	}

	public void setPixelsPerTimeInterval(int pixelsPerTimeInterval) {
		this.pixelsPerTimeInterval = pixelsPerTimeInterval;
	}

	public int getPixelsPerDay() {
		return pixelsPerDay;
	}

	public void setPixelsPerDay(int pixelsPerDay) {
		this.pixelsPerDay = pixelsPerDay;
	}

	public int getIntervalsPerHour() {
		return intervalsPerHour;
	}

	public void setIntervalsPerHour(int intervalsPerHour) {
		this.intervalsPerHour = intervalsPerHour;
	}

	public int getNumDays() {
		return numDays;
	}

	public void setNumDays(int numDays) {
		this.numDays = numDays;
	}
}