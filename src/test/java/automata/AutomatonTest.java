package automata;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.awt.Point;

/**
 * Unit tests for the Automaton class
 */
public class AutomatonTest {

    private Automaton automaton;

    @Before
    public void setUp() {
        automaton = new Automaton();
    }

    @Test
    public void testCreateState() {
        Point point = new Point(10, 20);
        State state = automaton.createState(point);

        assertNotNull(state);
        assertTrue(containsState(automaton.getStates(), state));
        assertEquals(point, new Point(state.getPoint()));
    }

    @Test
    public void testAddAndRemoveState() {
        State state = automaton.createState(new Point(0, 0));
        assertTrue(containsState(automaton.getStates(), state));

        automaton.removeState(state);
        assertFalse(containsState(automaton.getStates(), state));
    }

    @Test
    public void testSetInitialState() {
        State state = automaton.createState(new Point(0, 0));
        automaton.setInitialState(state);

        assertEquals(state, automaton.getInitialState());
        assertTrue(automaton.isInitialState(state));
    }

    @Test
    public void testAddAndRemoveFinalState() {
        State state = automaton.createState(new Point(0, 0));
        automaton.addFinalState(state);

        assertTrue(automaton.isFinalState(state));
        assertTrue(containsState(automaton.getFinalStates(), state));

        automaton.removeFinalState(state);
        assertFalse(automaton.isFinalState(state));
    }

    @Test
    public void testClearAutomaton() {
        automaton.createState(new Point(0, 0));
        automaton.createState(new Point(50, 50));

        automaton.clear();

        assertEquals(0, automaton.getStates().length);
        assertEquals(0, automaton.getTransitions().length);
        assertEquals(0, automaton.getFinalStates().length);
        assertNull(automaton.getInitialState());
    }

    // Helper method to check if an array contains a state
    private boolean containsState(State[] states, State target) {
        for (State state : states) {
            if (state == target) {
                return true;
            }
        }
        return false;
    }
}

