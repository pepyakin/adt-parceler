package me.pepyakin.adtparceler;

import org.parceler.Parcel;

/**
 * @author pepyakin
 */
@Parcel(
        converter = StageParcelConverter.class,
        implementations = {
                Stage.Identification.class,
                Stage.PinVerification.class })
public interface Stage {
    class Identification implements Stage {
        static final Identification INSTANCE = new Identification();
    }

    class PinVerification implements Stage {
        final String derp;

        public PinVerification(String derp) {
            this.derp = derp;
        }
    }
}
