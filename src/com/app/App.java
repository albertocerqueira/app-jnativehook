package com.app;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;

public class App {

	public static void main(String[] args) {
		try {
			GlobalScreen.registerNativeHook();
		} catch (NativeHookException ex) {
			System.err.println("Ops, ocorreu um problema ao tentar registrar o NativeHook");
			System.err.println(ex.getMessage());

			System.exit(1);
		}

		GlobalScreen.addNativeKeyListener(new InterceptKeyboard());
		GlobalScreen.addNativeMouseListener(new InterceptMouse());
	}
}