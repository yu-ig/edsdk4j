package add;
import com.sun.jna.Library;
/**
 * JNA Wrapper for library <b>add</b><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public interface AddLibrary extends Library {
	/**
	 * function declarations<br>
	 * Original signature : <code>int addNumber(int, int)</code><br>
	 * <i>native declaration : add.h:2</i>
	 */
	int addNumber(int a, int b);
}