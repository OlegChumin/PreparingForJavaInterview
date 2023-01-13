package Patterns.Pattern_07_Adapter;

public class AdapterPatternLesson {
    public static void main(String[] args) {
        AmericanSocket americanSocket = new SimpleAmericanSocket();
        Radio radio = new Radio();
        EuroSocket newEuroSocket = () -> System.out.println("give 220 volt");
        Radio radio2 = new Radio();
        radio2.listenMusic(newEuroSocket);

        EuroSocket euroSocket = new SocketAdapter(americanSocket);
        radio.listenMusic(euroSocket);
    }
}

interface EuroSocket {
    void getPower();
}

class SocketAdapter implements EuroSocket {
    AmericanSocket americanSocket;

    public SocketAdapter(AmericanSocket americanSocket) {
        this.americanSocket = americanSocket;
    }

    @Override
    public void getPower() {
        americanSocket.getPower();
    }
}


interface AmericanSocket {
    void getPower();
}

class SimpleAmericanSocket implements AmericanSocket {

    @Override
    public void getPower() {
        System.out.println("give 110 volt");
    }
}

class Radio {
    public void listenMusic(EuroSocket euroSocket) {
        euroSocket.getPower();
    }
}



