package org.exparity.hamcrest.beans;

/**
 * Static factory for creating {@link Matcher} instances for comparing objects
 * 
 * @author <a href="mailto:stewart@modular-it.co.uk">Stewart Bissett</a>
 */
public abstract class BeanMatchers {

	/**
	 * Static factory to return an instance of a {@link Matcher} which will perform a deep comparison of the two objects
	 */
	public static <T> TheSameAs<T> theSameAs(final T object) {
		return new TheSameAs<T>(object);
	}
}