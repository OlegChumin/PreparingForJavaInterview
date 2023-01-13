package Patterns.Pattern_06_Facade;

public class FacadePatternLesson {
    public static void main(String[] args) {
        LivingRoom livingRoom = new LivingRoom();
        livingRoom.pressButtonForAllDevices("5", "22", "ON");
        BedRoom bedRoom = new BedRoom();
        bedRoom.pressButtonForAllDevices("10", "23", "OFF");
        WorkRoom workRoom = new WorkRoom();
        workRoom.pressButtonForAllDevices("7", "20", "ON");
    }
}

class TV {
    void playChannel(String channel) {
        System.out.println("play channel " + channel);
    }
}

class AirConditioning {
    void setTemperature(String temperature) {
        System.out.println("set temperature " + temperature);
    }
}

class Light {
    void setLightOnOff(String lightOnOff) {
        System.out.println("set light ON/OFF " + lightOnOff);
    }
}

abstract class RoomFacade {
    TV tv = new TV();
    AirConditioning airConditioning = new AirConditioning();
    Light lightSwitcher = new Light();

    public void pressButtonForAllDevices(String channel, String temperature, String light) {
        tv.playChannel(channel);
        airConditioning.setTemperature(temperature);
        lightSwitcher.setLightOnOff(light);
    }
}

class LivingRoom extends RoomFacade {
}

class BedRoom extends RoomFacade {
}

class WorkRoom extends  RoomFacade{

}


// Variant II
//abstract class Room{
//    TV tv = new TV();
//    AirConditioning airConditioning = new AirConditioning();
//    Light lightSwitcher = new Light();
//    abstract void pressButtonForAllDevices(String channel, String temperature, String light);
//}
//
//class LivingRoom extends  Room{
//    public void pressButtonForAllDevices(String channel, String temperature, String light) {
//        tv.playChannel(channel);
//        airConditioning.setTemperature(temperature);
//        lightSwitcher.setLightOnOff(light);
//    }
//}
//
//class BedRoom extends Room {
//    public void pressButtonForAllDevices(String channel, String temperature, String light) {
//        tv.playChannel(channel);
//        airConditioning.setTemperature(temperature);
//        lightSwitcher.setLightOnOff(light);
//    }
//}

// Variant I
//class LivingRoom {
//    TV tv = new TV();
//    AirConditioning airConditioning = new AirConditioning();
//    Light lightSwitcher = new Light();
//    public void pressButtonForAllDevices(String channel, String temperature, String light) {
//        tv.playChannel(channel);
//        airConditioning.setTemperature(temperature);
//        lightSwitcher.setLightOnOff(light);
//    }
//}
//
//class BedRoom {
//    TV tv = new TV();
//    AirConditioning airConditioning = new AirConditioning();
//    Light lightSwitcher = new Light();
//    public void pressButtonForAllDevices(String channel, String temperature, String light) {
//        tv.playChannel(channel);
//        airConditioning.setTemperature(temperature);
//        lightSwitcher.setLightOnOff(light);
//    }
//}





