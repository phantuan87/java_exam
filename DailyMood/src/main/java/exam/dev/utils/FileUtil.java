package exam.dev.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

/**
 * 
 * @author phantuan
 *
 */
public final class FileUtil {
	public static final String MOODS_FILE_PATH = "MOODS_FILE_PATH";
	
	private static final String CONFIG_PATH = "config.properties";
	
	private FileUtil() {}
	
	public static Properties loadConfiguration(ClassLoader classLoader) throws FileNotFoundException, IOException {
		URL resource = classLoader.getResource(CONFIG_PATH);
		if (resource == null) {
			throw new FileNotFoundException("File Not Found:  " + CONFIG_PATH);
		}
		
		Properties props = new Properties();
		props.load(new FileReader(classLoader.getResource(CONFIG_PATH).getFile()));
		return props;
	}
	
	public static File getFileFromClassPath(ClassLoader classLoader, String path) throws FileNotFoundException {
		URL resource = classLoader.getResource(path);
		if (resource == null) {
			throw new FileNotFoundException("File Not Found:  " + path);
		}
		
		return new File(resource.getFile());
	}
}