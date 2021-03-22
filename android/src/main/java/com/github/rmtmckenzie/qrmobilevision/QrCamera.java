package com.github.rmtmckenzie.qrmobilevision;

interface QrCamera {
    void start(final boolean useFrontCamera) throws QrReader.Exception;
    void toggleFlash();
    void stop();
    int getOrientation();
    int getWidth();
    int getHeight();
}
