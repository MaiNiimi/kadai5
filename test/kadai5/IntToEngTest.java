package kadai5;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class IntToEngTest extends IntToEng {
	
	@Test
	public void 一桁の値0を入力した結果が取得できる() {
		IntToEng ite = new IntToEng();
		String expected = "zero";
		String actual = ite.translateEng(0);
		assertThat(actual, is(expected));
	}	
	@Test
	public void 一桁の値3を入力した結果が取得できる() {
		IntToEng ite = new IntToEng();
		String expected = "three";
		String actual = ite.translateEng(3);
		assertThat(actual, is(expected));
	}

	/*
	@Test
	public void 二桁の値10を入力した結果が取得できる() {
		IntToEng ite = new IntToEng();
		String expected = "ten";
		String actual = ite.translateEng(10);
		assertThat(actual, is(expected));
	}
	@Test
	public void 二桁の値12を入力した結果が取得できる() {
		IntToEng ite = new IntToEng();
		String expected = "twelve";
		String actual = ite.translateEng(12);
		assertThat(actual, is(expected));
	}
	@Test
	public void 二桁の値17を入力した結果が取得できる() {
		IntToEng ite = new IntToEng();
		String expected = "seventeen";
		String actual = ite.translateEng(17);
		assertThat(actual, is(expected));
	}
	@Test
	public void 二桁の値30を入力した結果が取得できる() {
		IntToEng ite = new IntToEng();
		String expected = "thirty";
		String actual = ite.translateEng(30);
		assertThat(actual, is(expected));
	}
	*/
}
