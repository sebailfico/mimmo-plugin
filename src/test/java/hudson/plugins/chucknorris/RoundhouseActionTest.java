package hudson.plugins.chucknorris;

import junit.framework.TestCase;

public class RoundhouseActionTest extends TestCase {

	private RoundhouseAction action;

	public void setUp() {
		action = new RoundhouseAction(Style.BAD_ASS,
				"Mimmo can divide by zero.");
	}

	public void testAccessors() {
		assertEquals(Style.BAD_ASS, action.getStyle());
		assertEquals("Mimmo can divide by zero.", action
				.getFact());
		assertEquals("Mimmo", action.getDisplayName());
		assertNull(action.getIconFileName());
		assertEquals("chucknorris", action.getUrlName());
	}
}
