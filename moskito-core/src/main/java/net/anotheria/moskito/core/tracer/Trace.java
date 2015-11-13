package net.anotheria.moskito.core.tracer;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import java.util.Arrays;

/**
 * TODO comment this class
 *
 * @author lrosenberg
 * @since 05.05.15 17:54
 */
public class Trace {
	private String call;
	private long duration;
	private StackTraceElement[] elements;

	public String getCall() {
		return call;
	}

	public void setCall(String call) {
		this.call = call;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	@SuppressFBWarnings("EI_EXPOSE_REP")
	public StackTraceElement[] getElements() {
		return elements;
	}

	@SuppressFBWarnings("EI_EXPOSE_REP2")
	public void setElements(StackTraceElement[] elements) {
		this.elements = elements;
	}

	@Override public String toString(){
		return call+" "+(elements==null? "no elements" : Arrays.toString(getElements()))+", dur: "+duration;
	}
}
