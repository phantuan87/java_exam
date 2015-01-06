package dev.exam.utils;

import java.util.Random;

/**
 * 
 * @author phantuan
 *
 */
public final class NumberUtil {

	private NumberUtil() {}
	
	public static Integer randomNumber(int range) {
		return new Random().nextInt(range);
	}
}
