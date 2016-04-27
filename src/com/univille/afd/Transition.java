package com.univille.afd;

/**
 * Created by eduardo.gabriel on 15/04/2016.
 */
public class Transition {
    private State origin;
    private State destiny;
    private String symbol;

    public State getOrigin() {
        return origin;
    }

    public void setOrigin(State origin) {
        this.origin = origin;
    }

    public State getDestiny() {
        return destiny;
    }

    public void setDestiny(State destiny) {
        this.destiny = destiny;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
