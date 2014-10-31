package launcher;

import flashlearn.FlashLearn;

public class Launcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("main start");

		/** call my class **/
		FlashLearn flashLearn=new FlashLearn();
		flashLearn.start();

		System.out.println("main end");
	}

}
