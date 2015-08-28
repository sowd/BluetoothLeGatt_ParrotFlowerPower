/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.bluetoothlegatt;

import java.util.HashMap;

/**
 * This class includes a small subset of standard GATT attributes for demonstration purposes.
 */
public class SampleGattAttributes {
    private static HashMap<String, String> attributes = new HashMap();
    public static String HEART_RATE_MEASUREMENT = genuuid_generic(0x2a, 0x37);
    public static String CLIENT_CHARACTERISTIC_CONFIG = genuuid_generic(0x29, 0x02);

    static {
        // Sample Services.
        attributes.put(genuuid_generic(0x18, 0x0d), "Heart Rate Service");
        attributes.put(genuuid_generic(0x18, 0x0a), "Device Information Service");

        // Sample Characteristics.
        attributes.put(HEART_RATE_MEASUREMENT, "Heart Rate Measurement");
        attributes.put(genuuid_generic(0x2a, 0x29), "Manufacturer Name String");

        // FlowerPower Profiles
        attributes.put(genuuid_generic(0x18, 0x0f), "Battery Service");   // New
        attributes.put(genuuid_generic(0x2a, 0x19), "Battery level");   // New

        attributes.put(genuuid_flowerpower(0xfa, 0x00), "FlowerPower Live Service");
        attributes.put(genuuid_flowerpower(0xfa, 0x01), "FP Light");
        attributes.put(genuuid_flowerpower(0xfa, 0x02), "FP Soil EC");
        attributes.put(genuuid_flowerpower(0xfa, 0x03), "FP Soil Temp");
        attributes.put(genuuid_flowerpower(0xfa, 0x04), "FP Air Temp");
        attributes.put(genuuid_flowerpower(0xfa, 0x05), "FP Soil VWC");
        attributes.put(genuuid_flowerpower(0xfa, 0x06), "FP Live measure Period");
        attributes.put(genuuid_flowerpower(0xfa, 0x07), "FP Device LED");
        attributes.put(genuuid_flowerpower(0xfa, 0x08), "FP Last Detected Move Time");
        attributes.put(genuuid_flowerpower(0xfa, 0x09), "FP Calibrated VWC");
        attributes.put(genuuid_flowerpower(0xfa, 0x0a), "FP Calibrated Air Temp");
        attributes.put(genuuid_flowerpower(0xfa, 0x0b), "FP Calibrated DLI");
        attributes.put(genuuid_flowerpower(0xfa, 0x0c), "FP Calibrated Ea");
        attributes.put(genuuid_flowerpower(0xfa, 0x0d), "FP Calibrated Ecb");
        attributes.put(genuuid_flowerpower(0xfa, 0x0e), "FP Calibrated Ecporous");

        attributes.put(genuuid_flowerpower(0xfb, 0x00), "FlowerPower History File through Upload Service");
        attributes.put(genuuid_flowerpower(0xfb, 0x01), "FP Tx buffer");
        attributes.put(genuuid_flowerpower(0xfb, 0x02), "FP Tx status");
        attributes.put(genuuid_flowerpower(0xfb, 0x03), "FP Rx status");

        attributes.put(genuuid_flowerpower(0xfc, 0x00), "FlowerPower History File Service");
        attributes.put(genuuid_flowerpower(0xfc, 0x01), "FP Nb entries");
        attributes.put(genuuid_flowerpower(0xfc, 0x02), "FP Last entries index");
        attributes.put(genuuid_flowerpower(0xfc, 0x03), "FP Transfer start index");
        attributes.put(genuuid_flowerpower(0xfc, 0x04), "FP Current Session ID");
        attributes.put(genuuid_flowerpower(0xfc, 0x05), "FP Current Session Start Index");
        attributes.put(genuuid_flowerpower(0xfc, 0x06), "FP Current Session Period");


        attributes.put(genuuid_flowerpower(0xfd, 0x00), "FlowerPower Time Service");
        attributes.put(genuuid_flowerpower(0xfd, 0x01), "FP Date");

        attributes.put(genuuid_flowerpower(0xfe, 0x01), "FP Calibration data");
        attributes.put(genuuid_flowerpower(0xfe, 0x02), "FP Force bond char");
        attributes.put(genuuid_flowerpower(0xfe, 0x03), "FP Name");
        attributes.put(genuuid_flowerpower(0xfe, 0x04), "FP Color");

        attributes.put(genuuid_flowerpower(0xff, 0xc1), "OAD Image Notify");
        attributes.put(genuuid_flowerpower(0xff, 0xc2), "OAD Image block req");

    }

    public static String lookup(String uuid, String defaultName) {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }

    public static String genuuid_generic(int id1, int id2){
        return "0000"+String.format("%02x",id1)+String.format("%02x",id2)+"-0000-1000-8000-00805f9b34fb";
    }

    public static String genuuid_flowerpower(int id1, int id2){
        return "39e1"+String.format("%02x",id1)+String.format("%02x",id2)+"-84a8-11e2-afba-0002a5d5c51b";
    }

}
