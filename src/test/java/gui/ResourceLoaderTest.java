package gui;

import org.junit.Test;
import static org.junit.Assert.*;

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
        // Test loading a resource that doesn't exist
        URL url = ResourceLoader.getResource("nonexistent/resource.txt");
        assertNull("Should return null for non-existent resources", url);
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

