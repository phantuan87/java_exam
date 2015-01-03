package exam.dev.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

/**
 * 
 * @author phantuan
 *
 */
public final class DateUtil {
	private DateUtil() {}
	
	public static String getClientTime(HttpServletRequest req, String formatPattern) {
		Locale locale = req.getLocale();
		Calendar calendar = Calendar.getInstance(locale);
		SimpleDateFormat formatter = new SimpleDateFormat(formatPattern);
		return formatter.format(calendar.getTime());
	}
}
