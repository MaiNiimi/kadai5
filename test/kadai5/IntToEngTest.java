package kadai5;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class IntToEngTest extends IntToEng {
	
	//一桁の値のテスト
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

	//二桁の値のテスト
	@Test
	public void 二桁の値10を入力した結果が取得できる() {
		IntToEng ite = new IntToEng();
		String expected = "ten";
		String actual = ite.translateEng(10);
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
	@Test
	public void 二桁の値52を入力した結果が取得できる() {
		IntToEng ite = new IntToEng();
		String expected = "fifty two";
		String actual = ite.translateEng(52);
		assertThat(actual, is(expected));
	}
	
	//三桁の値のテスト
	@Test
	public void 三桁の値100を入力した結果が取得できる() {
		IntToEng ite = new IntToEng();
		String expected = "one hundred";
		String actual = ite.translateEng(100);
		assertThat(actual, is(expected));
	}
	@Test
	public void 三桁の値102を入力した結果が取得できる() {
		IntToEng ite = new IntToEng();
		String expected = "one hundred two";
		String actual = ite.translateEng(102);
		assertThat(actual, is(expected));
	}
	@Test
	public void 三桁の値110を入力した結果が取得できる() {
		IntToEng ite = new IntToEng();
		String expected = "one hundred ten";
		String actual = ite.translateEng(110);
		assertThat(actual, is(expected));
	}
	
}
