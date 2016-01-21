package me.pepyakin.adtparceler;

import org.parceler.ParcelConverter;

/**
 * @author pepyakin
 */
public class StageParcelConverter implements ParcelConverter<Stage> {

    @Override
    public void toParcel(Stage input, android.os.Parcel parcel) {
        if (input instanceof Stage.Identification) {
            parcel.writeInt(0);
        } else if (input instanceof Stage.PinVerification) {
            parcel.writeInt(1);
            parcel.writeString(((Stage.PinVerification) input).derp);
        } else {
            throw new AssertionError();
        }
    }

    @Override
    public Stage fromParcel(android.os.Parcel parcel) {
        int ordinal = parcel.readInt();
        if (ordinal == 0) {
            return Stage.Identification.INSTANCE;
        } else if (ordinal == 1) {
            String derp = parcel.readString();
            return new Stage.PinVerification(derp);
        } else {
            throw new AssertionError();
        }
    }
}
