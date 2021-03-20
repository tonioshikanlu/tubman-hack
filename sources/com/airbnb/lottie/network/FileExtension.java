package com.airbnb.lottie.network;

import b.e.a.a.a;
import com.airbnb.lottie.utils.Logger;

public enum FileExtension {
    JSON(".json"),
    ZIP(".zip");
    
    public final String extension;

    private FileExtension(String str) {
        this.extension = str;
    }

    public static FileExtension forFile(String str) {
        FileExtension[] values = values();
        for (int i2 = 0; i2 < 2; i2++) {
            FileExtension fileExtension = values[i2];
            if (str.endsWith(fileExtension.extension)) {
                return fileExtension;
            }
        }
        Logger.warning("Unable to find correct extension for " + str);
        return JSON;
    }

    public String tempExtension() {
        StringBuilder y = a.y(".temp");
        y.append(this.extension);
        return y.toString();
    }

    public String toString() {
        return this.extension;
    }
}
