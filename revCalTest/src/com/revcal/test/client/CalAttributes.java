package com.revcal.test.client;

public class CalAttributes {

	private int workingHoursStart = 8;
	private int workingHoursEnd = 17;

	/**
	 * Creates a <code>CalAttributes</code> object with default settings.
	 */
	public CalAttributes() {
	}

	public int getWorkingHoursStart() {
		return workingHoursStart;
	}

	public void setWorkingHoursStart(int workingHoursStart) {
		this.workingHoursStart = workingHoursStart;
	}

	public int getWorkingHoursEnd() {
		return workingHoursEnd;
	}

	public void setWorkingHoursEnd(int workingHoursEnd) {
		this.workingHoursEnd = workingHoursEnd;
	}
}