package org.launchcode.java.demos.lsn1datatypes;

class Message {

    static String getMessage(String lang) {

        switch (lang) {
            case "sp":
                return "¡Hola, Mundo!";
            case "fr":
                return "Bonjour, le monde!";
            case "it":
                return "Ciao, Mundi!";
            default:
                return "Hello, World!";
        }
    }
}
