package gui;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.net.URL;

/**
 * Unit tests for the ResourceLoader class
 */
public class ResourceLoaderTest {

    @Test
    public void testLoadExistingResource() {
        // Test loading an icon that should exist
        URL url = ResourceLoader.getResource("ICON/arrow.gif");
        assertNotNull("Should be able to load arrow.gif icon", url);
    }

    @Test
    public void testLoadNonExistentResource() {
        // Redirect stderr to capture the warning
        PrintStream originalErr = System.err;
        ByteArrayOutputStream errContent = new ByteArrayOutputStream();
        System.setErr(new PrintStream(errContent));

        try {
            // Test loading a resource that doesn't exist
            URL url = ResourceLoader.getResource("nonexistent/resource.txt");
            assertNull("Should return null for non-existent resources", url);

            // Verify that a warning was logged
            String errorOutput = errContent.toString();
            assertTrue("Should log warning for non-existent resource",
                      errorOutput.contains("Warning: Could not load resource: nonexistent/resource.txt"));
        } finally {
            // Restore original stderr
            System.setErr(originalErr);
        }
    }

    @Test
    public void testLoadMediaResource() {
        // Test loading a media resource
        URL url = ResourceLoader.getResource("MEDIA/about.png");
        assertNotNull("Should be able to load about.png media file", url);
    }

    @Test
    public void testLoadWithDifferentPaths() {
        // Test various path formats
        URL url1 = ResourceLoader.getResource("ICON/arrow.gif");
        URL url2 = ResourceLoader.getResource("/ICON/arrow.gif");

        // Both should work, though they might return the same URL
        assertNotNull("Relative path should work", url1);
        assertNotNull("Absolute path should work", url2);
    }
}

