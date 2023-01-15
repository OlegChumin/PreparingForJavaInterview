package Patterns.Pattern_10_ChainOfResponsibility;

public class ChainOfResponsibilityPatternLesson {
    public static void main(String[] args) {
        //I
        MessageSender messageSender = new MessageSender(new MessagePrinter());
        messageSender.sendMessage("Control message");

        MessageHandler messageHandler = new MessageHandlerAddExclamationMark(new MessageCheckHandler(new MessagePrinterHandler(null)));
        messageHandler.handle("Hi, check");

    }
}

class MessageSender {
    MessagePrinter messagePrinter;

    public MessageSender(MessagePrinter messagePrinter) {
        this.messagePrinter = messagePrinter;
    }

    public void sendMessage(String message) {
        messagePrinter.printMessage(message);
    }

}

//I
class MessagePrinter {
    public void printMessage(String message) {
        if(!message.matches(".*\\d.*")) {
            System.out.println(message);
        } // no numbers
    }
}

//I
class MessagePrinter2 {
    public void printMessage2(String message) {
            System.out.println(message + "!");
         // no numbers
    }
}

abstract class MessageHandler {
    MessageHandler messageHandler;

    public MessageHandler(MessageHandler messageHandler) {
        this.messageHandler = messageHandler;
    }

    abstract void handle(String msg);
}

class MessagePrinterHandler extends MessageHandler {

    public MessagePrinterHandler(MessageHandler messageHandler) {
        super(messageHandler);
    }

    @Override
    void handle(String msg) {
        System.out.println(msg);
    }
}

class MessageCheckHandler extends MessageHandler {

    public MessageCheckHandler(MessageHandler messageHandler) {
        super(messageHandler);
    }

    @Override
    void handle(String msg) {
        if(!msg.matches(".*\\d.*")) {
            System.out.println(msg);
        }
    }
}

class MessageHandlerAddExclamationMark extends MessageHandler {

    public MessageHandlerAddExclamationMark(MessageHandler messageHandler) {
        super(messageHandler);
    }

    @Override
    void handle(String msg) {
        System.out.println(msg + " !");
    }
}