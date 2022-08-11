package genericLibrary;

import java.util.Random;

public class JavaLibrary {
	/**
	 * for generate random number
	 * @return
	 */
		public int getRandomNumber()
		{
			Random r=new Random();
			return r.nextInt(1000);
		}

}
