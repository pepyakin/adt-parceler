package me.pepyakin.adtparceler;

import org.parceler.Parcel;
import org.parceler.ParcelConstructor;

/**
 * @author pepyakin
 */
@Parcel
public final class PinVerificationOps {

    final Stage.PinVerification pinVerificationStage;

    @ParcelConstructor
    public PinVerificationOps(Stage.PinVerification pinVerificationStage) {
        this.pinVerificationStage = pinVerificationStage;
    }
}
