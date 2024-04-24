import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileNotFoundException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MorseCodeConverterStudent_Test {

	File codeFile;
	
	public void setUp() throws Exception {
	}

	
	public void tearDown() throws Exception {
	}

	@Test
	public void testConvertToEnglishString() {
		String phrase1 = MorseCodeConverter.convertToEnglish(".... --- -.-. -.- . -.-- / .. ... / - .... . / -... . ... - "
				+ "/ ... .--. --- .-. - / .. -. / - .... . / .-- --- .-. .-.. -..");
		
		assertEquals("hockey is the best sport in the world", phrase1);
		
		String message = MorseCodeConverter.convertToEnglish("... ..- -- -- . .-. / -... .-. . .- -.-");
		
		assertEquals("summer break", message);
	}

}

