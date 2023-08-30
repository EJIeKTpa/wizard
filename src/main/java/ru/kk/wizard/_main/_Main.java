package ru.kk.wizard._main;

import ru.kk.wizard.entity.Wizard;
import ru.kk.wizard.util.EventProducer;

public class _Main {
    public static void main(String[] args) {

        Wizard wizard = new Wizard();
        wizard.setCharacter();
        EventProducer eventProducer = new EventProducer();
        eventProducer.live(wizard);

    }
}