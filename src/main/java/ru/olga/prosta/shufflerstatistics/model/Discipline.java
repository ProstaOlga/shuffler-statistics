package ru.olga.prosta.shufflerstatistics.model;

public enum Discipline {
    KICKER("kicker"),
    PING_PONG("pong");

    private final String webName;

    private Discipline(final String webName){
        this.webName = webName;
    }

    public String getWebName(){
        return this.webName;
    }
}
