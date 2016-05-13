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
	@Test
	public void 三桁の値125を入力した結果が取得できる() {
		IntToEng ite = new IntToEng();
		String expected = "one hundred twenty five";
		String actual = ite.translateEng(125);
		assertThat(actual, is(expected));
	}
	@Test
	public void 三桁の値276を入力した結果が取得できる() {
		IntToEng ite = new IntToEng();
		String expected = "two hundred seventy six";
		String actual = ite.translateEng(276);
		assertThat(actual, is(expected));
	}
	
	
	//四桁の値のテスト
	@Test
	public void 四桁の値1000を入力した結果が取得できる() {
		IntToEng ite = new IntToEng();
		String expected = "one thousand";
		String actual = ite.translateEng(1000);
		assertThat(actual, is(expected));
	}
	@Test
	public void 四桁の値1006を入力した結果が取得できる() {
		IntToEng ite = new IntToEng();
		String expected = "one thousand six";
		String actual = ite.translateEng(1006);
		assertThat(actual, is(expected));
	}
	@Test
	public void 四桁の値1016を入力した結果が取得できる() {
		IntToEng ite = new IntToEng();
		String expected = "one thousand sixteen";
		String actual = ite.translateEng(1016);
		assertThat(actual, is(expected));
	}
	@Test
	public void 四桁の値1106を入力した結果が取得できる() {
		IntToEng ite = new IntToEng();
		String expected = "one thousand one hundred six";
		String actual = ite.translateEng(1106);
		assertThat(actual, is(expected));
	}
	@Test
	public void 四桁の値1011を入力した結果が取得できる() {
		IntToEng ite = new IntToEng();
		String expected = "one thousand eleven";
		String actual = ite.translateEng(1011);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void 四桁の値1012を入力した結果が取得できる() {
		IntToEng ite = new IntToEng();
		String expected = "one thousand twelve";
		String actual = ite.translateEng(1012);
		assertThat(actual, is(expected));
	}
	@Test
	public void 四桁の値1100を入力した結果が取得できる() {
		IntToEng ite = new IntToEng();
		String expected = "one thousand one hundred";
		String actual = ite.translateEng(1100);
		assertThat(actual, is(expected));
	}
	@Test
	public void 四桁の値6284を入力した結果が取得できる() {
		IntToEng ite = new IntToEng();
		String expected = "six thousand two hundred eighty four";
		String actual = ite.translateEng(6284);
		assertThat(actual, is(expected));
	}
}
