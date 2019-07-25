package com.drswobod.excercices.java.level1;

import com.sun.xml.internal.ws.spi.db.DatabindingException;

import java.io.IOException;

public class WhichExceptionBlocksWillBeTriggered {
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (DatabindingException ex) {
            System.out.println("DatabindingException");
        } catch (IOException ex) {
            System.out.println("IOException");
        } catch (Exception ex) {
            System.out.println("Exception");
        } finally {
            System.out.println("finally");
        }

        // wont compile
        try {
            throw new IOException();
        } catch (DatabindingException ex) {
            System.out.println("DatabindingException");
        } catch (Exception ex) {
            System.out.println("Exception");
        } catch (IOException ex) {
            System.out.println("IOException");
        } finally {
            System.out.println("finally");
        }
    }
}
