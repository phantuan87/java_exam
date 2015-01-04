package exam.dev.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

/**
 * The File utilization class.
 * @author phantuan
 *
 */
public final class FileUtil {
	
	private FileUtil() {}
	
	public static Properties loadConfiguration(ClassLoader classLoader) throws FileNotFoundException, IOException {
		URL resource = classLoader.getResource(DailyMoodConst.CONFIG_PATH);
		if (resource == null) {
			throw new FileNotFoundException("File Not Found:  " + DailyMoodConst.CONFIG_PATH);
		}
		
		Properties props = new Properties();
		props.load(new FileReader(classLoader.getResource(DailyMoodConst.CONFIG_PATH).getFile()));
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
