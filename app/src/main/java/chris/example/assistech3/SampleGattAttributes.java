package chris.example.assistech3;

import java.util.HashMap;

public class SampleGattAttributes {

    private static HashMap<String, String> attributes = new HashMap<>();
    public static String HEART_RATE_MEASUREMENT = "00002a37-0000-1000-8000-00805f9b34fb";
    public static String CLIENT_CHARACTERISTIC_CONFIG = "00002902-0000-1000-8000-00805f9b34fb";
    public static String HM_10 = "0000ffe1-0000-1000-8000-00805f9b34fb";
    public static String BLOOD_PRESSURE_MEASUREMENT = "00002a35-0000-1000-8000-00805f9b34fb";
    public static String ESP_TX = "6e400003-b5a3-f393-e0A9-e50e24dcca9e ";
    public static String ESP_RX = "6e400002-b5a3-f393-e0A9-e50e24dcca9e";

    static
    {
        // Sample Services.
        attributes.put("0000180d-0000-1000-8000-00805f9b34fb", "Heart Rate Service");
        attributes.put("0000ffe0-0000-1000-8000-00805f9b34fb", "HM-10 Service");
        attributes.put("0000180a-0000-1000-8000-00805f9b34fb", "Device Information Service");
        attributes.put("00001810-0000-1000-8000-00805f9b34fb", "Blood Pressure");
        attributes.put("6e400001-b5a3-f393-e0A9-e50e24dcca9e", "ESP Service");
        // Sample Characteristics.
        attributes.put(HEART_RATE_MEASUREMENT, "Heart Rate Measurement");
        attributes.put("00002a29-0000-1000-8000-00805f9b34fb", "Manufacturer Name String");
        attributes.put(BLOOD_PRESSURE_MEASUREMENT, "Blood Pressure Measurement");
        attributes.put(HM_10, "HM-10 Module");
        attributes.put(ESP_TX, "ESP TX");
        attributes.put(ESP_RX, "ESP RX");
    }

    public static String lookup(String uuid, String defaultName)
    {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }

}
