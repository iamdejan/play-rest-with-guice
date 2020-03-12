package entities.impl;

import entities.IMessage;

public class EnglishMessage implements IMessage {
    @Override
    public String getMessage() {
        return "Hello all";
    }
}
