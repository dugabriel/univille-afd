package com.univille.afd;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by eduardo.gabriel on 15/04/2016.
 */
public class Automata {
    private HashMap<Integer, State> states;
    private HashMap<Integer, State> finalState;
    private HashSet<Transition> transitions;
    private State startState;

    public HashMap<Integer, State> getStates() {
        return states;
    }

    public void setState(int id,State state){
        states.put(id,state);
    }

    public void setStates(HashMap<Integer, State> states) {
        this.states = states;
    }

    public HashMap<Integer, State> getFinalState() {
        return finalState;
    }

    public void setFinalState(HashMap<Integer, State> finalState) {
        this.finalState = finalState;
    }

    public HashSet<Transition> getTransitions() {
        return transitions;
    }

    public void setTransitions(HashSet<Transition> transitions) {
        this.transitions = transitions;
    }

    public State getStartState() {
        return startState;
    }

    public void setStartState(State startState) {
        this.startState = startState;
    }
}
