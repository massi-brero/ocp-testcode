package de.massisoft.ocp.chapter15;

public class NoXAllowedException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    NoXAllowedException() {
        super("Sory. No 'x' allowed here mate");
    }
}